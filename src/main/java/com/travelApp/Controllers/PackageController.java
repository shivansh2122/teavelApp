package com.travelApp.Controllers;

import java.io.IOException;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelApp.Domains.Packages;

@RestController
public class PackageController {
	
	@Autowired
	Client client;
	
	  @PostMapping("/create")
	    public String create(@RequestBody Packages packages) throws IOException {

	        IndexResponse response = client.prepareIndex("packages", "travelApp")
	                .setSource(jsonBuilder()
	                        .startObject()
	                        .field("name", packages.getBasePrice())
	                        .field("userSettings", packages.getPackageName())
	                        .endObject()
	                )
	                .get();
	               System.out.println("response id:"+response.getId());
	        return response.getResult().toString();
	    }

}

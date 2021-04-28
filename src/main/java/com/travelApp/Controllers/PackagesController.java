package com.travelApp.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelApp.Domains.Packages;
import com.travelApp.Repository.PackageRepository;

@RestController
public class PackagesController {
	
	@Autowired
	private PackageRepository packageRepository;
	
	
	@PostMapping(value = "/packages")
	public Object createPackage()
	{
		List<Packages> packages = new ArrayList<Packages>();
		for(int i=0;i<1000;i++)
		{
			packages.add(new Packages(i+"", "name"+i, "description"+i));
		}
		System.err.println("saved");

		return packageRepository.saveAll(packages);
	
		
	}
	
	
	
	@GetMapping(value = "/getAllPackages")
	public Object getAllPackage()
	{
		return  packageRepository.count();
		
	}
	

}

package com.travelApp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import com.travelApp.Domains.Packages;
import com.travelApp.Repository.PackageRepository;

@Configuration
public class PackageEasticDataSearch {

	@Autowired
	@Qualifier("elasticSearchWebClient")
	private WebClient webClient;
	
	@Autowired 
	private PackageRepository packageRepository;
	
	public void populate()
	{
		List<Packages> packages = new ArrayList<Packages>();
		for(int i=0;i<1000;i++)
		{
			packages.add(new Packages(i+"", "name"+i, "description"+i));
		}
		
		packageRepository.saveAll(packages);
		System.err.println("saved");
	}
	
}

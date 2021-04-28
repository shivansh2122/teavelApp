package com.travelApp.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.cache.CacheProperties.EhCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.travelApp.Repository")
public class EsConfig extends AbstractElasticsearchConfiguration{

	@Value("${elasticsearch.host}")
	private String EsHost;

	@Value("${elasticsearch.port}")
	private int EsPort;

	@Value("${elasticsearch.clustername}")
	private String EsClusterName;

	public String getHost() {
		return EsHost;
	}

	public int getPort() {
		return EsPort;
	}
	
	
	@Override
	public RestHighLevelClient elasticsearchClient() {
		final ClientConfiguration configurationClient=ClientConfiguration.builder().connectedTo(EsHost+":"+EsPort).build();
		return RestClients.create(configurationClient).rest();
	}

}
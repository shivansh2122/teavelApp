package com.travelApp.Repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import com.travelApp.Domains.Packages;

@Repository
public interface PackageRepository extends ElasticsearchRepository<Packages, String> {

}

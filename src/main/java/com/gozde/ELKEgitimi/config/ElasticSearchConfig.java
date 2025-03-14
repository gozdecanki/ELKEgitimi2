package com.gozde.ELKEgitimi.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

@Configuration
public class ElasticSearchConfig extends ElasticsearchConfiguration {


    @Override
    public ClientConfiguration clientConfiguration() {
//        return ClientConfiguration.builder().
//                connectedTo("https://localhost:9200")
//                .usingSsl()
//                .build();

        return ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();
    }
}

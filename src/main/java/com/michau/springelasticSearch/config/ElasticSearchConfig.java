package com.michau.springelasticSearch.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.lilium.elasticsearch.repository")
@ComponentScan(basePackages={"com.lilium.elasticsearch"})
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

    @Value("${elasticsearch.url")
    public String elasticsearchUrl;

    @Override
    public RestHighLevelClient elasticsearchClient() {
        return null;
    }
}

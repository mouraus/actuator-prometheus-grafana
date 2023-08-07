package com.api.treinamento.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component()
public class CustomHealth implements HealthIndicator {
    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        Health.Builder status = Health.up();
        return status.build();
    }


//    DataSourceHealthIndicator
//    MongoHealthIndicator
//    Neo4jHealthIndicator
//    CassandraHealthIndicator
//    RedisHealthIndicator
//    RabbitHealthIndicator
//    CouchbaseHealthIndicator
//    DiskSpaceHealthIndicator (seen in the above example)
//    ElasticsearchHealthIndicator
//    InfluxDbHealthIndicator
//    JmsHealthIndicator
//    MailHealthIndicator
//    SolrHealthIndicator
}

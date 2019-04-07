/*
 * Copyright (c) 2019. G-Solutions, Inc.
 */

package com.gsol.springplay001.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    /*@Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:test");
        dataSourceBuilder.username("SA");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }*/
}

package com.fjm.soft.api.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: fongjinming
 * @CreateTime: 2019-07-29 17:39
 * @Description:
 */
@Configuration
public class HikariDataSourceConfig {

    /**
     * shiro数据源(单数据源-hikari连接池).
     *
     * @return
     */
    @Bean(name = "dataSource")
    @Qualifier("dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public HikariDataSource shiroHikariDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }
}

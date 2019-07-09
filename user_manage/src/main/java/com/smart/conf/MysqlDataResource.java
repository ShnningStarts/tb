package com.smart.conf;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class MysqlDataResource {
    @Bean(name = "dataSource")

    public MysqlDataSource dataResource(Environment environment){
       MysqlDataSource dataSource=new MysqlDataSource();
        dataSource.setURL(environment.getProperty("spring.dataresource.url"));
        dataSource.setDatabaseName("user_base");
        dataSource.setPassword("yangbiao");
        return dataSource;

    }
}

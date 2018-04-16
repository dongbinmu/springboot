package com.dongbin.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by dongbin on 2018/4/15.
 */
@Configuration    //该注解类似于spring配置文件
@MapperScan(basePackages = "com.dongbin.dao", sqlSessionFactoryRef = "sqlSessionFactory")
public class MybatisConfig {

    @Resource
    private Environment env;

    @Bean
    @Primary
    public DataSource dataSource() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUser(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        dataSource.setJdbcUrl(env.getProperty("spring.datasource.url"));

        return dataSource;
    }

}

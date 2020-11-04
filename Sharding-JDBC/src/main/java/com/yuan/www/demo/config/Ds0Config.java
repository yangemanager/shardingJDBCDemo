package com.yuan.www.demo.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


/*@Configuration
@MapperScan(basePackages = "com.yuan.www.demo.mapper.ds0Mapper",sqlSessionTemplateRef = "ds0SqlSessionTemplate")
public class Ds0Config {

    @Value("${spring.shardingsphere.datasource.ds-0.driverClassName}")
    private String driverClassName;

    @Value("${spring.shardingsphere.datasource.ds-0.url}")
    private String url;

    @Value("${spring.shardingsphere.datasource.ds-0.username}")
    private String username;

    @Value("${spring.shardingsphere.datasource.ds-0.password}")
    private String password;


    @Primary
    @Bean(name = "ds0")
    public DataSource getFirstDataSource() {
        DataSource dataSource = DataSourceBuilder.create()
                .driverClassName(driverClassName)
                .url(url)
                .username(username)
                .password(password)
                .type(DruidDataSource.class)
                .build();
        return dataSource;
    }

    @Bean(name = "ds0SqlSessionFactory")
    @Primary
    public SqlSessionFactory firstSqlSessionFactory(@Qualifier("ds0") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean("ds0TransactionManger")
    @Primary
    public DataSourceTransactionManager firstTransactionManger(@Qualifier("ds0") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "ds0SqlSessionTemplate")
    @Primary
    public SqlSessionTemplate firstSqlSessionTemplate(@Qualifier("ds0SqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}*/

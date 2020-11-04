package com.yuan.www.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/*@Configuration
@MapperScan(basePackages = "com.yuan.www.demo.mapper.ds1Mapper",sqlSessionTemplateRef = "ds1SqlSessionTemplate")
public class Ds1Config {

    @Value("${spring.shardingsphere.datasource.ds-1.driverClassName}")
    private String driverClassName;

    @Value("${spring.shardingsphere.datasource.ds-1.url}")
    private String url;

    @Value("${spring.shardingsphere.datasource.ds-1.username}")
    private String username;

    @Value("${spring.shardingsphere.datasource.ds-1.password}")
    private String password;



    @Bean(name = "ds1")
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

    @Bean(name = "ds1SqlSessionFactory")
    public SqlSessionFactory firstSqlSessionFactory(@Qualifier("ds1") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean("ds1TransactionManger")
    public DataSourceTransactionManager firstTransactionManger(@Qualifier("ds1") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "ds1SqlSessionTemplate")
    public SqlSessionTemplate firstSqlSessionTemplate(@Qualifier("ds1SqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}*/

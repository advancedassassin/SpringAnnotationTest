package com.ydx.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@EnableTransactionManagement
@ComponentScan("com.ydx.tx")
@Configuration
public class TxConfig {

    // 数据源
    @Bean
    public DataSource dataSource() throws PropertyVetoException {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setUser("root");
        dataSource.setPassword("");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test");
        return  dataSource;

    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
        // Spring 对@Configuration类会特俗处理，
        // 给容器中加组件的方法，多次调用都是从容器中找组件，
        // 例如这里的dataSource()不会再new 一个数据源了
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

        return jdbcTemplate;
    }

    // 注册事务管理器在容器中
    @Bean
    public PlatformTransactionManager transactionManager() throws PropertyVetoException {

        return new DataSourceTransactionManager(
                dataSource()
        );
    }


}

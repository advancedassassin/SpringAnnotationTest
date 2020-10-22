package com.ydx.ext;

import com.ydx.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.ydx.ext")
@Configuration
public class ExtConfig {

    @Bean
    public Blue blue(){
        return new Blue();
    }

}

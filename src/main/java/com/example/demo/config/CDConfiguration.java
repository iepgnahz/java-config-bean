package com.example.demo.config;

import com.example.demo.bean.CDPlayer;
import com.example.demo.bean.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfiguration {
    @Bean
    public CompactDisc getCD(){
        return new CompactDisc();
    }

    @Bean
    public CDPlayer getCDPlayer(){
        return new CDPlayer(getCD());
    }
}

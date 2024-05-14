package com.config;


import com.easemob.im.server.EMProperties;
import com.easemob.im.server.EMService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public EMService service() {

        EMProperties properties = EMProperties.builder()
                .setAppkey("1176240414150603#demo")
                .setClientId("YXA6DeKnjPa7QAyJvxTrzoxL3A")
                .setClientSecret("YXA6W33Bn-wcrTaNReM52MSRusvbY_Y")
                .build();

        return new EMService(properties);
    }
}

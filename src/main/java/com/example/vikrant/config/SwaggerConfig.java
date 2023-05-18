package com.example.vikrant.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Vikrnat")
                .version("v1.0.0")
                .description("Qr 코드를 활용한 의료 정보 저장 서비스");
        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}


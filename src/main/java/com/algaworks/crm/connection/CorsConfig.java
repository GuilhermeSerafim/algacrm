package com.algaworks.crm.connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//configuração que permite solicitações de qualquer origem (*) e métodos GET, POST, PUT, DELETE, etc.
@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") //Esta linha define que a configuração CORS se aplicará a todas as URLs do seu aplicativo, ou seja, qualquer rota estará sujeita a essa configuração CORS.
                        .allowedOrigins("http://localhost:3000") // Apenas as solicitações originadas de um site hospedado em http://localhost:3000 serão permitidas.
                        .allowedMethods("GET", "POST", "PUT", "DELETE") //Operações a serem feitas por essa porta
                        .allowCredentials(true); //Isso indica que as solicitações CORS podem incluir credenciais, como cookies ou cabeçalhos de autorização.
                //Como estamos usando isso, não podemos colocar a origem de qualquer lugar (*)
            }
        };
    }
}

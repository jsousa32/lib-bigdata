package io.github.jsousa32.lib_bigdata.application.configuration;

import io.github.jsousa32.lib_bigdata.application.controls.DealboardBuilder;
import io.github.jsousa32.lib_bigdata.application.controls.DealboardService;
import io.github.jsousa32.lib_bigdata.application.entities.dtos.DealboardCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DealboardConfiguration {

    @Bean
    public DealboardService dealboardService(@Autowired(required = false) DealboardCredentials dealboardCredentials) {
        if (dealboardCredentials == null) {
            throw new IllegalArgumentException("DealboardCredentials bean not found. Please define a bean of type DealboardCredentials.");
        }

        return DealboardBuilder.builder(dealboardCredentials.getToken(), dealboardCredentials.getKey());
    }
}

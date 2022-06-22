package dev.coderchris.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.coderchris")
public class AppConfig {
    
    // @Bean("dogProfileService")
    // public DogProfileService getDogProfileService() {
    //     return new DogProfileService(getDogProfileRepository());
    // }

    // @Bean("dogProfileRepository")
    // public DogProfileRepository getDogProfileRepository() {
    //     return new DogProfileRepository();
    // }
}

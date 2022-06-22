package dev.coderchris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.coderchris.config.AppConfig;
import dev.coderchris.service.DogProfileService;

public class App 
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DogProfileService service = applicationContext.getBean("dogProfileService", DogProfileService.class);
        System.out.println(service.list());
        
    }
}

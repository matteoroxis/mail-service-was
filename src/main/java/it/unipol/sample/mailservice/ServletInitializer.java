package it.unipol.sample.mailservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

    /*public static void main(String[] args) {
      SpringApplication.run(ServletInitializer.class, args);
   }*/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServletInitializer.class);
    }

}

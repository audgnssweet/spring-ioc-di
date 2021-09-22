package com.example.encoding;

import com.example.encoding.app.ApplicationContextProvider;
import com.example.encoding.app.Base64Encoder;
import com.example.encoding.app.Encoder;
import com.example.encoding.app.UTF8Encoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class EncodingApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncodingApplication.class, args);
        ApplicationContext context = ApplicationContextProvider.getContext();

        String uri = "www.naver.com/books/it?page=10&size=20";

        Encoder encoder = context.getBean(Encoder.class);

        String encoded = encoder.encode(uri);
        System.out.println("encoded = " + encoded);
    }
}

@Configuration
class IocConfig {

    @Bean
    public Encoder encoder(Base64Encoder base64Encoder) {
        return new Encoder(base64Encoder);
    }

//    @Bean
//    public Encoder encoder(UTF8Encoder utf8Encoder) {
//        return new Encoder(utf8Encoder);
//    }

}
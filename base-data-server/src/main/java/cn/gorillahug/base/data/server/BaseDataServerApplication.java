package cn.gorillahug.base.data.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class BaseDataServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseDataServerApplication.class, args);
    }

}

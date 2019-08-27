package cn.gorillahug.base.data.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan(basePackages="cn")
public class BaseDataServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseDataServerApplication.class, args);
    }

}

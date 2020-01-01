package cn.gorillahug.base.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan(basePackages="cn.gorillahug.base.data.dao")
public class BaseDataServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseDataServerApplication.class, args);
    }

}

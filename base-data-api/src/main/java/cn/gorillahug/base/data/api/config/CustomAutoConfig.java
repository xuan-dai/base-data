package cn.gorillahug.base.data.api.config;

import cn.gorillahug.base.data.api.model.CustomAutoConfigBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author daixuan
 * @version 2019/8/27 23:04
 */
@Configuration
@Slf4j
public class CustomAutoConfig {

    @Bean
    public CustomAutoConfigBean getBaseBean(){
        log.info("------------init CustomAutoConfigBean configuration------------");
        return new CustomAutoConfigBean(12L);
    }
}

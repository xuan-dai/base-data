package cn.gorillahug.base.data.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author daixuan
 * @version 2019/5/25 20:11
 */
@Data
@Component
@ConfigurationProperties(prefix = "sdk-version-whitelist")
public class SdkVersionBean {
    private List<SdkVerWhitelist> list;

    @Data
    public static class SdkVerWhitelist {

        private String version;
        private List<String> appkeys;
    }
}

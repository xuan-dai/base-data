package cn.gorillahug.base.data.server.config;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.util.*;

/**
 * @author daixuan
 * @version 2019/5/25 20:00
 */
@Slf4j
public class YmlConfig {
    private static Map<String, Object> allMap = new HashMap<>();

    static {
        Yaml yaml = new Yaml();
        ClassPathResource classPathResource = new ClassPathResource("application.yml");
        Iterator<Object> result = null;
        try {
            result = yaml.loadAll(classPathResource.getInputStream()).iterator();
        } catch (IOException e) {
            log.error("YmlConfig static loadAll error:{}", e.getMessage());
        }
        while (result.hasNext()) {
            Map map = (Map) result.next();
            iteratorYml(map, null);
        }
    }

    public static void iteratorYml(Map map, String key) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof LinkedHashMap) {
                if (key == null) {
                    iteratorYml((Map) value, key2.toString());
                } else {
                    iteratorYml((Map) value, key + "." + key2.toString());
                }
            }
            if (value instanceof String || value instanceof List) {
                if (key == null) {
                    allMap.put(key2.toString(), value);
                } else {
                    allMap.put(key + "." + key2.toString(), value);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(YmlConfig.allMap);
        Object ss = allMap.get("sdk-version-whitelist.list");
        log.info(JSON.toJSONString(ss));
    }

}

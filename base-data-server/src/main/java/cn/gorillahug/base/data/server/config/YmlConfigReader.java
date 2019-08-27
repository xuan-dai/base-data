package cn.gorillahug.base.data.server.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.util.*;

/**
 * @author daixuan
 * @version 2019/5/25 20:00
 */
@Slf4j
@Component
public class YmlConfigReader {
    private static Map<String, Object> allMap = new HashMap<>();

    public Map<String, Object> reader(String location){
        Yaml yaml = new Yaml();
        ClassPathResource classPathResource = new ClassPathResource(location);
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
        return allMap;
    }

    private void iteratorYml(Map map, String key) {
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
}

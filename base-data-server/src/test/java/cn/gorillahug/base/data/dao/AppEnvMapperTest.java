package cn.gorillahug.base.data.dao;

import cn.gorillahug.base.data.BaseDataServerApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author daixuan
 * @version 2019/9/8 0:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BaseDataServerApplication.class)
@Slf4j
public class AppEnvMapperTest {

    @Autowired
    private AppEnvMapper appEnvMapper;

    @Test
    public void listAll() {
        List<Object> result = appEnvMapper.listAll();
        log.info("listAll result:{}",result);
    }

    @Test
    public void testListBySqlField() {
        Map<String, Object> param = new HashMap<>();
        param.put("appKey", "33e6d530a07f8582677a2cd8");
        param.put("sqlField", "create_time");
        List<String> result = appEnvMapper.listBySqlField(param);
        log.info("listBySqlField result:{}", result);
    }
}
package cn.gorillahug.base.data.config;

import cn.gorillahug.base.data.BaseDataServerApplication;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author daixuan
 * @version 2019/5/27 21:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BaseDataServerApplication.class)
@Slf4j
public class YmlConfigReaderTest {

    @Autowired
    private YmlConfigReader ymlConfigReader;

    @Test
    public void testReader() {
        System.out.println();
        Object ss = ymlConfigReader.reader("sdk.yml").get("sdk-version-whitelist.list");
        log.info(JSON.toJSONString(ss));
    }
}

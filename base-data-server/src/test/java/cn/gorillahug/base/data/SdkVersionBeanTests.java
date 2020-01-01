package cn.gorillahug.base.data;

import cn.gorillahug.base.data.config.SdkVersionBean;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class SdkVersionBeanTests {

    @Autowired
    private SdkVersionBean sdkVersionBean;
    @Test
    public void testGetSdkVersionBean() {
        List<SdkVersionBean.SdkVerWhitelist> list = sdkVersionBean.getList();
        log.info("result:{}", JSON.toJSONString(list));
    }

}

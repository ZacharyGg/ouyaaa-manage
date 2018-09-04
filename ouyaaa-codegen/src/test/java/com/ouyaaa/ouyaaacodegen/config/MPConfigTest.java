package com.ouyaaa.ouyaaacodegen.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author Administrator
 * @Date 2018/9/3 14:32
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MPConfigTest {
    @Test
    public void autoGenerator() throws Exception {
        MPConfig mpConfig = new MPConfig();
    }
}
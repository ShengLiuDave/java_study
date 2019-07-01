package com.study.java.example;

import com.study.java.JavaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @ClassName: LoadPropertiesTest
 * @Description: 测试springboot读取配置文件的几种方式
 * @author: liusheng
 * @date: 2019-06-17 21:03
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-17   liusheng        v1.0.0          Modify reason
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= JavaApplication.class)
public class LoadPropertiesTest {

    @Autowired
    private Values value;

    @Autowired
    private ConfigurationProperties configurationProperties;

    @Autowired
    private PropertySourceValue propertySourceValue;

    @Test
    public void getValueData() {
        System.out.println("name1 = " + value.getName());
        System.out.println("sex1 = " + value.getSex());
        System.out.println("age1 = " + value.getAge());
    }

    @Test
    public void getConfigurationPropertiesData() {
        System.out.println("name2 = " + configurationProperties.getName());
        System.out.println("sex2 = " + configurationProperties.getSex());
        System.out.println("age2 = " + configurationProperties.getAge());
    }

    @Test
    public void getPropertySourceValueData() {
        System.out.println("name3 = " + propertySourceValue.getName());
        System.out.println("sex3 = " + propertySourceValue.getSex());
        System.out.println("age3 = " + propertySourceValue.getAge());
    }

}
    
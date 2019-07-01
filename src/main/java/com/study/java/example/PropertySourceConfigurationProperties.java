package com.study.java.example;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @ClassName: PropertySourceConfigurationProperties
 * @Description: @PropertySource+@ConfigurationProperties注解读取方式
 *               PropertySource不能读取.yml中的值
 * @author: liusheng
 * @date: 2019-06-17 21:59
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-17   liusheng        v1.0.0          Modify reason
 */
@Data
@Component
@ConfigurationProperties(prefix="author")
@PropertySource(value="classpath:application.properties", encoding="utf-8")
public class PropertySourceConfigurationProperties {

    private String name;
    private String sex;
    private Integer age;

}
    
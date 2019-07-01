package com.study.java.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @ClassName: PropertySourceValue
 * @Description: @PropertySource+@Value注解读取方式: 读取指定文件
 *               在配置文件较多的情况下, 建议使用此种方式读取配置文件中的值
 *               可读取.properties和.yml中的值
 * @author: liusheng
 * @date: 2019-06-17 21:52
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-17   liusheng        v1.0.0          Modify reason
 */
@Data
@Component
@PropertySource(value = "classpath:application.yml", encoding = "utf-8")
public class PropertySourceValue {

    @Value("${author.name}")
    private String name;

    @Value("${author.sex}")
    private String sex;

    @Value("${author.age}")
    private Integer age;

}
    
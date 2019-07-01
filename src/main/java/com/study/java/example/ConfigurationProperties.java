package com.study.java.example;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @ClassName: ConfigurationProperties
 * @Description: ConfigurationProperties读取配置文件中的数据
 *               ConfigurationProperties作用在类上，用于注入Bean属性，然后再通过当前Bean获取注入值
 *               只能读取.properties文件中的值, 不能读取.yml文件中的值
 * @author: liusheng
 * @date: 2019-06-17 21:35
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-17   liusheng        v1.0.0          Modify reason
 */
@Data
@Component
/** @ConfigurationProperties(prefix) */
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "author")
public class ConfigurationProperties {

    private String name;
    private String sex;
    private Integer age;

}
    
package com.study.java.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @ClassName: Value
 * @Description: @Value 读取配置文件, 不建议使用, 可读性太差
 *               此方法不能用于各配置文件中有相同key, 不然直接报错
 *               且必须纳入 bean 的管理(@Component), 不然读取不到
 *               只能读取.properties文件中的值, 不能读取.yml文件中的值    
 * @author: liusheng
 * @date: 2019-06-17 20:53
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-17   liusheng        v1.0.0          Modify reason
 */
@Data
@Component
public class Values {

    @Value("${author.name}")
    private String name;

    @Value("${author.sex}")
    private String sex;

    @Value("${author.age}")
    private Integer age;

}
    
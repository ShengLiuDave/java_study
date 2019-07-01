package com.study.java.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright: Copyright (c) 2019 LanRu-Caifu
 *
 * @ClassName: ApcheToolsTest
 * @Description: ab测试
 * @author: liusheng
 * @date: 2019-06-29 18:46
 * @version: v1.0.0
 * ---------------------------------------------------------*
 * Modification History:
 * Date          Author         Version         Description
 * ---------------------------------------------------------*
 * 2019-06-29   liusheng        v1.0.0          Modify reason
 */
@RestController
@RequestMapping("/ab")
public class ApcheToolsTest {

    @GetMapping("/test")
    @ResponseBody
    public String testApcheToolAb() {
        return "ab - Apache HTTP server benchmarking tool";
    }

}
    
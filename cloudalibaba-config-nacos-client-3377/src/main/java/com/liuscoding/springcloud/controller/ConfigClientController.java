package com.liuscoding.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @className: ConfigClientController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 18:50
 */
@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConfigClientController
{
    //冒号后面是取不到值时的默认值
    @Value("${config.info:default_dev}")
    private String configInfo;


    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}

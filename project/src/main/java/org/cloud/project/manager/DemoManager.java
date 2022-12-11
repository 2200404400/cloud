package org.cloud.project.manager;

import org.cloud.project.service.DemoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 业务层，负责
 * 1. 业务的实现
 * 2. 可以调用同包的不同的service
 *
 * @author 22004
 * @date 2022.11.22
 */
@Component
public class DemoManager {
    @Resource
    private DemoService service;

    public void demo() {
        service.demo();
    }
}

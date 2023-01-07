package org.cloud.project.manager;

import org.cloud.project.mapper.DemoMapper;

import javax.annotation.Resource;

/**
 * @author ting
 */
public class DemoManager {
    @Resource
    private DemoMapper demoMapper;

    public void demo() {
        demoMapper.demo();
    }
}

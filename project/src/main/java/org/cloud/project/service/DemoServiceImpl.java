package org.cloud.project.service;

import com.github.yulichang.base.MPJBaseServiceImpl;
import org.cloud.project.entity.Demo;
import org.cloud.project.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 持久层，用于
 * 1. 封装各种查询语句，便于调用，但是一个表只能有一个持久层对象
 * 2. service   方法命名规则，get、set、add、del
 * 3. mapper    方法命名规则，select、update、delete、insert
 *
 * @author 22004
 * @date 2022.11.22
 */
@Service
public class DemoServiceImpl extends MPJBaseServiceImpl<DemoMapper, Demo> implements DemoService {
    @Resource
    private DemoMapper mapper;

    @Override
    public void demo() {
        mapper.demo();

    }
}

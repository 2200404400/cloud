package org.cloud.project.controller;

import lombok.extern.slf4j.Slf4j;
import org.cloud.base.R;
import org.cloud.project.entity.Demo;
import org.cloud.project.manager.DemoManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 控制层，主要作用
 * 1. 客户端访问（web + app）
 * 2. 对入参进行校验（Validated + Swagger）
 * 3. 验证权限
 * 4. 处理返回参数（R对象）
 * 5. 异常处理（统一抓住对象并做日志处理）
 *
 * @author
 */
@Slf4j
@RestController
public class DemoController {
    @Resource
    private DemoManager manager;


    @GetMapping("demo")
    public R demo(Demo demo) {
        try {
            //manager.demo();
            return R.info();
        } catch (Exception e) {
            log.error(this.getClass().getName(), e.getMessage());
            return R.error(e);
        }
    }
}

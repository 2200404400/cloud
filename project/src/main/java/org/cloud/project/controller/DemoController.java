package org.cloud.project.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.cloud.base.R;
import org.cloud.project.entity.Demo;
import org.cloud.project.service.DemoService;
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
 * @author ting
 */
@Slf4j
@RestController
@Api(value = "端点Value", tags = "端点Tags")
public class DemoController {
    @Resource
    private DemoService service;

    @GetMapping("demo")
    @ApiOperation(value = "方法Value", notes = "方法Notes")
    @ApiOperationSupport(order = 0)
    public R<Object> demo(Demo demo) {
        try {
            service.demo();
            return R.info();
        } catch (Exception e) {
            log.error(this.getClass().getName(), e.getMessage());
            return R.error(e);
        }
    }

    @GetMapping("go")
    public R<Object> go() {
        return R.info();
    }
}
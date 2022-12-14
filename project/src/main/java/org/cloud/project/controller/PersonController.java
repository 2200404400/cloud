package org.cloud.project.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.cloud.base.R;
import org.cloud.project.entity.Person;
import org.cloud.project.manager.PersonManager;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 人(Person)表控制层
 *
 * @author ting
 * @since 2023-01-07 19:09:44
 */
@Slf4j
@RestController
@RequestMapping("person")
public class PersonController {
    @Resource
    private PersonManager manager;

    /**
     * 获取
     *
     * @param page 分页
     * @param vo   入参
     * @return PersonDTO集合
     */
    @GetMapping("getList")
    public R<Page<Person>> getList(Page<Person> page, Person vo) {
        try {
            Page<Person> personList = manager.getList(page, vo);
            return R.info(personList);
        } catch (Exception e) {
            log.error("Person > getList：操作失败");
            return R.error(e);
        }
    }

    /**
     * 增加
     *
     * @param vo 入参
     * @return 响应消息
     */
    @PostMapping("add")
    public R<String> add(Person vo) {
        try {
            manager.add(vo);
            return R.info();
        } catch (Exception e) {
            log.error("Person > add：操作失败");
            return R.error(e);
        }
    }

    /**
     * 更新
     *
     * @param vo 入参
     * @return 响应消息
     */
    @PutMapping("set")
    public R<String> set(Person vo) {
        try {
            manager.set(vo);
            return R.info();
        } catch (Exception e) {
            log.error("Person > set：操作失败");
            return R.error(e);
        }
    }

    /**
     * 删除
     *
     * @param ids id集合
     * @return 响应消息
     */
    @DeleteMapping("del")
    public R<String> del(List<String> ids) {
        try {
            manager.del(ids);
            return R.info();
        } catch (Exception e) {
            log.error("Person > del：操作失败");
            return R.error(e);
        }
    }
}


package org.cloud.project.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.cloud.project.entity.Person;
import org.cloud.project.service.PersonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 人(Person)表控制层
 *
 * @author makejava
 * @since 2023-01-07 15:15:50
 */
@RestController
@RequestMapping("person")
public class PersonController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PersonService personService;

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param person 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Person> page, Person person) {
        return success(this.personService.page(page, new QueryWrapper<>(person)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.personService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param person 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Person person) {
        return success(this.personService.save(person));
    }

    /**
     * 修改数据
     *
     * @param person 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Person person) {
        return success(this.personService.updateById(person));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.personService.removeByIds(idList));
    }
}


package org.cloud.project.manager.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.cloud.project.entity.Person;
import org.cloud.project.manager.PersonManager;
import org.cloud.project.service.PersonService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 人(Person)表服务实现类
 *
 * @author ting
 * @since 2023-01-07 19:09:44
 */
@Component
public class PersonManagerImpl implements PersonManager {
    @Resource
    private PersonService service;

    /**
     * 获取筛选数据
     *
     * @param page 分页
     * @param vo   筛选
     * @return PersonDTO集合
     */
    @Override
    public Page<Person> getList(Page<Person> page, Person vo) {
        return service.getListByPageAndVO(page, vo);
    }

    /**
     * 增加
     *
     * @param vo 入参
     */
    @Override
    public void add(Person vo) {
        service.save(vo);
    }

    /**
     * 更新
     *
     * @param vo 入参
     */
    @Override
    public void set(Person vo) {
        service.updateById(vo);
    }

    /**
     * 通过id删除数据
     *
     * @param ids id集合
     */
    @Override
    public void del(List<String> ids) {
        service.removeByIds(ids);
    }
}

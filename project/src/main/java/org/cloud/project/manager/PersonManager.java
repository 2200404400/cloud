package org.cloud.project.manager;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.cloud.project.entity.Person;

import java.util.List;

/**
 * 人(Person)表服务接口
 *
 * @author ting
 * @since 2023-01-07 19:09:44
 */
public interface PersonManager {
    /**
     * 获取筛选数据
     *
     * @param page 分页
     * @param vo   筛选
     * @return PersonDTO集合
     */
    Page<Person> getList(Page<Person> page, Person vo);

    /**
     * 增加
     *
     * @param vo 入参
     */
    void add(Person vo);

    /**
     * 更新
     *
     * @param vo 入参
     */
    void set(Person vo);

    /**
     * 通过id删除数据
     *
     * @param ids id集合
     */
    void del(List<String> ids);
}

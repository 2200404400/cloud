package org.cloud.project.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.base.MPJBaseService;
import org.cloud.project.entity.Person;

/**
 * 人(Person)表服务接口
 *
 * @author ting
 * @since 2023-01-07 19:09:44
 */
public interface PersonService extends MPJBaseService<Person> {
    /**
     * 获取筛选数据
     *
     * @param page 分页
     * @param vo   筛选
     * @return PersonDTO集合
     */
    Page<Person> getListByPageAndVO(Page<Person> page, Person vo);
}

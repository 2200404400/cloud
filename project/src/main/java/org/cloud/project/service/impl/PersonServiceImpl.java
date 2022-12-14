package org.cloud.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.base.MPJBaseServiceImpl;
import org.cloud.project.dao.PersonDao;
import org.cloud.project.entity.Person;
import org.cloud.project.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 人(Person)表服务访问实现类
 *
 * @author ting
 * @since 2023-01-07 19:09:44
 */
@Service
public class PersonServiceImpl extends MPJBaseServiceImpl<PersonDao, Person> implements PersonService {
    @Resource
    private PersonDao dao;

    /**
     * 获取筛选数据
     *
     * @param page 分页
     * @param vo   筛选
     * @return PersonDTO集合
     */
    @Override
    public Page<Person> getListByPageAndVO(Page<Person> page, Person vo) {
        return dao.selectPage(page, this.getWrapperByEq(vo));
    }

    /**
     * 将输入不为空的值全部作为等于判断
     *
     * @param vo 入参
     * @return 条件构造器
     */
    private LambdaQueryWrapper<Person> getWrapperByEq(Person vo) {
        LambdaQueryWrapper<Person> wrapper = this.getWrapper();
        if (vo != null) {
            Map<SFunction<Person, ?>, Object> map = new HashMap<>();

            // 主键
            if (vo.getId() != null) {
                map.put(Person::getId, vo.getId());
            }
            // 名称
            if (vo.getName() != null) {
                map.put(Person::getName, vo.getName());
            }
            // 身高
            if (vo.getHeight() != null) {
                map.put(Person::getHeight, vo.getHeight());
            }
            // 外键
            if (vo.getFkStudentId() != null) {
                map.put(Person::getFkStudentId, vo.getFkStudentId());
            }
            // 删除状态
            if (vo.getIsDelete() != null) {
                map.put(Person::getIsDelete, vo.getIsDelete());
            }
            // 创建时间
            if (vo.getCreateDate() != null) {
                map.put(Person::getCreateDate, vo.getCreateDate());
            }
            // 更新时间
            if (vo.getUpdateDate() != null) {
                map.put(Person::getUpdateDate, vo.getUpdateDate());
            }
            // 乐观锁
            if (vo.getVersion() != null) {
                map.put(Person::getVersion, vo.getVersion());
            }

            wrapper.allEq(map);
        }
        return wrapper;
    }

    /**
     * 获取条件构造器
     *
     * @return 条件构造器
     */
    private LambdaQueryWrapper<Person> getWrapper() {
        LambdaQueryWrapper<Person> wrapper = Wrappers.lambdaQuery(Person.class);
        return wrapper;
    }
}

package org.cloud.project.manager.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.cloud.project.entity.School;
import org.cloud.project.manager.SchoolManager;
import org.cloud.project.service.SchoolService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学校(School)表服务实现类
 *
 * @author ting
 * @since 2023-01-07 19:09:43
 */
@Component
public class SchoolManagerImpl implements SchoolManager {
    @Resource
    private SchoolService service;

    /**
     * 获取筛选数据
     *
     * @param page 分页
     * @param vo   筛选
     * @return PersonDTO集合
     */
    @Override
    public Page<School> getList(Page<School> page, School vo) {
        return service.getListByPageAndVO(page, vo);
    }

    /**
     * 增加
     *
     * @param vo 入参
     */
    @Override
    public void add(School vo) {
        service.save(vo);
    }

    /**
     * 更新
     *
     * @param vo 入参
     */
    @Override
    public void set(School vo) {
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

package org.cloud.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.base.MPJBaseServiceImpl;
import org.cloud.project.dao.SchoolDao;
import org.cloud.project.entity.School;
import org.cloud.project.service.SchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 学校(School)表服务访问实现类
 *
 * @author ting
 * @since 2023-01-07 19:09:43
 */
@Service
public class SchoolServiceImpl extends MPJBaseServiceImpl<SchoolDao, School> implements SchoolService {
    @Resource
    private SchoolDao dao;

    /**
     * 获取筛选数据
     *
     * @param page 分页
     * @param vo   筛选
     * @return PersonDTO集合
     */
    @Override
    public Page<School> getListByPageAndVO(Page<School> page, School vo) {
        return dao.selectPage(page, this.getWrapperByEq(vo));
    }

    /**
     * 将输入不为空的值全部作为等于判断
     *
     * @param vo 入参
     * @return 条件构造器
     */
    private LambdaQueryWrapper<School> getWrapperByEq(School vo) {
        LambdaQueryWrapper<School> wrapper = this.getWrapper();
        if (vo != null) {
            Map<SFunction<School, ?>, Object> map = new HashMap<>();

            // 主键
            if (vo.getId() != null) {
                map.put(School::getId, vo.getId());
            }
            // 名称
            if (vo.getName() != null) {
                map.put(School::getName, vo.getName());
            }
            // 类型
            if (vo.getSchoolType() != null) {
                map.put(School::getSchoolType, vo.getSchoolType());
            }
            // 删除状态
            if (vo.getIsDelete() != null) {
                map.put(School::getIsDelete, vo.getIsDelete());
            }
            // 创建时间
            if (vo.getCreateDate() != null) {
                map.put(School::getCreateDate, vo.getCreateDate());
            }
            // 更新时间
            if (vo.getUpdateDate() != null) {
                map.put(School::getUpdateDate, vo.getUpdateDate());
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
    private LambdaQueryWrapper<School> getWrapper() {
        LambdaQueryWrapper<School> wrapper = Wrappers.lambdaQuery(School.class);
        return wrapper;
    }
}

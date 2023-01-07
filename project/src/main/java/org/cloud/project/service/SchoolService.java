package org.cloud.project.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.base.MPJBaseService;
import org.cloud.project.entity.School;

/**
 * 学校(School)表服务接口
 *
 * @author ting
 * @since 2023-01-07 19:09:43
 */
public interface SchoolService extends MPJBaseService<School> {
    /**
     * 获取筛选数据
     *
     * @param page 分页
     * @param vo   筛选
     * @return PersonDTO集合
     */
    Page<School> getListByPageAndVO(Page<School> page, School vo);
}

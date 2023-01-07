package org.cloud.project.manager;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.cloud.project.entity.School;

import java.util.List;

/**
 * 学校(School)表服务接口
 *
 * @author ting
 * @since 2023-01-07 19:09:43
 */
public interface SchoolManager {
    /**
     * 获取筛选数据
     *
     * @param page 分页
     * @param vo   筛选
     * @return PersonDTO集合
     */
    Page<School> getList(Page<School> page, School vo);

    /**
     * 增加
     *
     * @param vo 入参
     */
    void add(School vo);

    /**
     * 更新
     *
     * @param vo 入参
     */
    void set(School vo);

    /**
     * 通过id删除数据
     *
     * @param ids id集合
     */
    void del(List<String> ids);
}

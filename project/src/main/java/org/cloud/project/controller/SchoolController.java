package org.cloud.project.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.cloud.base.R;
import org.cloud.project.entity.School;
import org.cloud.project.manager.SchoolManager;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学校(School)表控制层
 *
 * @author ting
 * @since 2023-01-07 19:09:43
 */
@Slf4j
@RestController
@RequestMapping("school")
public class SchoolController {
    @Resource
    private SchoolManager manager;

    /**
     * 获取
     *
     * @param page 分页
     * @param vo   入参
     * @return PersonDTO集合
     */
    @GetMapping("getList")
    public R<Page<School>> getList(Page<School> page, School vo) {
        try {
            Page<School> personList = manager.getList(page, vo);
            return R.info(personList);
        } catch (Exception e) {
            log.error("School > getList：操作失败");
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
    public R<String> add(School vo) {
        try {
            manager.add(vo);
            return R.info();
        } catch (Exception e) {
            log.error("School > add：操作失败");
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
    public R<String> set(School vo) {
        try {
            manager.set(vo);
            return R.info();
        } catch (Exception e) {
            log.error("School > set：操作失败");
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
            log.error("School > del：操作失败");
            return R.error(e);
        }
    }
}


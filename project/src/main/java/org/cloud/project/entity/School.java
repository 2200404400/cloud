package org.cloud.project.entity;

import lombok.Data;

import java.util.Date;

/**
 * 学校(School)实体类
 *
 * @author ting
 * @since 2023-01-07 19:09:43
 */
@Data
public class School {
    /**
     * 主键
     */
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 类型
     */
    private Integer schoolType;
    /**
     * 删除状态
     */
    private Integer isDelete;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 更新时间
     */
    private Date updateDate;
}

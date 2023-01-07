package org.cloud.project.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 人(Person)实体类
 *
 * @author ting
 * @since 2023-01-07 19:09:44
 */
@Data
public class Person {
    /**
     * 主键
     */
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 身高
     */
    private BigDecimal height;
    /**
     * 外键
     */
    private String fkStudentId;
    /**
     * 删除状态
     */
    @TableLogic(value = "0", delval = "1")
    private Integer isDelete;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;
    /**
     * 乐观锁
     */
    @Version
    private String version;
}

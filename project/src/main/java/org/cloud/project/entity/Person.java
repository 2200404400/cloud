package org.cloud.project.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 人(Person)表实体类
 *
 * @author makejava
 * @since 2023-01-07 15:16:24
 */
@SuppressWarnings("serial")
public class Person extends Model<Person> {
    //主键
    private Integer id;
    //名称
    private String name;
    //身高
    private BigDecimal height;
    //学生外键
    private Integer fkStudentId;
    //删除状态
    private Integer isDelete;
    //创建时间
    private Date createDate;
    //更新时间
    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public Integer getFkStudentId() {
        return fkStudentId;
    }

    public void setFkStudentId(Integer fkStudentId) {
        this.fkStudentId = fkStudentId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}


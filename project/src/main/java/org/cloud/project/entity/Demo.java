package org.cloud.project.entity;

import lombok.Data;

/**
 * 实体类
 *
 * @author 22004
 */
@Data
public class Demo {
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 是否是猫
     */
    private boolean cat;
    /**
     * 身高
     */
    private double height;
}

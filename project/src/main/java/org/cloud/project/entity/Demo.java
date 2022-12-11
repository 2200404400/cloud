package org.cloud.project.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体类
 *
 * @author 22004
 * @date 2022.11.22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "演示类")
public class Demo {
    /**
     * 名字
     */
    @ApiModelProperty(value = "名字", hidden = true)
    private String name;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄", hidden = true)
    private int age;
    /**
     * 是否是猫
     */
    @ApiModelProperty(value = "是不是猫", hidden = true)
    private boolean isCat;
    /**
     * 身高
     */
    @ApiModelProperty(value = "身高", hidden = true)
    private double height;
}

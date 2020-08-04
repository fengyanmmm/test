package com.zhou.javakc.modules.system.dictionary.entity;

import com.zhou.javakc.component.base.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @version V1.0.0
 * @author zhouhonggang
 * @className Dictionary
 * @packageName com.zhou.javakc.modules.system.dictionary.entity
 * @description 数据字典对象
 * @date 2020-07-12 10:35
 */
@Getter
@Setter
@ToString
@ApiModel("【系统管理】【数据字典管理】数据字典参数")
public class Dictionary extends BaseEntity {

    @ApiModelProperty(value = "字典CODE(类型:gender)", dataType = "string")
    private String code;
    @ApiModelProperty(value = "字典名称(表现值:男)", dataType = "string")
    private String name;
    @ApiModelProperty(value = "字典数值(真实值:1)", dataType = "int")
    private int vals;
    @ApiModelProperty(value = "字典排序", dataType = "int")
    private int sorts;

}

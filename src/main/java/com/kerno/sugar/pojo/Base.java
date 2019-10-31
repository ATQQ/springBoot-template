package com.kerno.sugar.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

/**
 * @author sugar
 * 2019/10/30
 * 11:22
 * 通用字段
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Base {

    private Date createDate;
    private Date updateDate;
    private Integer updateCount;
}

package com.kerno.sugar.pojo.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kerno.sugar.pojo.Base;
import lombok.*;

import java.util.Date;

/**
 * @author sugar
 * 2019/10/30
 * 11:23
 * 用户对象
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User extends Base {
    private Integer userId;
    private String password;
    private String studentId;
    private String school;
    private int state;
    private int power;
    private Date punishDate;

    @Override
    public String toString() {
        return super.toString()+"User{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", studentId='" + studentId + '\'' +
                ", school='" + school + '\'' +
                ", state=" + state +
                ", power=" + power +
                ", punishDate=" + punishDate +
                '}';
    }
}

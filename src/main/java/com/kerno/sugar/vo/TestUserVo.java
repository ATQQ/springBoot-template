package com.kerno.sugar.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kerno.sugar.pojo.user.User;
import lombok.*;

/**
 * @author sugar
 * 2019/10/31
 * 18:11
 * 包装类测试
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class TestUserVo {

    private User user;
    private String testParam;
}

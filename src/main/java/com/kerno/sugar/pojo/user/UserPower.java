package com.kerno.sugar.pojo.user;

import java.util.Arrays;

/**
 * @author sugar
 * 2019/10/30
 * 12:29
 * 用户权限
 */

public enum UserPower {
    /**
     * 普通用户
     */
    ORDINARY(0),

    /**
     * 管理员
     */
    ADMIN(1);

    private final Integer powerId;


    UserPower(final Integer powerId) {
        this.powerId = powerId;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public static UserPower idToPower(final int id){
        return Arrays.stream(values()).filter(state->state.getPowerId()==id).findFirst().orElse(
                null);
    }
}

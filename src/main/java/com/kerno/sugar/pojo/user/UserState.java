package com.kerno.sugar.pojo.user;

import java.util.Arrays;

/**
 * @author sugar
 * 2019/10/30
 * 12:03
 * 用户状态
 */

public enum UserState {
    /**
     * 正常
     */
    ACTIVE(0),

    /**
     * 注册中
     */
    REGISTERING(1),

    /**
     * 处罚中
     */
    PUNISH(2),
    ;

    private final Integer stateId;

    UserState(final Integer stateId){
        this.stateId=stateId;
    }

    public Integer getStateId(){
        return stateId;
    }

    public static UserState idToState(final int id){
        return Arrays.stream(values()).filter(state->state.getStateId()==id).findFirst().orElse(
                null);
    }
}

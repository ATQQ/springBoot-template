package com.kerno.sugar.service;

import com.kerno.sugar.pojo.user.User;

/**
 * @author sugar
 * 2019/10/31
 * 17:19
 * 类作用描述
 */

public interface TestService {

    /**
     * 测试用户增加
     */
    int testUserAdd(User user);

    /**
     * 测试用户查询
     * @param id 主键
     */
    User findUser(Integer id);
}

package com.kerno.sugar.controller;
/*
 *@author sugar
 *2019/10/30
 *8:32
 */

import com.kerno.sugar.constants.ApiPathConstants;
import com.kerno.sugar.dto.Result;
import com.kerno.sugar.pojo.user.User;
import com.kerno.sugar.pojo.user.UserPower;
import com.kerno.sugar.pojo.user.UserState;
import com.kerno.sugar.service.TestService;
import com.kerno.sugar.vo.TestUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class testController {

    @Autowired
    private TestService testService;
    /**
     * get测试
     */
    @GetMapping(value = ApiPathConstants.TEST_GET)
    public Object test(){
//        int i=1/0;
        return Result.success();
    }

    /**
     * 测试增加用户
     * @param user
     * @return
     */
    @PostMapping(value =ApiPathConstants.TEST_ADD_USER )
    public Object testAddUser(@RequestBody  User user){
        user.setPower(UserPower.ORDINARY.getPowerId());
        user.setState(UserState.REGISTERING.getStateId());
        testService.testUserAdd(user);
        return Result.success();
    }


    /**
     * 测试查询用户
     * @param id
     * @return
     */
    @GetMapping(value = ApiPathConstants.TEST_GET_USER_BYID)
    public Object testGetUser(@PathVariable("user_id") Integer id){
        User user = testService.findUser(id);
        System.out.println(user);
        return Result.success(user);
    }

    /**
     * 包装类测试
     * @param userVo
     */
    @PostMapping(value = ApiPathConstants.TEST_POST_USERVO)
    public Object testGetUserVo(@RequestBody TestUserVo userVo){
        System.out.println(userVo);
        return Result.success(userVo);
    }
}

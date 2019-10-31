package com.kerno.sugar.mapper;

import com.kerno.sugar.pojo.user.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author sugar
 * 2019/10/30
 * 11:38
 * 接口描述
 */
@Repository
public interface UserMapper  extends BaseMapper<User>{
    @Override
    @Insert("insert into user(password,student_id,school,state,power) values(#{password},#{studentId},#{school},#{state},#{power}) ")
    int add(User user);

    @Override
    @Select("select * from user where user_id=#{id}")
    User find(int id);
}

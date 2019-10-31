package com.kerno.sugar.constants;

/**
 * @author sugar
 * 2019/10/30
 * 8:40
 * API路径
 */

public class ApiPathConstants {

    private static final String FLEA_MARKET="fleamarket/api";

    /**
     * 测试部分API
     */
    private static final String TEST=FLEA_MARKET+"/test";

    public static final String TEST_GET=TEST+"/get";

    public static final String TEST_ADD_USER=TEST+"/addUser";

    public static final String TEST_GET_USER_BYID=TEST+"/getUser/{user_id}";

    public static final String TEST_POST_USERVO=TEST+"/uservo";


}

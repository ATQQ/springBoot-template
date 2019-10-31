import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kerno.sugar.pojo.user.User;
import com.kerno.sugar.util.JsonUtil;
import com.kerno.sugar.util.TokenUtil;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sugar
 * 2019/10/31
 * 18:51
 * jackson转换测试
 */

public class jsonTest {

    @Test
    public void UserToJson() throws Exception {
        Map<String,Object> map=new HashMap<>();
        map.put("createDate",new Date());

        User user= User.builder().userId(2).password("abcddsd")
                .power(1)
                .state(0)
                .punishDate(new Date())
                .school("西南石油阿雪").build();
        map.put("user",user);

        String value = JsonUtil.objToStr(map);
        Map map1 = (Map) JsonUtil.strToObj(value,map.getClass());
        System.out.println(map.get("user"));
    }

    @Test
    public void testCreateToken() throws Exception {
        User user= User.builder().userId(2).password("abcddsd")
                .power(1)
                .state(0)
                .punishDate(new Date())
                .school("西南石油阿雪").build();
        String userToken = TokenUtil.create(user, 30);
        System.out.println(userToken);
        User user1 = TokenUtil.getUser(userToken);
        System.out.println(user1);
    }
}

import com.kerno.sugar.pojo.user.User;
import com.kerno.sugar.pojo.user.UserPower;
import com.kerno.sugar.pojo.user.UserState;
import org.junit.Test;

/**
 * @author sugar
 * 2019/10/30
 * 11:29
 * 普通对象测试
 */

public class pojoTest {

    @Test
    public void Test1(){
        System.out.println(new User());
    }

    @Test
    public void testEnum(){
        System.out.println(UserState.ACTIVE.getStateId());
        System.out.println(UserState.idToState((1)));
        System.out.println(UserPower.ORDINARY.getPowerId());
        System.out.println(UserPower.idToPower(1));
    }
}

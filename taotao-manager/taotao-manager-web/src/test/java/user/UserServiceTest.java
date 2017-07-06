package user;

import net.wdsoft.taotao.service.user.impl.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by jwd on 2017/6/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext*.xml")
public class UserServiceTest {

    @Autowired
    IUserService userService;

    @Test
    public void getUserByIdTest() {
        User user = userService.getUserById(1);
        Assert.notNull(user);
    }

}

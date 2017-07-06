package net.wdsoft.taotao.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jwd on 2017/6/22.
 */
@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int userId) {
        return userMapper.getUserById(userId);
    }
}

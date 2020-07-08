package com.ssm.service.impl;

import com.ssm.dao.IUserDao;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/8
 * @Description: com.ssm.service.impl
 * @versio: 1.0
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

    @Override
    public int insert(User user) {
        return 0;
    }
}

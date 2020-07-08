package com.ssm.service;

import com.ssm.model.User;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/8
 * @Description: com.ssm.service
 * @versio: 1.0
 */
public interface IUserService {
    User selectUser(long userId);

    int insert(User user);
}

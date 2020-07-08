package com.ssm.dao;

import com.ssm.model.User;

/**
 * @Auther: http://www.tanwei.com
 * @Date: 2020/7/8
 * @Description: com.ssm.dao
 * @versio: 1.0
 */
public interface IUserDao {
    User selectUser(long id);
}

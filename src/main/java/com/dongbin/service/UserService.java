package com.dongbin.service;

import com.dongbin.dao.UserMapper;
import com.dongbin.model.User;
import com.dongbin.model.UserExample;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dongbin on 2018/4/15.
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User getUserByName(String name) {

        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name);
        List<User> userList = userMapper.selectByExample(example);

        if (!CollectionUtils.isEmpty(userList)) {
            return userList.get(0);
        }
        return null;
    }

}

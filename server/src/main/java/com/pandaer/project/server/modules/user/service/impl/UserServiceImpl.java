package com.pandaer.project.server.modules.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pandaer.project.server.modules.user.entity.User;
import com.pandaer.project.server.modules.user.mapper.UserMapper;
import com.pandaer.project.server.modules.user.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {


    @Override
    public User addUser(User user) {
        save(user);
        return user;
    }
}





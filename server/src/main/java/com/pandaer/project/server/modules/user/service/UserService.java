package com.pandaer.project.server.modules.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pandaer.project.server.modules.user.entity.User;

/**
* @author pandaer
* @description 针对表【user】的数据库操作Service
* @createDate 2024-04-24 15:38:14
*/
public interface UserService extends IService<User> {
    User addUser(User user);
}

package cn.bdqn.service.impl;

import cn.bdqn.dao.users.UsersDao;
import cn.bdqn.dao.users.impl.UsersDaoImpl;
import cn.bdqn.entity.Users;
import cn.bdqn.service.UserService;

public class UserServiceImpl implements UserService {
    UsersDao usersDao = new UsersDaoImpl();

    public boolean getUser(Users users) {
        return usersDao.getUsers(users) == null;
    }
}

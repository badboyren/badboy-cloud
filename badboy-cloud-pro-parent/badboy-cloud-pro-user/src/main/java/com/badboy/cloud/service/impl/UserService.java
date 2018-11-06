package com.badboy.cloud.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badboy.cloud.dao.UserDao;
import com.badboy.cloud.domain.User;
import com.badboy.cloud.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	public UserDao userDao;
	
	@Override
	public User getUserInfo(String uuid) {
		User user = new User();
		user.setName("张三："+uuid);
		user.setUuid(uuid);
		user.setBirthday(new Date());
		userDao.getUserInfo(uuid);
		return user;
	}

}

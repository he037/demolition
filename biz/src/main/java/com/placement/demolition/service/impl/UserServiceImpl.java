package com.placement.demolition.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.demolition.dao.UserDao;
import com.placement.demolition.model.User;
import com.placement.demolition.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User selectByPromaryKey(Long id) {

		return userDao.selectByPrimaryKey(id);
	}

}

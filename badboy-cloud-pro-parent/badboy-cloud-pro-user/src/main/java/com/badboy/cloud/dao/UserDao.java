package com.badboy.cloud.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.badboy.cloud.domain.User;

@Mapper
public interface UserDao {
	public HashMap getUserInfo(String uuid);
}

package com.cblog.service.impl;

import com.cblog.dao.test1.UserDao;
import com.cblog.domain.User;
import com.cblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    /*
    * 报错是因为idea的报错不是程序本身
    * */
    @Autowired
    private UserDao userDao;

    /*
    * 断点已经进来
    * */
	@Override
	public int saveUserInfo(Map<String,Object> map) {
		User user = new User();
		user.setUserName((String) map.get("userName"));
		user.setPassWord((String) map.get("passWord"));
		user.setUid(91);
		int a = userDao.saveUser(user);
		return a;
	}
}

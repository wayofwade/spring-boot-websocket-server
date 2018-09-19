package com.cblog.service.impl;

import com.cblog.dao.test1.TestDao;
import com.cblog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    /*
    * 报错是因为idea的报错不是程序本身
    * */
    @Autowired
    private TestDao testDao;

    /*
    * 断点已经进来
    * */
	@Override
	public String testMybatis() {
		Map<String, Object> map=new HashMap<>();
		map.put("userName", "yzk");
		map.put("passWord", "test");
		testDao.saveTest(map);
		return "测试";
	}
}

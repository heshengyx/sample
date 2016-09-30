package com.grg.sample;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.grg.sample.entity.Group;
import com.grg.sample.entity.User;

public class JsonTest {

	public static void main(String[] args) {
		Group group = new Group();
		group.setId(0L);
		group.setName("admin");

		User guestUser = new User();
		guestUser.setId(2L);
		guestUser.setName("guest");
		guestUser.setDate(new Date());

		User rootUser = new User();
		rootUser.setId(3L);
		rootUser.setName("root");

		group.addUser(guestUser);
		group.addUser(rootUser);

		String jsonString = JSON.toJSONString(group);

		System.out.println(jsonString);
		
		int i = 1/0;
	}

}

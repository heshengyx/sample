package com.grg.sample;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import com.grg.sample.dao.MemberDaoImpl;
import com.grg.sample.entity.Member;

public class RedisTest {

	private ApplicationContext applicationContext;
	private RedisTemplate<String, Member> redisTemplate;
	private MemberDaoImpl memberDao;

	@SuppressWarnings("unchecked")
	@Before
	public void setup() {
		applicationContext = new ClassPathXmlApplicationContext(
				"classpath*:redis.xml");
		redisTemplate = (RedisTemplate<String, Member>) applicationContext.getBean("redisTemplate");
		memberDao = new MemberDaoImpl();
		memberDao.setRedisTemplate(redisTemplate);
	}
	
	@Test
	public void testAdd() {
		Member member = new Member();
		member.setId("1");
		member.setNickname("zhangsan");
		try {
			memberDao.add(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testGet() {
		Member member = memberDao.get("1");
		System.out.println(member.getNickname());
	}
}

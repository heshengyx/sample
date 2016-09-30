package com.grg.sample.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.serializer.RedisSerializer;

import com.grg.sample.entity.Member;

public class MemberDaoImpl extends RedisGeneratorDao<String, Member> implements
		MemberDao {

	public int save() {
		redisTemplate.randomKey();
		return 0;
	}

	public int add(final Member member) {
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			public Boolean doInRedis(RedisConnection connection)
					throws DataAccessException {
				RedisSerializer<String> serializer = getRedisSerializer();
				byte[] key = serializer.serialize(member.getId());
				byte[] name = serializer.serialize(member.getNickname());
				return connection.setNX(key, name);
			}
		});
		return 0;
	}

	public Member get(final String keyId) {
		Member result = redisTemplate.execute(new RedisCallback<Member>() {
			public Member doInRedis(RedisConnection connection)
					throws DataAccessException {
				RedisSerializer<String> serializer = getRedisSerializer();
				byte[] key = serializer.serialize(keyId);
				byte[] value = connection.get(key);
				if (value == null) {
					return null;
				}
				String nickname = serializer.deserialize(value);
				return new Member(keyId, nickname);
			}
		});
		return result;
	}
}

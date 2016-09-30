package com.grg.sample.dao;

import com.grg.sample.entity.Member;

public interface MemberDao {

	int save();
	int add(Member member);
	
	 Member get(String keyId);
}

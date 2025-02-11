package com.example.member;

import java.util.List;
import java.util.Map;

public interface MemberMapper {
	int create(MemberVO vo);
	MemberVO read(int m_num);
	int update(MemberVO vo);
	int delete(int m_num);
	List<MemberVO> list();
	int checkID(String id);
	MemberVO readById(String m_id);
	int passwd_check(Map map);
	int passwd_update(Map map);
	int recent_update(int m_num);
	int login(Map map);

}

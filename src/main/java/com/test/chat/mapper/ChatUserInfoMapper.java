package com.test.chat.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.test.chat.vo.ChatUserInfoVO;

@Mapper
public interface ChatUserInfoMapper {

	public int insertChatUserInfo(ChatUserInfoVO chatUser);
	public ChatUserInfoVO selectChatUserInfoById(int chatUiNum);
}

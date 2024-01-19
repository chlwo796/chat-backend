package com.test.chat.service;

import org.springframework.stereotype.Service;

import com.test.chat.mapper.ChatUserInfoMapper;
import com.test.chat.vo.ChatUserInfoVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChatUserInfoService {

	private final ChatUserInfoMapper chatUserMapper;

	public ChatUserInfoVO join(ChatUserInfoVO chatUser) {
		if(chatUserMapper.insertChatUserInfo(chatUser) == 1) {
			return chatUser;
		}
		return null;
	}
}

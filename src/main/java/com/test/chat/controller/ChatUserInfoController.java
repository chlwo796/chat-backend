package com.test.chat.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.chat.service.ChatUserInfoService;
import com.test.chat.vo.ChatUserInfoVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ChatUserInfoController {

	private final ChatUserInfoService chatUserService;

	@PostMapping("/api/join")
	public ChatUserInfoVO join(@RequestBody ChatUserInfoVO chatUser) {
		return chatUserService.join(chatUser);
	}
}

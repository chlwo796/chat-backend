package com.test.chat.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChatUserInfoVO {
	private int chiNum;
	private String chiId;
	private String chiPwd;
	private String chiName;
}

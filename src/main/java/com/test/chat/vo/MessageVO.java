package com.test.chat.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MessageVO {

	private String message;
	private String sentTime;
	private String receivedTime;
	private String sender;
	private String direction;
	private String position;
	private String type;
	private String payload;
	private int senderUiNum;
	private int receiveUiNum;
}

package com.zhan.app.redis_client;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class SubMessageDelegateListener implements MessageListener {

	public void onMessage(Message arg0, byte[] arg1) {
		System.out.println("======onMessage=====");
	}

}

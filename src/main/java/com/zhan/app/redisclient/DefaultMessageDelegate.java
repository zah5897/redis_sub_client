package com.zhan.app.redisclient;

import java.io.Serializable;

public class DefaultMessageDelegate {
	public void handleMessage(Serializable message, String channel) {
		System.out.println(message);
	}
}

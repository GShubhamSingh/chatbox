package com.coder.shubham.chatroom;

import redis.clients.jedis.JedisPubSub;

public class Subscriber extends JedisPubSub {

	@Override
	public void onMessage(String channel, String message) {
		
		System.out.println(message);
		
	}

	@Override
	public void onPMessage(String pattern, String channel, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPSubscribe(String arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPUnsubscribe(String arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSubscribe(String channel, int no) {
		System.err.println("Welcome to the chatroom ShareNLearn");
		System.err.println("========================================");
		
	}

	@Override
	public void onUnsubscribe(String channel, int arg1) {
		System.err.println("==========================================");
		System.err.println("chatroom has been closed See Ya Later");
		
		
	}

}

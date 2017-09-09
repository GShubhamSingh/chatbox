package com.coder.shubham.chatroom;

import redis.clients.jedis.Jedis;
/**
 * This class will be providing the chat box window to view messages by subscribing to particular channel
 * @author shubham
 *
 */
public class ChatRoom {
	
	/**
	 * The method is used to subscribe the channel and will act as Chatbox window.
	 * messages from multiple publisher who has subscribed to the channel will be displayed.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//channel name
		final String CHANNEL ="ShareNLearn";
		
		//connection
		Jedis jedis = new Jedis("localhost");
		
		//subscribe a particular channel
		jedis.subscribe(new Subscriber(), CHANNEL);
	}
}

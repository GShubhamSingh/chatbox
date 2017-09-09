package com.coder.shubham.chatroom;

import java.util.Scanner;

import redis.clients.jedis.Jedis;
/**
 * This class is used to create a instance of a user and post messages
 * @author DIGGANT
 *
 */
public class Publisher {
	/**
	 * This method create a new instance for user to connect to the chatroom and post the message 
	 * @param args
	 */
	 public static void main(String[] args) {
		 //channel name
		 final String CHANNEL ="ShareNLearn";
		 
		 //connection
		 Jedis jedis = new Jedis("localhost");
		 
		 //Add User to chatroom
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the publisher Name:");
	      String publisherName =scanner.nextLine();
	      jedis.publish(CHANNEL,"Chatroom  Share N Learn welcomes "+publisherName);
	      System.out.println("Thank you for joining the chatroom Share N Learn, Keep Sharing Keep Learning");
	      
	      //Post Messages to chatroom
	      while (true){
	          System.out.println("Post your message...");
	          String msg = scanner.nextLine();
	          jedis.publish(CHANNEL,new StringBuffer(publisherName).append(" : ").append(msg).toString());

	      }
	      
			

	}
}

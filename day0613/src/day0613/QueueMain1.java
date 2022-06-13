package day0613;

import java.util.Stack;

class Message {
	public String command;
	public String to;
	
	public Message(String command , String to) {
		this.command = command;
		this.to = to;
	}
}

public class QueueMain1 {
	public static void main(String[] args) {
		Stack<Message> msgQueue = new Stack<Message>();
		
		msgQueue.push(new Message("sendMail" , "김그린"));
		msgQueue.push(new Message("sendSMS" , "이자바"));
		msgQueue.push(new Message("sendkakaotalk" , "하하하"));
		
		while(!msgQueue.empty()) {
			Message msg = msgQueue.pop();
			
			switch(msg.command) {
			case "sendMail" : 
				System.out.println(msg.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" : 
				System.out.println(msg.to + "님에게 문자을 보냅니다.");
				break;
			case "sendkakaotalk" : 
				System.out.println(msg.to + "님에게 카톡을 보냅니다.");
				break;
			default : 
				System.out.println("Error");
			}
		}
	} // main
}

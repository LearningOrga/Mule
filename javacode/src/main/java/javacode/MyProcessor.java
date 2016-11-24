package javacode;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class MyProcessor  implements Callable{
	
	public MyProcessor(){
		System.out.println("Run");
	}
	
	/*
	public String process1(String payload){
		System.out.println("In Process 1");
		payload = payload + "contains " +payload.length()+ " chars in it";
		return payload;
	}

	
	public String process2(String payload){
		System.out.println("In Process 2");
		payload = payload + "contains " +payload.length()+ " chars in it";
		return payload;
	}*/

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		MuleMessage message = eventContext.getMessage();
		String getflow = message.getInvocationProperty("myName");
		System.out.println("mY nAME IS -" + getflow);
		//update mulemessage for whatever changes you want
		return message;
	}

}

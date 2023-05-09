

package com.example.springbootsmsapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Component
public class SmsService {

	    
	    private final String ACCOUNT_SID ="AC8e4bf76747268b4ca6735647054fb26f";

	    private final String AUTH_TOKEN = "381315aebb1f06ad347707c01b0c1a8e";

	    private final String FROM_NUMBER = "+14406933701";

	    public void send(SmsPojo sms) {
	    	Twilio.init( ACCOUNT_SID,AUTH_TOKEN);

	        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber("+14406933701"), sms.getMessage())
	                .create();
	        System.out.println("AC8e4bf76747268b4ca6735647054fb26f"+message.getSid());// Unique resource ID created to manage this transaction

	    }

	    public void receive(MultiValueMap<String, String> smscallback) {
	    }
	
}
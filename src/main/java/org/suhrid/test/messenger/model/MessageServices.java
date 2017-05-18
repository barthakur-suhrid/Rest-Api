package org.suhrid.test.messenger.model;

import java.util.ArrayList;
import java.util.List;

public class MessageServices {

	public List<Messages> getAllMessages(){
		Messages n1=new Messages();
		Messages n2=new Messages();
		
		n1.setId(1);
		n1.setMessage("Wat up?");
		n1.setCreated(new java.util.Date());
		n1.setAuthor("Ram");
		n2.setId(2);
		n2.setMessage("Nothing");
		n2.setCreated(new java.util.Date());
		n2.setAuthor("Ravi");
		List<Messages> ls=new ArrayList<Messages>();
		ls.add(n1);
		ls.add(n2);
	    return ls;
	}
	
	
}

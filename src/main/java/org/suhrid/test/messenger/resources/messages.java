package org.suhrid.test.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.suhrid.test.messenger.model.MessageServices;
import org.suhrid.test.messenger.model.Messages;

@Path("messages")
public class messages {
	
    MessageServices msgser=new MessageServices();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Messages> getMessages(){
		
		return msgser.getAllMessages();
	}
	
}

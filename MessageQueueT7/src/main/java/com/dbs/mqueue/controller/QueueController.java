
package com.dbs.mqueue.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QueueController {
	
	public List<MesssageQueue> fetchQueues(@PathVariable int queueId  )
	{
		List<MessageQueue> list_fetch=new ArrayList<MessageQueue>();
		
		
		
		return list_fetch;
	}

}

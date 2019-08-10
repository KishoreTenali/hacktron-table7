
package com.dbs.mqueue.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QueueController {
	
	public List<Queue> fetchQueues(@PathVariable int queueId  )
	{
		List<Queue> list_fetch=new ArrayList<Queue>();
		
		//list_fetch=
		
		return list_fetch;
	}

}

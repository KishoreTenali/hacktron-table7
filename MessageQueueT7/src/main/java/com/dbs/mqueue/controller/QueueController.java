
package com.dbs.mqueue.controller;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.mqueue.bean.Queue;
import com.dbs.mqueue.service.QueueService;

@RestController
public class QueueController {
	
	@Autowired
	QueueService queueService;
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/fetchQueue/{qid}",method=RequestMethod.GET, consumes = "application/json")
	public List<Queue> fetchQueues(@RequestParam(name="queueid",required=true) int queueId  )
	{
		List<Queue> list_fetch=new ArrayList<Queue>();
		
		list_fetch= queueService.fetchQueue(queueId);
		
		return list_fetch;
	}
	
	@RequestMapping(value="/deleteQueue/{qid}",method=RequestMethod.DELETE, consumes = "application/json")
	public boolean deleteQueue(@RequestParam(name="queueid",required=true) int queueId  )
	{
		boolean result;
		
		result = queueService.deleteQueue(queueId);
		
		return result;
	}

	@RequestMapping(value="/addQueue",method=RequestMethod.POST, consumes = "application/json")
	public boolean addQueue(){



			 byte[] array = new byte[7]; // length is bounded by 7
			    new Random().nextBytes(array);
			    String  name= new String(array, Charset.forName("UTF-8"));
			 

	    return queueService.addQueue(name);
	}


}


package com.dbs.mqueue.controller;

import java.util.ArrayList;
import java.util.List;

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
	
	


}

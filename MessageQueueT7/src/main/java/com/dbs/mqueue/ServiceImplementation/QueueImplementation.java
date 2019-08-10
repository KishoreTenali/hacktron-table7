package com.dbs.mqueue.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbs.mqueue.bean.Queue;
import com.dbs.mqueue.repository.QueueRepository;
import com.dbs.mqueue.service.QueueService;

public class QueueImplementation implements QueueService {

	@Autowired
	QueueRepository queueRepository;
	
	@Override
	public List<Queue> fetchQueue(int queueID) {
		
				
		return queueRepository.findAll();
		
		
		
	}
	
	@Override
	public boolean deleteQueue(int queueID) {
		return queueRepository.deleteQueue(queueID);
	}

	@Override
	public boolean addQueue(String name) {
		return queueRepository.addQueue(name);
	}

}

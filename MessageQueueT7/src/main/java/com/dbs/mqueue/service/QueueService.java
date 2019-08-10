package com.dbs.mqueue.service;

import java.util.List;

import com.dbs.mqueue.bean.Queue;

public interface QueueService {
	
	public List<Queue> fetchQueue(int queueID);
	
	public boolean deleteQueue(int queueID);

	public boolean addQueue(String name);
}

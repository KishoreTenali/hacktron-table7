package com.dbs.mqueue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dbs.mqueue.bean.Queue;












@Repository
public interface QueueRepository extends JpaRepository<Queue,Integer> {
	
	public List<Queue> findAll();
	
	@Query(value="DELETE from queue WHERE queueid = ?1",nativeQuery=true)
	public boolean deleteQueue(int queueId);
}

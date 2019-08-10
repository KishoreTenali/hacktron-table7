package com.dbs.mqueue.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="queue")
public class Queue {
	
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "queueid", nullable = false,unique = true)
	private int queueid;
    @Column(name = "queuename", nullable = false,unique = true)
	private String queuename;
    @OneToMany
    @JoinTable(name="message")
    private List <Message> message;

	public int getQueueid() {
		return queueid;
	}

	public void setQueueid(int queueid) {
		this.queueid = queueid;
	}

	public String getQueuename() {
		return queuename;
	}

	public void setQueuename(String queuename) {
		this.queuename = queuename;
	}

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}
  


    
    

}

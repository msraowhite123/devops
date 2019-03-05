package com.thread;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {
	private Queue<T> q = new LinkedList<>();

	
	int max = -1;
	int empty = 0;
	
	BlockingQueue(int size){
		max =size;
	}

	public synchronized void enqueue(T task) {
		while (q.size() == max) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(q.size() == empty){
			notifyAll();
		}
		this.q.offer(task);
	}
	
	public synchronized T dequeue() {
		while (q.size() == empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(q.size() == max){
			notifyAll();
		}
		return this.q.poll();
	}

}

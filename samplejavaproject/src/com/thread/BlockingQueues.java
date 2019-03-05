package com.thread;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueues<T> {

	private Queue<T> q = new LinkedList<>();

	int max = -1;
	int min = 0;

	public BlockingQueues(int size) {
		this.max = size;
	}

	public synchronized void enqueue(T task) throws InterruptedException {

		while (q.size() == max) {
			wait();
		}
		if (q.size() == min)
			notifyAll();
		q.offer(task);
	}

	public synchronized T dequeue() throws InterruptedException {

		while (q.size() == min) {
			wait();
		}
		if (q.size() == max)
			notifyAll();
		return (T) q.poll();
	}
}

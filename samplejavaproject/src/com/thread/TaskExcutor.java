package com.thread;

public class TaskExcutor implements Runnable {
	BlockingQueues<Runnable> q;

	public TaskExcutor(BlockingQueues<Runnable> queue) {
		this.q = queue;

	}

	@Override
	public void run() {
		while (true) {
			Runnable r;
			try {
				r = this.q.dequeue();
				r.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}

	}

}

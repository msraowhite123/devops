package com.thread;

public class ThreadPoll {

	BlockingQueues<Runnable> q;

	public ThreadPoll(int size, int no) {
		q = new BlockingQueues<>(size);
		TaskExcutor exe = null;
		String threadName = null;
		for (int i = 0; i < no; i++) {
			threadName = "Thread-" + i;
			exe = new TaskExcutor(q);
			Thread thread = new Thread(exe, threadName);
			thread.start();

		}

	}

	public void submitTask(Runnable task) throws InterruptedException {
		this.q.enqueue(task);
	}

}

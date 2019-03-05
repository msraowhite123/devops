package com.thread;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
	public static void main(String[] args) {
		proconsumer pc = new proconsumer();
		new Thread(new Producer(pc)).start();
		new Thread(new Consumer(pc)).start();

	}

}

class Producer implements Runnable {
	proconsumer proconsumer;

	public Producer(proconsumer pc) {
		this.proconsumer = pc;
	}

	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				proconsumer.produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class Consumer implements Runnable {
	proconsumer proconsumer;

	public Consumer(proconsumer pc) {
		this.proconsumer = pc;
	}

	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				proconsumer.consumer(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class proconsumer {
	boolean flag = false;
	List list = new ArrayList<>();

	public synchronized void consumer(int i) throws InterruptedException {
		if (!flag) {
			wait();
		}
		System.out.println("get " + list.get(i));
		flag = false;
		notifyAll();
	}

	public synchronized void produce(int num) throws InterruptedException {
		if (flag) {
			wait();
		}
		list.add(num);
		System.out.println("add" + num);
		flag = true;
		notifyAll();
	}

}

class ProConsumer {
	boolean flag = false;
	List list = new ArrayList<>();

	public synchronized void producer(int i) throws InterruptedException {
		if (flag == true) {
			wait();
		}
		System.out.println("addding element " + i);
		list.add(i);
		flag = true;
		notifyAll();

	}

	public synchronized void consumer(int i) throws InterruptedException {
		if (flag == false) {
			wait();
		}
		System.out.println("get element " + list.get(i));
		flag = false;
		notifyAll();

	}

}
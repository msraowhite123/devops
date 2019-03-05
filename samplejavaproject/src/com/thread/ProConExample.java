/*package com.thread;

import java.util.ArrayList;
import java.util.List;

public class ProConExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass gc = new GenericClass();
		new Thread(new Producers(gc)).start();
		new Thread(new Consumers(gc)).start();
	}
}

class Producers implements Runnable {
	GenericClass proconsumer;

	public Producers(GenericClass pc) {
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

class Consumers implements Runnable {
	GenericClass proconsumer;

	public Consumers(GenericClass pc) {
		this.proconsumer = pc;
	}

	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				proconsumer.consume(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class GenericClass {

	@SuppressWarnings("rawtypes")
	List l = new ArrayList<>();
	boolean flag = false;

	@SuppressWarnings("unchecked")
	public synchronized void produce(int data) throws InterruptedException {

		if (flag)
			wait();

		l.add(data);
		System.out.println("produce " + data);
		notifyAll();
		flag = true;

	}

	public synchronized void consume(int data) throws InterruptedException {

		if (!flag)
			wait();

		int d = (int) l.get(data);
		System.out.println("comsume " + d);
		notifyAll();
		flag= false;

	}

}
*/
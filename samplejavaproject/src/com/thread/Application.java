package com.thread;

public class Application {
    public static void main(String[] args) throws InterruptedException {
    	//create queue size - 3
    	//Number of threads - 4
        ThreadPoll threadPool = new ThreadPoll(3,4);
        //Created 15 Tasks and submit to pool
        for(int taskNumber = 1 ; taskNumber <= 7; taskNumber++) {
            TestTask task = new TestTask(taskNumber);
            threadPool.submitTask(task);
        }
    }
}

package com.paypal;

public class Queue implements QueueIntf {

	@Override
	public void enqueue(int data) {
		// TODO Auto-generated method stub
		System.out.println("Queue::enqueue() called");
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		System.out.println("Queue::dequeue() called");
		return 0;
	}

}

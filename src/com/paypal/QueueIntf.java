package com.paypal;

public interface QueueIntf {
	void enqueue(int data);
	int dequeue();
}

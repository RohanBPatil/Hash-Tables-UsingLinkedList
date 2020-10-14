package com.rohan.hashtable;

public class MyLinkedList<k> {
	public INode<k> head;
	public INode<k> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * adding node at back
	 * 
	 * @param newNode
	 */
	public boolean appends(INode<k> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
		return true;
	}

	/**
	 * searching for node having key 'key'
	 */
	public INode<k> search(k key) {
		INode<k> temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	
	public boolean delete(k key) {
		INode<k> temp = head;
		INode<k> prev = head;
		if (head.getKey().equals(key)) {
			head = head.getNext();
		} else {
			while (temp.getNext() != null) {
				if (temp.getKey().equals(key))
					break;
				prev = temp;
				temp = temp.getNext();
			}
			if (tail.getKey().equals(key)) {
				tail = prev;
				tail.setNext(null);
			}
			prev.setNext(temp.getNext());
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		INode<k> temp = head;
		while (temp.getNext() != null) {
			string.append(temp).append(" -> ");
			temp = temp.getNext();
		}
		string.append(temp);
		return string.toString();
	}

}

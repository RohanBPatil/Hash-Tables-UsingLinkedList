package com.rohan.hashtable;

public class MyHashMap<k, v> {
	MyLinkedList<k> myLinkedList;

	public MyHashMap() {
		myLinkedList = new MyLinkedList<>();
	}

	/**
	 * returns value for passed key
	 */
	@SuppressWarnings("unchecked")
	public v get(k key) {
		MyMapNode<k, v> myHashNode = (MyMapNode<k, v>) myLinkedList.search(key);
		return (myHashNode == null) ? null : myHashNode.getValue();
	}

	/**
	 * adds new key value pair to linked list
	 */
	@SuppressWarnings("unchecked")
	public void add(k key, v value) {
		MyMapNode<k, v> node = (MyMapNode<k, v>) myLinkedList.search(key);
		if (node == null) {
			node = new MyMapNode<>(key, value);
			myLinkedList.appends(node);
		} else {
			node.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{ " + myLinkedList + " }";
	}

}

package com.rohan.hashtable;

public class MyMapNode<k, v> implements INode<k> {
	k key;
	v value;
	MyMapNode<k, v> next;

	public MyMapNode(k key, v value) {
		this.key = key;
		this.value = value;
		next = null;
	}

	@Override
	public k getKey() {
		return key;
	}

	@Override
	public void setKey(k key) {
		this.key = key;
	}

	@Override
	public INode<k> getNext() {
		return next;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setNext(INode<k> next) {
		this.next = (MyMapNode<k, v>) next;
	}

	public v getValue() {
		return value;
	}

	public void setValue(v value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "K = '" + getKey() + "' V = '" + getValue() + "'";
	}

}

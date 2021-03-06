package com.wesleyreisz.mobiledev.linkedlist;

public class Node {
	private String value = "";
	private Node pointerNode = null;
	
	public Node(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getPointerNode() {
		return pointerNode;
	}

	public void setPointerNode(Node pointerNode) {
		this.pointerNode = pointerNode;
	}

	@Override
	public String toString() {
		return "value=" + value;
	}
	
	
	

}

package org.test.datastructures.linkedlist;

public class Node<T> {
	
	private Node<T> next;
	
	private T value;
	
	private boolean cycleStart;

	public Node(Node<T> next, T value) {
		this.next = next;
		this.value = value;
	}

	public Node<T> getNext() {
		return next;
	}

	public T getValue() {
		return value;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public boolean isCycleStart() {
		return cycleStart;
	}

	public void setCycleStart(boolean cycleStart) {
		this.cycleStart = cycleStart;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (cycleStart ? 1231 : 1237);
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (cycleStart != other.cycleStart)
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", cycleStart=" + cycleStart + "]";
	}
	
	
	
}

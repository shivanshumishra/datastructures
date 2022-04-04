package linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	
	private Node<T> root;
	private int numOfItems;
	
	// returns middle node in the linked list
	public Node<T> getMiddleNode(){
		Node<T> slow = this.root;
		Node<T> fast = this.root;
		
		while(fast.getNextNode() != null 
				&& fast.getNextNode().getNextNode() != null) {
			slow = slow.getNextNode();
			fast = fast.getNextNode().getNextNode();
		}
		return slow;
	}

	@Override
	public void insert(T data) {
		if(root == null) {
			root = new Node<>(data);
		}
		else {
			insertBegining(data);
		}
	}

	private void insertBegining(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
	}
	
	private void insertEnd(T data, Node<T> node) {
		
		if(node.getNextNode() != null) {
			insertEnd(data, node.getNextNode());
		}
		else {
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
		
	}

	@Override
	public void remove(T data) {
		if(root == null) return;
		if(root.getData().compareTo(data) == 0) {
			root = root.getNextNode();
		}
		else {
			remove(data,root,root.getNextNode());
		}
	}

	private void remove(T data, Node<T> previousNode,Node<T> actualNode) {
		
		while(actualNode != null) {
			
			if(actualNode.getData().compareTo(data) == 0) {
				numOfItems--;
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public void traverse() {
		if(root == null) return;
		
		Node<T> actualNode = root; 
		while(actualNode != null) {
			System.out.print(actualNode);
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public int size() {
		return numOfItems;
	}

}

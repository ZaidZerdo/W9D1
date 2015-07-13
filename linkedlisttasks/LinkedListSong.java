package linkedlisttasks;

public class LinkedListSong {
	private Node start;
	private int size;
	
	public LinkedListSong() {
		start = null;
		size = 0;
	}
	
	public LinkedListSong(Song[] array) {
		for (Song s : array) {
			add(s);
		}
	}
	
	public void add(Song s) {
		if (start == null) {
			start = new Node(s);
		} else {
			Node last = getLastNode();
			
			last.setNext(new Node(s));
		}
		size++;
	}
	
	public Node get(int index) {
		// TODO exception handling		
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	private Node getLastNode() {
		if (start == null) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		start = null;
		size = 0;
	}
	
	public void remove(int index) {
		if (index == 0) {
			start = start.getNext();
		} else {
			Node node = get(index);
			
			Node previous = start;
			while (previous.getNext() != node) {
				previous = previous.getNext();
			}
			
			previous.setNext(node.getNext());
		}
		size--;
	}
	
	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}
		
		return start.toString();
	}
	
	private class Node {
		private Node next;
		private Song song;
		
		public Node(Song song) {
			this.song = song;
			this.next = null;
		}
		
		public void setNext(Node node) {
			this.next = node;
		}

		public Node getNext() {
			return next;
		}
		
		@Override
		public String toString() {
			// Base case
			if (next == null) {
				return song.toString();
			}
			
			return song.toString() + ", " + next.toString();
		}
	}
}

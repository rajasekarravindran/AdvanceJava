package in.domain.collections;

public class LinkedList {

	Node first;

	public void add(int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = null;

		// scenario#1 ---> List is empty. we are adding the first node
		if (first == null) {
			first = newNode; // this node is the first node
			newNode.previous = null; // this is the first node

			return; // work done!
		}

		// secnerio #2 ---> List is not empty. We must find the last Node
		Node node = first; // let us begin from the begin
		while (node.next != null) // loop till there is no next available
			node = node.next; // keep moving next item

		// now node means last node
		Node last = node;
		last.next = newNode; // next to the last will be newNode
		newNode.previous = last; // previous to new node will be current lastNode

	}

	public void insert(int pos, int value) {

	}

	public int get(int pos) {
		Node currentNode = first;
		int count = 0; // Initialize count as zero

		while (currentNode != null) // To check current node not equal null or not
		{
			if (count == pos) // To check the count and position equal and if its equal return the value
				return currentNode.value;
			count++;
			currentNode = currentNode.next;
		}

		return 0;
	}

	public void set(int pos, int value) {
		Node currentNode = first;
		int count = 0;

		while (currentNode != null) {
			if (count == pos)
				currentNode.value = value; // to set the current node value to the given value
			count++;
			currentNode = currentNode.next; 
		}

	}

	public void remove(int pos) {
	
		//If first node is empty		
		if(first == null)
			return;		
		Node removeNode = first; 
		
		if(pos == 0)  //To remove the first node 
			first = removeNode.next;

		//To find the previous node of remove node to be deleted. 
		for (int i=0; removeNode!=null && i<pos-1; i++) 
			removeNode = removeNode.next;
		
		if (removeNode == null || removeNode.next == null) //If list position is more than number of remove node
			return;
				
		
		Node next = removeNode.next.next; //Remove node to be deleted using next

		removeNode.next = next;
	}

	public void printList() // To print the node value
	{
		Node currentNode = first;
		while (currentNode != null) {
			System.out.print(currentNode.value + " ");
			currentNode = currentNode.next;
		}
	}
}

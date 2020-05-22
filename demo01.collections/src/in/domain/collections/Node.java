package in.domain.collections;

public class Node {

	int value;
	Node next;
	Node previous;
	
	
	
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		System.out.println("To print the list of nodes");
		list.printList();
		
		System.out.println("===============");
		
		//2 To get the position of the list
		System.out.println("Print the given position data: "+list.get(1));
		
		//3. To set the given value to the given position
		list.set(1, 10);
		System.out.println("Display the Node values after set the value to the given position");
		list.printList();
		
		//4. To remove the node given position
		list.remove(1);
		System.out.println("Display the Node values after removed ");
		list.printList();
		
	}
}

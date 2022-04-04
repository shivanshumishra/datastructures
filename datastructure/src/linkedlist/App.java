package linkedlist;

public class App {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.insert("Adam");
		names.insert("Eve");
		names.insert("Heman");
		names.insert("Henna");
		
		names.traverse();
		
		System.out.print(names.getMiddleNode());
	}

}

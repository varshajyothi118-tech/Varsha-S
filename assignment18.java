import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original LinkedList: " + list);

        // Accessing the first element
        System.out.println("First element: " + list.getFirst());

        // Accessing the last element
        System.out.println("Last element: " + list.getLast());

        // Accessing an element using index
        System.out.println("Element at index 2: " + list.get(2));

        // Removing the first element
        list.removeFirst();

        System.out.println("After removing first: " + list);

        // Removing the last element
        list.removeLast();

        System.out.println("After removing last: " + list);

        // Removing an element by value
        list.remove("Mango");

        System.out.println("After removing Mango: " + list);

        // Removing an element by index
        // list.remove(0);
    }
}

import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create an ArrayList of tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Complete Java assignment");
        tasks.add("Study for exam");
        tasks.add("Go for a walk");
        tasks.add("Read a book");

        System.out.println("Tasks after adding:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Removing a task
        tasks.remove("Go for a walk");

        System.out.println("\nTasks after removing:");
        for (String task : tasks) {
            System.out.println(task);
        }

        // Iterating using for loop
        System.out.println("\nTasks using index:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}

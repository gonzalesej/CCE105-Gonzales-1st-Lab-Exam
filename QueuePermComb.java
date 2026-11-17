import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuePermComb {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<String> queue = new LinkedList<>();

    for (int i = 1; i <= 5; i++) {
      System.out.print("Enter element " + i + ": ");
      queue.add(sc.next());         
    }

    System.out.println("Queue: " + queue);
    System.out.println("Front: " + queue.peek());  
    System.out.println("Dequeued: " + queue.poll()); 
    System.out.println("Dequeued: " + queue.poll());
    System.out.println("Queue now: " + queue);
    System.out.println("Is empty? " + queue.isEmpty());

    Queue<String> letters = new LinkedList<>();
    letters.add("A");
    letters.add("B");
    letters.add("C");
    System.out.println("\nQueue: " + letters);

    System.out.print("Enter number of elements to arrange: ");
    int r = sc.nextInt();
    System.out.println();

    Queue<String> perms = new LinkedList<>();
    perms.add("");              

    for (int round = 0; round < r; round++) {
      int size = perms.size();        
      for (int i = 0; i < size; i++) {
        String current = perms.poll();  
        for (String letter : letters) {

          if (!current.contains(letter)) {
            perms.add(current + letter);
          }
        }
      }
    }

    int count = 0;
    while (!perms.isEmpty()) {
      System.out.println(perms.poll());
      count++;
    }

    System.out.println("\nTotal Permutations: " + count);
    sc.close();
  }
}
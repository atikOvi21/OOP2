package Queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();

        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.print("Polling from queue: ");
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + ", ");
            queue.poll();
        }
        System.out.println();
    }
}

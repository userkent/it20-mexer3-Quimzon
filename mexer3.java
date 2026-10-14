package mexer3;

import java.util.PriorityQueue;
import java.util.Comparator;

class Ticket {
    String name;
    int urgency;

    Ticket(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }
}

public class Mexer3 {

    public static void main(String[] args) {
       
         PriorityQueue<Ticket> Miles = new PriorityQueue<>(
            Comparator.comparingInt(ticket -> ticket.urgency)
        );

        Miles.offer(new Ticket("Printer", 3));
        Miles.offer(new Ticket("Network", 1));
        Miles.offer(new Ticket("Login", 2));

        System.out.println("Ticket Serving Order:");

        while (!Miles.isEmpty()) {
            Ticket ticket = Miles.poll();

            System.out.println(
                ticket.name + " (" + ticket.urgency + ")"
            );
        }
    }
}
        
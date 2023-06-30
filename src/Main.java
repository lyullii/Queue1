import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Person> people = generateClient();
        Queue<Person> attr = new LinkedList<>(people);

        while(!attr.isEmpty()) {
            Person person = attr.poll();
            int quantityTickets = person.getQuantityTickets();
            quantityTickets = quantityTickets - 1;
            person.setQuantityTickets(quantityTickets);
            System.out.printf("\n%s %s прокатился на аттракционе, у него осталось %d билетов", person.getName(), person.getSureName(), quantityTickets);
            if(quantityTickets > 0) {
                attr.offer(person);
            }
        }
    }
    private static List<Person> generateClient() {
        return List.of(
                new Person("Vasya", "Sorokin", 3),
                new Person("Senya", "Serov", 1),
                new Person("Katya", "Komarova", 1),
                new Person("Ksyusha", "Lekaya", 4),
                new Person("Ivan", "Ivanov", 2)
        );
    }
}
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        List<Person> people = generateClients();
        for (Person person : people) {
            queue.offer(person);
        }
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person + " прокатился на аттракционе");
            person.setQuantityOfTickets(person.getQuantityOfTickets() - 1);
            if (person.getQuantityOfTickets() > 0) {
                queue.offer(person);
            }
        }
    }

    static List<Person> generateClients() {
        Person person1 = new Person("Николай", " Николаев", 5);
        Person person2 = new Person("Павел", " Павлов", 4);
        Person person3 = new Person("Александр", "Александров", 3);
        Person person4 = new Person("Максим", " Максимов", 6);
        Person person5 = new Person("Олег", " Олегов", 2);

        List<Person> clients = new ArrayList<>();
        clients.add(person1);
        clients.add(person2);
        clients.add(person3);
        clients.add(person4);
        clients.add(person5);
        return clients;
    }
}
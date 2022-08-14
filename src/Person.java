public class Person {
    private String name;
    private String surname;
    private int quantityOfTickets;

    public Person(String name, String surname, int quantityOfTickets) {
        this.name = name;
        this.surname = surname;
        this.quantityOfTickets = quantityOfTickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getQuantityOfTickets() {
        return quantityOfTickets;
    }

    public void setQuantityOfTickets(int quantityOfTickets) {
        this.quantityOfTickets = quantityOfTickets;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

package OOPS.Day1;
interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef - Name: " + name + ", ID: " + id + " is cooking food.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter - Name: " + name + ", ID: " + id + " is serving food.");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Worker c = new Chef("Raj", 101);
        Worker w = new Waiter("Amit", 102);

        c.performDuties();
        w.performDuties();
    }
}

package DSA.Day2;
class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

class Inventory {
    Item head;

    void addAtBeginning(Item item) {
        item.next = head;
        head = item;
    }

    void addAtEnd(Item item) {
        if (head == null) {
            head = item;
            return;
        }
        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = item;
    }

    void addAtPosition(Item item, int position) {
        if (position <= 0 || head == null) {
            addAtBeginning(item);
            return;
        }
        Item temp = head;
        for (int i = 1; i < position && temp.next != null; i++) {
            temp = temp.next;
        }
        item.next = temp.next;
        temp.next = item;
    }

    void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void updateQuantity(int id, int quantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = quantity;
                break;
            }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
                break;
            }
            temp = temp.next;
        }
    }

    void searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
            }
            temp = temp.next;
        }
    }

    void displayTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    void sortByNameAscending() {
        if (head == null || head.next == null) return;
        head = mergeSortByName(head, true);
    }

    void sortByPriceDescending() {
        if (head == null || head.next == null) return;
        head = mergeSortByPrice(head, false);
    }

    Item mergeSortByName(Item node, boolean ascending) {
        if (node == null || node.next == null) return node;
        Item middle = getMiddle(node);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSortByName(node, ascending);
        Item right = mergeSortByName(nextOfMiddle, ascending);
        return mergeByName(left, right, ascending);
    }

    Item mergeSortByPrice(Item node, boolean ascending) {
        if (node == null || node.next == null) return node;
        Item middle = getMiddle(node);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSortByPrice(node, ascending);
        Item right = mergeSortByPrice(nextOfMiddle, ascending);
        return mergeByPrice(left, right, ascending);
    }

    Item mergeByName(Item a, Item b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;
        Item result;
        if ((ascending && a.name.compareTo(b.name) <= 0) || (!ascending && a.name.compareTo(b.name) > 0)) {
            result = a;
            result.next = mergeByName(a.next, b, ascending);
        } else {
            result = b;
            result.next = mergeByName(a, b.next, ascending);
        }
        return result;
    }

    Item mergeByPrice(Item a, Item b, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;
        Item result;
        if ((ascending && a.price <= b.price) || (!ascending && a.price > b.price)) {
            result = a;
            result.next = mergeByPrice(a.next, b, ascending);
        } else {
            result = b;
            result.next = mergeByPrice(a, b.next, ascending);
        }
        return result;
    }

    Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void displayAll() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addAtEnd(new Item("Pen", 1, 50, 5.0));
        inventory.addAtBeginning(new Item("Notebook", 2, 30, 15.0));
        inventory.addAtPosition(new Item("Eraser", 3, 20, 2.0), 1);
        inventory.displayAll();
        inventory.updateQuantity(2, 35);
        inventory.searchByName("Pen");
        inventory.displayTotalValue();
        inventory.sortByNameAscending();
        inventory.displayAll();
        inventory.sortByPriceDescending();
        inventory.displayAll();
    }
}


package DSA.Day2;
class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {
    Task head = null, tail = null;
    Task current = null;

    void addAtBeginning(Task task) {
        if (head == null) {
            head = tail = current = task;
            task.next = task;
        } else {
            task.next = head;
            head = task;
            tail.next = head;
        }
    }

    void addAtEnd(Task task) {
        if (head == null) {
            head = tail = current = task;
            task.next = task;
        } else {
            tail.next = task;
            task.next = head;
            tail = task;
        }
    }

    void addAtPosition(Task task, int position) {
        if (position <= 0 || head == null) {
            addAtBeginning(task);
            return;
        }
        Task temp = head;
        for (int i = 1; i < position && temp.next != head; i++) {
            temp = temp.next;
        }
        task.next = temp.next;
        temp.next = task;
        if (temp == tail) tail = task;
    }

    void removeById(int id) {
        if (head == null) return;

        if (head.id == id && head == tail) {
            head = tail = current = null;
            return;
        }

        Task temp = head, prev = tail;

        do {
            if (temp.id == id) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                if (current == temp) current = current.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentTask() {
        if (current != null) {
            System.out.println(current.id + " " + current.name + " " + current.priority + " " + current.dueDate);
        }
    }

    void moveToNextTask() {
        if (current != null) current = current.next;
    }

    void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskSchedulerSystem {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addAtEnd(new Task(1, "Task1", 1, "2025-07-20"));
        scheduler.addAtEnd(new Task(2, "Task2", 2, "2025-07-21"));
        scheduler.addAtBeginning(new Task(3, "Task3", 1, "2025-07-19"));
        scheduler.displayAllTasks();
        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.viewCurrentTask();
        scheduler.searchByPriority(1);
        scheduler.removeById(2);
        scheduler.displayAllTasks();
    }
}


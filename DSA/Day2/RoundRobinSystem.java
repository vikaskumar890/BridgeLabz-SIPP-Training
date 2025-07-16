package DSA.Day2;
class Process {
    int id;
    int burstTime;
    int priority;
    int remainingTime;
    Process next;

    Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobinScheduler {
    Process head = null, tail = null;
    int timeQuantum;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    void addProcess(Process process) {
        if (head == null) {
            head = tail = process;
            process.next = process;
        } else {
            tail.next = process;
            process.next = head;
            tail = process;
        }
    }

    void removeProcessById(int id) {
        if (head == null) return;

        Process temp = head, prev = tail;

        do {
            if (temp.id == id) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                    return;
                } else if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void simulateScheduling() {
        if (head == null) return;
        Process current = head;
        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int count = countProcesses();

        while (count > 0) {
            if (current.remainingTime > 0) {
                int executionTime = Math.min(current.remainingTime, timeQuantum);
                time += executionTime;
                current.remainingTime -= executionTime;
                if (current.remainingTime == 0) {
                    int turnaround = time;
                    int waiting = turnaround - current.burstTime;
                    totalTurnaroundTime += turnaround;
                    totalWaitingTime += waiting;
                    removeProcessById(current.id);
                    count--;
                }
            }
            current = current.next;
        }

        System.out.println("Average Waiting Time: " + (totalWaitingTime / (double)(count == 0 ? 1 : count)));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / (double)(count == 0 ? 1 : count)));
    }

    void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println(temp.id + " " + temp.burstTime + " " + temp.priority + " Remaining: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }

    int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

public class RoundRobinSystem {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);
        scheduler.addProcess(new Process(1, 10, 2));
        scheduler.addProcess(new Process(2, 6, 1));
        scheduler.addProcess(new Process(3, 8, 3));
        scheduler.displayProcesses();
        scheduler.simulateScheduling();
    }
}


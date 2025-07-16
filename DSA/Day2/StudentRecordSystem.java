package DSA.Day2;
class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;

    Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

class StudentList {
    Student head;

    void addAtBeginning(Student student) {
        student.next = head;
        head = student;
    }

    void addAtEnd(Student student) {
        if (head == null) {
            head = student;
            return;
        }
        Student temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = student;
    }

    void addAtPosition(Student student, int position) {
        if (position <= 0 || head == null) {
            addAtBeginning(student);
            return;
        }
        Student temp = head;
        for (int i = 1; i < position && temp.next != null; i++) {
            temp = temp.next;
        }
        student.next = temp.next;
        temp.next = student;
    }

    void deleteByRollNo(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    Student searchByRollNo(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) return temp;
            temp = temp.next;
        }
        return null;
    }

    void updateGrade(int rollNo, String newGrade) {
        Student student = searchByRollNo(rollNo);
        if (student != null) student.grade = newGrade;
    }

    void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordSystem {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addAtEnd(new Student(101, "Alice", 20, "A"));
        list.addAtBeginning(new Student(102, "Bob", 21, "B"));
        list.addAtPosition(new Student(103, "Charlie", 22, "C"), 1);
        list.display();
        list.updateGrade(102, "A+");
        list.deleteByRollNo(103);
        list.display();
    }
}


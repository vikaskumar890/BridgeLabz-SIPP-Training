package DSA.Day2;
import java.util.*;

class User {
    int id;
    String name;
    int age;
    List<Integer> friends;
    User next;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }
}

class SocialNetwork {
    User head;

    void addUser(User user) {
        user.next = head;
        head = user;
    }

    User findUserById(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    User findUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriend(int userId, int friendId) {
        User user = findUserById(userId);
        User friend = findUserById(friendId);
        if (user != null && friend != null && !user.friends.contains(friendId)) {
            user.friends.add(friendId);
            friend.friends.add(userId);
        }
    }

    void removeFriend(int userId, int friendId) {
        User user = findUserById(userId);
        User friend = findUserById(friendId);
        if (user != null && friend != null) {
            user.friends.remove(Integer.valueOf(friendId));
            friend.friends.remove(Integer.valueOf(userId));
        }
    }

    void displayFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) return;
        System.out.print("Friends of " + user.name + ": ");
        for (int id : user.friends) {
            User friend = findUserById(id);
            if (friend != null) System.out.print(friend.name + " ");
        }
        System.out.println();
    }

    void mutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 == null || user2 == null) return;
        Set<Integer> set1 = new HashSet<>(user1.friends);
        Set<Integer> mutual = new HashSet<>();
        for (int id : user2.friends) {
            if (set1.contains(id)) mutual.add(id);
        }
        System.out.print("Mutual Friends: ");
        for (int id : mutual) {
            User user = findUserById(id);
            if (user != null) System.out.print(user.name + " ");
        }
        System.out.println();
    }

    void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends");
            temp = temp.next;
        }
    }
}

public class SocialMediaConnections {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();
        network.addUser(new User(1, "Alice", 22));
        network.addUser(new User(2, "Bob", 23));
        network.addUser(new User(3, "Charlie", 24));
        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.displayFriends(1);
        network.displayFriends(2);
        network.mutualFriends(1, 2);
        network.removeFriend(1, 2);
        network.displayFriends(1);
        network.countFriends();
    }
}


package DSA.Day2;
class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
    }
}

class TextEditor {
    TextState current;
    int size = 0;
    int maxHistory = 10;

    void performAction(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
        size++;
        if (size > maxHistory) {
            TextState temp = current;
            for (int i = 0; i < maxHistory; i++) {
                if (temp.prev != null) temp = temp.prev;
            }
            temp.prev = null;
        }
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void showCurrentState() {
        if (current != null) {
            System.out.println("Current: " + current.content);
        } else {
            System.out.println("Editor is empty");
        }
    }
}

public class UndoRedoEditor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.performAction("Hello");
        editor.performAction("Hello World");
        editor.performAction("Hello World!");
        editor.showCurrentState();
        editor.undo();
        editor.showCurrentState();
        editor.redo();
        editor.showCurrentState();
        editor.undo();
        editor.undo();
        editor.showCurrentState();
        editor.redo();
        editor.showCurrentState();
    }
}


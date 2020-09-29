package Q4;

public class LinkedList {
    private Node root;
    private int length;

    public Node root() {
        return root;
    }
    public int length() {
        return length;
    }
    public void append(int value) {
        if (root == null) {
            length++;
            root = new Node(value);
        } else {
            length++;
            Node current = root;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            Node next = new Node(value);
            current.setNext(next);
        }
    }
    public void inset(int index, int value) {
        if (index == 0) {
            length++;
            Node node = new Node(value);
            if (root != null) {
                root.setPrev(node);
                node.setNext(root);
            }
            root = node;
        } else {
            int currentIndex = 0;
            Node current = root;
            Node prev = current;
            while (current != null && currentIndex < index) {
                prev = current;
                current = current.getNext();
                currentIndex++;
            }
            if (currentIndex == index) {
                length++;
                Node node = new Node(value);
                prev.setNext(node);
                if (current != null) {
                    current.setPrev(node);
                }

                node.setPrev(prev);
                node.setNext(current);
            }
        }
    }
    public void remove(int index) {
// Special-case deletion at root
        if (index == 0) {
            if (root != null) {
                root = root.getNext();
                if (root != null) {
                    root.setPrev(null);
                }
                --length;
            }
        } else {
            int currentIndex = 0;
            Node current = root;
            Node prev = current;
            while (current != null && currentIndex < index) {
                prev = current;
                current = current.getNext();
                ++currentIndex;
            }
// Check that we reached the target index
            if (currentIndex == index) {
                --length;
                if (current != null) {
                    Node next = current.getNext();
                    prev.setNext(next);
                    if (next != null) {
                        next.setPrev(prev);
                    }
                } else {
                    prev.setNext(null);
                }
            }
        }
    }
    public String toString() {
        String result = "[ ";
        Node current = root;
        while (current != null) {
            result += current.value + " ";
            current = current.getNext();
        }
        return result + "]";
    }
}

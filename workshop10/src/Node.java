public class Node<T> {
    public final T value;

    public final Node<T> left;
    public final Node<T> right;

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

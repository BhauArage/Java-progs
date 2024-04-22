import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    class Node{
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            if(next == null){
                System.out.println(data);
            }
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    SimpleLinkedList() {
    }

    SimpleLinkedList(T[] values) {
        Arrays.stream(values).forEach(this::push);
    }

    void push(T value) {
        Node n=new Node(value);
        if(head==null)
            head=n;
        else
            tail.setNext(n);
        tail=n;
        size++;
    }

    T pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        T poppedItem= tail.getData();
        size--;

        if (head.equals(tail)) {
            head = null;
            tail = null;
        }
        else{
        tail = getPrev(tail);
        tail.setNext(null);}
        return poppedItem;
    }

    private Node getPrev(Node node) {
        if (head.equals(node)) return null;
        Node current = head;
        while (!current.getNext().equals(node)) {
            current = current.getNext();
        }
        return current;
    }

    void reverse() {
        Object[] arr = asArray((Class<T>) Object.class);
        head = null;
        Arrays.stream(arr)
                .map(o -> (T)o)
                .forEach(this::push);
    }

    T[] asArray(Class<T> clazz) {
        T[] arr = (T[]) Array.newInstance(clazz, size);
        Node curr = head;
        for (int i = size - 1; i >= 0; i--) {
            arr[i] = curr.getData();
            curr = curr.getNext();
        }
        return arr;
    }

    int size() {
        return size;
    }
}

public class MyLL<T> {
    private class Node<E> {
        public E value;
        public Node<E> next;
        public Node<E> previous;

        public Node(E value, Node<E> next, Node<E> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
            if(this.next != null) {
              this.next.previous = this;
            }
            if(this.previous != null) {
                this.previous.next = this;
            }
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public MyLL() {
        head = null;
        tail = null;
    }


    public void printList() {
        Node<T> current = head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public boolean contains(T toFind) {
        Node<T> current = head;
        while(current != null) {
            if(current.value.equals(toFind)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void addToBack(T toAdd) {
        if(tail != null) {
            Node<T> newNode = new Node<>(toAdd, null, tail);
            tail = newNode;
            if(tail.previous.previous == null) {
                head = tail.previous;
            }
        } else {
            Node<T> newNode = new Node<>(toAdd, null, null);
            head = newNode;
            tail = newNode;
        }
        
    }

    public void printFromBack() {
        if(tail == null) return;
        Node<T> current = tail;
        while(current != null) {
            System.out.println(current.value);
            current = current.previous;
        }
    }

    public T remove(T toRemove) {
        if(head == null) return null;
        if(head.value.equals(toRemove)) {
            head = head.next;
            head.previous = null;
            return toRemove;
        }
        if(tail.value.equals(toRemove)) {
            tail = tail.previous;
            tail.next = null;
            return toRemove;
        }

        Node<T> current = head;
        while(current.next != null) {
            if(current.next.value.equals(toRemove)) {
                current.next = current.next.next;
                current.next.previous = current;
                return toRemove;
            }
            current = current.next;
            current.next.previous = current;
        }
        return null;
    }
}

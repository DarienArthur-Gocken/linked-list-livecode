public class Practice {
    public static void main(String[] args) {
        /*
        Node head = new Node('g', null);
        Node ryan = new Node('s', null);
        head.next = ryan;
        ryan.next = new Node('t', null);
        ryan.next.next = new Node('x', null);



        printList(head);
       // System.out.println(contains(head, 'x'));
        // System.out.println(contains(head, 'e'));

        System.out.println("-----");
        remove(head, 't');
        printList(head);*/
/*
        MyLL<Character> list = new MyLL<>();
        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');

        list.printList();

        MyLL<Integer> list2 = new MyLL<>();
        list2.addToBack(5);
        list2.addToBack(99);
        list2.addToBack(2);
        list2.addToBack(-33333);
        list2.addToBack(66);

        list2.printList();*/
/*
        MyLL<Character> list = new MyLL<>();
        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');
        list.printFromBack();

       // list.remove('m');

        System.out.println("_______TEST________");
        list.printFromBack();*/
        MyLL<Integer> intList = new MyLL<>();

        intList.addToBack(5);
        intList.addToBack(10);
        intList.addToBack(25);
        intList.addToBack(400);

        intList.printFromBack();

    }

    public static void printList(Node start) {
        while(start != null) {
            System.out.println(start.value);
            start = start.next;
        }
    }

    public static boolean contains(Node start, char toFind) {
        while(start != null) {
            if(start.value == toFind) {
                return true;
            }
            start = start.next;
        }
        return false;
    }

    public static char remove(Node head, char toRemove) {
        Node current = head;
        while(current.next != null) {
            if(current.next.value == toRemove) {
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }
        return '\0';
    }
}

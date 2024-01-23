package practice;

public class LinkedListImplementationMain {
    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(4,3);
        list.display();

    }
}

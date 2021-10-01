import implementation.MyLinkedList;

public class MyMain {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addLast(2.5F);
        list.addLast(3.5F);
        list.addLast(4.5F);
        list.addLast(5.5F);
        list.addLast(6.5F);
        System.out.println("Sum of all numbers are : "+list.sum());
        System.out.println("Mean of all numbers are : "+list.mean());
    }
}

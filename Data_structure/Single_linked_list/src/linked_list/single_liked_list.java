package linked_list;

import java.util.Scanner;

/**
 *
 * @author Fuad
 */
public class single_liked_list {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node up = null;
    public Node down = null;

    public void insert(int data) {
        Node newdata = new Node(data);
        if (up == null) {
            up = newdata;
            down = newdata;
        } else {
            down.next = newdata;
            down = newdata;
        }
    }

    public void display() {
        Node present = up;

        if (up == null) {
            System.out.println("Empty list");
        }

        while (present != null) {
            System.out.print(present.data + " ");
            present = present.next;
        }

    }

    public static void main(String[] args) {

        single_liked_list list = new single_liked_list();

        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.display();

    }

}

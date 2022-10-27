package mx.tc.j2se.tasks;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class LinkedTaskList extends AbstractTaskList {

            class Node{
            Task data;
            Node next;

            public Node(Task data) {
                this.data = data;
                this.next = null;
            }
        }

    public Node head = null;
    public Node tail = null;

    public void add(Task obj) {
        //Create a new node
        Node newNode = new Node(obj);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    public void remove(Task obj)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data.title == obj.title) {
            head = temp.next; // Changed head
            System.out.println("Deleted first node");
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data.title != obj.title) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
        System.out.println("Deletion done");
    }

    public Task getTask(int index){
        int i=0;
        Node current =head;
        while(current !=null){
            if (i == index) {
                break;
            }
            current=current.next;
            i++;
        }
        return current.data;
    }

    public int size(){
        int i=0;
        Node current = head;
        while(current != null) {
            //Prints each node by incrementing pointer
            i++;
            current = current.next;
        }
        return i;

    }


    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "LinkedTaskList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        LinkedTaskList that = (LinkedTaskList) o;
//        return head.equals(that.head) && tail.equals(that.tail);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(head, tail);
//    }

    public ArrayList<Task> incoming(LocalDateTime from, LocalDateTime to){
        ArrayList<Task> ar = new ArrayList<Task>();
        Node current=head;
        while(current != null)
        {
            if(current.data.getTime().compareTo(from) >0 && current.data.getTime().compareTo(to)<0)
            {
                ar.add(current.data);
            }
            current = current.next;

        }
        return ar;
    }
}

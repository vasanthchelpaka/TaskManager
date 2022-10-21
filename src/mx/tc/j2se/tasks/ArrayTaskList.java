package mx.tc.j2se.tasks;
import java.util.*;

public class ArrayTaskList {

    private static final int INITIAL_CAPACITY = 3;
    private int size = 0;
    private Task elementData[] = {};

    public ArrayTaskList() {
        elementData = new Task[INITIAL_CAPACITY];
    }

    public void add(Task task) {
        if (size == elementData.length) {
            ensureCapacity(); // increase current capacity of list, make it
            // double.
        }
        elementData[size++] = task;
    }

    private void ensureCapacity() {
        System.out.println(elementData.length);
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
        System.out.println(elementData.length);
    }

    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[i] + " ");
        }

    }

    public Object remove(Task task) {


        for (int i = 0; i < elementData.length-1; i++) {
            if (elementData[i].getTitle().equals(task.getTitle())) {
                System.out.println(i);
                for(int j=i;j<size;j++){
                    if(j==size-1) break;
                    elementData[j]=elementData[j+1];

                }
            }


        }
        elementData[size-1] = null;
        return true;


    }
}






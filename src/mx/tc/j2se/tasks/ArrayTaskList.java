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


    }






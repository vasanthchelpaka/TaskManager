package mx.tc.j2se.tasks;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


public  class ArrayTaskList extends AbstractTaskList{

    private static final int INITIAL_CAPACITY = 1;
    public int size = 0;
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

   /* public void display(){
        public Iterator < String > iterator() {
            Iterator < String > iter = new Iterator < String > () {
                private int currentIndex = 0;
                @Override
                public boolean hasNext() {
                    return currentIndex < size;
                }

                @Override
                public String next() {
                    if (hasNext()) return myData.get(currentIndex++);
                    else throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            return iter;
        }
    }*/

    //removes task and then returns true
    //it also decrements the size of array after deletion.
    public void remove(Task task) {


        for (int i = 0; i < elementData.length-1; i++) {
            if (elementData[i].getTitle().equals(task.getTitle())) {
                //System.out.println(i);
                for(int j=i;j<size;j++){
                    if(j==size-1) break;
                    elementData[j]=elementData[j+1];

                }
            }


        }
        elementData[size-1] = null;
        size--;
       // return true;
    }

    //returns the number of tasks
    public int size(){


        return size;
    }


    public Task getTask(int index){
        return (elementData[index]);

    }

    //make it compatible to repetitive tasks also
    public ArrayList<Task> incoming(LocalDateTime from, LocalDateTime to){
        ArrayList<Task> ar = new ArrayList<Task>();
        for (int i = 0; i < size; i++) {
            //System.out.println(elementData[i].getTime());
            if(elementData[i].getTime().compareTo(to) < 0 && elementData[i].getTime().compareTo(from) > 0){
                ar.add(elementData[i]);
            }
        }
        //System.out.println(ar.size());
        return ar;
    }

    @Override
    public  Stream<Task> getStream() {
        System.out.println("test");
       return Stream.of(elementData);
       //return null;
    }
}






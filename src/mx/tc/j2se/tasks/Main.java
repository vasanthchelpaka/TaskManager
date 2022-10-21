package mx.tc.j2se.tasks;//package mx.tc.j2se.tasks;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("a",1);
        Task task2 = new Task("b",2);
        Task task3 = new Task("c",3);


        ArrayTaskList task = new ArrayTaskList();
        //Add elements in custom ArrayList
        task.add(task1);
        task.add(task2);
        task.add(task3);
        //task.add(3);
        task.display();
       //System.out.println( task.remove(task1));
       //System.out.println("$$");
        task.display();
        System.out.println();
        System.out.println(task.size());
        System.out.println(task.getTask(3));

    }
}

package mx.tc.j2se.tasks;//package mx.tc.j2se.tasks;

public class Main {
    public static void main(String[] args) {
//        Task t1=new Task("Morning Run",3,15,2);
//        if(t1.isRepeated()){
//            t1.current=t1.start;
//            while(t1.current< t1.getEndTime()) {
//                System.out.println(t1.getTitle()+ " " + t1.getCurrentTime());
//                t1.current += t1.getRepeatInterval();
//                if(t1.current < t1.getEndTime()){
//                    t1.setActive(true);}
//                else{t1.setActive(false);}
//                System.out.println(t1.isActive());
//            }
//            ArrayListCustom<Integer> task = new ArrayListCustom<Integer>();
//            task.add(1);
//            list.add(2);
//            list.add(3);
//            list.add(4);
//            list.add(1);
//            list.add(2);
        Task task1 = new Task("vasanth",2011);


        ArrayTaskList task = new ArrayTaskList();
        //Add elements in custom ArrayList
        task.add(task1);
        //task.add(2);
        //task.add(3);
        task.display();






    }
}

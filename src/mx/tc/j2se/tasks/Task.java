package mx.tc.j2se.tasks;

public class Task {
    String title;

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", status=" + status +
                ", repeat=" + repeat +
                ", time=" + time +
                ", start=" + start +
                ", end=" + end +
                ", interval=" + interval +
                ", current=" + current +
                '}' +
                '\n'
                ;
    }

    boolean status,repeat;
    int time;
    int start;
    int end;
    int interval;
    int current;

    //non-repetitive task constructor
    Task(String title, int time){
        this.title=title;
        this.time=time;
        this.repeat=false;
        System.out.println(title);
        System.out.println(time);
    }

    // repetitive task  constructor
    Task (String title, int start, int end, int interval){
        this.title=title;
        this.start=start;
        this.end=end;
        this.interval=interval;
        this.repeat=true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isActive(){
        return status;
    }
    public void setActive(boolean active){
        this.status=active;
    }

    //returns start time if task is repetitive
    //changed a bit to get time without complications, might have to change back
    public int getTime() {
        if(isRepeated()){
            return getStartTime();
        }
        //return current;
        return getStartTime();
    }

    //converts repetitive task to non-repetitive
    public void setTime(int time) {
        this.time = time;
        if(isRepeated()){
            repeat=false;
        }
    }

    //returns time of executions if task is non-repetitive
    public int getStartTime() {
        if(!isRepeated()) {
            return time ;
        }
        return start;

    }

    //returns time of executions if task is non-repetitive
    public int getEndTime() {
        if(!isRepeated()) {
            return time;
        }
        return end;
    }

    //why ?
    public int getCurrentTime(){
        return this.current;
    }
    //why??
    public int getRepeatInterval(){
        if(!isRepeated()){
            return 0;
        }
        return interval;
    }

    //if task is non-repetitive, converts it into repetitive
    public void setTime(int start, int end, int interval){
        if(!isRepeated()){
            repeat=true;
        }
        this.start=start;
        this.end=end;
        this.interval=interval;
    }

    // checking task for repeatability
    public boolean isRepeated(){
        return repeat;
    }

    //returns next start time of execution after current time
    //I believe the interval should be added to start not current
    public int nextTimeAfter (int current){
        if(current < end) {
            status=true;
            current += interval;
            return current;
        }
        else{
            status=false;
            return -1;
        }
    }


}

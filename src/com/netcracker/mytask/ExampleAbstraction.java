package com.netcracker.mytask;
//Need to Prepare the Abstraction
 class ExampleAbstraction {
    private String name;
    public ExampleAbstraction(){

    }
    public ExampleAbstraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExampleAbstraction{" +
                "name='" + name + '\'' +
                '}';
    }
}
class  Test{
    public static void main(String[] args) {
        ExampleAbstraction ev =new ExampleAbstraction();
        ev.setName("jai");
        System.out.println("ev===="+ev);
    }
}
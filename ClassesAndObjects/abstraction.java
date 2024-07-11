package ClassesAndObjects;

abstract class abstractionLayer{
    abstract void functionality1();
    abstract void functionality2();
}
class abstractImplementation extends abstractionLayer{
    void functionality1(){
        System.out.println("Functionality 1");
    }
    void functionality2(){
        System.out.println("Functionality 2");
    }
}
class abstractImplementation2 extends abstractionLayer{
    void functionality1(){
        System.out.println("Functionality 11");
    }
    void functionality2(){
        System.out.println("Functionality 22");
    }
}


interface abstractionLayert{
     void functionality1();
     void functionality2();
}
class abstractImplementationt implements abstractionLayert{
    public void functionality1(){
        System.out.println("Functionality 1 interface");
    }
    public void functionality2(){
        System.out.println("Functionality 2 interface");
    }
}
class abstractImplementation2t implements abstractionLayert{
    public void functionality1(){
        System.out.println("Functionality 11 interface");
    }
    public void functionality2(){
        System.out.println("Functionality 22 interface");
    }
}

interface ab extends abstractionLayert{
    void functionality3();
}


public class abstraction {
    public static void main(String s[]){
        abstractionLayer obj1 = new abstractImplementation();
        abstractionLayer obj2 = new abstractImplementation2();
        abstractionLayert obj3 = new abstractImplementationt();
        abstractionLayert obj4 = new abstractImplementation2t();
    } 
}

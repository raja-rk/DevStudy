package ClassesAndObjects;
class test1{
    public test1(){
        System.out.println("test1");
    }
    static{
        String name ="temp"; // static block is called only oncce when the class is loaded first
        System.out.println("in static block");
    }
    public void function(int a){
        System.out.println(a);
    }
    public void function(double a){
        System.out.println(a);
    }
}
class test2 extends test1{
    public test2(){
        super();
        System.out.println("test2");
    }
    public test2(int n){
        this();
        System.out.println("in test2 int");
    }
}

abstract class test3{
    public abstract void method1();
    public void method2(){

    }
    public static void method3(){

    }
}
class implementAbstractMethod extends test3{
    public void method1(){
        System.out.println("method1");
    }
    class innerClass{
        public void method1(){
            System.out.println("inner class method1");
        }
    }
    
}
public class Hello{
    public static void main(String a[]) throws ClassNotFoundException{
        Class temp = Class.forName("Basics");//load a class without any object instantiation
        int a1 = 1;
        float b = 2.0f;
        long l = 124l;
        double d = 5.8;
        char c = 'k';
        boolean b1 = true;
        System.out.print("Hello World");
        test1 ins = new test1();
        ins.function(4);
        ins.function(4.0);
        test2 t = new test2(5);
        implementAbstractMethod t4 = new implementAbstractMethod();
        implementAbstractMethod.innerClass innerClassObject = t4.new innerClass();
        innerClassObject.method1();
        
    }
}
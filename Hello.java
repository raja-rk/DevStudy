class test1{
    public void function(int a){
        System.out.println(a);
    }
    public void function(double a){
        System.out.println(a);
    }
}
public class Hello{
    public static void main(String a[]){
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
    }
}
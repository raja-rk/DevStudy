import ClassesAndObjects.*;

public class Basics {
    public static void main(String a[]){
        int random = (int)(Math.random()*100);

        //array size is fixed and cannot be changed once declared
        int arr[] = {1,2,3,4};
        int arr2[] = new int[4];
        int arr3[][] = new int[3][6];// multidimensional array

        int arr4[][] = new int[3][];// jagged array
        arr4[0]= new int[3];
        arr4[1]= new int[2];
        arr4[2]= new int[4];

        arr3[0][4]=5;
        arr3[1][5]=6;
        for(int i=0;i<arr.length;i++){ 
            arr2[i] = arr[i];
        }
        System.out.println(arr2[0]);
        System.out.println(arr3[0][3]);
        System.out.println(arr3[0][4]);
        System.out.println(arr3[1][5]);
        //enhanced for loop
        for(int i:arr){

        }
        for(int i[]: arr3){
            for(int j: i){

            }
        }

        //Strings
        //** strings are allocated memory in heap in string contant pool
        String name = "hello";
        name = name + "1"; // new memory will be allocated to name and the old name will go to garbage collector
        String name2 = new String("World");
        String name3 = name.concat(name2);
        String name4 = name + name2;

        //mutable(changable) - StringBufffer
        //and immutable(non-changable) strings
        StringBuffer sb = new StringBuffer("buffer");
        System.out.println(sb.capacity());// length and capacity are two different fucntions , capacity = length + 16
        System.out.println(sb.length());
        System.out.println(Integer.SIZE);
        //The main difference between the two methods is that append() adds a new element to the end of a list, while concat() combines two strings together.
        String str = sb.toString();

        //StringBuilder is not thread safe while StringBuffer is thread safe 

        //packages
        Hello t = new Hello();
    }
}

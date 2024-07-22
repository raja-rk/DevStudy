package DSA;
import java.util.*;
public class insertionBubbleSelectionSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter elements of array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println();
        System.out.print("Unsorted array: "+list);
        System.out.println();
        // bubbleSort(list);
        //selectionSort(list);
        insertionSort(list);
        System.out.print("Sorted array: "+list);
    }

    private static void insertionSort(List<Integer> list) {
        for(int i=1;i<list.size();i++){
            int key = list.get(i);
            int j = i-1;
            while(j>=0 && list.get(j)>key){
                list.set(j+1,list.get(j));
                j = j-1;
            }
            list.set(j+1,key);
        }

    }

    private static void selectionSort(List<Integer> list) {
        for(int i=0;i<list.size()-1;i++){
            int min = i;
            for(int j=i+1;j<list.size();j++){
                if(list.get(j)<list.get(min)){
                    min = j;
                }
            }
            swap(list, i, min);
            
            System.out.println(list);
        }
    }

    private static void bubbleSort(List<Integer> list) {
        int size= list.size();
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(list.get(j)>list.get(j+1)){
                    swap(list,j,j+1);
                }
            }
        }
    }


    private static void swap(List<Integer> list, int j, int i) {
        if(i!=j){
            list.set(j,list.get(j)+list.get(i));
            list.set(i,list.get(j)-list.get(i));
            list.set(j,list.get(j)-list.get(i));
        }else{
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
    }

}

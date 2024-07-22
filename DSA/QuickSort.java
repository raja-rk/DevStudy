package DSA;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter elements of array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.print("Unsorted array: "+list);
        System.out.println();
        qSort(list,0,list.size()-1);
        System.out.print("Sorted array: "+list);
    }

    private static void qSort(List<Integer> list,int i,int j){
        if (i>=j) return;
        int pi = partition(list,i,j);
        qSort(list,i,pi-1);
        qSort(list,pi+1,j);
    }

    private static int partition(List<Integer> list,int low,int high) {
        int pivot = list.get(high);
        int i = low-1;
        for(int j=low;j<high;j++){
            if(list.get(j)<pivot){
                i++;
                int temp = list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
            }
        }
        int temp = list.get(i+1);
        list.set(i+1,list.get(high));
        list.set(high,temp);

        return i+1;
    }
}

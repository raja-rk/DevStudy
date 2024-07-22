package DSA;
import java.util.*;
public class mergeSort {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter elements of array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.print("Unsorted array: "+list);
        System.out.println();
        mSort(list,0,list.size()-1);
        System.out.print("Sorted array: "+list);
    }

    private static void mSort(List<Integer> list, int i, int j) {
        if(i>=j)return;
        int mid = i+(j-i)/2;
        mSort(list, i, mid);
        mSort(list, mid+1, j);
        merge(list,i,mid,j);
    }

    private static void merge(List<Integer> list, int i, int mid, int j){
        int size = j-i+1;
        int[] temp = new int[size];
        int i1 = i;
        int i2 = mid+1;
        int k = 0;
        while(i1<=mid && i2<=j){
            if(list.get(i1)<=list.get(i2)){
                temp[k] = list.get(i1);
                i1++;
            }
            else{
                temp[k] = list.get(i2);
                i2++;
            }
            k++;
        }
        while(i1<=mid){
            temp[k] = list.get(i1);
            i1++;
            k++;
        }
        while(i2<=j){
            temp[k] = list.get(i2);
            i2++;
            k++;
        }
        for(int t=0;t<size;t++){
            list.set(t+i,temp[t]);
        }
    }
}

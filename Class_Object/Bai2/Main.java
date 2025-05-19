package Class_Object.Bai2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size=100000;
        int [] array=new int[size];
        Random random=new Random();
        for (int i=0;i<size;i++){
            array[i]=random.nextInt(size*10);
        }
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();
        System.out.println("Thời gian sắp xếp (ms): " + stopWatch.getElapsedTime());
    }
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int minIndex=i;
            for (int j=0;j<n;j++){
                if (arr[j]<minIndex){
                    minIndex=arr[j];
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}

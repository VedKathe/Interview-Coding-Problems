package Sorting;

public class Sort {

    int[] bubbleSort(int[] arr) {
        int[] sortedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        sortedArray = arr;
        return sortedArray;
    }

    int[] selectionSort(int[] arr) {
        int[] sortedArray = new int[arr.length];
        int smallest = 0;
        for (int i = 0; i < arr.length; i++) {
            smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            if (arr[i] > arr[smallest]) {
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }
        sortedArray = arr;
        return sortedArray;
    }

    int[] interstionSort(int[] arr) {
        int[] sortedArray = new int[arr.length];
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j= i-1;

            while(j>=0 && arr[j]>key ){
                arr[j+1]= arr[j];
                j = j -1;
            }
            arr[j+1]=key;
        }
        sortedArray = arr;
        return sortedArray;
    }

    int[] MergeSort(int[] arr){


        
        return arr;
    }

    static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

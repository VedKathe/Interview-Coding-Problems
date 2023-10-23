package Sorting;

public class Main {
    public static void main(String arg[])
    {
        int input[] = new int[]{7,3,6,9,4,6,8,2,21,3,4,1,2,4,5} ;
        int result[] = new int[input.length];
        Sort s = new Sort();
        result = s.interstionSort(input);
        Sort.print(result);
    }
}

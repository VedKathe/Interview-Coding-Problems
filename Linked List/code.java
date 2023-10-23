import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class code {

    public static void binarySerach(int[] arr, int k) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end-start) / 2;

            if (arr[middle] == k) {
                System.out.println("Element found");
            } 
             if (arr[middle] < k) {
                start = middle + 1;
            } else  {
                end = middle - 1;
            }
        }
        System.out.println("NOT FOUnd");
    }

    public static void minMax(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for (int a : arr) {
            newArr.add(a);
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!newArr.isEmpty()) {
            int max = Collections.max(newArr);
            int min = Collections.min(newArr);

            result.add(max);
            result.add(min);

            newArr.remove(Integer.valueOf(max));
            newArr.remove(Integer.valueOf(min));
            System.out.println("Remaining array:" + newArr);
            System.out.println("Sorted array: " + result);
        }

    }

    public static void occorance(String n) {
        HashMap<Character, Integer> occ = new HashMap<Character, Integer>();
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            count = 0;
            for (int j = 0; j < n.length(); j++) {

                if (n.charAt(j) == n.charAt(i)) {
                    count++;
                }
            }
            occ.put(n.charAt(i), count);
        }

        for (Map.Entry<Character, Integer> m : occ.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            n = n * fact(n - 1);
            return n;
        }
    }

    public static void slt(String str){
        String nes = str.substring(0, str.length()-1);
        System.out.println(nes);
    }
    
    public static void main(String[] args) {

        // int n=5;

        // System.out.println(fact(n));
        // occorance("aasasads");
        // int[] arr = new int[] { 93, 2, 1, 4, 7, 3, 5, 7, 31, 4, 3 };
        // binarySerach(arr,31);
        slt("helloothis");
    }
}

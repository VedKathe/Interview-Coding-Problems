
import java.util.Scanner;

public class NumberEncryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine().trim();
        String actionString = scanner.nextLine().trim();
        String outputString = numberEncryption(inputString, actionString);
        System.out.println(outputString);
    }

    public static String numberEncryption(String inputString, String actionString) {
        char[] inputArray = inputString.toCharArray();
        int idx = 0;
        

        for (char action : actionString.toCharArray()) {
            
            if (action == 'R') {
                idx = Math.min(idx + 1, inputArray.length - 1);
            } else if (action == 'L') {
                idx = Math.max(idx - 1, 0);
            } else if (action == 'T') {
                inputArray[idx] = (char) ('0' + Math.min(inputArray[idx] - '0' + 1, 9));
            } else if (action == 'D') {
                inputArray[idx] = (char) ('0' + Math.max(inputArray[idx] - '0' - 1, 0));
            } else if (actionString.toCharArray()[0] == 'S') {

                int swapIdx =  Integer.parseInt(actionString.substring(1, 2) );
                
                
                
                if (swapIdx >= 0 && swapIdx < inputArray.length) {
                    char temp = inputArray[idx];
                    inputArray[idx] = inputArray[swapIdx-1];
                    inputArray[swapIdx-1] = temp;
                }
                
            }
            actionString = actionString.substring(1);
            
        }

        return new String(inputArray);
    }
}

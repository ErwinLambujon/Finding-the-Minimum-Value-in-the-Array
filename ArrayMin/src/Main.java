import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Find Minimum
        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("The minimum is = " + min);
    }
}
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // take input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of size of array: ");
        int a = sc.nextInt(); // initialize array size

        int[] arr = new int[a]; // declare an array

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt(); // initialize array elements
        }
        get_even(arr);
        sc.close();
    }

    public static void get_even(int[] arr) {
        int even = 0;
        int odd = 0;
        int ctr_even = 0;
        int ctr_odd = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.println(j + " is an even number");
                even += j;
                ctr_even++;
            } else {
                System.out.println(j + " is an odd number");
                odd += j;
                ctr_odd++;
            }
        }
        System.out.println();
        System.out.printf("\nThere is a total of %d odd numbers and their sum is %d", ctr_odd, odd);
        System.out.printf("\nThere is a total of %d even numbers and their sum is %d", ctr_even, even);

    }
}

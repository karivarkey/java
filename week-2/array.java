import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int array[], i, count_odd, count_even;
        System.out.print("Enter the number of elements in the array : ");
        int n = reader.nextInt();
        array = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("Enter the " + i + "th Element : ");
            array[i] = reader.nextInt();
        }
        count_even = 0;
        count_odd = 0;
        for (i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                count_even++;
            } else {
                count_odd++;
            }
        }
        System.out.println("The number of even elemts are : " + count_even);
        System.out.println("The number of odd elemts are : " + count_odd);
        reader.close();
    }

}
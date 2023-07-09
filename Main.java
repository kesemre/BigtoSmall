import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen dizinizin kaç elemanlı olduğunu giriniz");
        int arrLeght = scanner.nextInt();
        int[] arr = new int[arrLeght];
        for (int i=0;i<arrLeght;i++){
            System.out.print("dizinizin "+(1+i)+". elamınını girniz.");
            arr[i] = scanner.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
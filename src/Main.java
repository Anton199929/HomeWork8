import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int[] even = new int[3];
        even[0] = 1;
        even[1] = 2;
        even[2] = 3;
        double[] odd = {1.57, 7.654, 9.986};
        int[] arbitrary = {2, 7, 10, 356};

        System.out.println("Задача 2");

        for (int i = 0; i < even.length; i++){
            if (i == even.length - 1){
                System.out.println(even[i]);
                break;
            }
            System.out.print(even[i] + "," + " ");
        }
        for (int i = 0; i < odd.length; i++){
            if (i == odd.length - 1){
                System.out.println(odd[i]);
                break;
            }
            System.out.print(odd[i] + "," + " ");
        }
        for (int i = 0; i < arbitrary.length; i++){
            if (i == arbitrary.length - 1){
                System.out.println(arbitrary[i]);
                break;
            }
            System.out.print(arbitrary[i] + "," + " ");
        }

        System.out.println("Задача 3");

        for (int i = even.length - 1; i >= 0; i--){
            if (i == 0) {
                System.out.println(even[i]);
                break;
            }
            System.out.print(even[i] + "," + " ");
        }
        for (int i = odd.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(odd[i]);
                break;
            }
            System.out.print(odd[i] + "," + " ") ;
        }
        for (int i = arbitrary.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(arbitrary[i]);
                break;
            }
            System.out.print(arbitrary[i] + "," + " ");
        }

        System.out.println("Задача 4");

        for (int i = 0; i < even.length; i++){
            if (even[i] % 2 != 0 ){
                even[i] = even[i] + 1;
                System.out.print(even[i] + " ");
            }
        }





    }
}
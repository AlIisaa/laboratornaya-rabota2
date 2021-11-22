import java.util.Scanner;

public class lab2 {
    public static void main (String[] count) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое отрицательное число, которое меньше 15:");
        int n = scanner.nextInt();
        int outcome = 1;
        if (n<0 | n>15){
            System.out.print("Ошибка!Число не удовлетворяет условия ввода!");
        }
        else{
            for(int j = 1; j <= n; j++){
                outcome = outcome * j;
            }
            System.out.print(n + "!=" + outcome);
        }
    }
}


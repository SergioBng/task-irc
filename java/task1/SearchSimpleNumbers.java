package task1;

import java.util.Scanner;

public class SearchSimpleNumbers {
    public static void main(String[] args) {
        System.out.println("Enter last number of all simple numbers:");
        Scanner scanner = new Scanner(System.in);
        int boundOfNumbers = scanner.nextInt();

        countSimpleNumbers(boundOfNumbers);
    }

    public static int countSimpleNumbers(int boundOfNumbers) {
        int countOfSimpleNumbers = 0;

        for (int i = 0; i <=boundOfNumbers; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            // переходим на следующую итерацию цикла, если 0 или 1

            boolean isSimple = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isSimple = false;
                    break;
                }
            }
            // проверяем делится ли число на другое без остатка

            if(isSimple){
                countOfSimpleNumbers++;
            }
            // увеличиваем количество простых чисел, если найдем такое
        }

        double percentSimpleNumbersFromAll = countOfSimpleNumbers * 100 / (boundOfNumbers + 1);
        // считаем процент простых чисел от всех, включая ноль

        System.out.printf("Count of simple numbers in range from 0 to %d - %d\n\n" +
                        "Percent simple numbers from all - %.1f\n",
                boundOfNumbers, countOfSimpleNumbers, percentSimpleNumbersFromAll);

        return countOfSimpleNumbers;
    }
}

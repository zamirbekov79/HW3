public class Main {
    public static void main(String[] args) {
        double[] numbers = {8.5, 7.2, -2.3, -4.1, 2.0, 3.5, 6.0, -7.8, 4.2, -3.3, 5.5, 9.1, -1.4, 7.7, -6.6};

        boolean foundFirstNegative = false;
        double sum = 0;
        int count = 0;
        for (double number : numbers) {
            if (!foundFirstNegative) {
                if (number < 0) {
                    foundFirstNegative = true;
                }
            } else {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Положительных чисел после первого отрицательного нет.");
        }
    }
}

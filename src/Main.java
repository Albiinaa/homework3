
public class Main {
    public static void main(String[] args) {
        double[] num = {2.5, 3.6, -1.5, -5.6, 9.0, 4.0, 0.3, 7.5, -8.5, 2.0, -11.5, -0.5, -7.7, 10.1, -9.1};
        boolean examination = false;
        int zeroInt = 0;
        double zeroDouble = 0;
        for (double numbers : num) {
            if (numbers < 0) {
                examination = true;
            } else if (numbers > 0 && examination) {
                zeroDouble = numbers;
                zeroInt++;
                System.out.println(numbers);
            }
        }
        System.out.println("Среднее арифметическое положительных чисел:" + zeroDouble / zeroInt);
        
    }


}

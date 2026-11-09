package library.service;

public class NumberClassifier {


    public String numberClassify(int number) {
        if (number % 2 == 0) {
            return number + " Even ";
        } else if (number % 3 == 0) {
            return number + " Divisible by 3 ";
        } else {
            return number + " something else ";
        }
    }

    public void printNumbers(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(numberClassify(i));
        }
    }
}

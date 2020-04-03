package main;

public class Fibonacci implements LineSelector{

    private int getFibonacciValue(int position) {

        if(position == 1) {
            return 1;
        }
        else if(position == 2) {
          return 2;
        }
       else {
          return getFibonacciValue(position - 1) + getFibonacciValue(position - 2);
       }
    }

    public boolean isValidLine(int value) {
        int count = 1;
        int fibonacciValue = 0;

        while (fibonacciValue < value) {
            fibonacciValue = getFibonacciValue(count);
          if (fibonacciValue == value) return true;
          count++;
        }

        return false;
    }
}

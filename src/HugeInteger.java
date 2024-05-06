import java.math.BigInteger;
import java.util.Arrays;

public class HugeInteger {
    int[] digits = new int[40];

    public HugeInteger() {}

    public int[] parse(String number) {
//        String regex1 = "((234|\\+234)-?|0)?(70|[8-9][0-1])\\d{8}";
//        String regex = "(0-9)";
        if (number.length() == 40) {
            for (int count = 0; count < number.length(); count++) {
                digits[count] = Integer.parseInt(String.valueOf(number.charAt(count)));
            }
            return digits;
        } else {
            throw new NumberNotInRangeException("Number length must be 40");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int digit : digits) {
            builder.append(digit);
        }
        return builder.toString();
    }

    public int add(int[] array1, int[] array2) {
        int sum = 0;
        int sum2 = 0;
        for (int digit : array1) {
            sum2 += digit;
        }
        for (int digit2 : array2) {
            sum += digit2;
        }
        return sum + sum2;
    }

    public int subtract(int[] array2, int[] array1) {
        int subtract = 0;
        int subtract2 = 0;
        for (int digit : array2) {
            subtract += digit;
        }
        for (int digit : array1) {
            subtract2 += digit;
        }
        return subtract - subtract2;
    }

    public boolean equals(int[] array1, int[] array2) {
        for (int digit : array1) {
            for (int digit2 : array2) {
                if (digit == digit2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isNotEqualsTo(int[] array1, int[] array2) {
        for (int digit : array1) {
            for (int digit2 : array2) {
                if (digit != digit2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isGreaterThan(int[] array1, int[] array2) {
        int sum = 0;
        int sum2 = 0;
        for (int digit : array1) {
            sum2 += digit;
        }
        for (int digit2 : array2) {
            sum += digit2;
        }
       if(sum > sum2){
           System.out.println(sum);
           System.out.println(sum2);
           return true;
       }
        System.out.println(sum);
        System.out.println(sum2);
        return false;
    }
}


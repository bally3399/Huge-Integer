public class HugeInteger {
    int[] digits = new int[40];
    private boolean isDigit(String number) {
        for (char digit : number.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false;
            }
        }
        return true;
    }

    public int[] parse(String number) {
        if (!isDigit(number)) {
            throw new CheckNumberException("Not a number");
        } else {
            if (number.length() == 40) {
                for (int count = 0; count < number.length(); count++) {
                    digits[count] = Integer.parseInt(String.valueOf(number.charAt(count)));
                }
                return digits;
            } else {
                throw new NumberNotInRangeException("Invalid number");
            }
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

    public int add(HugeInteger number) {
        int sum = 0;
        int sum2 = 0;
        for (int digit : digits) {
            sum += digit;
        }
        int[] array = parse(String.valueOf(number));
        for (int digit : array) {
            sum2 += digit;
        }
        return sum + sum2;
    }

    public int subtract(HugeInteger number) {
        int subtract = 0;
        int subtract2 = 0;
        for (int digit : digits) {
            subtract -= digit;
        }
        int[] array = parse(String.valueOf(number));
        for (int digit : array) {
            subtract2 -= digit;
        }
        return subtract - subtract2;
    }

    public boolean equals(HugeInteger number) {
        int[] array = parse(String.valueOf(number));
        for (int digit : digits) {
            for (int digit2 : array) {
                if (digit == digit2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isNotEqualsTo(HugeInteger number) {
        int[] array = parse(String.valueOf(number));
        for (int digit : digits) {
            for (int digit2 : array) {
                if (digit != digit2) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isGreaterThan(HugeInteger number) {
        int[] array = parse(String.valueOf(number));
        for (int digit : digits) {
            for (int digit2 : array) {
                if (digit > digit2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isLessThan(HugeInteger number) {
        int[] array = parse(String.valueOf(number));
        for (int digit : digits) {
            for (int digit2 : array) {
                if (digit < digit2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isGreaterThanOrEqualsTo(HugeInteger number) {
        int[] array = parse(String.valueOf(number));
        for (int digit : digits) {
            for (int digit2 : array) {
                if (digit >= digit2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isLessThanOrEqualsTo(HugeInteger number) {
        int[] array = parse(String.valueOf(number));
        for (int digit : digits) {
            for (int digit2 : array) {
                if (digit <= digit2) {
                    return true;
                }
            }
        }
        return false;
    }
}


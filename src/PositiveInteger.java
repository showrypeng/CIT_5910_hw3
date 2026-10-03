public class PositiveInteger {
    private int num;

    public PositiveInteger(int number){
        num = number;
    }

    public boolean isPerfect() {
        int sum = 0;

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }

    public boolean isAbundant() {
        int sum = 0;

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        return sum > num;
    }

    public boolean isNarcissistic() {
        int sum = 0;
        int digits = 1;

        if (num>9){
            for (int i = 1; num >= Math.pow(10, i); i ++){
                digits = i +1;
            }
        }

        for (int i = 0; i < digits; i++){
            int digit = (num / (int) Math.pow(10, i)) % 10;
            sum += (int) Math.pow(digit, digits);
            }
        return sum == num;
    }

}


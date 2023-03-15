package tradutor;

public class Numoctal {

    private int decimal;
    private String octal;

    public Numoctal(int decimal) {
        this.decimal = decimal;
        int temp = decimal;
        String octal = "";
        while (temp > 0) {
            int resto = temp % 8;
            octal = resto + octal;
            temp /= 8;
        }
        this.octal = octal;
    }

    public String toString() {
        return octal;
    }

}

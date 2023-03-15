package tradutor;

public class Numhexa {
    
    private int decimal;
    private String hexa;

    Numhexa(int decimal) {
        this.decimal = decimal;
        int temp = decimal;
        hexa = ""; // Ajuste aqui
        while (temp > 0) {
            int resto = temp % 16;
            if (resto < 10) {
                hexa = resto + hexa;
            } else {
                hexa = (char)('A' + resto - 10) + hexa;
            }
            temp /= 16;
        }
    }
    
    public String toString() {
        return hexa;
    }

}
package tradutor;

public class Numbinario {

    private int decimal;
    private String binario;

    public Numbinario(int decimal) {
        this.decimal = decimal;
        int temp = decimal;
        String binario = "";
        while (temp > 0) {
            int resto = temp % 2;
            binario = resto + binario;
            temp /= 2;
        }
        this.binario = binario;
    }

    public String toString() {
        return binario;
    }

}

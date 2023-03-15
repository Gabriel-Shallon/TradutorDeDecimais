package tradutor;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class chamarosnum {

    public static void main(String[] args) {
        
        int A = 0; 
        
        while (A!=1){  


        UIManager.put("OptionPane.yesButtonText","Binário");
        UIManager.put("OptionPane.noButtonText","Hexadecimal");
        UIManager.put("OptionPane.cancelButtonText","Octal");
        int translchoic = JOptionPane.showConfirmDialog(null, "Para qual dessas opções ira traduzir seu decimal?", "Trad. decimal", JOptionPane.YES_NO_CANCEL_OPTION);
        
        UIManager.put("OptionPane.cancelButtonText","Canelar");

        if (translchoic == 0){
            int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o Decimal", "Trad. binário"));
            Numbinario binario1 = new Numbinario(decimal);
            JOptionPane.showMessageDialog(null, binario1);
        }else if (translchoic == 1){
            int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o Decimal", "Trad. binário"));
            Numhexa hexa1 = new Numhexa(decimal);
            JOptionPane.showMessageDialog(null, hexa1);
        }else{
            int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o Decimal", "Trad. binário"));
            Numoctal octal1 = new Numoctal(decimal);
            JOptionPane.showMessageDialog(null, octal1);
        }

        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION);

        }
    }
}

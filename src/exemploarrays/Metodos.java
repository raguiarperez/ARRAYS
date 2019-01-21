
package exemploarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author raguiarperez
 */
public class Metodos {
       int[] notas = new int[8];

    public int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("valor"));

    }

    public void crearArrays() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = darValor();
        }

    }

    public void amosar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }

    public void amosarForEach() {
        for (int ele : notas) {
            System.out.println(ele);
        }

    }
    public void eleBuscar(){
        int ele= darValor();
        int atopado=0;
        for(int i=0;i<notas.length;i++){
            System.out.println("O elemento esta na posicion:" +(i+1));
            atopado=1;
            break;
        }
    }

}


package exemploarrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author raguiarperez
 */
public class Metodos {
    int tam=5;
    int[] notas = new int[5];
    int[] repes= new int[5];

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
//            System.out.println("O elemento esta na posicion:" +(i+1));
            atopado=1;
            break;
        }
    }
    public void repetidos(){
        int z=0;
        int elerepe;
        elerepe=darValor();
//        for(int i=0;i<notas.length;i++)
//            if(elerepe==notas[i]){
//                repes[z]=i+1;
//                z++;
//            }
//        for(int i=0;i<z;i++)
//            System.out.println(elerepe+" esta --> posicion:"+ repes[i]);
        
        if(z==0)
            System.out.println(elerepe+"no esta en la lista");
        else if(z==1)
            System.out.println(elerepe+"no se repite");
           else
        for(int i=0;i<notas.length;i++)
            System.out.println(elerepe+" esta --> posicion:"+ repes[i]);
    }
//    public void ordenar(){
//        int aux=0;
//        for(int i=0;i<notas.length-1;i++)
//            for(int j=0;j<notas.length;j++)
//                if(notas[i]< notas[j]){
//                    aux=notas[i];
//                    notas[i]=notas[j];
//                    notas[j]=aux;
//                }
//    }
    public void ordenarshort(){
        Arrays.sort(notas);
    }
    public void borrar(){
        int eleBorrar= darValor();
        for(int i=0;i<notas.length;i++)
            if(eleBorrar == notas[i]){
                for(int pos=i;pos<notas.length-1;pos++)
                notas[pos]=notas[pos+1];
                tam--;
                
                
        }
    }

}

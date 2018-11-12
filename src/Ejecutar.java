

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JOptionPane;

/**
 *
 * @author  Sulay Cupitra
 */
public class Ejecutar {

    public int inicializador() {
        int Max = (28) + 1;// cota sup mas 1   
        int Min = 10;

        int A = (int) (Math.random() * 30 + 10);
         if (A>=29) {
            A=30;
             return A;
        }
          return A;
       
    }

    public static void main(String[] args) {
        Ejecutar admin = new Ejecutar();

        int A = admin.inicializador();
        System.out.println("el numero aleatorio es: " + A);
        int[] b = {1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0};
        String d = "" + b[0];
        ListaDoble_String list = new ListaDoble_String(d);
        ListaDoble_String tmp = list;
        admin.crear_cinta(tmp, b, A);
        // list.imprimir(list);
        admin.imprimir(list);
        System.out.println("");
        admin.mover(list);
        System.out.println("al derecho:");
        admin.imprimir(list);
        ///4 izqueirda, 6 derecha

        // admin.modificar();
    }

    public void imprimir(ListaDoble_String list) {
        System.out.println("impresion de la cinta: ");
       list.imprimir(list);
        System.out.println("");
    }

    public ListaDoble_String mover(ListaDoble_String list) {
        
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog("ingrese para moverse:\n4) izquierda\n6) derecha\n5) salir "));

        switch (opc) {
            case 4:
                list = list.moverIzquierda(list);
                System.out.println("el valor de la cinta en esta posicion es: "+list.valor);
                modificar(list.valor, list);
               
                
                mover(list);
                break;
            case 5:
                //SoloNumeros admin = new Ejecutar();
                System.out.println("Hasta luego, \nimpresion de la cinta al revez");
                //admin.imprimir(list);
                imprimir(list);
                //System.exit(0);
                break;
            case 6:
                list = list.moverDerecha(list);
                 System.out.println("el valor de la cinta en esta posicion es: "+list.valor);
                modificar(list.valor, list);
                 
                 
                 
                mover(list);
                break;
            default:
                System.out.println("error");
                mover(list);
                break;

        }
return list;
    }

    
  
    
    public void modificar(String valor,ListaDoble_String list) {
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
       // Ejecutar admin = new Ejecutar();
        int aaa = JOptionPane.showConfirmDialog(null, "Esta seguro cambiar el contenido de la cinta?", "Atencion", dialogButton);
        if (aaa == JOptionPane.YES_OPTION) {
            String p =guardar();
            list.valor=p;
            System.out.println(p);
        }else if (aaa == JOptionPane.NO_OPTION) {
                //System.exit(0);
                mover(list);
        }
    }

    public void crear_cinta(ListaDoble_String tmp, int[] b, int A) {
        if (A >= 31) {
            A = (A / A) * 30;
            System.out.println(A);
            crear_cinta(tmp, b, A);
        } else {
            String c = "";
            for (int i = 0; i < A; i++) {
                c = "" + b[i + 1];
                tmp = tmp.insertar(c);
            }
        }
    }
    
    
    public String guardar() {
        int num = -1;
        String a="";
        int numt = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero para crear automata"));
        num = numt;
        switch (numt) {
            case 0:
                num = numt;
                a=num+"";
                System.out.println(a);
                break;
            case 1:
                num = numt;
                 a=num+"";
                System.out.println(a);
                break;
            default:
                JOptionPane.showMessageDialog(null, " numero No Permitido");
                a="";
                a = guardar();
                break;
        }
        return a;
    }
}

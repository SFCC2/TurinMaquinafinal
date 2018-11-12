/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author  Sulay Cupitra
 */
public class ListaDoble_String {
    String valor;
    ListaDoble_String siguiente;
    ListaDoble_String anterior;
    
    public ListaDoble_String(){
    
    }
    
    public ListaDoble_String(String valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
    
    void imprimir(ListaDoble_String l){
        while(l != null){
            System.out.print(l.valor+" ");
            l = l.siguiente;
        }
    }
    
    void imprimirRevez(ListaDoble_String l){
        while(l != null){
            System.out.print(l.valor+" ");
            l = l.anterior;
        }
    }
    
    ListaDoble_String obtenerUltimo (ListaDoble_String l){
        while(l != null){
            if(l.siguiente == null){
                return l;
            }else{
                l = l.siguiente;
            }
        }
        
        return l;
    }
    
    ListaDoble_String moverDerecha (ListaDoble_String l){
        if(l.siguiente != null)
            return l.siguiente;
        else
            return l;
    }
    
    
    ListaDoble_String moverIzquierda (ListaDoble_String l){
        if(l.anterior != null)
            return l.anterior;
        else
            return l;
    }
    
    ListaDoble_String insertar(String i){
        ListaDoble_String tmp = this;
        tmp.siguiente = new ListaDoble_String(i);
        siguiente.anterior = tmp;
        return siguiente;
    }
    
    public static void main(String[] arg){
        
        
        ListaDoble_String L = new ListaDoble_String("");
        ListaDoble_String tmp = L;
        String c = "";
        for (int i = 1; i < 10; i++) {
             c = "" +i;
            tmp = tmp.insertar(c);
        }
        
        L.imprimir(L);
        System.out.println("");
        ListaDoble_String ultimo = L.obtenerUltimo(L);
        
        L.imprimirRevez(ultimo);
        
        System.out.println("\n----");
        
        System.out.print(L.valor);
        L = L.moverDerecha(L);
        System.out.print(L.valor);
        L = L.moverDerecha(L);
        System.out.print(L.valor);
        L = L.moverIzquierda(L);
        System.out.print(L.valor);
        
        System.out.println("");
        
    }
    
    
    
}

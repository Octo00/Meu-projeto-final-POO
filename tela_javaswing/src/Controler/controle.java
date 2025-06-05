package Controler;

import entidade.Usuario;
import java.util.ArrayList;

public class controle {
 
    ArrayList <Usuario> Lista = new ArrayList ();
    int id = 1;
    
     public void salvar(Usuario a1) {
        Lista.add(a1);
        id ++;
}

    public ArrayList<Usuario> consultar(){
        return Lista;
    }

    public void imprimir(Usuario a1){
      a1.imprimeAtributos();
        
    }
}
     


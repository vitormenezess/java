
package view;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Windows 10
 */
public class teste {
    public static void main(String[] args) {
                
    Cliente cliente = new Cliente(1, "tiago", "Santo Antônio", "36015-001");
    System.out.println(cliente);
    
    Usuario usuario = new Usuario(1, "barbeiro","senha");
        System.out.println(usuario);
    }
    
}

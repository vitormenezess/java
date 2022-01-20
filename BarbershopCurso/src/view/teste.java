
package view;

import Model.Agendamento;
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
    
    Servico servico = new Servico(1, "barba", 30);
        System.out.println(servico);
    
    
    Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "25/07/2018 09:15");
        System.out.println(agendamento.getCliente().getNome());
    
    }
    
}

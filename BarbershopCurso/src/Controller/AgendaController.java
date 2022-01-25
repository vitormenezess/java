package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import static Model.DAO.Banco.servico;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import java.util.ArrayList;
import view.Agenda;
import Model.Servico;
/**
 *
 * @author Windows 10
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
        
    }
    public void atualizaTabela(){
        //busca
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        //Exibe
        helper.prencherTabela(agendamentos);
        
    } 
    public void atualizaCliente(){
        
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        helper.preencherClientes(clientes);
    }
    public void atualizaServico(){
        
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
}
    public void atualizaValor(){
        
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    public void agendar(){
        //Buscar
        Agendamento agendamento = helper.obterModelo();
        
        //salva
        new AgendamentoDAO().insert(agendamento);
        
        //iserir
        atualizaTabela();
        helper.limparTela();
    }
}
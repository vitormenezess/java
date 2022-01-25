package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import static Model.DAO.Banco.servico;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author vitor
 */
public class AgendaHelper implements IHelper{
    
    private final Agenda view;
    
    public AgendaHelper(Agenda view){
        this.view = view;
    }

    public void prencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTblAgenda().getModel();
        tableModel.setNumRows(0);
        
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormat(),
                agendamento.getObservcao(),
            });
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCmbCliente().getModel();
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCmbServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
            
        }
    }
     public Cliente obterCliente() {
        return (Cliente) view.getCmbCliente().getSelectedItem();
     }

    public Servico obterServico() {
        return (Servico) view.getCmbServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTxtValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        
        int id = Integer.parseInt(view.getTxtId().getText());
        //novo agendamento
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTxtValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTxtData().getText();
        String hora = view.getTxtHora().getText();
        String dataHora = data +" "+ hora;
        String observacao = view.getTxtObservacao().getText();
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getTxtId().setText("0");
        view.getTxtData().setText("");
        view.getTxtHora().setText("");
        view.getTxtObservacao().setText("");
        
    }
    
}

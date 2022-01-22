
package Controller;

import view.Agenda;
import view.MenuPrincipal;

/**
 *
 * @author vitor
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;
    
    public MenuPrincipalController(MenuPrincipal view){
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
}

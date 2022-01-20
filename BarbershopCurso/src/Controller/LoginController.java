package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import view.Login;

/**
 *
 * @author vitor
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view =view;
        this.helper = new LoginHelper(view);
    }
    public void entrarNoSistema(){
        //Pegar um Usuario da View
        Usuario usuario = helper.obterModelo();
        
    }    
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        this.view.exibeMensagem("Executei e fiz a tarefa");
        
    }
    
}

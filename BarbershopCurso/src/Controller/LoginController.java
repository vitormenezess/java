package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Login;
import view.MenuPrincipal;

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
        //Pesquisar usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
            
        }else{
            view.exibeMensagem("Usuario ou senha invalidos");
        }
        
        
    }    
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        this.view.exibeMensagem("Executei e fiz a tarefa");
        
    }
    
}

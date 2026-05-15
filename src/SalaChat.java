import java.util.ArrayList;
import java.util.List;

public class SalaChat implements ChatMediator {

    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        for (Usuario u : usuarios) {
            if (u != remetente) {
                u.receberMensagem(mensagem);
            }
        }
    }
}
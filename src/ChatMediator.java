public interface ChatMediator {
    void enviarMensagem(String mensagem, Usuario remetente);
    void adicionarUsuario(Usuario usuario);
}
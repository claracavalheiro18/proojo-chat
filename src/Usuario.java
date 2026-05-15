public class Usuario {

    private String nome;
    private ChatMediator mediador;

    public Usuario(String nome, ChatMediator mediador) {
        this.nome = nome;
        this.mediador = mediador;
    }

    public void enviar(String mensagem) {
        System.out.println(nome + " enviou: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
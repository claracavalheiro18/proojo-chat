public class Main {

    public static void main(String[] args) {

        SalaChat sala = new SalaChat();

        Usuario u1 = new Usuario("Clara", sala);
        Usuario u2 = new Usuario("Ana", sala);
        Usuario u3 = new Usuario("João", sala);

        sala.adicionarUsuario(u1);
        sala.adicionarUsuario(u2);
        sala.adicionarUsuario(u3);

        u1.enviar("oie pessoal, seguem os avisos gerais do dia");
    }
}
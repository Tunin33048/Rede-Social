public class Usuario {

    private String nome;
    private String email;

    Usuario(RedeSocial[] redeSociais) {
        redeSociais[0].postarComentario();
        redeSociais[0].postarFoto();
        redeSociais[0].postarVideo();
        System.out.println("-----------------------------");
        redeSociais[1].curtirPublicacao();
    }

    Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

}

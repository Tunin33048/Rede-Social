public class Usuario {

    private String nome;
    private String email;
    Instagram instagram = new Instagram();

    Usuario(RedeSocial[] redeSociais) {
        redeSociais[0].postarComentario();
        redeSociais[0].postarFoto();
        redeSociais[0].postarVideo();
        System.out.println("--------------------------------------\n");
        redeSociais[1].curtirPublicacao();
        instagram.fazStreaming();
        instagram.compartilhar();
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

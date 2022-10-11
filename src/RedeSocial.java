public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao() {
        System.out.println("Você curtiu uma publicação\n");
    }

    public int getNumAmigos() {
        return this.numAmigos;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }

}

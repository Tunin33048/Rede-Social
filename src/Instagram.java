public class Instagram extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void fazStreaming() {
        System.out.println("Você está fazendo um Streaming no Instagram\n");

    }

    @Override
    public void compartilhar() {
        System.out.println("Você compartilhou algo no seu Instagram\n");

    }

    @Override
    public void postarFoto() {
        System.out.println("Você postou uma foto no Instagram\n");

    }

    @Override
    public void postarVideo() {
        System.out.println("Você postou um vídeo no Instagram\n");

    }

    @Override
    public void postarComentario() {
        System.out.println("Você postou um comentário no Instagram\n");

    }

}

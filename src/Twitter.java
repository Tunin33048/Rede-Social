public class Twitter extends RedeSocial implements VideoConferencia, Compartilhamento {

    @Override
    public void fazStreaming() {
        System.out.println("Você está fazendo um Streaming no Twitter\n");

    }

    @Override
    public void compartilhar() {
        System.out.println("Você compartilhou algo no seu Twitter\n");

    }

    @Override
    public void postarFoto() {
        System.out.println("Você postou uma foto no Twitter\n");

    }

    @Override
    public void postarVideo() {
        System.out.println("Você postou um vídeo no Twitter\n");

    }

    @Override
    public void postarComentario() {
        System.out.println("Você postou um comentário no Twitter\n");

    }

}

public class main {
    public static void main(String[] args) {

        RedeSocial redeSociais[] = new RedeSocial[10];
        Facebook facebook = new Facebook();
        // GooglePlus googlePlus = new GooglePlus();
        // Twitter twitter = new Twitter();
        Instagram instagram = new Instagram();

        Usuario usuario = new Usuario("nome", "email");
        System.out.println("Seu nome é: " + usuario.getNome());
        System.out.println("Seu email é: " + usuario.getEmail());
        facebook.setSenha("123");
        instagram.setSenha("234");
        facebook.setNumAmigos(10);
        instagram.setNumAmigos(123);

        redeSociais[0] = facebook;
        redeSociais[1] = instagram;
        //redeSociais[2] = googlePlus;
        //redeSociais[3] = twitter;

        System.out.println("--------------------------------------\n");
        Usuario redesUsuario = new Usuario(redeSociais);
        
    }
}
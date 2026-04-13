public class Main {
    public static void main(String[] args) {

        Playlist playlist = new Playlist(5);

        playlist.adicionarMusica(10);
        playlist.adicionarMusica(20);
        playlist.adicionarMusica(30);

        playlist.adicionarMusicaPosicao(15, 1);

        System.out.println("Tamanho: " + playlist.tamanho());

        for (int i = 0; i < playlist.tamanho(); i++) {
            System.out.println("Musica " + i + ": " + playlist.obterMusica(i));
        }

        playlist.removerMusicaPosicao(2);

        System.out.println("\nApós remover:");

        for (int i = 0; i < playlist.tamanho(); i++) {
            System.out.println("Musica " + i + ": " + playlist.obterMusica(i));
        }

        System.out.println("\nContém 20? " + playlist.contem(20));
    }
}
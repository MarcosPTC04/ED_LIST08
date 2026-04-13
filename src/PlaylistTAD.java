public interface PlaylistTAD {

    void adicionarMusica(int id);
    void adicionarMusicaPosicao(int id, int pos);

    int removerMusica();
    int removerMusicaPosicao(int pos);

    int buscarMusica(int id);
    int obterMusica(int pos);

    boolean contem(int id);
    boolean estaVazia();
    boolean estaCheia();

    int tamanho();

    void limpar();
}
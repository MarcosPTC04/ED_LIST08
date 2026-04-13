public class Playlist implements PlaylistTAD {

    private int[] musicas;
    private int tamanho;

    public Playlist(int capacidade) {
        musicas = new int[capacidade];
        tamanho = 0;
    }

    @Override
    public void adicionarMusica(int id) {
        if (estaCheia()) {
            System.out.println("Playlist cheia!");
            return;
        }
        musicas[tamanho] = id;
        tamanho++;
    }

    @Override
    public void adicionarMusicaPosicao(int id, int pos) {
        if (estaCheia() || pos < 0 || pos > tamanho) {
            System.out.println("Erro ao adicionar!");
            return;
        }

        for (int i = tamanho; i > pos; i--) {
            musicas[i] = musicas[i - 1]; // SHIFT
        }

        musicas[pos] = id;
        tamanho++;
    }

    @Override
    public int removerMusica() {
        if (estaVazia()) return -1;

        int removido = musicas[tamanho - 1];
        tamanho--;
        return removido;
    }

    @Override
    public int removerMusicaPosicao(int pos) {
        if (estaVazia() || pos < 0 || pos >= tamanho) return -1;

        int removido = musicas[pos];

        for (int i = pos; i < tamanho - 1; i++) {
            musicas[i] = musicas[i + 1]; // SHIFT
        }

        tamanho--;
        return removido;
    }

    @Override
    public int buscarMusica(int id) {
        for (int i = 0; i < tamanho; i++) {
            if (musicas[i] == id) return i;
        }
        return -1;
    }

    @Override
    public int obterMusica(int pos) {
        if (pos < 0 || pos >= tamanho) return -1;
        return musicas[pos];
    }

    @Override
    public boolean contem(int id) {
        return buscarMusica(id) != -1;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public boolean estaCheia() {
        return tamanho == musicas.length;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public void limpar() {
        tamanho = 0;
    }
}
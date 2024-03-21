import java.util.ArrayList;
public class Album {

    private String nome;
    private String ano_lancamento;
    private ArrayList<Musica> musicas = new ArrayList<Musica>();

    public Album(String nome, String ano_lancamento){

        this.nome = nome;
        this.ano_lancamento = ano_lancamento;

    }

    public void add_musica(Musica musica) {

        this.musicas.add(musica);
    }

}

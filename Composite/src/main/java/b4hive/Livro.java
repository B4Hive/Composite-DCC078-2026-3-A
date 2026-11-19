package b4hive;

import java.util.List;
import java.util.ArrayList;

public class Livro {
    private String titulo;
    private List<Conteudo> subitens;
    public Livro(String titulo) {
        this.titulo = titulo;
        this.subitens = new ArrayList<>();
    }
    public void addSubitem(Conteudo subitem) {
        subitens.add(subitem);
    }
    public String getConteudo() {
        String saida = titulo + "\n";
        for (Conteudo subitem : subitens) {
            saida += subitem.getConteudo();
        }
        return saida;
    }
}

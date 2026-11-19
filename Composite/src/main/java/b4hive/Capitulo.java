package b4hive;

import java.util.ArrayList;
import java.util.List;

public class Capitulo extends Conteudo {
    private String titulo;
    private List<Conteudo> conteudo;
    public Capitulo(String titulo) {
        this.titulo = titulo;
        this.conteudo = new ArrayList<>();
    }
    public void addConteudo(Conteudo c) {
        conteudo.add(c);
    }
    @Override
    public String getConteudo() {
        String saida = "Capitulo: " + titulo + "\n";
        for (Conteudo c : conteudo) {
            saida += c.getConteudo();
        }
        return saida;
    }
}

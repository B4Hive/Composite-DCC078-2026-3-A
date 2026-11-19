package b4hive;

public class Texto extends Conteudo {
    private String content;
    public Texto(String content) { this.content = content; }
    @Override 
    public String getConteudo() { return content + "\n"; }
}

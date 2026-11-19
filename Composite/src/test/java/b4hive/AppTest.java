package b4hive;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testLivro() {
        Livro livro = new Livro("Livro de Teste");
        Capitulo capitulo1 = new Capitulo("Primeiro");
        Texto texto1 = new Texto("Texto do primeiro capítulo.");
        capitulo1.addConteudo(texto1);
        livro.addSubitem(capitulo1);
        assertEquals("Livro de Teste\nCapitulo: Primeiro\nTexto do primeiro capítulo.\n", livro.getConteudo());
    }

}

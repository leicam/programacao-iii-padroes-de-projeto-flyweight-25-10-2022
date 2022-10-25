import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Floresta extends JFrame {
    private List<Arvore> arvores = new ArrayList<>();

    public void plantarArvore(int x, int y, String nome, Color cor, String dadosArvore){
        TipoDeArvore tipo = FabricaArvore.obterTipoArvore(nome, cor, dadosArvore);
        Arvore arvore = new Arvore(x, y, tipo);

        arvores.add(arvore);
    }

    @Override
    public void paint(Graphics grafico) {
        for (Arvore arvore : arvores){
            arvore.desenhar(grafico);
        }
    }
}

import java.awt.*;

public class TipoDeArvore {
    private String nome;
    private Color cor;
    private String dadosArvore;

    public TipoDeArvore(String nome, Color cor, String dadosArvore) {
        this.nome = nome;
        this.cor = cor;
        this.dadosArvore = dadosArvore;
    }

    public void desenhar(Graphics grafico, int x, int y){
        grafico.setColor(Color.BLACK);
        grafico.fillRect(x-1, y, 3, 5);
        grafico.setColor(this.cor);
        grafico.fillOval(x-5, y-10, 10, 10);
    }
}
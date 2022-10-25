import java.awt.*;

public class Main {
    private static int TAMANAHO_QUADRO = 500;
    private static int ARVORES_PARA_DESENHAR = 1000000;
    private static int TIPOS_DE_ARVORE = 2;

    public static void main(String[] args) {
        Floresta floresta = new Floresta();

        for(int i = 0; i < Math.floor(ARVORES_PARA_DESENHAR / TIPOS_DE_ARVORE); i++){
            floresta.plantarArvore(random(0, TAMANAHO_QUADRO), random(0, TAMANAHO_QUADRO),
                    "arvore verao", Color.GREEN, "textura arvore verao");

            floresta.plantarArvore(random(0, TAMANAHO_QUADRO), random(0, TAMANAHO_QUADRO),
                    "arvore outono", Color.ORANGE, "textura arvore outono");
        }

        floresta.setSize(TAMANAHO_QUADRO, TAMANAHO_QUADRO);
        floresta.setVisible(true);

        System.out.println(ARVORES_PARA_DESENHAR + " arvores para desenhar");
        System.out.println("---------------------");
        System.out.println("Memoria utilizada:");
        System.out.println("Tamanho da arvore (8 bytes) * " + ARVORES_PARA_DESENHAR);
        System.out.println("+ Tamanho dos tipos de arvres (~30 bytes) * " + TIPOS_DE_ARVORE + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((ARVORES_PARA_DESENHAR * 8 + TIPOS_DE_ARVORE * 30) / 1024 / 1024) +
                "MB (ao invés de " + ((ARVORES_PARA_DESENHAR * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int minimo, int maximo){
        return minimo + (int) (Math.random() * (maximo - minimo) + 1);
    }
}
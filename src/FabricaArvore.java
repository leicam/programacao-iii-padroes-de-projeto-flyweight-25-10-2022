import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class FabricaArvore {
    private static Map<String, TipoDeArvore> tipos = new HashMap<>();

    public static TipoDeArvore obterTipoArvore(String nome, Color cor,String dadosArvore){
        TipoDeArvore tipo = tipos.get(nome);

        if (tipo != null){
            return tipo;
        }

        tipo = new TipoDeArvore(nome, cor, dadosArvore);
        tipos.put(nome, tipo);

        return tipo;
    }
}

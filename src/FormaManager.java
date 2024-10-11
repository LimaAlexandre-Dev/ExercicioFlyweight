import java.util.ArrayList;
import java.util.List;

public class FormaManager {

    private static List<Forma> formas;
    private static CorFactory corFactory;

    public FormaManager() {
        this.formas = new ArrayList<>();
        this.corFactory = new CorFactory();
    }

    public void addForma(String nomeCor, String posicao, int tamanho){
        Cor cor = corFactory.getCor(nomeCor);
        Forma novaForma = new Forma(cor, posicao, tamanho);
        formas.add(novaForma);
    }

    public static void apresentar(){
        for(Forma forma : formas){
            System.out.println(forma.toString());
        }
    }
}

import java.util.HashMap;
import java.util.Map;

public class CorFactory {

    private static Map<String, Cor> map = new HashMap<>();

    public static Cor getCor(String nome){
        if(!map.containsKey(nome)){
            Cor cor = new Cor(nome);
            map.put(nome,cor);
        }
        return map.get(nome);
    }

}
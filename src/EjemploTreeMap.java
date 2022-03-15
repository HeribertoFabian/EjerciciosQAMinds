import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMap {

    public static void main(String[] args) {
        Map<Integer, String> mapa = new TreeMap();
        mapa.put(1,"México");
        mapa.put(2, "Francia");
        mapa.put(3,null);
        mapa.put(4, "Italia");
        //mapa.put(null, "China");


        for(Map.Entry<Integer,String> elemento:mapa.entrySet()){
            System.out.println(elemento.getKey() + " : " +elemento.getValue());
        }

        mapa.replace(3, "Argentina");

        mapa.forEach((clave, valor) -> {
            System.out.println(valor.toUpperCase(Locale.ROOT));
        });


        //

        System.out.println(mapa);

        System.out.println("Imprimiendo solo llaves " + mapa.keySet());
        System.out.println("Imprimiendo solo valores " + mapa.values());

    }
}

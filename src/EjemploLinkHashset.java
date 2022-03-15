import java.util.LinkedHashSet;
import java.util.Iterator;

public class EjemploLinkHashset{

public static void main(String[] args){

LinkedHashSet<Integer> lh1 = new LinkedHashSet<Integer>();

lh1.add(30);
lh1.add(10);
lh1.add(40);
lh1.add(40);
lh1.add(20);

// EjemploLinkHashset@12345

System.out.println("Elementos en la coleccion: " +lh1);


Iterator<Integer> i = lh1.iterator();
while(i.hasNext()){
	System.out.println("con itertaor: " +i.next());
}

System.out.println(lh1.contains(10));

lh1.clear();
System.out.println("Elementos en la coleccion: " +lh1);
}
}
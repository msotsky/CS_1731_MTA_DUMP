import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Iterator;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(11);

        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            Integer i = it.next();
            System.out.println(i);
            int x = i * i;
            System.out.println(x);
        }
        System.out.println("");
        Iterator<Integer> it = list.iterator();
        it.next(); //gets the first elements
        it.next(); it.next();//gets the second element
        it.remove();//removes the element
        System.out.println(list);
        System.out.println("");

    }
}
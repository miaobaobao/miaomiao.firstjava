import java.io.IOException;  
import java.util.HashSet;  
import java.util.Set;  
  
public class Test {  
    public static void main(String[] args) throws IOException {  
        Set<Integer> set1 = new HashSet<Integer>();  
        set1.add(1);  
        set1.add(2);  
        set1.add(3);  
        set1.add(4);  
        Set<Integer> set2 = new HashSet<Integer>();  
        set2.add(1);  
        set2.add(3);  
        set2.add(5);  
        set2.add(7);
        set2.add(9); 
        set2.add(11); 
        System.out.println("合集:"); 
        set1.addAll(set2);  
        for (Integer i : set1) {  
            System.out.print(i);  
        }  
        set1 = new HashSet<Integer>();  
        set1.add(1);  
        set1.add(2);  
        set1.add(3);  
        set1.add(4);  
        System.out.println();
        System.out.println("交集:");  
        set1.retainAll(set2);  
        for (Integer i : set1) {  
            System.out.print(i);  
        }  
        set1 = new HashSet<Integer>();  
        set1.add(1);  
        set1.add(2);  
        set1.add(3);  
        set1.add(4);  
        System.out.println();
        System.out.println("差集:");  
        set1.removeAll(set2);  
        for (Integer i : set1) {  
            System.out.print(i);  
        }  
    }  
} 
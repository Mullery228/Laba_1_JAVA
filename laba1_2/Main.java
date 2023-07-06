 import java.util.ArrayList;
 import java.util.List;

 public class Main {
     public static void main(String[] args) {;
         List<Integer> array = new ArrayList<>();
         for (int i = 2; i <= 1000; i++) {
             boolean prostoe = true;
             for (int j = 2; j < i; j++) {
                 if (i % j == 0) {
                     prostoe = false;
                     break;
                 }
             }
             if (prostoe) {
                 array.add(i);
             }
         }
         System.out.println("Простые числа: " + array);
     }
 }
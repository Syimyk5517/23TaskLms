import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i]=random.nextInt(0,2);}
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            arrayList.add(random.nextInt(0, 2));

        }System.out.println(arrayList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int counter = 0;
        while (counter < 10){
            linkedList.add(random.nextInt(0,2) );
            counter++;
        }
        System.out.println(linkedList);

        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Sorttolgonu");
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(Arrays.toString(num));


    }
}
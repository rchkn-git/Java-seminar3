package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("Привет");
        list.add("Как дела?");
        list.add(0, "Норм");
        list2.addAll(list);
        list2.addAll(2, list);
        System.out.println(list);
        System.out.println(list.get(1));

        System.out.println(list.size());
        list2.clear();

        list.remove(0);
        list.remove("Норм"); //удалить элемент, если он соответствует указанному

        list.set(1, "Hello"); //перезаписать элемент

        list.indexOf("Hello");
        list.lastIndexOf("Hello");

        list.add("!!!");
        list.add("asd");

        if (!list.contains("Hello")){
            list.add("Hi!");
        }

        System.out.println(list.subList(1, 2));

        list.ensureCapacity(123); //увеличит размер внутреннего массива до 123
//        list.trimToSize(5); //уменьшить внутренний массив до нужного размера

        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();

        for(int i = 0; i<10; i++){
            integers1.add(new Random().nextInt(50));
            integers2.add(new Random().nextInt(50));
        }

        System.out.println(integers1);
        System.out.println(integers2);
        System.out.println("-".repeat(16));
//        integers1.removeAll(integers2);
//        integers1.retainAll(integers2); //пересечение множеств
        integers1.addAll(integers2);
//        integers1.sort(Comparator.naturalOrder());
        integers1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 % 3 != 0) return 1;
                if(o2 % 2 == 0) return -2;
                return o1 - o2;
            }
        });

        integers1.sort((o1, o2) -> {
            if(o1 == 1) return 0;
            return o1 - o2;
        });

        for (int i = 0; i < integers1.size(); i++){
            integers1.get(i);
        }

        for (int i: integers1) {
            System.out.println(i);
        }

        Iterator<Integer> iterator = integers1.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            iterator.remove();
        }

        integers1.forEach(n -> System.out.println(n));

        System.out.println(integers1);

    }
}
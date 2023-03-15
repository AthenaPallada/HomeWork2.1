package HW_2course.Collections3.collection_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WorkCollection {

    /**
     * Демонстрация различных операций над списком
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Василий");
        list.add("Павел");
        list.add("Андрей");
        list.add("Андрей");
        list.add("Петр");
        list.add("Анжелика");

        String[] listL = list.toArray(new String[list.size()]);
        for (int i = 0; i < listL.length; i++) {
            listL[i] = listL[i].substring(1);
            System.out.println(listL[i]);
        }
        List<String> listWithoutLetter = Arrays.asList(listL);
        Collections.sort(listWithoutLetter);
        System.out.println(listWithoutLetter);

        //printCollection("Удаление 1 э-та", listWithoutLetter);

//
//        printCollection("Оригинал", list);
//
//        // Смешивание
//        Collections.shuffle(list);
//        printCollection("Смешивание", list);
//
//        // Обратный порядок
//        Collections.reverse(list);
//        printCollection("Обратный порядок", list);
//
//        // "Проворачивание" на определенное количество
//        Collections.rotate(list, 2); // Число может быть отрицательным - тогда порядок будет обратный
//        printCollection("Проворачивание", list);
//
//        // Обмен элементов
//        Collections.swap(list, 0, list.size()-1);
//        printCollection("Обмен элементов", list);
//
//        // Замена
//        Collections.replaceAll(list, "Андрей", "Алексей");
//        printCollection("Замена", list);
//
//        // Копирование - здесь обязательно надо иметь нужные размеры
//        List<String> list2 = new ArrayList<String>(list.size());
//        // Поэтому заполняем список. Хоть чем-нибудь.
//        for(String mc : list) {
//            list2.add(null);
//        }
//        // Компируем из правого аргумента в левый
//        Collections.copy(list2, list);
//        printCollection("Копирование", list2);
//
//        // Полная замена
//        Collections.fill(list2, ("Антон"));
//        printCollection("Полная замена", list2);

    }

    private static void printCollection(String title, List<String> list) {
        System.out.println(title);
        for(String mc : list) {
            System.out.println("Item:" + mc);
        }
        System.out.println();
    }
}

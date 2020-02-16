package ru.java.courses;

import org.omg.CORBA.Object;

import java.util.*;

public class Lesson10_CollectionsLists {

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем список чисел
     * 2. Удаляем все дубли
     * 3. Сортируем список по возрастанию
     * 4. Преобразуем числа в строки
     * <p>
     * Подсказки:
     * Collections.sort() - сортировка
     * Удалять элементы из итерируемого списка нельзя - выпадет исключение
     */
    public static List<String> task1(List<Integer> source) {
        List <Integer> tmpList = new ArrayList<>(source);
        Collections.sort(tmpList);
        int i = 0;
        while (i < tmpList.size() - 1)
        {
            if (tmpList.get(i) == tmpList.get(i + 1))
            {
                tmpList.remove(i + 1);
            }
            else { i++; }
        }
        List<String> resultList = new ArrayList<>();
        for (int num : tmpList) {
            resultList.add(String.valueOf(num));
        }
        return resultList;
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем на входе массив чисел
     * 2. Преобразовываем его к списку
     * 4. Все четные числа увеличиваем на единицу
     * 5. Возвращаем кусок списка с 3-го по 7-й элемент
     * <p>
     * Подсказка: на входе может быть любое количество чисел
     */
    public static List<Integer> task2(Integer... array) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        List<Integer> listResult = new ArrayList<>();
        int i = 0;
        for (int num : list) {
            if (num % 2 == 0)
            {
                list.set(i, num + 1);
            }
            i++;
        }
        i = 3;
        while (i < list.size() && i < 8)
        {
            listResult.add(list.get(i));
            i++;
        }
        return listResult;
    }
}

package ru.java.courses;

import java.util.*;
import java.util.Map.Entry;

public class Lesson11to12_SetMap {

    public static class User {

        private String name;
        private int age;
        private String phone;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public User(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем коллекцию пользователей
     * 2. Удаляем все дубли (одинаковое имя и возраст)
     * 3. Сортируем по имени и возрасту
     * 4. Возвращаем последнего пользователя
     */

     static class UserNameComparator implements Comparator<User>{
        public int compare(User us1, User us2) {
            return us1.getName().compareTo(us2.getName());
        }
     }

     static class UserAgeComparator implements  Comparator<User>
     {
         public int compare(User us1, User us2){
             if (us1.getAge() > us2.getAge())
                 return 1;
             else
                 if (us1.getAge() < us2.getAge())
                     return -1;
                 else
                     return 0;
         }
     }

    public static User task1(Collection<User> source) {
        Comparator<User> comparator = new UserAgeComparator().thenComparing(new UserAgeComparator());
        TreeSet<User> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(source);
        return treeSet.last();
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем коллекцию пользователей
     * 2. Преобразовываем его в справочник [номер телефона -> пользователь]
     * 3. Один номер телефона на одного пользователя
     * 4. Вернуть количество записей в справочнике
     */
    public static int task2(Collection<User> source) {
        Map<String, String> map = new HashMap<String, String>();
        for (User us : source) {
            map.put(us.getPhone(), us.getName());
        }
        return map.size();
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем список названий книг
     * 2. Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
     * 3. Все книги должны быть отсортированы по алфавиту с первой до последней полки
     * 4. Количество полок константное - 5 штук
     * 5. Вернуть книги распределенные по полкам
     *
     * Нумерация полок начинается с единицы!
     */
    public static Map task3(Collection<String> source) {

        return null;
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем книги, распределенные по полкам
     * 5. Вернуть справочник [название книги -> номер полки]
     */
    public static Map task4(Map<Integer, String> source) {
        Map<String, Integer> map = new HashMap<>();
        for (Entry<Integer, String> num : source.entrySet()) {
            map.put(num.getValue(), num.getKey());
        }
        return map;
    }
}

package ru.java.courses.sport;

public class Coach {
    private String name;
    private int experience;

    public Coach(String name)
    {
        if (null == name || name.isEmpty())
        {
            throw new IllegalArgumentException("У тренера должно быть имя");
        }
        this.name = name;
    }

    public Coach(String name, int experience)
    {
        this(name);
        if (experience < 0 || experience > 90)
        {
            throw new IllegalArgumentException("Некорректный стаж работы");
        }
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

package ru.java.courses.sport;

public class Athlete {
    private boolean active;
    private String name;
    private int personalNumber;

    public Athlete(String name)
    {
        if (null == name || name.isEmpty())
        {
            throw new IllegalArgumentException("У игрока должно быть имя");
        }
        this.name = name;
    }

    public Athlete(String name, int personalNumber)
    {
        this(name);
        if (personalNumber < 0)
            throw new IllegalArgumentException("Персональный номер не может быть отрицательным");
        this.personalNumber = personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getActive(){
        return active;
    }
}
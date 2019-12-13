package ru.java.courses.sport.team.football;

public enum PlayerRole {

    WINGER("Нападающий"),
    DEFENDER("Защитник"),
    GOALKEEPER("Вратарь");
    private  String name;


    PlayerRole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

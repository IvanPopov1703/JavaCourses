package ru.java.courses.sport.team.football;

import ru.java.courses.sport.Athlete;
import ru.java.courses.sport.ScoringPlayers;

public class FootballPlayer extends Athlete implements ScoringPlayers {

    private PlayerRole role;
    private int goals;

    public FootballPlayer(String name, PlayerRole playerRole)
    {
        super(name);
        if (null == playerRole)
        {
            throw new IllegalArgumentException("У игрока отсутствует роль");
        }
        this.role = playerRole;
    }

    @Override
    public void score() {
        if (getActive())
        {
            goals++;
        }
        else
        {
            throw new IllegalArgumentException("Неактивные игроки не могут забивать");
        }
    }

    @Override
    public int getScore() {
        return goals;
    }

    public int getGoals() {
        return goals;
    }

    public PlayerRole getRole() {
        return role;
    }

    public void setRole(PlayerRole role) {
        if (null == role)
        {
            throw new IllegalArgumentException("У игрока отсутствует роль");
        }
        this.role = role;
    }


}

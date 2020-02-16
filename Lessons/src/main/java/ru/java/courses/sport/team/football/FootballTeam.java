package ru.java.courses.sport.team.football;

import ru.java.courses.sport.Coach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballTeam {
    private String name;
    private Coach coach;

    public static final int MAX_PLAYERS_COUNT = 20;

    private List<FootballPlayer> footballPlayers = new ArrayList<>();

    public FootballTeam(String name)
    {
        if(null == name || name.isEmpty())
        {
            throw new IllegalArgumentException("У команды должно быть название");
        }
        this.name = name;
    }

    //Количество игроков в команде
    public int getPlayersCount()
    {
        return footballPlayers.size();
    }

    //Возвращает количество голов забитых всеми игроками
    public int getScore()
    {
        int sum = 0;
        for (FootballPlayer player : footballPlayers)
        {
            sum += player.getScore();
        }
        return sum;
    }

    public int getMaxPlayersCount(){
        return MAX_PLAYERS_COUNT;
    }

    public void addPlayers(FootballPlayer... newPlayers)
    {
        if ((getPlayersCount() + newPlayers.length) > getMaxPlayersCount())
        {
            throw new IllegalArgumentException("Количество игроков превышено");
        }
        footballPlayers.addAll(Arrays.asList(newPlayers));
    }

    public void deletePlayer(FootballPlayer player)
    {
        footballPlayers.remove(player);
    }

    public List<FootballPlayer> getFootballPlayers()
    {
        return footballPlayers;
    }

    public void setFootballPlayers(List<FootballPlayer> footballPlayers) {
        this.footballPlayers = footballPlayers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public void addPlayer(FootballPlayer defender2) {
    }

    public void removePlayer(FootballPlayer defender1) {
    }


}

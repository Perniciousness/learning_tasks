package practice.oop.task8.services;

import java.util.List;

import practice.oop.task8.models.Player;

public interface TeamService {
    
    void addPlayerIntoTeam(Player player);

    void removePlayerFromTeam(Player player);
    
    String getTeamInfo(List<Player> team);
}

package practice.oop.task8.services.impl;

import java.util.List;

import practice.oop.task8.models.Player;
import practice.oop.task8.services.TeamService;

public class TeamServiceImpl implements TeamService {

    private List<Player> team;

    public TeamServiceImpl(List<Player> team) {
        
        this.team = team;
    }
    
    @Override
    public void addPlayerIntoTeam(Player player) {
        
        team.add(player);
    }

    @Override
    public void removePlayerFromTeam(Player player) {
        
        team.remove(player);
    }

    @Override
    public String getTeamInfo(List<Player> team) {
        
        StringBuilder output = new StringBuilder();
        for (Player player : team) {

            int offset = output.length();
            String info = String.format("Name: %s%nRace: %s%nRole: %s%nClass: %s%nLevel: %d%n%n", player.getName(), player.getRace(), player.getRole(), player.getType(), player.getLevel());

            output.insert(offset, info);
        }
        String result = output.toString();
        return "".equals(result) ? "Team doesn't have any players." : result;
    }   
}

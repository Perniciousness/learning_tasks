package practice.oop.task8.models;

public class Player {
    
    private final String name;
    private final PlayerRole role;
    private final PlayerType type;
    private final PlayerRace race;
    private int level;

    public Player(String name, PlayerRole role, PlayerType type, PlayerRace race, int level) {
        this.name = name;
        this.role = role;
        this.type = type;
        this.race = race;
        this.level = level;
    }

    public String getName() { return name; }

    public PlayerRole getRole() { return role; }

    public PlayerType getType() { return type; }

    public PlayerRace getRace() { return race; }

    public int getLevel() { return level; }

    public void setLevel(int level) { this.level = level; }
}

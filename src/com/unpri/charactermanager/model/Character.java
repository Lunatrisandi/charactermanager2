package com.unpri.charactermanager.model;

public class Character {
    private String name;
    private CharacterType type;
    private int level;
    private int health;

    // Constructor 1: default level 1, health 100
    public Character(String name, CharacterType type) {
        this(name, type, 1, 100);
    }

    // Constructor 2: lengkap
    public Character(String name, CharacterType type, int level, int health) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.health = health;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public CharacterType getType() { return type; }
    public void setType(CharacterType type) { this.type = type; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    // Demo level up: level naik 1, health bertambah 20
    public void levelUp() {
        this.level++;
        this.health += 20;
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', type=" + type +
               ", level=" + level + ", health=" + health + "}";
    }
}
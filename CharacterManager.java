package com.unpri.charactermanager;

import java.util.ArrayList;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class CharacterManager {

    private ArrayList<Character> characters;

    public CharacterManager() {
        characters = new ArrayList<>();
    }

    public boolean addCharacter(Character character) {

        if (characters.contains(character)) {
            return false;
        }

        characters.add(character);
        return true;
    }

    public Character findByName(String name) {

        for (Character c : characters) {

            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }

        return null;
    }

    public boolean removeCharacter(String name) {

        Character c = findByName(name);

        if (c != null) {
            characters.remove(c);
            return true;
        }

        return false;
    }

    public int getTotalCharacters() {
        return characters.size();
    }

    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Character c : characters) {
            total += c.getLevel();
        }

        return (double) total / characters.size();
    }

    public ArrayList<Character> findByType(CharacterType type) {

        ArrayList<Character> result = new ArrayList<>();

        for (Character c : characters) {

            if (c.getType() == type) {
                result.add(c);
            }
        }

        return result;
    }

    /**
     * Mengembalikan karakter dengan attack power tertinggi.
     */
    public Character findStrongest() {

        if (characters.isEmpty()) {
            return null;
        }

        Character strongest = characters.get(0);

        for (Character c : characters) {

            if (c.getAttackPower() >
                    strongest.getAttackPower()) {

                strongest = c;
            }
        }

        return strongest;
    }
}
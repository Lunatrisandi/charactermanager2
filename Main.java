package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {
        Character c1 = new Character("Arthur", CharacterType.WARRIOR);
        Character c2 = new Character("Merlin", CharacterType.MAGE, 5, 80);
        Character c3 = new Character("Legolas", CharacterType.ARCHER, 3, 90);

        System.out.println("=== Daftar Karakter ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n=== Demo Level Up ===");
        System.out.println("Sebelum: " + c1);
        c1.levelUp();
        System.out.println("Sesudah: " + c1);
    }
}
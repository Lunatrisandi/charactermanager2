package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class AppTheme {

    public static final int ELITE_LEVEL = 5;

    public static final Color PRIMARY =
            new Color(52, 152, 219);

    public static final Color BACKGROUND =
            new Color(236, 240, 241);

    public static final Color GOLD =
            new Color(255, 215, 0);

    public static final Font TITLE_FONT =
            new Font("Arial", Font.BOLD, 24);

    public static final Font NORMAL_FONT =
            new Font("Arial", Font.PLAIN, 14);

    public static final Font ELITE_FONT =
            new Font("Arial", Font.BOLD, 16);

    public static Border roleBorder(String role) {

        switch(role.toLowerCase()) {

            case "warrior":
                return BorderFactory.createLineBorder(
                        Color.RED, 2);

            case "mage":
                return BorderFactory.createLineBorder(
                        Color.MAGENTA, 2);

            case "archer":
                return BorderFactory.createLineBorder(
                        Color.GREEN, 2);

            default:
                return BorderFactory.createLineBorder(
                        Color.GRAY, 2);
        }
    }

    public static Color roleColor(String role) {

        switch(role.toLowerCase()) {

            case "warrior":
                return new Color(231,76,60);

            case "mage":
                return new Color(155,89,182);

            case "archer":
                return new Color(46,204,113);

            default:
                return PRIMARY;
        }
    }
}
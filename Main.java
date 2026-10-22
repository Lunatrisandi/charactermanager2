package com.unpri.charactermanager;

import javax.swing.SwingUtilities;

import com.unpri.charactermanager.view.MainWindow;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new MainWindow();
        });

    }
}
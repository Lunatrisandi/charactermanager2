package com.unpri.charactermanager.view;

import javax.swing.*;
import java.awt.*;

import com.unpri.charactermanager.CharacterManager;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class MainWindow extends JFrame {

    private JTextArea area;
    private JLabel lblAverage;

    private CharacterManager manager;

    public MainWindow() {

        manager = new CharacterManager();

        setTitle("Character Manager TP5");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeData();

        area = new JTextArea();
        area.setEditable(false);

        JScrollPane scrollPane =
                new JScrollPane(area);

        JLabel title =
                new JLabel(
                        "DAFTAR KARAKTER",
                        SwingConstants.CENTER);

        title.setFont(
                new Font("Arial",
                        Font.BOLD,
                        22));

        lblAverage = new JLabel();

        JButton btnTambah =
                new JButton("Tambah Karakter");

        btnTambah.addActionListener(e -> {

            String nama =
                    JOptionPane.showInputDialog(
                            this,
                            "Masukkan Nama");

            if (nama == null || nama.isEmpty()) {
                return;
            }

            Character karakter =
                    new Character(
                            nama,
                            CharacterType.WARRIOR,
                            5,
                            30);

            manager.addCharacter(karakter);

            refreshData();
        });

        JPanel bawah = new JPanel(new BorderLayout());

        bawah.add(lblAverage,
                BorderLayout.WEST);

        bawah.add(btnTambah,
                BorderLayout.EAST);

        setLayout(new BorderLayout());

        add(title,
                BorderLayout.NORTH);

        add(scrollPane,
                BorderLayout.CENTER);

        add(bawah,
                BorderLayout.SOUTH);

        refreshData();

        setVisible(true);
    }

    private void initializeData() {

        manager.addCharacter(
                new Character(
                        "Arjuna",
                        CharacterType.WARRIOR,
                        5,
                        30));

        manager.addCharacter(
                new Character(
                        "Srikandi",
                        CharacterType.ARCHER,
                        3,
                        20));

        manager.addCharacter(
                new Character(
                        "Bima",
                        CharacterType.WARRIOR,
                        7,
                        40));

        manager.addCharacter(
                new Character(
                        "Gatotkaca",
                        CharacterType.WARRIOR,
                        6,
                        35));

        manager.addCharacter(
                new Character(
                        "Cempaka",
                        CharacterType.MAGE,
                        4,
                        25));
    }

    private void refreshData() {

        area.setText("");

        for (Character c :
                manager.getAllCharacters()) {

            area.append(
                    c.toString()
                            + "\n\n");
        }

        lblAverage.setText(
                "Rata-rata Level : "
                        + String.format(
                                "%.2f",
                                manager.getAverageLevel()));
    }
}
package com.uai.app.ui;

import com.uai.app.ui.utils.UAIJFrame;
import com.uai.app.ui.utils.UIBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuUI extends UAIJFrame {

    private JPanel mainPanel;
    private JButton mostrarDatosButton;
    private JButton buscarButton;
    private JButton eliminarButton;
    private JButton agregarButtom;
    private JButton editarButton;


    public MainMenuUI(String title) {
        super(title);

        this.setMainPanel(mainPanel);

        mostrarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UIBuilder.buildUI(MostrarDatosUI.class);
            }
        });
        agregarButtom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {UIBuilder.buildUI(AgregarLibroUI.class);

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

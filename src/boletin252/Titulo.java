package boletin252;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sbenavidesvazquez
 */
public class Titulo implements ActionListener {

    JFrame marco;
    JPanel panel;
    JLabel titulo;
    JButton bProg, bBase;

    public void Ventana() {

        titulo = new JLabel();
        marco = new JFrame("Curso DAM");
        panel = new JPanel();
        bProg = new JButton("Programacion");
        bBase = new JButton("Bases de Datos");

        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(bProg);
        panel.add(bBase);
        marco.add(panel);
        marco.setSize(350, 100);

        bProg.addActionListener(this);
        bBase.addActionListener(this);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(bProg==e.getSource())
            marco.setTitle("Programacion");
        else if(bBase==e.getSource())
            marco.setTitle("Base de Datos");
    }

}

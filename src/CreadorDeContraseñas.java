import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CreadorDeContraseñas extends JFrame {
    private JButton Generar;
    SpinnerModel numCaracteres = new SpinnerNumberModel(12, 1, 50, 1);
    JSpinner spin1;
    JCheckBox c1 = new JCheckBox("MINUSCULAS");
    JCheckBox c2 = new JCheckBox("MAYUSCULAS");
    JCheckBox c3 = new JCheckBox("NUMEROS");
    JCheckBox c4 = new JCheckBox("SIMBOLOS");
    private JLabel contraseña;
    Color asulitoresulon = new Color(49, 112, 255);

    CreadorDeContraseñas() {
        setLayout(new GridLayout(4, 1, 0, 0));


        JPanel p11 = new JPanel();
        p11.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("GENERE SU PROXIMA CONTRASEÑA");
        l1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 42));
        p11.add(l1);


        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        contraseña = new JLabel("");
        contraseña.setFont(new Font("Comic Sans Ms", Font.PLAIN, 30));
        p1.add(contraseña);


        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 2, 0, 0));
        JLabel l2 = new JLabel("    Número de carácteres de la contraseña");
        l2.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p2.add(l2);
        JPanel p22 = new JPanel();
        p22.setLayout(new GridLayout(4, 1));

        p22.add(c1);
        p22.add(c2);
        p22.add(c3);
        p22.add(c4);
        p2.add(p22);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2, 550, 0));
        spin1 = new JSpinner(numCaracteres);
        spin1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 200));
        p3.add(spin1);
        Generar = new JButton("CONFIRMAR");
        Generar.setFont(new Font("Comic Sans Ms", Font.PLAIN, 35));
        Generar.addActionListener(new ListenerButton());
        Generar.setForeground(Color.white);
        Generar.setBackground(asulitoresulon);
        p3.add(Generar);


        add(p11);
        add(p1);
        add(p2);
        add(p3);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {

        CreadorDeContraseñas cr = new CreadorDeContraseñas();
    }

    private class ListenerButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int cantidad = (int) spin1.getValue();
            contraseña.setText(Generador.generarContraseña(cantidad));

            if (c1.isSelected()){
                contraseña.setText(Generador.generarContraseña2(cantidad));
            }
            if (c2.isSelected()){
                contraseña.setText(Generador.generarContraseña3(cantidad));
            }
            if (c3.isSelected()){
                contraseña.setText(Generador.generarContraseña4(cantidad));
            }
            if (c4.isSelected()){
                contraseña.setText(Generador.generarContraseña5(cantidad));
            }
            if (c1.isSelected()&&c2.isSelected()){
                contraseña.setText(Generador.generarContraseña6(cantidad));
            }
            if (c1.isSelected()&& c2.isSelected()&& c3.isSelected()){
                contraseña.setText(Generador.generarContraseña7(cantidad));
            }
            if (c2.isSelected()&& c3.isSelected()){
                contraseña.setText(Generador.generarContraseña8(cantidad));
            }
            if (c2.isSelected()&& c3.isSelected()&& c4.isSelected()){
                contraseña.setText(Generador.generarContraseña9(cantidad));
            }
            if (c1.isSelected()&& c3.isSelected()){
                contraseña.setText(Generador.generarContraseña10(cantidad));
            }
            if (c2.isSelected()&& c3.isSelected()){
                contraseña.setText(Generador.generarContraseña11(cantidad));
            }
            if (c3.isSelected()&& c4.isSelected()){
                contraseña.setText(Generador.generarContraseña12(cantidad));
            }
            if (c1.isSelected()&& c4.isSelected()){
                contraseña.setText(Generador.generarContraseña13(cantidad));
            }
            if (c2.isSelected()&& c4.isSelected()){
                contraseña.setText(Generador.generarContraseña14(cantidad));
            }
            if (c1.isSelected()&& c2.isSelected()&& c4.isSelected()){
                contraseña.setText(Generador.generarContraseña15(cantidad));
            }

        }
    }
}

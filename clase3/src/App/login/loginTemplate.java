package App.login;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class loginTemplate extends JFrame{

    private JPanel pDerecha, pIzquierda;
    private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox cbTipoUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    // private JRadioButton rbOpcion1, rbOpcion2;
    // private JTextArea taSugerencias;

    public loginTemplate() {
        super("Login Usuario");

        pIzquierda = new JPanel();
        pIzquierda.setSize(600, 500);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setBackground(new Color(245, 245, 245));
        pIzquierda.setLayout(null);
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setSize(400, 500);
        pDerecha.setLocation(600, 0);
        pDerecha.setBackground(new Color(78, 115, 223));
        pDerecha.setLayout(null);
        this.add(pDerecha);

        lTituloApp = new JLabel("Login de Usuario");
        lTituloApp.setBounds(100, 20, 200, 30);
        lTituloApp.setForeground(new Color(90, 92, 105));
        //pIzquierda.add(lTituloApp);

        lEslogan = new JLabel("Iniciar sesión");
        lEslogan.setSize(130, 20);
        lEslogan.setLocation((pDerecha.getWidth() - lEslogan.getWidth()) / 2, 40);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        lEslogan.setForeground(Color.DARK_GRAY);
        pDerecha.add(lEslogan);

        lTituloLogin = new JLabel("Usuario");
        lTituloLogin.setSize(110, 30);
        lTituloLogin.setLocation(30, 80);
        lTituloLogin.setForeground(Color.DARK_GRAY);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lTituloLogin);

        lNotificaciones = new JLabel("¿Recordar contraseña?");
        lNotificaciones.setSize(170, 20);
        lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 360);
        lNotificaciones.setForeground(Color.DARK_GRAY);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lNotificaciones);

        tNombreUsuario = new JTextField("User");
        tNombreUsuario.setSize(300, 40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tNombreUsuario);

        tClaveUsuario = new JPasswordField();
        tClaveUsuario.setSize(300, 40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 180);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tClaveUsuario);

        cbTipoUsuario = new JComboBox();
        cbTipoUsuario.addItem("Usuario");
        cbTipoUsuario.addItem("Administrador");
        cbTipoUsuario.addItem("invitado");
        cbTipoUsuario.setSize(300, 40);
        cbTipoUsuario.setLocation((pDerecha.getWidth() - cbTipoUsuario.getWidth()) / 2, 240);
        cbTipoUsuario.setForeground(Color.DARK_GRAY);
        cbTipoUsuario.setBackground(Color.WHITE);
        ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(cbTipoUsuario);

        bEntrar = new JButton("Siguiente >");
        bEntrar.setSize(120, 45);
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 300);
        bEntrar.setFocusable(false);
        bEntrar.setBackground(new Color(78, 115, 223));
        bEntrar.setForeground(Color.WHITE);
        pDerecha.add(bEntrar);

        bCerrar = new JButton("X");
        bCerrar.setBounds(330, 10, 45, 30);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(new Color(78, 115, 223));
        bCerrar.setForeground(Color.WHITE);
        pDerecha.add(bCerrar);

        bRegistrarse = new JButton("Registrarse");
        bRegistrarse.setBounds(230, 420, 145, 35);
        bRegistrarse.setFocusable(false);
        bRegistrarse.setBackground(Color.BLUE);
        bRegistrarse.setForeground(Color.WHITE);
        pDerecha.add(bRegistrarse);

        

        checkSi = new JCheckBox("Si");
        checkSi.setSize(45, 25);
        checkSi.setFocusable(false);
        checkSi.setBackground(Color.WHITE);
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2 - 15, 385);
        pDerecha.add(checkSi);

        checkNo = new JCheckBox("No");
        checkNo.setSize(45, 25);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        checkNo.setLocation((pDerecha.getWidth() + checkNo.getWidth()) / 2 - 15, 385);
        pDerecha.add(checkNo);

        grupo = new ButtonGroup();
        grupo.add(checkSi);
        grupo.add(checkNo);

        // rbOpcion1 = new JRadioButton("opcion1");
        // rbOpcion1.setBounds(50, 400, 120, 30);
        // pIzquierda.add(rbOpcion1);

        // rbOpcion2 = new JRadioButton("opcion2");
        // rbOpcion2.setBounds(200, 400, 120, 30);
        // pIzquierda.add(rbOpcion2);

        // taSugerencias = new JTextArea("Escribe algo...");
        // taSugerencias.setBounds(185, 180, 230, 140);
        // pIzquierda.add(taSugerencias);

        setLayout(null);
        setSize(1000, 500);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

public class Ventana extends JFrame {

    public JPanel panel;

    public Ventana() {
        // tamaño
        setSize(500, 500); 
        
        // Título de la ventana
        setTitle("Ventana"); 

        // setLocation(200, 200); // Posición de la ventana
        // setBounds(200, 200, 500, 500); //setSize y setLocation
        
        // Centrar Ventana
        setLocationRelativeTo(null);

        // Evitar ReSize
        // setResizable(false);

        // tamaño mínimo
        Dimension dimension = new Dimension(200,200);
        setMinimumSize(dimension);

        // Color
        // this.getContentPane().setBackground(Color.BLUE);
        this.iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Acción defulat al cerrar ventana
    }

    private void iniciarComponentes() {
        colocaPaneles();
        // colocarEtiquetas();
        // colocaBotones();
        // colocarRadioBotones();
        // colocarBotonesDeActivacion();
        // colocarCajasDeTexto();
        // colocarAreasDeTexto();
        // colocarCasillasDeVerificacion();
        // colocarListasDesplegables();
        listaDesplegableModel();
    }

    private void colocaPaneles() {
        panel = new JPanel();
        panel.setLayout(null); // Desactivamos Layout por defecto

        // panel.setBackground(Color.GREEN); // Color del panel
        this.getContentPane().add(panel); // Agregamos el panel
        


    }

    private void colocarEtiquetas() {
        JLabel etiqueta = new JLabel("Hola Mundo!!!"/*, SwingConstants.CENTER*/);
        etiqueta.setOpaque(true); // Quitamos default
        // etiqueta.setText("Hola");
        etiqueta.setBounds(10, 20, 200, 30);
        // Alineación horizontal del Texto
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        // Border border = BorderFactory.createLineBorder(Color.black);
        Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        etiqueta.setBorder(loweredetched); // establecemos borde
        etiqueta.setForeground(Color.PINK); // Color de letra
        etiqueta.setBackground(Color.YELLOW); // Colo de fondo
        // Fuente
        etiqueta.setFont(new Font("comic sans", Font.ITALIC, 20));

        panel.add(etiqueta); // Agregamos etiqueta a panel

        // Etiqueta 2
        ImageIcon imagen =  new ImageIcon("balon.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80, 90, 350, 350);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }

    private void colocaBotones() {
        JButton boton1 = new JButton();
        boton1.setText("Click"); // Texto de botón
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true); // Establecemos la interacción del botón
        boton1.setMnemonic('a'); // Alt + a = click
        boton1.setForeground(Color.BLUE);
        boton1.setFont(new Font("sans serif", Font.BOLD, 20));

        // Boton 2 de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100, 200, 100, 40);
        boton2.setOpaque(true); // Desabilitar defaults para background
        ImageIcon clicaqui = new ImageIcon("clicaqui.png");
        boton2.setIcon(new ImageIcon(clicaqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        // boton2.setBackground(Color.BLUE); // Color de fondo

        // Boton 3
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.green, 3, false));
        

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
    }

    private void colocarRadioBotones() {
        JRadioButton radioBoton1 = new JRadioButton("Opción 1", true);
        radioBoton1.setEnabled(true);
        radioBoton1.setFont(new Font("Sans serif", 0, 20));
        radioBoton1.setBounds(50, 100, 200, 50);

        JRadioButton radioBoton2 = new JRadioButton("Opción 2", false);
        radioBoton2.setBounds(50, 150, 100, 50);

        JRadioButton radioBoton3 = new JRadioButton("Opción 3", false);
        radioBoton3.setBounds(50, 200, 100, 50);

        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);

        panel.add(radioBoton1);
        panel.add(radioBoton2);
        panel.add(radioBoton3);
    }

    private void colocarBotonesDeActivacion() {
        JToggleButton botonActivacion1 = new JToggleButton("Opción 1", true);
        botonActivacion1.setBounds(50, 100, 100, 40);

        JToggleButton botonActivacion2 = new JToggleButton("Opción 2", true);
        botonActivacion2.setBounds(50, 150, 100, 40);
        
        JToggleButton botonActivacion3 = new JToggleButton("Opción 3", true);
        botonActivacion3.setBounds(50, 200, 100, 40);

        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonActivacion1);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);

        panel.add(botonActivacion1);
        panel.add(botonActivacion2);
        panel.add(botonActivacion3);
    }

    private void colocarCajasDeTexto() {
        // JTextField cajaTexto = new JTextField("Hola!", 40); // 40 columnas con setLayout activado en el panel principal
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 50, 100, 30);
        cajaTexto.setText("Hola");

        System.out.println("Texto en la caja: "  + cajaTexto.getText());

        panel.add(cajaTexto);

    }

    private void colocarAreasDeTexto() {
        JTextArea areaTexto =  new JTextArea();
        areaTexto.setBounds(20, 20, 300, 200);
        areaTexto.setText("Escriba el texto aquí...");
        areaTexto.append("\nEscribe por aquí...");
        areaTexto.setEditable(true); // Desactivar edición con false

        System.out.println("El texto es:" + areaTexto.getText());

        panel.add(areaTexto);

        // Barras de desplazamiento
        JScrollPane barraDesplazamiento = new JScrollPane(areaTexto); // las políticas de barras tambien se puede colocar en el constructor
        barraDesplazamiento.setBounds(20, 20, 300, 200);
        // Opcional
        barraDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        barraDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(barraDesplazamiento);
    }
    
    private void colocarCasillasDeVerificacion(){
        JCheckBox casillaVerificacion1 = new JCheckBox("Opción 1", true);
        casillaVerificacion1.setEnabled(false);
        casillaVerificacion1.setBounds(20,20,100,40);
        panel.add(casillaVerificacion1);

        JCheckBox casillaVerificacion2 = new JCheckBox("Opción 2");
        casillaVerificacion2.setBounds(20,50,100,40);
        panel.add(casillaVerificacion2);

        JCheckBox casillaVerificacion3 = new JCheckBox("Opción 3");
        casillaVerificacion3.setBounds(20,80,100,40);
        panel.add(casillaVerificacion3);

        JCheckBox casillaVerificacion4 = new JCheckBox("Opción 4");
        casillaVerificacion4.setBounds(20,110,100,40);
        panel.add(casillaVerificacion4);
    }

    private void colocarListasDesplegables() {
        String paises[] = {"Perú", "Colombia", "Paraguay", "Ecuador"};
        JComboBox<String> listaDesplegable1 = new JComboBox<String>(paises);
        listaDesplegable1.setBounds(20, 20, 100, 30);
        listaDesplegable1.addItem("Argentina");
        listaDesplegable1.setSelectedItem("Paraguay");

        panel.add(listaDesplegable1);

    }

    private void listaDesplegableModel() {
        Persona persona1 = new Persona("Gustavo Julián", 42, "Mexicano");
        Persona persona2 = new Persona("Tania Bustamante", 20, "Argentina");

        DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();
        JComboBox<Persona> listaDesplegable = new JComboBox<Persona>(modelo);
        
        modelo.addElement(persona1);
        modelo.addElement(persona2);


        listaDesplegable.setBounds(20, 20, 200, 30);

        panel.add(listaDesplegable);

    }
}

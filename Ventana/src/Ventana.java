import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Ventana extends JFrame {
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
        JPanel panel = new JPanel();
        panel.setLayout(null); // Desactivamos Layout por defecto

        // panel.setBackground(Color.GREEN); // Color del panel
        this.getContentPane().add(panel); // Agregamos el panel
        
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
        JLabel etiqueta2 = new JLabel(new ImageIcon("balon.jpg"));
        etiqueta2.setBounds(10, 80, 458, 458);
        panel.add(etiqueta2);

    }
}

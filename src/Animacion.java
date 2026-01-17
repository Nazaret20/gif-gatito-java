import javax.swing.*;
import java.awt.*;

public class Animacion extends JFrame {
    
    private JLabel label;
    private ImageIcon[] imagenes;
    private int i = 0;
    
    public Animacion() {
        // Configurar ventana
        setTitle("Animación");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Cargar tus imágenes desde src
        imagenes = new ImageIcon[10];
        imagenes[0] = new ImageIcon(getClass().getResource("/img/1.png"));
        imagenes[1] = new ImageIcon(getClass().getResource("/img/2.png"));
        imagenes[2] = new ImageIcon(getClass().getResource("/img/3.png"));
        imagenes[3] = new ImageIcon(getClass().getResource("/img/4.png"));
        imagenes[4] = new ImageIcon(getClass().getResource("/img/5.png"));
        //-------reversa
        imagenes[5] = new ImageIcon(getClass().getResource("/img/5.png"));
        imagenes[6] = new ImageIcon(getClass().getResource("/img/4.png"));
        imagenes[7] = new ImageIcon(getClass().getResource("/img/3.png"));
        imagenes[8] = new ImageIcon(getClass().getResource("/img/2.png"));
        imagenes[9] = new ImageIcon(getClass().getResource("/img/1.png"));
        
        // Redimensionar imágenes
        for (int j = 0; j < imagenes.length; j++) {
            Image img = imagenes[j].getImage();
            Image imgRedimensionada = img.getScaledInstance(400, 400, Image.SCALE_FAST);
            imagenes[j] = new ImageIcon(imgRedimensionada);
        }
        
     
        // Mostrar imagen
        label = new JLabel(imagenes[0]);
        add(label);
        
        // Iniciar animación
        Timer timer = new Timer(100, e -> {
            i = (i + 1) % 10;
            label.setIcon(imagenes[i]);
        });
        timer.start();
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Animacion();
    }
}




  
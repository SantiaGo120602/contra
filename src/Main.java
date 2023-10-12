import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Entity Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            Entity entity = new Entity(50, 50, 100, 100, "/home/santiago/Documents/patrones1/contra/src/resources/images/characters/example.png");
            frame.add(entity.getPanel());
            frame.setVisible(true);

            // Move the entity
            entity.move(200, 200);
        });
    }
}

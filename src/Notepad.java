import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Notepad {

  static int keyInput[] = { KeyEvent.VK_J, KeyEvent.VK_A, KeyEvent.VK_V,
      KeyEvent.VK_A, KeyEvent.VK_SPACE };

  public static void main(String[] args) throws Exception {

    Runtime.getRuntime().exec("notes");

    Robot robot = new Robot();
    for (int i = 0; i < keyInput.length; i++) {
      robot.keyPress(keyInput[i]);
      robot.delay(100);
    }
  }
}
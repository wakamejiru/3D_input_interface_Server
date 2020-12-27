import java.awt.*;
import java.awt.event.KeyEvent;

public class Keypress {
    public void press(String data) {
        try {
            Robot robot = new Robot();
            switch (data) {
                case "F1":
                    robot.keyPress(KeyEvent.VK_F1);
                    break;
                case "F2":
                    robot.keyPress(KeyEvent.VK_F2);
                    break;
                case "F3":
                    robot.keyPress(KeyEvent.VK_F3);
                    break;
                case "F4":
                    robot.keyPress(KeyEvent.VK_F4);
                    break;
                case "F5":
                    robot.keyPress(KeyEvent.VK_F5);
                    break;
                case "F6":
                    robot.keyPress(KeyEvent.VK_F6);
                    break;
                case "F7":
                    robot.keyPress(KeyEvent.VK_F7);
                    break;
                case "F8":
                    robot.keyPress(KeyEvent.VK_F8);
                    break;
                case "F9":
                    robot.keyPress(KeyEvent.VK_F9);
                    break;
                case "F10":
                    robot.keyPress(KeyEvent.VK_F10);
                    break;
                case "F11":
                    robot.keyPress(KeyEvent.VK_F11);
                    break;
                case "F12":
                    robot.keyPress(KeyEvent.VK_F12);
                case "hennkaku":
                    robot.keyPress(KeyEvent.VK_FULL_WIDTH);
                    break;
                case "0":
                    robot.keyPress(KeyEvent.VK_0);
                    break;
                case "1":
                    robot.keyPress(KeyEvent.VK_1);
                    break;
                case "2":
                    robot.keyPress(KeyEvent.VK_2);
                    break;
                case "3":
                    robot.keyPress(KeyEvent.VK_3);
                    break;
                case "4":
                    robot.keyPress(KeyEvent.VK_4);
                    break;
                case "5":
                    robot.keyPress(KeyEvent.VK_5);
                    break;
                case "6":
                    robot.keyPress(KeyEvent.VK_6);
                    break;
                case "7":
                    robot.keyPress(KeyEvent.VK_7);
                    break;
                case "8":
                    robot.keyPress(KeyEvent.VK_8);
                    break;
                case "9":
                    robot.keyPress(KeyEvent.VK_9);
                    break;
                case "a":
                    robot.keyPress(KeyEvent.VK_A);
                    break;
                case "B":
                    robot.keyPress(KeyEvent.VK_B);
                    break;
                case "C":
                    robot.keyPress(KeyEvent.VK_C);
                    break;
                case "d":
                    robot.keyPress(KeyEvent.VK_D);
                    break;
                case "E":
                    robot.keyPress(KeyEvent.VK_E);
                    break;
                case "F":
                    robot.keyPress(KeyEvent.VK_F);
                    break;
                case "G":
                    robot.keyPress(KeyEvent.VK_G);
                    break;
                case "H":
                    robot.keyPress(KeyEvent.VK_H);
                    break;
                case "I":
                    robot.keyPress(KeyEvent.VK_I);
                    break;
                case "J":
                    robot.keyPress(KeyEvent.VK_J);
                    break;
                case "K":
                    robot.keyPress(KeyEvent.VK_K);
                    break;
                case "L":
                    robot.keyPress(KeyEvent.VK_L);
                    break;
                case "M":
                    robot.keyPress(KeyEvent.VK_M);
                    break;
                case "N":
                    robot.keyPress(KeyEvent.VK_N);
                    break;
                case "O":
                    robot.keyPress(KeyEvent.VK_O);
                    break;
                case "P":
                    robot.keyPress(KeyEvent.VK_P);
                    break;
                case "Q":
                    robot.keyPress(KeyEvent.VK_Q);
                    break;
                case "R":
                    robot.keyPress(KeyEvent.VK_R);
                    break;
                case "s":
                    robot.keyPress(KeyEvent.VK_S);
                    break;
                case "T":
                    robot.keyPress(KeyEvent.VK_T);
                    break;
                case "U":
                    robot.keyPress(KeyEvent.VK_U);
                    break;
                case "V":
                    robot.keyPress(KeyEvent.VK_V);
                    break;
                case "w":
                    robot.keyPress(KeyEvent.VK_W);
                    break;
                case "X":
                    robot.keyPress(KeyEvent.VK_X);
                    break;
                case "Y":
                    robot.keyPress(KeyEvent.VK_Y);
                    break;
                case "Z":
                    robot.keyPress(KeyEvent.VK_Z);
                    break;
                case "-":
                    robot.keyPress(KeyEvent.VK_MINUS);
                    break;
                case "^":
                    robot.keyPress(KeyEvent.VK_CIRCUMFLEX);
                    break;
                case "_":
                    robot.keyPress(KeyEvent.VK_UNDERSCORE);
                    break;
                case "/":
                    robot.keyPress(KeyEvent.VK_SLASH);
                    break;
                case ".":
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    break;
                case ",":
                    robot.keyPress(KeyEvent.VK_COMMA);
                    break;
                case "[":
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    break;
                case "]":
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    break;
                case ";":
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    break;
                case ":":
                    robot.keyPress(KeyEvent.VK_COLON);
                    break;
                case "@":
                    robot.keyPress(KeyEvent.VK_AT);
                    break;
                case "↑":
                    robot.keyPress(KeyEvent.VK_UP);
                    //robot.delay(10);
                    //robot.keyRelease(KeyEvent.VK_UP);
                    break;
                case "↓":
                    robot.keyPress(KeyEvent.VK_DOWN);
                    //robot.delay(10);
                    //robot.keyRelease(KeyEvent.VK_DOWN);
                    break;
                case "←":
                    robot.keyPress(KeyEvent.VK_LEFT);
                    //robot.delay(10);
                    //robot.keyRelease(KeyEvent.VK_LEFT);
                    break;
                case "→":
                    robot.keyPress(KeyEvent.VK_RIGHT);
                    //robot.delay(10);
                    //robot.keyRelease(KeyEvent.VK_RIGHT);
                    break;
                case "ctrl_L":
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    break;
                case "Alt_L":
                    robot.keyPress(KeyEvent.VK_ALT);
                    break;
                case "tab":
                    robot.keyPress(KeyEvent.VK_TAB);
                    break;
                case "space":
                    robot.keyPress(KeyEvent.VK_SPACE);
                    break;
                case "Alt_R":
                    robot.keyPress(KeyEvent.VK_ALT);
                    break;
                case "ctrl_R":
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    break;
                case "shift_L":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    break;
                case "shift_R":
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    break;
                case "CAPS":
                    robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    break;
                case "enter":
                    robot.keyPress(KeyEvent.VK_ENTER);
                    break;
                case "back_space":
                    robot.keyPress(KeyEvent.VK_BACK_SPACE);
                    break;
                case "null":
                    //何もなし
                    break;
                    //キーを離す
                case "dis_F1":
                    robot.keyRelease(KeyEvent.VK_F1);
                    break;
                case "dis_F2":
                    robot.keyRelease(KeyEvent.VK_F2);
                    break;
                case "dis_F3":
                    robot.keyRelease(KeyEvent.VK_F3);
                    break;
                case "dis_F4":
                    robot.keyRelease(KeyEvent.VK_F4);
                    break;
                case "dis_F5":
                    robot.keyRelease(KeyEvent.VK_F5);
                    break;
                case "dis_F6":
                    robot.keyRelease(KeyEvent.VK_F6);
                    break;
                case "dis_F7":
                    robot.keyRelease(KeyEvent.VK_F7);
                    break;
                case "dis_F8":
                    robot.keyRelease(KeyEvent.VK_F8);
                    break;
                case "dis_F9":
                    robot.keyRelease(KeyEvent.VK_F9);
                    break;
                case "dis_F10":
                    robot.keyRelease(KeyEvent.VK_F10);
                    break;
                case "dis_F11":
                    robot.keyRelease(KeyEvent.VK_F11);
                    break;
                case "dis_F12":
                    robot.keyRelease(KeyEvent.VK_F12);
                case "dis_hennkaku":
                    robot.keyRelease(KeyEvent.VK_FULL_WIDTH);
                    break;
                case "dis_0":
                    robot.keyRelease(KeyEvent.VK_0);
                    break;
                case "dis_1":
                    robot.keyRelease(KeyEvent.VK_1);
                    break;
                case "dis_2":
                    robot.keyRelease(KeyEvent.VK_2);
                    break;
                case "dis_3":
                    robot.keyRelease(KeyEvent.VK_3);
                    break;
                case "dis_4":
                    robot.keyRelease(KeyEvent.VK_4);
                    break;
                case "dis_5":
                    robot.keyRelease(KeyEvent.VK_5);
                    break;
                case "dis_6":
                    robot.keyRelease(KeyEvent.VK_6);
                    break;
                case "dis_7":
                    robot.keyRelease(KeyEvent.VK_7);
                    break;
                case "dis_8":
                    robot.keyRelease(KeyEvent.VK_8);
                    break;
                case "dis_9":
                    robot.keyRelease(KeyEvent.VK_9);
                    break;
                case "dis_a":
                    robot.keyRelease(KeyEvent.VK_A);
                    break;
                case "dis_B":
                    robot.keyRelease(KeyEvent.VK_B);
                    break;
                case "dis_C":
                    robot.keyRelease(KeyEvent.VK_C);
                    break;
                case "dis_d":
                    robot.keyRelease(KeyEvent.VK_D);
                    break;
                case "dis_E":
                    robot.keyRelease(KeyEvent.VK_E);
                    break;
                case "dis_F":
                    robot.keyRelease(KeyEvent.VK_F);
                    break;
                case "dis_G":
                    robot.keyRelease(KeyEvent.VK_G);
                    break;
                case "dis_H":
                    robot.keyRelease(KeyEvent.VK_H);
                    break;
                case "dis_I":
                    robot.keyRelease(KeyEvent.VK_I);
                    break;
                case "dis_J":
                    robot.keyRelease(KeyEvent.VK_J);
                    break;
                case "dis_K":
                    robot.keyRelease(KeyEvent.VK_K);
                    break;
                case "dis_L":
                    robot.keyRelease(KeyEvent.VK_L);
                    break;
                case "dis_M":
                    robot.keyRelease(KeyEvent.VK_M);
                    break;
                case "dis_N":
                    robot.keyRelease(KeyEvent.VK_N);
                    break;
                case "dis_O":
                    robot.keyRelease(KeyEvent.VK_O);
                    break;
                case "dis_P":
                    robot.keyRelease(KeyEvent.VK_P);
                    break;
                case "dis_Q":
                    robot.keyRelease(KeyEvent.VK_Q);
                    break;
                case "dis_R":
                    robot.keyRelease(KeyEvent.VK_R);
                    break;
                case "dis_s":
                    robot.keyRelease(KeyEvent.VK_S);
                    break;
                case "dis_T":
                    robot.keyRelease(KeyEvent.VK_T);
                    break;
                case "dis_U":
                    robot.keyRelease(KeyEvent.VK_U);
                    break;
                case "dis_V":
                    robot.keyRelease(KeyEvent.VK_V);
                    break;
                case "dis_w":
                    robot.keyRelease(KeyEvent.VK_W);
                    break;
                case "dis_X":
                    robot.keyRelease(KeyEvent.VK_X);
                    break;
                case "dis_Y":
                    robot.keyRelease(KeyEvent.VK_Y);
                    break;
                case "dis_Z":
                    robot.keyRelease(KeyEvent.VK_Z);
                    break;
                case "dis_-":
                    robot.keyRelease(KeyEvent.VK_MINUS);
                    break;
                case "dis_^":
                    robot.keyRelease(KeyEvent.VK_CIRCUMFLEX);
                    break;
                case "dis__":
                    robot.keyRelease(KeyEvent.VK_UNDERSCORE);
                    break;
                case "dis_/":
                    robot.keyRelease(KeyEvent.VK_SLASH);
                    break;
                case "dis_.":
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    break;
                case "dis_,":
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    break;
                case "dis_[":
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    break;
                case "dis_]":
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                    break;
                case "dis_;":
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    break;
                case "dis_:":
                    robot.keyRelease(KeyEvent.VK_COLON);
                    break;
                case "dis_@":
                    robot.keyRelease(KeyEvent.VK_AT);
                    break;
                case "dis_↑":
                    robot.keyRelease(KeyEvent.VK_UP);
                    //robot.delay(10);
                    //robot.keyRelease(KeyEvent.VK_UP);
                    break;
                case "dis_↓":
                    robot.keyRelease(KeyEvent.VK_DOWN);
                    //robot.delay(10);
                    //robot.keyRelease(KeyEvent.VK_DOWN);
                    break;
                case "dis_←":
                    robot.keyRelease(KeyEvent.VK_LEFT);
                    //robot.delay(10);
                    //robot.keyRelease(KeyEvent.VK_LEFT);
                    break;
                case "dis_→":
                    robot.keyRelease(KeyEvent.VK_RIGHT);
                    //robot.delay(10);
                    //robot.keyRelease(KeyEvent.VK_RIGHT);
                    break;
                case "dis_ctrl_L":
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                    break;
                case "dis_Alt_L":
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "dis_tab":
                    robot.keyRelease(KeyEvent.VK_TAB);
                    break;
                case "dis_space":
                    robot.keyRelease(KeyEvent.VK_SPACE);
                    break;
                case "dis_Alt_R":
                    robot.keyRelease(KeyEvent.VK_ALT);
                    break;
                case "dis_ctrl_R":
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                    break;
                case "dis_shift_L":
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "dis_shift_R":
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case "dis_CAPS":
                    robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                    break;
                case "dis_enter":
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    break;
                case "dis_back_space":
                    robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                    break;
                case "dis_null":
                    //何もなし
                    break;
            }
        } catch (AWTException e) {

        }
    }
}
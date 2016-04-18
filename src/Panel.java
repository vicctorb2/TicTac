import com.sun.org.apache.bcel.internal.generic.RETURN;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ррор on 24.02.2016.
 */
public class Panel extends JPanel {

    static Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    static boolean firstplayer = true;
    static boolean secondplayer = false;
    static boolean playwithbot = false;
    static boolean autoplay = false;
    static String str1="X"; static String str2="O";
    static String temp="";

    static int count = 9;


    public Panel() {
        b1 = new Button();
        b2 = new Button();
        b3 = new Button();
        b4 = new Button();
        b5 = new Button();
        b6 = new Button();
        b7 = new Button();
        b8 = new Button();
        b9 = new Button();
        setLayout(new GridLayout(3, 3));
        addOnPanel();
        setListeners();
    }

    private void setListeners() {
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.gamePlay(Panel.this);
                if (playwithbot) {
                    botGameplay();
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2.gamePlay(Panel.this);
                if (playwithbot) {
                    botGameplay();
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b3.gamePlay(Panel.this);
                if (playwithbot) {
                    botGameplay();
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b4.gamePlay(Panel.this);
                if (playwithbot) {
                    botGameplay();
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b5.gamePlay(Panel.this);
                if (playwithbot) {
                    botGameplay();
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b6.gamePlay(Panel.this);
                if (playwithbot) {
                    botGameplay();
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b7.gamePlay(Panel.this);
                if (playwithbot) {
                    botGameplay();
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b8.gamePlay(Panel.this);
                if (playwithbot) {
                    botGameplay();
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b9.gamePlay(Panel.this);
                if (playwithbot) {
                    botGameplay();
                }
            }
        });

    }

    public static boolean checkWinner() {
        if (b1.getText() != "" && b2.getText() != "" && b3.getText() != "") {
            if (b1.getText() == b2.getText() && b2.getText() == b3.getText()) {
                JOptionPane.showMessageDialog(null, "Победил "+b1.getText()+"!");
                restart();
                return true;
            }
        }
        if (b4.getText() != "" && b5.getText() != "" && b6.getText() != "") {
            if (b4.getText() == b5.getText() && b5.getText() == b6.getText()) {
                JOptionPane.showMessageDialog(null, "Победил "+b4.getText()+"!");
                restart();
                return true;
            }
        }
        if (b7.getText() != "" && b8.getText() != "" && b9.getText() != "") {
            if (b7.getText() == b8.getText() && b8.getText() == b9.getText()) {
                JOptionPane.showMessageDialog(null, "Победил "+b7.getText()+"!");
                restart();
                return true;
            }
        }
        if (b1.getText() != "" && b4.getText() != "" && b7.getText() != "") {
            if (b1.getText() == b4.getText() && b4.getText() == b7.getText()) {
                JOptionPane.showMessageDialog(null, "Победил "+b1.getText()+"!");
                restart();
                return true;
            }
        }
        if (b2.getText() != "" && b5.getText() != "" && b8.getText() != "") {
            if (b2.getText() == b5.getText() && b5.getText() == b8.getText()) {
                JOptionPane.showMessageDialog(null, "Победил "+b2.getText()+"!");
                restart();
                return true;
            }
        }
        if (b3.getText() != "" && b6.getText() != "" && b9.getText() != "") {
            if (b3.getText() == b6.getText() && b6.getText() == b9.getText()) {
                JOptionPane.showMessageDialog(null, "Победил "+b3.getText()+"!");
                restart();
                return true;
            }
        }
        if (b7.getText() != "" && b5.getText() != "" && b3.getText() != "") {
            if (b7.getText() == b5.getText() && b5.getText() == b3.getText()) {
                JOptionPane.showMessageDialog(null, "Победил "+b7.getText()+"!");
                restart();
                return true;
            }
        }
        if (b1.getText() != "" && b5.getText() != "" && b9.getText() != "") {
            if (b1.getText() == b5.getText() && b5.getText() == b9.getText()) {
                JOptionPane.showMessageDialog(null, "Победил "+b1.getText()+"!");
                restart();
                return true;
            }
        }
        if(b1.getText()!="" && b2.getText()!="" && b3.getText()!="" &&
                b4.getText()!="" && b5.getText()!="" && b6.getText()!="" &&
                b7.getText()!="" && b8.getText()!="" && b9.getText()!="" ){
            JOptionPane.showMessageDialog(null, "No winners");
            restart();
        }
        return false;
    }

    public static void restart() {

        if (JOptionPane.showConfirmDialog(null, "Restart?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            firstplayer = true;
            secondplayer = false;
            if (playwithbot) {
                count = 5;
            } else {
                count = 9;
            }
        } else {
            System.exit(0);
        }
    }

    public static void restart_without_confirm(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        firstplayer = true;
        secondplayer = false;
        if (playwithbot) {
            count = 5;
        } else {
            count = 9;
        }
    }

    public void botGameplay() {
        if ((b1.getText() == "X" && b2.getText() == "X") ||
                (b2.getText() == "X" && b3.getText() == "X") ||
                (b1.getText() == "X" && b3.getText() == "X")) {
            if (b1.getText() == b2.getText()) {
                if (b3.getText() != "O") {
                    b3.setButtonAsO();
                    return;
                }
            }
            if (b2.getText() == b3.getText()) {
                if (b1.getText() != "O") {
                    b1.setButtonAsO();
                    return;
                }
            }
            if (b1.getText() == b3.getText()) {
                if (b2.getText() != "O") {
                    b2.setButtonAsO();
                    return;
                }
            }
        }
        if ((b4.getText() == "X" && b5.getText() == "X") ||
                (b5.getText() == "X" && b6.getText() == "X") ||
                (b4.getText() == "X" && b6.getText() == "X")) {
            if (b4.getText() == b5.getText()) {
                if (b6.getText() != "O") {
                    b6.setButtonAsO();
                    return;
                }
            }
            if (b5.getText() == b6.getText()) {
                if (b4.getText() != "O") {
                    b4.setButtonAsO();
                    return;
                }
            }
            if (b4.getText() == b6.getText()) {
                if (b5.getText() != "O") {
                    b5.setButtonAsO();
                    return;
                }
            }
        }
        if ((b7.getText() == "X" && b8.getText() == "X") ||
                (b8.getText() == "X" && b9.getText() == "X") ||
                (b7.getText() == "X" && b9.getText() == "X")) {
            if (b7.getText() == b8.getText()) {
                if (b9.getText() != "O") {
                    b9.setButtonAsO();
                    return;
                }
            }
            if (b8.getText() == b9.getText()) {
                if (b7.getText() != "O") {
                    b7.setButtonAsO();
                    return;
                }
            }
            if (b7.getText() == b9.getText()) {
                if (b8.getText() != "O") {
                    b8.setButtonAsO();
                    return;
                }
            }
        }
        if ((b1.getText() == "X" && b4.getText() == "X") ||
                (b4.getText() == "X" && b7.getText() == "X") ||
                (b1.getText() == "X" && b7.getText() == "X")) {
            if (b1.getText() == b4.getText()) {
                if (b7.getText() != "O") {
                    b7.setButtonAsO();
                    return;
                }
            }
            if (b4.getText() == b7.getText()) {
                if (b1.getText() != "O") {
                    b1.setButtonAsO();
                    return;
                }
            }
            if (b1.getText() == b7.getText()) {
                if (b4.getText() != "O") {
                    b4.setButtonAsO();
                    return;
                }
            }
        }
        if ((b2.getText() == "X" && b5.getText() == "X") ||
                (b5.getText() == "X" && b8.getText() == "X") ||
                (b2.getText() == "X" && b8.getText() == "X")) {
            if (b2.getText() == b5.getText()) {
                if (b8.getText() != "O") {
                    b8.setButtonAsO();
                    return;
                }
            }
            if (b5.getText() == b8.getText()) {
                if (b2.getText() != "O") {
                    b2.setButtonAsO();
                    return;
                }
            }
            if (b2.getText() == b8.getText()) {
                if (b5.getText() != "O") {
                    b5.setButtonAsO();
                    return;
                }
            }
        }
        if ((b3.getText() == "X" && b6.getText() == "X") ||
                (b6.getText() == "X" && b9.getText() == "X") ||
                (b3.getText() == "X" && b9.getText() == "X")) {
            if (b3.getText() == b6.getText()) {
                if (b9.getText() != "O") {
                    b9.setButtonAsO();
                    return;
                }
            }
            if (b6.getText() == b9.getText()) {
                if (b3.getText() != "O") {
                    b3.setButtonAsO();
                    return;
                }
            }
            if (b3.getText() == b9.getText()) {
                if (b6.getText() != "O") {
                    b6.setButtonAsO();
                    return;
                }
            }
        }
        if ((b1.getText() == "X" && b5.getText() == "X") ||
                (b5.getText() == "X" && b9.getText() == "X") ||
                (b1.getText() == "X" && b9.getText() == "X")) {
            if (b1.getText() == b5.getText()) {
                if (b9.getText() != "O") {
                    b9.setButtonAsO();
                    return;
                }
            }
            if (b5.getText() == b9.getText()) {
                if (b1.getText() != "O") {
                    b1.setButtonAsO();
                    return;
                }
            }
            if (b1.getText() == b9.getText()) {
                if (b5.getText() != "O") {
                    b5.setButtonAsO();
                    return;
                }
            }
        }
        if ((b7.getText() == "X" && b5.getText() == "X") ||
                (b5.getText() == "X" && b3.getText() == "X") ||
                (b7.getText() == "X" && b3.getText() == "X")) {
            if (b7.getText() == b5.getText()) {
                if (b3.getText() != "O") {
                    b3.setButtonAsO();
                    return;
                }
            }
            if (b5.getText() == b3.getText()) {
                if (b7.getText() != "O") {
                    b7.setButtonAsO();
                    return;
                }
            }
            if (b3.getText() == b7.getText()) {
                if (b5.getText() != "O") {
                    b5.setButtonAsO();
                    return;
                }
            }
        }
        if (b1.getText() == "") {
            b1.setButtonAsO();
            return;
        }
        if (b5.getText() == "") {
            b5.setButtonAsO();
            return;
        }
        if (b3.getText() == "") {
            b3.setButtonAsO();
            return;
        }
        if (b7.getText() == "") {
            b7.setButtonAsO();
            return;
        }
        if (b9.getText() == "") {
            b9.setButtonAsO();
            return;
        }
        if (b2.getText() == "") {
            b2.setButtonAsO();
            return;
        }
        if (b4.getText() == "") {
            b4.setButtonAsO();
            return;
        }
        if (b6.getText() == "") {
            b6.setButtonAsO();
        }
        if (b8.getText() == "") {
            b8.setButtonAsO();
            return;
        }
    }

    public static void autoPlay() {
        int rand=0;
        String strX="X"; String strO="O";
        String str=strX;

        while(b1.getText()=="" || b2.getText()=="" || b3.getText()=="" ||
                b4.getText()=="" || b5.getText()=="" || b6.getText()=="" ||
                b7.getText()=="" || b8.getText()=="" || b9.getText()=="" ){

            rand=(int)Math.abs(Math.random()*10%9);

            if(rand==0){
                if(b1.getText()=="") {
                    b1.setButtonAs(str);
                    if(str==strX){
                        str=strO;
                    }
                    else{str=strX;}
                }
            }
            if(rand==1){
                if(b2.getText()=="") {
                    b2.setButtonAs(str);
                    if(str==strX){
                        str=strO;
                    }
                    else{str=strX;}
                }
            }
            if(rand==2){
                if(b3.getText()=="") {
                    b3.setButtonAs(str);
                    if(str==strX){
                        str=strO;
                    }
                    else{str=strX;}
                }
            }
            if(rand==3){
                if(b4.getText()=="") {
                    b4.setButtonAs(str);
                    if(str==strX){
                        str=strO;
                    }
                    else{str=strX;}
                }
            }
            if(rand==4){
                if(b5.getText()=="") {
                    b5.setButtonAs(str);
                    if(str==strX){
                        str=strO;
                    }
                    else{str=strX;}
                }
            }
            if(rand==5){
                if(b6.getText()=="") {
                    b6.setButtonAs(str);
                    if(str==strX){
                        str=strO;
                    }
                    else{str=strX;}
                }
            }
            if(rand==6){
                if(b7.getText()=="") {
                    b7.setButtonAs(str);
                    if(str==strX){
                        str=strO;
                    }
                    else{str=strX;}
                }
            }
            if(rand==7){
                if(b8.getText()=="") {
                    b8.setButtonAs(str);
                    if(str==strX){
                        str=strO;
                    }
                    else{str=strX;}
                }
            }
            if(rand==8){
                if(b9.getText()=="") {
                    b9.setButtonAs(str);
                    if(str==strX){
                        str=strO;
                    }
                    else{str=strX;}
                }
            }
        }
    }

    public void addOnPanel() {
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
    }
}


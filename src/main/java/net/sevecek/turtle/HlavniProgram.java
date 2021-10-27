package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;
import java.awt.*;

public class HlavniProgram {

    Turtle zofka = new Turtle();

    public void main(String[] args) {
        snehuliak();
        zmrzlina();
        vlacik();
    }

    public void snehuliak() {
        zofka.setPenColor(Color.blue);
        zofka.setLocation(70, 80);
        nakresliKolecko(60);

        zofka.setLocation(40, 170);
        nakresliKolecko(120);

        zofka.setLocation(10, 170);
        nakresliKolecko(30);

        zofka.setLocation(160, 170);
        nakresliKolecko(30);

        zofka.setLocation(10, 320);
        nakresliKolecko(180);
    }

    public void zmrzlina() {
        zofka.setPenColor(Color.ORANGE);
        zofka.setLocation(280, 200);
        nakresliKolecko(120);
        zofka.turnRight(90);
        zofka.setLocation(280, 210);
        nakresliRovnoramennyTrojuholnik(150, 46);
    }

    public void vlacik() {
        zofka.setPenColor(Color.GREEN);
        zofka.setLocation(550, 220);
        nakresliObdlznik(80, 170);
        zofka.setLocation(720, 220);
        nakresliObdlznik(150, 120);
        nakresliKolecko(120);
        zofka.setLocation(640, 247);
        nakresliKolecko(40);
        zofka.setLocation(580, 247);
        nakresliKolecko(40);
        zofka.setLocation(470, 240);
        zofka.turnRight(45);
        nakresliRovnoramennyTrojuholnik(80, 90);
    }

    public void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(200);
            zofka.turnRight(90);
        }
    }

    public void nakresliCtverec(double dlzkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(dlzkaStrany);
            zofka.turnRight(90);
        }
    }

    public void nakresliRovnostrannyTrojuholnik() {
        for (int i = 0; i < 3; i++) {
            zofka.move(200);
            zofka.turnRight(120);
        }
    }

    public void nakresliRovnostrannyTrojuholnik(double dlzkaStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.move(dlzkaStrany);
            zofka.turnRight(120);
        }
    }

    public void nakresliRovnoramennyTrojuholnik(double dlzkaRamenaAB, double uhol) {
        zofka.move(vypocitejDelkuZakladne(dlzkaRamenaAB, uhol));
        double uholUZakladne = 180 - ((180 - uhol) / 2);
        zofka.turnRight(uholUZakladne);

        for (int i = 0; i < 2; i++) {
            zofka.move(dlzkaRamenaAB);
            zofka.turnRight(180 - uhol);
        }
    }


    public double vypocitejDelkuZakladne(double velikostRamene, double uhelMeziRameny) {
        double tretiStrana;
        tretiStrana = Math.abs((velikostRamene
                * Math.sin((uhelMeziRameny * Math.PI / 180.0) / 2.0))
                * 2.0);
        return tretiStrana;
    }

    public void nakresliObdlznik() {
        for (int i = 0; i < 2; i++) {
            zofka.move(200);
            zofka.turnRight(90);
            zofka.move(400);
            zofka.turnRight(90);
        }
    }

    public void nakresliObdlznik(double stranaA, double stranaB) {
        for (int i = 0; i < 2; i++) {
            zofka.move(stranaA);
            zofka.turnRight(90);
            zofka.move(stranaB);
            zofka.turnRight(90);
        }
    }

    public void nakresliKolecko() {
        for (int i = 0; i < 360; i++) {
            zofka.move(1.30);
            zofka.turnRight(1);
        }
    }

    public void nakresliKolecko(double priemer) {
        double obvod = Math.PI * priemer;
        double krok = obvod / 360;
        for (int i = 0; i < 360; i++) {
            zofka.move(krok);
            zofka.turnRight(1);
        }
    }

}

public class test {
    public static void main(String[] args) {
        Motor m = new Motor("Motor1", 100, 20, "rot", 50, 1000);
        Motor m2 = new Motor("Motor2", 130, 10, "rot", 52, 1500);
        Motor m3 = new Motor("Motor3", 120, 20, "rot", 28, 1000);
        Motor m4 = new Motor("Motor4", 110, 10, "rot", 22, 3000);
        Motor m5 = new Motor("Motor5", 135, 13, "rot", 42, 3050);

        Landebahn l = new Landebahn(300, 230, "Landebahn1", "Österreich", "ja", 23, "grau");

        Passagiere p = new Passagiere(23, "Niki", 23, 178, "Österreich", "Serbisch");
        Passagiere p2 = new Passagiere(23, "Thomas", 22, 178, "Österreich", "Österreich");


        Flugzeug fl = new Flugzeug("turbine1", "weiß", 600, 80, 400, 200, 10, m, p, l);
        fl.setMotorListe(m2);
        fl.setMotorListe(m3);
        fl.setMotorListe(m4);
        fl.setMotorListe(m5);
        fl.setPassagierListe(p2);
        System.out.println("PS der Moteren von fl: " + fl.getPS());

        Flugzeug fl2 = new Flugzeug("turbine2", "grau", 700, 100, 430, 160, 11, m, p, l);
        fl2.setMotorListe(m2);
        fl2.setMotorListe(m3);
        fl2.setMotorListe(m4);
        fl2.setPassagierListe(p2);
        System.out.println("PS der Motoren von fl: " + fl2.getPS());

        Hanger ha = new Hanger(23, "Bayern", "grau", 10, 230, 230, 100, fl);
        ha.setFlugzeugListe(fl2);

    }

}

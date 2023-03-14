package exceptions.ue.transporter;

public class Episode42 {

    public static void main(String[] args) {
        Transporter transporter = new Transporter();
        Starship enterprise = new Starship("Enterprise");

        String person = "Captain Kirk";
        String from = "Riga IV";

        System.out.println("Beaming " + person + " from " + from + " to " + enterprise.getName() + "...");
        enterprise.beamUp(person, from);

    }
}

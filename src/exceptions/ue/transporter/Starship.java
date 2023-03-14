package exceptions.ue.transporter;

public class Starship {

    private String name;
    private Transporter transporter;

    public Starship(String name) {
        this.name = name;
        this.transporter = new Transporter();
    }

    public String getName() {
        return name;
    }

    public void beamUp(String person, String from) {
        try {
            transporter.beam(person, from, name, true);
        } catch (TransportMalfunctionException e) {
            System.out.println("Beam transport failed.");
        } finally {
            transporter.shutdown();
        }

    }
}

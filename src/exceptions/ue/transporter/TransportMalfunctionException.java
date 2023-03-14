package exceptions.ue.transporter;

public class TransportMalfunctionException extends Exception {

    public TransportMalfunctionException() {

    }

    public TransportMalfunctionException(String message) {
        super(message);
    }
}

public class TotpExpectedException extends IllegalArgumentException {
    public TotpExpectedException() {
        super();
    }
    public TotpExpectedException(String message) {
        super(message);
    }
    public TotpExpectedException(Throwable cause) {
        super(cause);
    }
    public TotpExpectedException(String message, Throwable cause) {
        super(message, cause);
    }
}

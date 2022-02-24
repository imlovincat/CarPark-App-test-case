public class CarParkKind {

    private String kind;

    public CarParkKind(String kind) {

        if (kind.equals("STAFF") || kind.equals("STUDENT") || kind.equals("MANAGEMENT") || kind.equals("VISITOR")) {
            this.kind = kind;
        }
        else {
            throw new IllegalArgumentException("CarParkKind class error");
        }
    }

    public String toString() {
        return kind;
    }
}
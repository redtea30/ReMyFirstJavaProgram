package TCP.enhance;


public class Type {
    String type;
    String message;
    Long time;
    Integer recall;

    public Type(String type, String message, Integer recall) {
        this.type = type;
        this.message = message;
        this.time = System.currentTimeMillis();
        this.recall = recall;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                ", message='" + message + '\'' +
                ", time=" + time +
                ", recall=" + recall +
                '}';
    }
}

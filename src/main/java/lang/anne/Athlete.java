package lang.anne;

public class Athlete {
    private String name;
    private String status;

    public Athlete(String name){
        this(name, "Beginner");
    }
    public Athlete(String name, String status){
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}

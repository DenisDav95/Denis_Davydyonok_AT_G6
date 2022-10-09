package basetask;

public class Obstacle {

    private String description;
    private String severity;

    public void setDescription(String myDescription) {
        myDescription = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSeverity(String mySeverity) {
        mySeverity = severity;
    }

    public String getSeverity() {
        return severity;
    }

    public Obstacle() {
        description = "Земельный пук";
        severity = "высокая";
    }

    public Obstacle(String obstacleDescription, String obstacleSeverity) {
        description = obstacleDescription;
        severity = obstacleSeverity;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло " + severity + " препятствиие " + description);
    }

}

package homework.day2.basetask;

public class TrainMethodsObjects {

    public void processMouse(Mouse m) {
        System.out.println(m.getName());
        System.out.println(m.getAge());
        m.printMouseDetails();
    }

    public void processSouce(Souce s) {
        System.out.println(s.getName());
        System.out.println(s.getColor());
        s.printSouceDetails();
    }

    public void processBee(Bee b) {
        System.out.println(b.getGender());
        System.out.println(b.getWeight());
        b.printBeeDetails();
    }

    public void processObstacle(Obstacle o) {
        System.out.println(o.getDescription());
        System.out.println(o.getSeverity());
        o.printObstacleDetails();
    }

    public void processPineapple(Pineapple p) {
        System.out.println(p.getGrade());
        System.out.println(p.getHeatCapacity());
        p.printPineappleDetails();
    }

}
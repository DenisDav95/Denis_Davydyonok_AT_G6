package basetask;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {

        TrainMethodsObjects output = new TrainMethodsObjects();

        Mouse myMouse = new Mouse("Витя", 5);
        Souce mySouse = new Souce();
        Bee myBee = new Bee();
        Obstacle myObstacle = new Obstacle("Огненный шар", "низкая");
        Pineapple myPineapple = new Pineapple();

        output.processMouse(myMouse);
        output.processSouce(mySouse);
        output.processBee(myBee);
        output.processObstacle(myObstacle);
        output.processPineapple(myPineapple);
    }

}

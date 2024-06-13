package Activities;

import java.util.*;
import java.util.Date;

class Plane {
    private int maxPassengers;
    private List<String> passengers;
    private Date lastTakeOffTime;
    private Date lastLandingTime;

    public Plane(int maxPassengers){
        this.maxPassengers= maxPassengers;
        this.passengers= new ArrayList<>();
    }

    public void onboard(String passenger){
        this.passengers.add(passenger);
    }

    public Date takeOff(){
        this.lastTakeOffTime= new Date();
        return lastTakeOffTime;
    }

    public void landing(){
        this.lastLandingTime= new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded(){
        this.lastLandingTime= new Date();
        return lastLandingTime;
    }

    public List<String> getPassengers(){
        return passengers;
    }
}

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane myPlane= new Plane(10);
        myPlane.onboard("Rachel");
        myPlane.onboard("John");
        myPlane.onboard("Mathew");
        System.out.println("Take off time: " +myPlane.takeOff());
        System.out.println("Passengers in plane: "+myPlane.getPassengers());
        Thread.sleep(5000);
        System.out.println("Landing time: " +myPlane.getLastTimeLanded());
        System.out.println("Passengers in plane after landing: "+myPlane.getPassengers());
    }
}

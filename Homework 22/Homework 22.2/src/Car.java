public class Car {
    String engine;
    String body;
    String gearbox;
    int wheel;
    boolean fifthDoor;

    public Car(String engine){
        this.engine = engine;
    }

    public String getEngine(){
        return engine;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getBody(){
        return body;
    }
    public void setBody(String body){
        this.body = body;
    }
    public String getGearbox(){
        return gearbox;
    }
    public void setGearbox(String gearbox){
        this.gearbox = gearbox;
    }
    public int getWheel(){
        return  wheel;
    }
    public void setWheel(int wheel){
        this.wheel = wheel;
    }
    public boolean getFifthDoor(){
        return fifthDoor;
    }
    public void setFifthDoor(boolean fifthDoor){
        this.fifthDoor = fifthDoor;
    }
}

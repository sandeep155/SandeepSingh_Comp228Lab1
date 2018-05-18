package exercise3;

public class GameObject {
    // instance variables
    int center;
    private String 	 velocity,
            state ,
            rotation ;
    //Constructor
    public GameObject(int center, String velocity, String state, String rotation) {
        this.center = center;
        this.velocity = velocity;
        this.state = state;
        this.rotation = rotation;
    }

    // Getter and Setter
    public int getCenter() {
        return center;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    //Method to return GameObject's Information
    public String getGameObjectInformation (){
        return "GameObjet center: " + center + "\n" +
                "velocity: " + velocity + "\n" +
                "state: " + state + "\n" +
                "rotation: " + rotation + "\n";

    }

}


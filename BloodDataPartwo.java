public class BloodDataPartwo {
    private String bloodType;
    private String rhFactor;

    public BloodDataPartwo() { 
        bloodType = "O";
        rhFactor = "+";
    }

    public void setBloodType(String bt) {
        bloodType = bt;
    }

    public void setRhFactor(String rh) {
        rhFactor = rh;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}
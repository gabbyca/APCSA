public class LightBulb {

    private boolean LED;
    private String brand;
    private int hoursLast;
    private String isTrue ="";

    public LightBulb(boolean l, String b){
            LED = l;
            brand = b;
    }

    public void figureOut(){
        if (LED)
            isTrue = " is LED";
        else {
            isTrue = " is not LED";
        }
    }


    public String toString(){
            return "The light-bulb from " + brand + isTrue;

    }




}

import java.util.*;

public class Hours extends LightBulb {
    private int arrLen;

    ArrayList<Integer> arrList= new ArrayList<Integer>();


    public Hours(boolean l, String b, int a) {
        super(l, b);
        arrLen = a;
    }
//why does it go twice
    public ArrayList<Integer> arrStuff() {
       for(int i = 0; i <= arrLen; i++){
           arrList.add(i);
       }
       System.out.println("arrStuff run");
        return arrList;
    }

  
    public void pickOne(){
        for(int i = 0; i < arrList.size(); i++){
           int index = (int)(Math.random() * arrList.size());
        }

    }






    public String toString(){
        return super.toString() + " and has " + "hours of use.";

    }

}
public class Main {
    public static void main(String[] args) {

        Hours bulb1 = new Hours(true, "Lowe's", 4);


        bulb1.figureOut();
        bulb1.pickOne();
        bulb1.arrStuff(); // it runs once here




        System.out.println(bulb1.toString());
        System.out.println(bulb1.arrStuff()); // then runs again here



    }
}
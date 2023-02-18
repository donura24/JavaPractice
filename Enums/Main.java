package JavaPractice.Enums;

public class Main {
    public static void main(String[] args) {

        //DaysOfTheWeek  day = DaysOfTheWeek.THURSDAY;

        /*if(day == DaysOfTheWeek.THURSDAY){
            System.out.println("It's Thursday");
        }

        for (DaysOfTheWeek rDay : DaysOfTheWeek.values()){
            System.out.println(rDay);
        }

         */

        for (Foods food : Foods.values()) {
            System.out.println(Foods.valueOf(String.valueOf(food))+" level of sweetness is: "+Foods.valueOf(String.valueOf(food)).levelOfSweetness);
        }

    }
}

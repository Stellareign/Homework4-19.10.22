public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 4:");
        int efficiencyTime = 2;
       int efficiencyBottles = 16;
       int timeMinutes = 20;
       int dayMinutes = 24 * 60;
       int threeDayMinutes = 3 * 24 * 60;
       int monthMinutes = threeDayMinutes * 10;
       float in20MinutesBottles = timeMinutes / efficiencyTime * efficiencyBottles;
        System.out.println("За " + timeMinutes + " минут машина произвела бутылок " + in20MinutesBottles + " штук.");
        float inDayBottles = dayMinutes / efficiencyTime * efficiencyBottles;
        System.out.println("За день машина произвела бутылок " + inDayBottles + " штук.");
        float inThreeDayBottles = threeDayMinutes / efficiencyTime * efficiencyBottles;
        System.out.println("За три дня машина произвела бутылок " + inThreeDayBottles + " штук.");
        float inMonthBottles = monthMinutes / efficiencyTime * efficiencyBottles;
        System.out.println("За месяц машина произвела бутылок " + inMonthBottles + " штук.");






    }
}
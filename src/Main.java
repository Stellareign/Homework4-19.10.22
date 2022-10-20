public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 8:");
    double salaryMashaRub = 67760.0;
        double salaryMashaIncrease = salaryMashaRub * 1.10;
        double YearSalaryMasha = salaryMashaRub * 12;
        double YearSalaryMashaIncrease = salaryMashaIncrease * 12;
        double increaseAnnualIncomeMasha = YearSalaryMashaIncrease - YearSalaryMasha;
        System.out.println("Маша теперь в месяц получает " + salaryMashaIncrease + " годовой доход вырос на " + increaseAnnualIncomeMasha + " рублей");
    double salaryDenisRub = 83690.0;
        double salaryDenisIncrease = salaryDenisRub * 1.10;
        double salaryYearDenis = salaryDenisRub * 12;
        double salaryYearDenisIncrease = salaryDenisIncrease * 12;
        double increaseAnnualIncomeDenis = salaryYearDenisIncrease - salaryYearDenis;
        System.out.println("Денис теперь в месяц получает " + salaryDenisIncrease + " годовой доход вырос на " + increaseAnnualIncomeDenis  + " рублей");
    double salaryKristinaRub = 76230.0;
        double salaryKristinaIncrease = salaryKristinaRub * 1.10;
        double salaryYearKristina = salaryKristinaRub + 12;
        double salaryYearKristinaIncrease = salaryKristinaIncrease * 12;
        double increaseAnnualIncomeKristina = salaryYearKristinaIncrease - salaryYearKristina;
        System.out.println("Кристина теперь в месяц получает " + salaryKristinaIncrease + " годовой доход вырос на " + increaseAnnualIncomeKristina  + " рублей");

       }
}
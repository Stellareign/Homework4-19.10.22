public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 7:");
    float weightLoss1Gr = 250;
    float weightLoss2Gr = 500;
    int desiredResultKg = 7;
    int desiredResultGr = desiredResultKg * 1000;
    double quantityDaysWithLoss1 = desiredResultGr / weightLoss1Gr;
    double quantityDaysWithLoss2 = desiredResultGr / weightLoss2Gr;
    double averageQuantityDays = (quantityDaysWithLoss1 + quantityDaysWithLoss2) / 2;
        System.out.println("Если потеря веса составит по " + weightLoss1Gr + " г в день, то потребуется " + quantityDaysWithLoss1 + " дней");
        System.out.println("Если потеря веса составит по " + weightLoss2Gr + " г в день, то потребуется " + quantityDaysWithLoss2 + " дней");
        System.out.println("В среднем на похудение на 7 кг потребуется " + averageQuantityDays + " дней");







    }
}
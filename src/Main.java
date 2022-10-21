public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 5:");
    int totlalPaints  =120;
    int witePaintCans = 2;
    int brownPaintCans = 4;
    int quantityClasses = totlalPaints / (witePaintCans + brownPaintCans);
    int quantityWitePaint = quantityClasses * witePaintCans;
    int quantityBrownPaint = quantityClasses * brownPaintCans;
        System.out.println("В школе, где " + quantityClasses +" классов, нужно " + quantityWitePaint +
                " банок белой краски и " + quantityBrownPaint + " банок коричневой краски");







    }
}
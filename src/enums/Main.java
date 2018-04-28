package enums;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(Season.valueOf("SUMMER").getAvgTemp());


        if (season == Season.WINTER){
            System.out.println("Są takie same");
        }
    }
}

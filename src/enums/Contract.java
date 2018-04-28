package enums;

public enum Contract {
    UMOWA_O_PRACE (12), UMOWA_ZLECENIE (3), UMOWA_O_DZIELO (6);

    int avgLength;

    public int getAvgLength() {
        return avgLength;
    }

    private Contract(int avgLength){
        this.avgLength = avgLength;

    }
}

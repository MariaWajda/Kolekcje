package enums;

public enum Season {

        WINTER (-20), SPRING (18) , SUMMER (30), AUTUMN (15); //bezpaprametrowe instacje eunmó

        private int avgTemp;

        public int getAvgTemp() {
            return avgTemp;
        }

        private Season (int avgTemp){
            this.avgTemp = avgTemp;
        }

}

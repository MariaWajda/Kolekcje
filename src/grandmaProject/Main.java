package grandmaProject;

import java.io.IOException;

public class Main {
    //nazwa:ilosc:cena
    //oblicz kwotę całkowitą zakupów
    // jkiego produktu kupila najwiecej
    //czy nie naliczyli podwójnie towaru
    //5, 2, 1, 0.5 , 0.2 , 0.1 - i ile musi miec najmniej monet ze sobą aby opłacić zamówienie

    public static void main(String[] args) {
        Connection connection = new Connection();
        try {
            connection.whatNext();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

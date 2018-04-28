package grandmaProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GrandmasList {


    public String readFile () throws IOException{
        FileInputStream fileInputStream = new FileInputStream("D:\\folder\\lista.txt");
        StringBuilder stringBuilder = new StringBuilder();
        int read;
        while ((read = fileInputStream.read()) != -1) {
            stringBuilder.append((char) read);
        }
        //System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
        public String [] splitListToArray (String list){
        String [] array = list.split("/");

            for (int i = 0; i < array.length ; i++) {
                System.out.println(i + " "+ array[i]);
            }
//        for (String s : array){
//            System.out.println(s);
//        }
        return array;
    }

    public void splitTheList (String [] list) {
        String [] splittedAgain = new String[]{};

        for (String s : list){
            Product newProduct = new Product();
            String [] properties = s.split(":");
            newProduct.setName(properties[0]);
            newProduct.setAmount(Integer.valueOf(properties[1]));
            newProduct.setPrice(Double.valueOf(properties[2]));
        }

    }

}

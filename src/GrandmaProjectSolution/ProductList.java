package GrandmaProjectSolution;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ProductList {

    private File productListFile;
    private List<Product> productListt;

    public ProductList (String pathToFile) throws IOException{
        productListFile = new File(pathToFile);
        productListt = new ArrayList<>();

        String content = Utils.readFileContent(productListFile);
        if (chechFileContent(content)){
            parseProductListFromString(content);
        } else {
            throw new IllegalStateException("Incorret coś-tam ");
        }


        parseProductListFromString(Utils.readFileContent(productListFile));
    }
    private boolean chechFileContent (String content){
        return true; //Pattern.matches("(.+::.+:.+/?)+", content);
    }

    private void parseProductListFromString (String productsString){
        String [] products = productsString.split("/");

        for (String product : products){
            String [] onepRroduct = product.split(":");
            productListt.add(new Product(onepRroduct[0], Double.parseDouble(onepRroduct[1]), Integer.parseInt(onepRroduct[2])));
        }
    }
    public Product getMaxProduct(){
        Product productMaxCount = productListt.get(0);
        for (Product product : productListt){
            if (productMaxCount.getCount() < product.getCount()){
                productMaxCount = product;
            }
        } return productMaxCount;
    }
    public double getTotalPrice () {
        double price = 0;
        for(Product product : productListt){
            price += product.getPrice() * product.getCount();
        }
        return price;
    }
    public boolean hasListDoubleProduct(){
        for (Product product : productListt){


        } return false;
    }
}

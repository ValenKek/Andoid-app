package com.example.lr2;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductName {
    private final String company;
    private final String name;
    private int level;
    private boolean expirationDate;

    public int getLevel() {
        return level;
    }

    public ProductName(String name, String company, int level, boolean expirationDate) {
        this.company = company;
        this.name = name;
        this.level = level;
        this.expirationDate = expirationDate;
    }


    public boolean isExpirationDate() {
        return expirationDate;
    }

    public String getCompany() {
        return company;
    }
    public  String getName() {
        return name;
    }
    public final static ArrayList<ProductName> productsName=new ArrayList<>(Arrays.asList(
            new ProductName("RX 5700xt","AMD",1,true),

            new ProductName("I3 7020u","Intel",2,false),

            new ProductName("RTX 3090","Nvidia",1,true)


    ));
    public static ArrayList<ProductName> getNames(){
        return productsName;
    }
    @Override
    public String toString(){
        return company;
    }
    public static ProductName getProductsName(String company){
        for(ProductName p: productsName){
            if (p.getCompany().equals(company)){
                return p;
            }
        }
       return null;
    }
}

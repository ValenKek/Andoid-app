package com.example.lr2;
import java.util.ArrayList;
import java.util.Arrays;

    public class Product {
        private String name;

        private String company;

        public Product(String name,String company) {
            this.name = name;

            this.company=company;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public final static ArrayList<Product> products=new ArrayList<Product>(Arrays.asList(
                new Product("RX 5700xt","AMD"),
                new Product("I3 7020u","Intel"),
                new Product("RTX 3090","Nvidia")

        ));
        public static  ArrayList<Product> getProducts(String company){
            ArrayList<Product> productArrayList= new ArrayList<>();
            for(Product p: products){
                if (p.getCompany().equals(company)){
                    productArrayList.add(p);
                }
            }
            return productArrayList;
        }
    }



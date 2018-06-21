package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;

public class Webshop {

    public static void main(String[] args) {

        //not so nice, but I'm too lazy to put this code in to seperate function. ty
        ProductCategory category1 = new ProductCategory("Headphones", "Headphones",
                "Listening music or audio books");
        Supplier supplier = new Supplier("Sony", "Big company");

        Product headphone = new Product("Sony X30", 3499,Currency.getInstance("HUF"));
        headphone.setProductCategory(category1);
        headphone.setSupplier(supplier);

        Product headphone2 = new Product("Sony Y30", 13499,Currency.getInstance("HUF"));
        headphone2.setProductCategory(category1);
        headphone2.setSupplier(supplier);

        headphone.setName("Sony X35");
        headphone.setDefaultPrice(4277);
        headphone.setProductCategory(new ProductCategory("Premium Headphones", "Headphones",
                "Listening music or audio books"));

        System.out.println(headphone.toString());

        for(Product product : Product.getAllProductsBy(category1)) {
            System.out.println(product.toString());
        }

        System.out.println(Product.getAllProductsBy(category1).size());

        Product iphone = new Product("Iphone S8", 2500, Currency.getInstance("USD"));
        Supplier apple = new Supplier("Apple", "Think different");
        FeaturedProductCategory category = new FeaturedProductCategory("Phones", "SmartPhones", "Smart phones");
        iphone.setSupplier(apple);
        category.schedule( new GregorianCalendar(2018, 6, 11).getTime(), new GregorianCalendar(2018, 6, 30).getTime());
        iphone.setProductCategory(category);


        for (Product product : Product.getAllProductsBy(apple)) {
            System.out.println(product.getName());
        }

        System.out.println(iphone.getProductCategory().toString());

        iphone.setDefaultCurrency(Currency.getInstance("HUF"));
        iphone.setDefaultPrice(450000);

        System.out.println(iphone.toString());



    }
}

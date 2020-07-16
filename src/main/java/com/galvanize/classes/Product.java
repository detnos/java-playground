package com.galvanize.classes;

class Product {
    Product(String name, int valueInCents) {
        this.name = name;
        this.valueInCents = valueInCents;
    }

    private String name;
    private int valueInCents;

    public String getName() {
        return name;
    }

    public int getValueInCents() {
        return valueInCents;
    }

    //declare your class here
    private static class Currency {
        private Product product;

        public Currency(Product product) {
            this.product = product;
        }

        public String getUSD() {
            Integer myInt = this.product.valueInCents;
            String dollars = myInt.toString().substring(0, myInt.toString().length() - 2);
            String cents = myInt.toString().substring(myInt.toString().length() - 2);
            System.out.println(dollars);
            System.out.println(cents);

            return "$" + dollars + "." + cents;
        }

    }

    public Currency getCurrency() {
        return new Currency(this);
    }
}
package ru.netology;

public class Product {
        private int price;
        private String name;

        public Product(int price, String name) {
            this.price = price;
            this.name = name;
        }

        public Product() {
        }

    public Product(String[] products, int[] prices, int[] sum) {
    }

    public int getPrice() {
            return price;
        }

        public String getName(String s) {
            return name;
        }
    }
package ru.netology;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            String[] products = {"Хлеб", "Булочка", "Пряник"};
            int[] prices = {25, 30, 12};
            int[] sum = {0, 0, 0};
            int[] count = {0, 0, 0};
            int productNumber = 0;
            int productCount = 0;
            int sumProducts = 0;
            //int currentPrice = prices[productNumber];

            System.out.println("Список возможных товаров для покупки: ");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб./шт.");
            }
            while (true) {
                System.out.println("Выберите товар и количество или введите `end`");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                if ("end".equals(input)) {
                    break;
                }
                String[] split = input.split(" ");
                productNumber = Integer.parseInt(split[0]) - 1;
                productCount = Integer.parseInt(split[1]);
                sum[productNumber] += prices[productNumber] * productCount;
                count[productNumber] += productCount;
            }
            System.out.println("Итоговая корзина с продуктами:");

            for (int i = 0; i < products.length; i++) {
                if (count[i] != 0) {
                    System.out.println(products[i] + " " + count[i] + " шт., " + prices[i] + " руб., " + sum[i] + " рублей в сумме.");
                }
                sumProducts += sum[i];
            }
            System.out.println("Итого: " + sumProducts + " рублей.");
        }
    }
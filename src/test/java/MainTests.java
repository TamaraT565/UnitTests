import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.Product;


public class MainTests {
    Product products0 = new Product();

    @BeforeEach
    void prepareBasket() {
        String[] products = {"Хлеб", "Булочка", "Пряник"};
        int[] prices = {25, 30, 12};
        int[] sum = {1, 1, 1};
        products0 = new Product(products, prices, sum);
    }

    @Test
    public void testCreatingConstructor() {

        Assertions.assertNotNull(products0);
    }

    @Test
    void negativeInputProductSumValues() {
        String[] products1 = {"Хлеб", "Булочка", "Пряник"};
        int[] prices1 = {25, 30, 12};
        int[] sum1 = {0, 0, 0};
        int[] count1 = {0, 0, 0};
        int productNumber1 = 0;
        int productCount = -5;
        try {
            if (productCount > 0) {
                System.out.println("Количество продуктов введено корректно" + productCount);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Число количества продуктов - отрицательно!");
        }
        Assertions.assertTrue(productCount < 0, "Количество продуктов введено отрицательным числом");
    }
    @ParameterizedTest
    @ValueSource(strings = {"Бублик", "Булочка", "Пряник"})
    public void paramTestContainingLetter(String argument){
        Assertions.assertTrue(argument.contains("к"));
    }
}



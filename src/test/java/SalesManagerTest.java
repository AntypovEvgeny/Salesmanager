import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SalesManagerTest {
    private SalesManager salesManager;

    @DisplayName("Тестирование: SalesManager")
    @BeforeEach
    void setSalesManager() {
        salesManager = new SalesManager(new long[]{100, 600, 500, 300, 350});
    }

    @Test
    @DisplayName("Тестирование поиск максимального числа")
    void max() {
        Assertions.assertEquals(600, salesManager.max());
    }

    @Test
    @DisplayName("Тестирование поиск минимального числа")
    void min() {
        Assertions.assertEquals(100, salesManager.min());
    }

    @Test
    @DisplayName("Тестирование поиск среднего числа")
    void average() {
        Assertions.assertEquals(383, salesManager.average());
    }
}

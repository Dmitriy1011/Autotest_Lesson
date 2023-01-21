import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculatePrice() {
        val itemPrice = 10
        val itemCount = 1
        val discount = 100
        val discountStart = 1_000
        val level = "gold"

        val result = calculatePrice(itemPrice, itemCount, discount, discountStart, level)

        assertEquals(90, result)
    }
}
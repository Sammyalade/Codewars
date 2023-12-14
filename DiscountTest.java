import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountTest{

		@Test
		public void testDiscountOfTheCustomer(){
			Discount discount = new Discount();
			int discountCalculation = discount.discount(0.10, 10000);
			assertEquals(1000, discountCalculation);
			System.out.print("Discount: " + discountCalculation);
		}


}
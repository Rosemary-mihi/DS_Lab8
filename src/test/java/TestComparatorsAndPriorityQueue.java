import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestComparatorsAndPriorityQueue 
{
	Customer A = new Customer(0,0,0);
	Customer B = new Customer(0,0,0);
	Customer C = new Customer(0,0,0);
	Customer.WorthComparator C1 = new Customer.WorthComparator();
	Customer.LoyaltyComparator C2 = new Customer.LoyaltyComparator();
	Customer.WorthPoliteComparator C3 = new Customer.WorthPoliteComparator();
	
	@BeforeEach
	void setUp() throws Exception
	{
		Customer A = new Customer(0,0,0);
		Customer B = new Customer(0,0,0);
		Customer C = new Customer(0,0,0);
		Customer.WorthComparator C1 = new Customer.WorthComparator();
		Customer.LoyaltyComparator C2 = new Customer.LoyaltyComparator();
		Customer.WorthPoliteComparator C3 = new Customer.WorthPoliteComparator();
		// OuterClass.InnerClass inner = new OuterClass.InnerClass();;
	}
	
	@Test
	void testWorthComparator()
	{
		assertEquals(C1.compare(A, B),0);
	}
}

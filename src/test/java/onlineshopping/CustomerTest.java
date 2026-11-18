package onlineshopping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomerTest {

    @Test
    void testCreateCustomerWithValidType() {
        for (CustomerType type : CustomerType.values()) {
            Customer customer = new Customer("A", type);

            assertEquals(type, customer.getCustomerType());
        }
    }

    @Test
    void testRejectNullTypeOnCreation() {
        assertThrows(NullPointerException.class, () -> new Customer("A", null));
    }

    @Test
    void testUpdateCustomerWithValidType() {
        Customer customer = new Customer("A", CustomerType.REGULAR);
        CustomerType[] updateTypes = {
                CustomerType.PREMIUM,
                CustomerType.VIP,
                CustomerType.REGULAR
        };

        for (CustomerType type : updateTypes) {
            CustomerType previousType = customer.getCustomerType();

            assertNotEquals(previousType, type);

            customer.setCustomerType(type);

            assertEquals(type, customer.getCustomerType());
        }
    }

    @Test
    void testSetNullCustomerType() {
        Customer customer = new Customer("A", CustomerType.REGULAR);

        assertThrows(NullPointerException.class, () -> customer.setCustomerType(null));
    }
}

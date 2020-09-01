import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredandunderLimit() {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
        System.out.println("RegisteredandunderLimit "+actual);
    }

    @Test
    void shouldCalculateNotRegisteredandunderLimit() {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
        System.out.println("NotRegisteredandunderLimit "+actual);
    }

    @Test
    void shouldCalculateRegisteredandupperLimit() {
        BonusService service = new BonusService();

        long amount = 950100060;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
        System.out.println("RegisteredandupperLimit "+actual);
    }

    @Test
    void shouldCalculateNotRegisteredandupperLimit() {
        BonusService service = new BonusService();

        long amount = 950100060;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
        System.out.println("NotRegisteredandupperLimit "+actual);
    }

    @Test
    void shouldCalculateNotRegisteredandintheLimit() {
        BonusService service = new BonusService();

        long amount = 1000000;
        boolean registered = false;
        long expected = 100;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
        System.out.println("NotRegisteredintheLimit "+actual);
    }

    @Test
    void shouldCalculateRegisteredandintheLimit() {
        BonusService service = new BonusService();

        long amount = 1000000;
        boolean registered = true;
        long expected = 300;

        long actual = service.calculate(amount, registered);

        assertEquals(expected,actual);
        System.out.println("RegisteredintheLimit "+actual);
    }

}
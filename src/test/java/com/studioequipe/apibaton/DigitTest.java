package com.studioequipe.apibaton;

import com.phenix.digit.Digit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests de la classe {@link APIBaton}.
 *
 * @author <a href="mailto:edouard128@hotmail.com">Edouard Jeanjean</a>
 */
public final class DigitTest {

    /**
     * Début des tests.
     */
    public DigitTest() {
    }

    /**
     * Ce qui se passe avant tous les tests.
     */
    @BeforeAll
    public static void setUpClass() {
    }

    /**
     * Ce qui se passe après tous les tests.
     */
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Exécuter avant chaque test.
     */
    @BeforeEach
    public void setUp() {
    }

    /**
     * Exécute après chaque test.
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * On teste les fonctions.
     */
    @Test
    public void test() {
        byte nombre = 5;
        assertEquals("05", Digit.getDigit(nombre), "Ce n'est pas formaté comme on veut.");

        nombre = 10;
        assertEquals("10", Digit.getDigit(nombre), "Ce n'est pas formaté comme on veut.");

        nombre = 66;
        assertEquals("66", Digit.getDigit(nombre), "Ce n'est pas formaté comme on veut.");

        assertEquals("09", Digit.getDigit(9), "Ce n'est pas formaté comme on veut.");
        assertEquals("10", Digit.getDigit(10), "Ce n'est pas formaté comme on veut.");
        assertEquals("99", Digit.getDigit(99), "Ce n'est pas formaté comme on veut.");

        assertEquals("1", Digit.getDigit(1, 1), "Ce n'est pas formaté comme on veut.");
        assertEquals("01", Digit.getDigit(1, 2), "Ce n'est pas formaté comme on veut.");
        assertEquals("003", Digit.getDigit(3, 3), "Ce n'est pas formaté comme on veut.");
        assertEquals("0010", Digit.getDigit(10, 4), "Ce n'est pas formaté comme on veut.");

        assertEquals("006", Digit.getDigit3(6), "Ce n'est pas formaté comme on veut.");
        assertEquals("010", Digit.getDigit3(10), "Ce n'est pas formaté comme on veut.");
        assertEquals("066", Digit.getDigit3(66), "Ce n'est pas formaté comme on veut.");
        assertEquals("666", Digit.getDigit3(666), "Ce n'est pas formaté comme on veut.");
        assertEquals("999", Digit.getDigit3(999), "Ce n'est pas formaté comme on veut.");
    }
}

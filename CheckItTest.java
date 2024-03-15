import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckItTest {

    // Predicate Coverage
    @Test
    public void testPredicateTrue() {
        assertTrue(CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testPredicateFalse() {
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    // Clause Coverage
    @Test
    public void testClauseTrue() {
        assertTrue(CheckIt.checkIt(true, true, true));
    }

    @Test
    public void testClauseFalse() {
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    // CACC
    @Test
    public void testCACC_1() {
        assertTrue(CheckIt.checkIt(true, true, false));
        assertFalse(CheckIt.checkIt(false, false, true));
    }

    @Test
    public void testCACC_2() {
        assertTrue(CheckIt.checkIt(true, false, true));
        assertFalse(CheckIt.checkIt(false, true, false));
    }

    // RACC
    @Test
    public void testRACC_1() {
        assertTrue(CheckIt.checkIt(true, true, true));
    }

    @Test
    public void testRACC_2() {
        assertFalse(CheckIt.checkIt(false, false, true));
    }

}
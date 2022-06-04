import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CardNameTest {

    private final String cardName;
    private final boolean expected;

    public CardNameTest(String cardName, boolean expected) {
        this.cardName = cardName;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getCardName() {
        return new Object[][] {
                { "Vert Dider", true},
                { "Fernando Alonso", true},
                { "Fernando Alonso Díaz", false},
                { "IQ", false},
                { "SirLewisCarl DavidsonHamilton", false},
        };
    }

    @Test
    @DisplayName("Cheking the selected name can be printed on the card")
    public void CardNamesholdBePrinted() {
        Account account = new Account(cardName);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}

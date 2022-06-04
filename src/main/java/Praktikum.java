
public class Praktikum {

    public static void main(String[] args) {

        String cardName = "Vert Dider";
        Account account = new Account(cardName);

        if(account.checkNameToEmboss())
            System.out.println("Card can be PRINTed");
        else
            System.out.println("Card name is WRONG");

    }

}

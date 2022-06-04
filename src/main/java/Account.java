import io.qameta.allure.Step;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    @Step("Getting cardName {cardName}")
    public boolean checkNameToEmboss() {
        return name.length() >= 3 && name.length() <= 19 && !name.startsWith(" ") && !name.endsWith(" ") && onlyOneSpaceCheck();
    }

    private boolean onlyOneSpaceCheck() {
        int spaceCount = 0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == ' ')
                spaceCount++;
        }
    return spaceCount == 1;
    }

}

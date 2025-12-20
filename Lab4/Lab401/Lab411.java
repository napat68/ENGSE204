package Lab401;

import java.util.Scanner;

class Configuration {

    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {

        if (theme == null || theme.trim().isEmpty()) {
            throw new IllegalArgumentException("Error theme can't be empty or null.");
        }

        if (fontSize < 10) {
            fontSize = 10;
        } else if (fontSize > 20) {
            fontSize = 20;
        }

        this.theme    = theme;
        this.fontSize = fontSize;
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this(user.theme, base.fontSize, user.darkMode);
    }

    public void displaySettings() {
        System.out.println("Theme: " + theme + ", Size: " + fontSize + ", Dark: " + darkMode);
    }
}

public class Lab411 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String baseTheme     = input.next();
        int baseFontSize     = input.nextInt();
        boolean baseDarkMode = input.nextBoolean();

        String userTheme     = input.next();
        int userFontSize     = input.nextInt();     
        boolean userDarkMode = input.nextBoolean();

        Configuration baseConfig  = new Configuration(baseTheme, baseFontSize, baseDarkMode);
        Configuration userConfig  = new Configuration(userTheme, userFontSize, userDarkMode);

        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();

        input.close();
    }
}

package Lab301;

import java.util.Scanner;

class SystemLogger {

    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        if (level == 1) return "INFO";
        if (level == 2) return "DEBUG";
        if (level == 3) return "ERROR";
        return "UNKNOWN";
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel < 1 || newLevel > 3) {
            System.out.println("Invalid log level.");
            return; 
        }

        currentLogLevel = newLevel;
        System.out.println("Log level set to " + getLevelName(newLevel));
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel < currentLogLevel) {
            return; 
        }

        String levelName = getLevelName(messageLevel);
        System.out.println("[" + levelName + "]: " + message);
    }
}

public class Lab310 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < n; i++) {
            String command = input.nextLine(); 

            if (command.equals("SET")) {
                int newLevel = input.nextInt();
                input.nextLine();
                SystemLogger.setLogLevel(newLevel);
                
            } else if (command.equals("LOG")) {
                int msgLevel = input.nextInt();
                input.nextLine(); 
                String message = input.nextLine(); 
                SystemLogger.log(msgLevel, message);
            }
        }

        input.close();
    }
}


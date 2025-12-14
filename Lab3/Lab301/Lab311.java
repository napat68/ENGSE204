package Lab301;

import java.util.Scanner;

class SystemConfig {

    private static SystemConfig instance;

    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return this.serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return this.maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count <= 0) {
            System.out.println("Invalid count.");
            return; 
        }
        this.maxConnections = count;
        System.out.println("Max connections set.");
    }
}

public class Lab311 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            String cmd = input.nextLine();

            if (cmd.equals("SET_URL")) {
                String url = input.nextLine();
                SystemConfig config = SystemConfig.getInstance();
                config.setServerUrl(url);

            } else if (cmd.equals("SET_MAX")) {
                int count = input.nextInt();
                input.nextLine();
                SystemConfig config = SystemConfig.getInstance();
                config.setMaxConnections(count);

            } else if (cmd.equals("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }

        input.close();
    }
}


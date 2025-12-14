package Lab301;

import java.util.Scanner;

class DatabaseConnection {

    private String connectionString;

    private boolean connected;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false;
    }

    public boolean isConnected() {
        return connected;
    }

    public void connect() {

        if (connected) {
            System.out.println("Already connected.");
            return;
        }

        connected = true;
        System.out.println("Connected to " + connectionString);
    }

    public void disconnect() {

        if (!connected) {
            System.out.println("Already disconnected.");
            return;
        }

        connected = false;
        System.out.println("Disconnected.");
    }
}

public class Lab305 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String databaseName = input.nextLine();

        if (databaseName.isEmpty()) {
            System.out.println("Invalid database name.");
            input.close();
            return;
        }

        DatabaseConnection dbConnection =
                new DatabaseConnection(databaseName);

        dbConnection.connect();
        dbConnection.disconnect();
        dbConnection.disconnect();

        System.out.println(dbConnection.isConnected());

        input.close();
    }
}




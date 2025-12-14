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
        return this.connected;
    }

    public void connect() {

        if (this.connected == true) {
            System.out.println("Already connected.");
            return;
        }

        this.connected = true;
        System.out.println("Connected to " + this.connectionString);
    }

    public void disconnect() {

        if (this.connected == false) {
            System.out.println("Already disconnected.");
            return;
        }

        this.connected = false;
        System.out.println("Disconnected.");
    }
}

public class Lab305 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String databaseName = input.nextLine();

        DatabaseConnection dbConnection =
                new DatabaseConnection(databaseName);

        dbConnection.connect();
        dbConnection.disconnect();
        dbConnection.disconnect();

        System.out.println(dbConnection.isConnected());

        input.close();
    }
}



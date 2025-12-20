package Lab401;

import java.util.Scanner;

class Resource {

    private String id;

    public Resource(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Error :id can't be empty or null.");
        }

        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Resource " + id + " finalized (destroyed).");
        } finally {
            super.finalize();
        }
    }
}

public class Lab407 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String id1 = input.nextLine();
        String id2 = input.nextLine();
        String id3 = input.nextLine();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;

        System.gc();
        System.runFinalization();

        r3 = null;

        System.gc();
        System.runFinalization();

        input.close();
    }
}

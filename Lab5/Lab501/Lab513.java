package Lab501;

import java.util.Scanner;

class UserLab513 {
    protected String name;

    public UserLab513(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class DeveloperLab513 extends UserLab513 {
    protected int projects;

    public DeveloperLab513(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class AdminLab513 extends DeveloperLab513 {
    protected String adminKey;

    public AdminLab513(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class Lab513 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String devName = input.nextLine();
        int devProjects = input.nextInt();
        input.nextLine(); // clear newline

        String adminName = input.nextLine();
        int adminProjects = input.nextInt();
        input.nextLine(); // clear newline
        String adminKey = input.nextLine();

        UserLab513 u1 = new UserLab513("Guest");
        DeveloperLab513 d1 = new DeveloperLab513(devName, devProjects);
        AdminLab513 a1 = new AdminLab513(adminName, adminProjects, adminKey);

        UserLab513[] users = new UserLab513[3];
        users[0] = u1;
        users[1] = d1;
        users[2] = a1;

        int totalClearance = 0;

        for (UserLab513 u : users) {
            totalClearance += u.getClearanceLevel();
        }

        for (UserLab513 u : users) {
            if (u instanceof AdminLab513) {
                AdminLab513 admin = (AdminLab513) u;
                System.out.println(admin.getAdminKey());
            }
        }

        System.out.println(totalClearance);

        input.close();
    }
}


package Lab301;

class UserLab309 {

    private String usernameLab;
    private String password;

    private static int minPasswordLength = 8;

    public UserLab309(String username, String password) {
        this.usernameLab = username;

        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsernameLab() {
        return this.usernameLab;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
            return; 
        }
        System.out.println("Update failed.");
    }

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
            return; 
        }
        minPasswordLength = length;
        System.out.println("New min length set to " + length);
    }

    public static int getMinLength() {
        return minPasswordLength;
    }
}



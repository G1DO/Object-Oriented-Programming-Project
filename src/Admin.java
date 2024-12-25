class Admin extends User {
    public Admin(String userID, String name) {
        super(userID, name);
    }

    @Override
    public void displayOptions() {
        System.out.println("Admin Options: ");
        System.out.println("1. Add Book\n2. Remove Book\n3. List All Books\n4. Register Member\n5. List All Members\n6. Generate Reports\n0. Logout");
    }
}
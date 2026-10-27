package main;

public enum UserRole {


    ADMIN("Admin", true, 30);


    private String displayName;
    private boolean active;
    private int age;

    UserRole(String displayName, boolean active, int age) {
        this.displayName = displayName;
        this.active = active;
        this.age = age;
    }


    public String getDisplayName() {
        return displayName;
    }

    public boolean isActive() {
        return active;
    }

    public int getAge() {
        return age;
    }
}

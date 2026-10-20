public class Main {
    public static void main(String[] args) {
        UserRole role = UserRole.ADMIN;
        System.out.println(role);
        System.out.println(role.getDisplayName());
        System.out.println(role.getAge());
        System.out.println(role.isActive());
        
    }
}

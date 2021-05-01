public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setId(5);
        user.setUserName("asosyal");

        BaseUserManager baseUserManager = new BaseUserManager();
        baseUserManager.Add(user);
    }
}

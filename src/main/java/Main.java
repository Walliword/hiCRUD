import models.Auto;
import models.User;
import services.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
//        User user = new User("Peta", 16);
//        userService.saveUser(user);
//        User user = userService.findUser(2);
//        userService.deleteUser(user);
//        User user3 = userService.findUser(3);
//        userService.deleteUser(user3);

//        Auto ferrari = new Auto("Ferrari", "red");
//        ferrari.setUser(user);
//        user.addAuto(ferrari);
//        Auto ford = new Auto("ford", "black");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);

        System.out.println(userService.findAllUsers());
        User user1 = userService.findUser(5);
        System.out.println(user1.getAutos());
    }
}

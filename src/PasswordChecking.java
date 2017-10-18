import java.util.Scanner;

class PasswordChecking {

    static String userPassword = "secret";

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        if (userPassword.equals(password)) {
            System.out.println("Вы ввели правильный пароль");
        }else if (password.length() > userPassword.length()){
            System.out.println("Пароль неверный - вы ввели слишком много символов!");
        }else if(password.length() < userPassword.length()){
            System.out.println("Пароль неверный - вы ввели слишком мало символов!");
        }else {
            System.out.println("Пароль неверный!");
        }
    }
}
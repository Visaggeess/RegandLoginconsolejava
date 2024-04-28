import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите логин");
        Scanner java = new Scanner(System.in);

        String login = java.nextLine();
        System.out.println("Введите ваш пароль");
        String password = java.nextLine();
        System.out.println("Вы зарегистрировались");
        String userpassword = password;
        System.out.println("Ваш логин: " + login);
        System.out.println("Пароль:");
        String userpasswordx = java.nextLine();
        if (userpasswordx.equals(userpassword)) {
            System.out.println("Пароль ввёден, загрузка");
            System.out.println("Вы вошли");
            return;
        }
        else if (userpasswordx != userpassword) {
            System.out.println("Ошибка, пароль неверный (1/3)");
            System.out.println("Повторите попытку");
        }
            String userpasswordxpovtor = java.nextLine();
        if (userpasswordxpovtor.equals(userpassword)) {
            System.out.println("Пароль введён, загрузка");
            System.out.println("Вы вошли");
            return;
        }
        else if (!userpasswordxpovtor.equals(userpassword)) {
            System.out.println("Ошибка, пароль неверный (2/3)");
            System.out.println("Повторите попытку");
        }
        String userpasswordxpovtorjava = java.nextLine();
        if (userpasswordxpovtorjava.equals(userpassword)) {
            System.out.println("Пароль введён, загрузка");
            System.out.println("Вы вошли");
            return;
    } else if (userpasswordxpovtorjava != userpassword) {
            System.out.println("Ошибка, пароль неверный (3/3)");
            System.out.println("Вы ввели пароль неверно 3/3 раза");
            return;
        }
        }
    }
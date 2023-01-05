import Controller.Controller;
import Model.Cats.Cats;
import Model.Cats.Russia_cat;
import Model.Method.mew_1;
import View.Menu;

import java.util.Scanner;

public class Main {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        Menu menu = new Menu();
        Controller controller = new Controller();

        int choose = 0;
        do {
            menu.menu();
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    controller.add();
                    break;
                case 2:
                    controller.deleteByID();
                    break;
                case 3:
                    controller.displayAllCat();
                    break;
                case 4:
                    controller.displayCat();
                    break;
                case 5:
                    controller.changeMewCat();
                    break;
                default:
                    choose = 0;
            }
        }
            while (choose != 0) ;

    }
}
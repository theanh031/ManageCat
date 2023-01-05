package Controller;

import Model.Cats.Cats;
import View.Menu;

import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    private Menu _menu = new Menu();
    private Service _service = new Service();


    public void add() {
        int choose = 0;
        do {
            _menu.menu_addCat();
            choose = Integer.parseInt(sc.nextLine());
            _service.add(choose);
        } while (choose != 0);
    }

    public void deleteByID() {
        int ID;
        boolean check = false;
        System.out.println("Type ID: ");
        ID = Integer.parseInt(sc.nextLine());
        check = _service.delete(ID);
        System.out.println(check ? "Delete Successfully" : " Id not existed");

    }

    public void displayAllCat() {
        _service.displayAllCats();
    }

    public void displayCat() {
        int ID;
        System.out.println("Type ID: ");
        ID = Integer.parseInt(sc.nextLine());
        _service.displayCat(ID);
    }

    public void changeMewCat() {
        Cats cat = null;
        int ID;
        System.out.println("Type ID: ");
        ID = Integer.parseInt(sc.nextLine());
        cat = _service.findMewCat(ID);

        int choose = 0;
        boolean check = false;
        do{
            _menu.menu_mewCat();
            choose = Integer.parseInt(sc.nextLine());
            check = _service.changeMewCat(choose, cat);
            if(check = true ) {
                System.out.println("Change Successfully");
            }
            else{
                System.out.println("No Value! Type again !");
            }
        }while (check == false);

    }

}

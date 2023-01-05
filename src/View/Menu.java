package View;

import Model.Method.Imew;

public class Menu {
    public void menu() {
        System.out.println("--------------------Manage Mom's Cats----------------------------");
        System.out.println("<1>. Add Cat");
        System.out.println("<2>. Delete Cat");
        System.out.println("<3>. Display fully Cats");
        System.out.println("<4>. Display Cat with ID");
        System.out.println("<5>. Change Cat's mew");
        System.out.println("<0>. Exit");
    }

    public void menu_addCat() {
        System.out.println("--------------------Choose Cat's type----------------------------");
        System.out.println("<1>. Long hair Cat");
        System.out.println("<2>. Short hair Cat");
        System.out.println("<3>. Russia Cat");
        System.out.println("<4>. Arabica Cat");
        System.out.println("<0>. Exit");
    }

    public void menu_mewCat() {
        System.out.println("--------------------Choose new Cat's mew----------------------------");
        System.out.println("<1>. mew_1 : meow");
        System.out.println("<2>. mew_2: meow meow");
        System.out.println("<3>. mew_3: meow meow meow");
        System.out.println("<4>. mew_4: meow meow meow meow");
        System.out.println("<0>. Exit");
    }

}

package Controller;

import Model.Cats.*;
import Model.Method.*;
import com.sun.source.tree.CaseTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    static Scanner sc = new Scanner(System.in);

//    private Imew newImew_1 = new ModifyMew();

    private ArrayList<Cats> _list = new ArrayList<>();


    // create ID auto raise
    private int _generateID() {
        int max = 1;
        if(_list != null && _list.size() > 0) {
            max = _list.get(0).getID();
            for(int i =0; i < _list.size(); i++) {
                if(max < _list.get(i).getID()){
                    max = _list.get(i).getID();
                }
            }
            max++;
        }
        return max;
    }

    // 1. add cat
    public int add(int i){
        switch (i) {
            case 1:
                Cats longHairCat = new LongHair_cat();
                longHairCat.setID(_generateID());
                longHairCat.setImew(new mew_1());
                _list.add(longHairCat);
                System.out.println("successfully added Long hair cat");
                break;
            case 2:
                Cats shortHairCat = new ShortHair_cat();
                shortHairCat.setID(_generateID());
                shortHairCat.setImew(new mew_2());
                _list.add(shortHairCat);
                System.out.println("successfully added Short hair cat");

                break;
            case 3:
                Cats russiaCat = new Russia_cat();
                russiaCat.setID(_generateID());
                russiaCat.setImew(new mew_3());
                _list.add(russiaCat);
                System.out.println("successfully added Russia cat");

                break;
            case 4:
                Cats arabicaCat = new Arabica_cat();
                arabicaCat.setID(_generateID());
                arabicaCat.setImew(new mew_4());
                _list.add(arabicaCat);
                System.out.println("successfully added Arabica cat");
                break;
            default:
                i = 0;
                break;
        }
        return i;
    }

    // 2. delete Cat with id

    public boolean delete(int id) {
        Cats cat = null;
        boolean check = false;
        for(int i = 0; i < _list.size(); i++) {
            if(_list.get(i).getID() == id ) {
                cat = _list.get(i);
                break;
            }
        }
        if(cat != null) {
            _list.remove(cat);
            check = true;
        }
        return check;
    }

    // 3. Display Cat fully

    public void displayAllCats() {
        _list.forEach(x -> {
            System.out.println(x);
        });
    }

    // 4. display Cats

    public void displayCat(int ID) {
        Cats cat = null;
        for(int i = 0; i < _list.size(); i++) {
            if(_list.get(i).getID() == ID) {
                cat = _list.get(i);
                break;
            }
        }
        System.out.println(cat);
    }

     //5. Change mew

    public Cats findMewCat(int ID) {
        Cats cat = null;
        for(int i = 0; i < _list.size(); i++) {
            if(_list.get(i).getID() == ID) {
                cat = _list.get(i);
            }
        }
        return cat;

    }
    public boolean changeMewCat(int i, Cats cats) {
        boolean check = false;
        switch (i) {
            case 1:
                cats.setImew(new mew_1());
                check = true;
                break;
            case 2:
                cats.setImew(new mew_2());
                check = true;
                break;
            case 3:
                cats.setImew(new mew_3());
                check = true;
                break;
            case 4:
                cats.setImew(new mew_4());
                check = true;
                break;
            default:
        }
        return check;

    }





}

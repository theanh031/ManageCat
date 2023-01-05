package Model.Cats;

import Model.Method.Imew;

import java.util.Scanner;

public abstract class Cats {
    static Scanner sc = new Scanner(System.in);
    Imew Imew;
    int ID;
    String Name;
    byte Age;
    String Gender;

    public Cats(Model.Method.Imew imew) {
        Imew = imew;
    }

    public Cats() {
        setName((String) _typingCat("name"));
        setAge(Byte.parseByte((String) _typingCat("age")));
        sc.nextLine();
        setGender(_typingCat__gender());
    }

    public Model.Method.Imew getImew() {
        return Imew;
    }

    public void setImew(Model.Method.Imew imew) {
        Imew = imew;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public byte getAge() {
        return Age;
    }

    public void setAge(byte age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        if(gender == 1) {
            this.Gender = "Male";
        }else if(gender == 2){
            this.Gender = "Female";
        }else {
            System.out.println("Other");
        }
    }

    private static Object _typingCat(String o) {
        System.out.println("Typing " + o + ": ");
        return sc.next();
    }
    private static int _typingCat__gender(){
        System.out.println("Press 1 for Male || 2 for Female :");
        return Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return getID() + ". " + getName() + " " + getAge() + " years old, is " + getGender() + " " + getImew().mew();
    }


}

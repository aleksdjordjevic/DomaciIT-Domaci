import rs.itbootcamp.dao.*;
import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.UserModel;

import java.util.Scanner;

public class Test {
    private static FoodModel userNewFood(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite id: ");
        int id = sc.nextInt();
        System.out.println("Unesite name: ");
        String name = sc.next();
        System.out.println("Unesite kcal: ");
        double kcal = sc.nextDouble();
        System.out.println("Unesite proteine: ");
        double proteins = sc.nextDouble();
        System.out.println("Unesite UH: ");
        double carbs = sc.nextDouble();
        System.out.println("Unesite masti: ");
        double fats = sc.nextDouble();
        return new FoodModel(id,name,kcal,proteins,carbs,fats);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodDao fd = new FoodDaoSQL();
        MealDao md = new MealDaoSQL();
        UserDao ud = new UserDaoSQL();

        // ud.add(new UserModel(1,"Pera","pera@gmail.com","123456",true));
        // ud.add(new UserModel(2,"Zika","zika@gmail.com","password",false));
        // ud.add(new UserModel(3,"Ana","ana@gmail.com","654321",true));
        // ud.add(new UserModel(4,"Lana","lana@gmail.com","sifra1",false));

        // dfyuiog8179fvg12hfr98o723g4fv7891g34rv07891234frg7891234gf298037fg278f94g287fg
        // dufy28fg41287fg2387fg246387fg2836fg23847rtg23487fg23874frg3874g287frg27fg387f4

        // Rainbow tables
        // 123456  -> dfyuiog8179fvg12hfr98o723g4fv7891g34rv07891234frg7891234gf298037fg278f94g287fg
        // 1234567 -> dufy28fg41287fg2387fg246387fg2836fg23847rtg23487fg23874frg3874g287frg27fg387f4
        // sifra   ->

        // CS50
        // Cezar - aaaabbbb 2  ->  ccccdddd
        // V.    - aaaabbbb cd ->  dedeefef

        System.out.println("Unesite email ili username: ");
        String entry = sc.next();
        System.out.println("Unesite password: ");
        String pw = sc.next();

        if(ud.login(entry,pw)){
            System.out.println("USPESNO");

        }
        else{
            System.out.println("NEUSPESNO");
        }


        // System.out.println(md.getAllMeals());
        // md.insert(new MealModel(1,"Ime jela","Opis","5"));
        // md.delete(1);
        // md.insert(new MealModel(5,"23423432","dsfsd","1"));
        // md.update(new MealModel(5,"Paprikas","Posni","4"));
        // md.insert(new MealModel(6,"sdfasdjhf","12312","2"));
        // System.out.println(fd.getFood(15496));

        // for(int i = 1; i < 5; i++){
        //     fd.insert(new FoodModel(i,"Name"+i,200+i*13.7,0.5*i+2,1,2));
        // }

        // 1, 3, 15496  -> 5
        // fd.addToMeal(5,1,213.5);
        // fd.addToMeal(5,3,45.2);
        // fd.addToMeal(5,15496,564);

        // System.out.println(md.getMeal(5));
        //
        //
        // String menu = """
        //         0. Exit
        //         1. Dodaj u tabelu Food
        //         2. Prikazi tabelu Food
        //         3. Izbrisi hranu
        //         """;
        //
        // int choice = 5;
        // while(choice != 0){
        //     System.out.println(menu);
        //     choice = sc.nextInt();
        //     switch(choice){
        //         case 0:
        //             break;
        //         case 1:
        //             fd.add(userNewFood());
        //             break;
        //         case 2:
        //             System.out.println(fd.getAllFood());
        //             break;
        //         case 3:
        //             System.out.println("Unesite id za brisanje: ");
        //             int id = sc.nextInt();
        //             fd.delete(id);
        //             System.out.println("Uspesno brisanje");
        //             break;
        //     }
        // }



    }
}

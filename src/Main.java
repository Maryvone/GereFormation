import com.maryvone.gereformation.dao.PersonnelDAO;
import com.maryvone.gereformation.model.Personnel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        try {
            create();
        } catch (Exception e) {
            e.printStackTrace();
        }
        afficheResult();

    }
    public static void create() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Personnel");
        System.out.println("Quel est le nom");
        String nom = scanner.nextLine();
        System.out.println("Quel est le prénom?");
        String prenom = scanner.nextLine();
        System.out.println("Quel est le nom d'utilisateur?");
        String utilisateur= scanner.nextLine();
        System.out.println("Quel est le mot de passe");
        String mdp = scanner.nextLine();
        System.out.println("Quel sera le role?");
        String role = scanner.nextLine();
        System.out.println("Quel sera l'email?");
        String email = scanner.nextLine();
        Personnel personnel = new Personnel(nom,prenom,utilisateur,mdp,email,role);
        try {
            PersonnelDAO.create(personnel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public static void afficheResult (){
         ArrayList<Personnel> resultat = PersonnelDAO.findAll();
         for (Personnel personnel : resultat) {
             personnel.affDesc();
         }

     }

}

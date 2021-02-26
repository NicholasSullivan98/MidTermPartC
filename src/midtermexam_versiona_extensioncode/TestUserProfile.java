/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author nicho
 */
public class TestUserProfile{
    
    public static void main (String args[]){
        System.out.println("Enter you're name:");
        Scanner in = new Scanner (System.in);
        String name = in.nextLine();
        System.out.println("Pick a Movie genre: ");
        System.out.println("1. Comedy");
        System.out.println("2. Drama");
        System.out.println("3. Action");
        System.out.println("4. Mystery");
        in = new Scanner (System.in);
        String genre = in.nextLine();
        UserProfile user1 = new UserProfile(name, genre);
        System.out.println("User Profile created.");
    }
}

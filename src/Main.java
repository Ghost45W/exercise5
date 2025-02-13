import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.Files.size;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person bill = new Person("bill", "bill34@gmail.com");
        Person phil = new Person("phil", "phil34@gmail.com");
        Person will = new Person("will", "will34@gmail.com");

        AdressBook bigBookOfAdress = new AdressBook(new ArrayList<Person>());
        int userInput = 0;
        while (userInput != 4) {
                System.out.println("(1) - Add a Contact");
                System.out.println("(2) - Remove a Contact");
                System.out.println("(3) - Search Contacts");
            System.out.println("(4) - Exit Program");
                System.out.println("What would you like to do?");

                userInput = input.nextInt();
                input.nextLine();

            if (userInput == 1){
                System.out.println("What is the name of the contact you would like to add?");
                String name = input.nextLine();
                System.out.println("What is the email of the contact you would like to add?");
                String email = input.nextLine();
                bigBookOfAdress.addPerson(new Person(name,email));
                userInput = 0;
            }
            if (userInput == 2){
                bigBookOfAdress.displayContacts();
                System.out.println("What contact would you like to remove?");
                String name = input.nextLine();
                System.out.println("What is the email of the contact you would like to remove?");
                String email = input.nextLine();
                bigBookOfAdress.removePerson(new Person(name,email));
                userInput = 0;
            }
            if (userInput ==3){
                bigBookOfAdress.displayContacts();
                userInput = 0;
            }
        }


    }
}
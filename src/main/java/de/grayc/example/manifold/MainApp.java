package de.grayc.example.manifold;


import de.grayc.example.manifold.json.Person;
import de.grayc.example.manifold.properties.AppConfig;

public class MainApp {

     public static void main(String[] args) {
         Person person = Person.create("Hans", "Meier");
         System.out.println("Person: ${person.getFirstName()} ${person.getLastName()}");

         System.out.println("Our config: mode=${AppConfig.mode} level=${AppConfig.level}");

     }
}

package hw4.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//    В зооклубі створити методи, та застосувати їх
//1) додати учасника в клуб;
//2) додати тваринку до учасника клубу.
//3) видалити тваринку з власника.
//            4) видалити учасника клубу.
//5) видалити конкретну тваринку з усіх власників.
//            6) вивести на екран зооклуб.


public class ZooClub {

    private Map<Person, List<Pet>> club = new HashMap<>();;

    public void addMember(Person person){
        if (!club.containsKey(person)){
            club.put(person, new ArrayList<Pet>());
            System.out.println("\n"+person.getName()+" " + person.getSurname() + " was added to the club");
        }
        else {
            System.out.println("\n"+person.getName()+" " + person.getSurname() + " was already added to the club");
        }
    }

    public void addPetToMember(Person person,Pet pet){
        if (club.containsKey(person)){
            club.get(person).add(pet);
        }else{
            addMember(person);
            club.get(person).add(pet);
        }
        System.out.println("\n"+pet.getName() + " was added to the " + person.getName() + " " + person.getSurname());
    }

    public void deleteMember(Person person){
        if (club.containsKey(person)){
            club.remove(person);
            System.out.println("\n"+person.getName() + " " + person.getSurname() + " was deleted from the club");
        }else {
            System.out.println("\n"+person.getName() + " " + person.getSurname() + " are not club member");
        }
    }

    public void deletePetFromMember(Person person, Pet pet){
        if (club.containsKey(person)){
           if(club.get(person).contains(pet)){
               club.get(person).remove(pet);
               System.out.println("\n"+pet.getName() + " was deleted from " + person.getName() + " " + person.getSurname());
           }else {
               System.out.println("\n"+person.getName() + " " + person.getSurname() + " are not owner of " +pet.getName());
           }
        }else {
            System.out.println("\n"+person.getName() + " " + person.getSurname() + " are not club member");
        }
    }

    public void deletePetFromAllMembers(Pet pet) {
        for (List<Pet> pets : club.values()) {
            pets.removeIf(existingPet -> existingPet.equals(pet));
        }
        System.out.println("\n"+ pet.getName() + " was deleted from thr all club members");
    }


    public void showAllClub(){
        System.out.println("\n"+"/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println("\n"+"Club members : ");

        for (Map.Entry<Person, List<Pet>> d  : club.entrySet()) {
            Person person = d.getKey();
            List<Pet> pets = d.getValue();

            if(pets.isEmpty()){
                System.out.println("\n"+person.getName() + " " + person.getSurname() + " has not any pets");
            }else {
                System.out.println("\n"+person.getName() + " " + person.getSurname() +person.getId() + " has such pets : ");
                for (int i = 0; i < pets.size(); i++) {
                    System.out.println(i+1 + ". " + pets.get(i).getName());
                }
            }
        }
        System.out.println("\n"+"/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
    }

}

package hw4.task4;

public class Main {

//    Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//    В зооклубі створити методи, та застосувати їх
//1) додати учасника в клуб;
//2) додати тваринку до учасника клубу.
//3) видалити тваринку з власника.
//            4) видалити учасника клубу.
//5) видалити конкретну тваринку з усіх власників.
//            6) вивести на екран зооклуб.
//    Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//    Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку

    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();
        Person person = Person.builder().name("John").surname("Carpenter").build();
        Person person2 = Person.builder().name("Jessy").surname("Pinkman").build();
        Person person3 = Person.builder().name("Batman").surname("Batmanovenko").build();
        Person person4= Person.builder().name("Gandalf").surname("White").build();
        Person person5= Person.builder().name("Gandalf").surname("Grey").build();

        Pet pet = Pet.builder().name("Crunchy").build();
        Pet pet2 = Pet.builder().name("Lilo").build();
        Pet pet3 = Pet.builder().name("Robin").build();
        Pet pet4 = Pet.builder().name("BatGirl").build();
        Pet pet5 = Pet.builder().name("Nora").build();
        Pet pet6 = Pet.builder().name("Frodo").build();

        zooClub.addMember(person);
        zooClub.addMember(person);
        zooClub.addPetToMember(person,pet);

        zooClub.addPetToMember(person2,pet2);
        zooClub.addPetToMember(person2,pet5);

        zooClub.deleteMember(person);
        zooClub.deleteMember(person);

        zooClub.deletePetFromMember(person2,pet2);

        zooClub.addPetToMember(person3, pet3);
        zooClub.addPetToMember(person3, pet4);

        zooClub.addPetToMember(person4, pet6);
        zooClub.addPetToMember(person5, pet6);

        zooClub.deletePetFromAllMembers(pet6);

        zooClub.deletePetFromMember(person2,pet6);

        zooClub.showAllClub();
    }

}

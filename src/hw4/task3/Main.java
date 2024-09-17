package hw4.task3;


import java.util.*;

public class Main {

//    Створити клас котрий відповідає наступній моделі
//    {
//        id: 1,
//                name: 'vasya',
//            surname: 'pupkin',
//            email: 'asd@asd.com',
//            age: 31,
//            gender: 'MALE',
//            skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//    }
//    Використати композицію/агрегацію та енуми в потрібному місці.
//    Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//    Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

    public static void main(String[] args) {

        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill(LanguageType.JAVA,3));
        skills.add(new Skill(LanguageType.CSHARP,1));

        List<Skill> skills2 = new ArrayList<>();
        skills2.add(new Skill(LanguageType.JAVASCRIPT,1));
        skills2.add(new Skill(LanguageType.PYTHON,2));

        List<Skill> skills3 = new ArrayList<>();
        skills3.add(new Skill(LanguageType.RUBY,3));

        List<Skill> skills4 = new ArrayList<>();
        skills4.add(new Skill(LanguageType.JAVASCRIPT,1));
        skills4.add(new Skill(LanguageType.PYTHON,2));
        skills4.add(new Skill(LanguageType.CPLUSPLUS,2));
        skills4.add(new Skill(LanguageType.JAVA,2));
        skills4.add(new Skill(LanguageType.CSHARP,2));

        List<Skill> skills5 = new ArrayList<>();
        skills5.add(new Skill(LanguageType.TYPESCRIPT,1));
        skills5.add(new Skill(LanguageType.JAVASCRIPT,2));
        skills5.add(new Skill(LanguageType.RUBY,2));

        User user = new User(1,"Eric",10,"Cartman","kissmyass@gmail.com", GenderType.MALE,skills);
        User user2 = new User(1,"Eleanora",19,"Greyson","s@gmail.com", GenderType.FEMALE,skills2);
        User user3 = new User(1,"Lorie",30,"Lost","lost@gmail.com", GenderType.FEMALE,skills3);
        User user4 = new User(1,"Kyle",9,"Broflofsiy","brof@gmail.com", GenderType.MALE,skills4);
        User user5 = new User(1,"Lalka",43,"B","lal@gmail.com", GenderType.FEMALE,skills5);

        HashSet<User> users = new HashSet<>();
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        users.removeIf(u -> u.getGender() == GenderType.MALE);

        System.out.println("\n"+users+"\n");

        TreeSet<User> users1 = new TreeSet<>(Comparator.comparingInt(u->u.getSkills().size()));
        users1.add(user);
        users1.add(user2);
        users1.add(user3);
        users1.add(user4);
        users1.add(user5);

        System.out.println("\n"+users1+"\n");
    }
}

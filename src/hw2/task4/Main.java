package hw2.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Skill skill = new Skill();
        skill.setExp(2);
        skill.setTitle(LanguageType.JAVA);

        Skill skill1 = new Skill();
        skill1.setExp(3);
        skill1.setTitle(LanguageType.RUBY);

        Skill skill2 = new Skill(LanguageType.CPLUSPLUS,1);

        ArrayList<Skill> skills = new ArrayList<Skill>();
        skills.add(skill);
        skills.add(skill1);
        skills.add(skill2);

        User user = new User(1,"nou",20,"uon","uonnou@gmail.com",GenderType.MALE,skills);

        System.out.println(user.toString());
    }
}

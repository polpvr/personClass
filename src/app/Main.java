package app;

public class Main {

        public static void main(String[] args) {

            Person person1 = new Person("Мартін", 15, "Акробат");
            Person person2 = new Person("Алекс", 16, "Співак");
            Person person3 = new Person("Глорія", 20, "Тренер");

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);

            person1.setProfession("Актор");

            System.out.println("\n(Після оновлення професії)");
            System.out.println(person1);
        }
    }

    class Person {
        private final String name;
        private final int age;
        private String profession;

        public Person(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.profession = profession;
        }

        public void setProfession(String newProfession) {
            this.profession = newProfession;
        }

        public String toString() {
            return "Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession;
        }
    }

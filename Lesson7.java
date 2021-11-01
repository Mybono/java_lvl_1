/**
 * Java 1. Homework 7
 * 
 * @author Artur
 * @version 01.11.2021
 */

/**
 * 1. Расширить задачу про котов и тарелки с едой. 2. Сделать так, чтобы в
 * тарелке с едой не могло получиться отрицательного количества еды (например, в
 * миске 10 еды, а кот пытается покушать 15-20). 3. Каждому коту нужно добавить
 * поле сытость (когда создаем котов, они голодны). Если коту удалось покушать
 * (хватило еды), сытость = true. 4. Считаем, что если коту мало еды в тарелке,
 * то он её просто не трогает, то есть не может быть наполовину сыт (это сделано
 * для упрощения логики программы). 5. Создать массив котов и тарелку с едой,
 * попросить всех котов покушать из этой тарелки и потом вывести информацию о
 * сытости котов в консоль. 6. Добавить в тарелку метод, с помощью которого
 * можно было бы добавлять еду в тарелку.
 */

class Lesson7 {
    public static void main(String[] args) {
        Cat[] cats = { new Cat("Murzik", 15), new Cat("Gosha", 25), new Cat("Tolya", 20) };
        Plate plate = new Plate(60, 50);
        System.out.println(plate);

        // feeding cats first time
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        // adding food in the plate
        System.out.println(plate);
        plate.add(40);
        System.out.println(plate);

        // feeding cats second time
        for (Cat cat : cats) {
            cat.setFullness(false); // make the cat hungry
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite; // ability to eat for 1 time
    private boolean fullness; // satiety status

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "name = " + name + ", apetite = " + appetite + ", fullness = " + fullness;
    }
}

class Plate {
    private int volume;
    private int food;

    Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "food on plate: " + food;
    }
}
package JAVA.OOP;

class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cat {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void voice() {
        System.out.println(name + " MAU");
    }

    public void greet() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " +  owner.getName());
    }
}

/// Переопределение
class Pers extends Cat {
    public Pers (String name, int age, Owner owner) {
    super(name, age, owner); 
    }  
    @Override
    public void voice() {
        System.out.println("Я делаю МУР-МУР");
    }
}

class Siam extends Cat {
    public Siam (String name, int age, Owner owner) {
    super(name, age, owner); 
    }  
    @Override
    public void voice() {
        System.out.println("Я делаю МЯУ-МЯУ");
    }
}
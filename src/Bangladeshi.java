public class Bangladeshi extends HumanProp implements Human{

    public Bangladeshi(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
        this.Name = name;
        this.age = age;
    }

    @Override
    public void move() {
        System.out.println("[WALK] " + Name + " moves at a steady pace of 3 m/s");
        System.out.println("   They prefer walking through the bustling streets of Dhaka!");
    }

    @Override
    public void speaks() {
        System.out.println("[SPEAK] " + Name + " speaks Bengali fluently");
        System.out.println("   'Apni kemon achen?' - How are you?");
    }

    @Override
    public void eats() {
        System.out.println("[FOOD] " + Name + " enjoys traditional Bangladeshi cuisine:");
        System.out.println("   [RICE] Rice (the staple food)");
        System.out.println("   [FISH] Fresh fish from the rivers");
        System.out.println("   [NOODLES] Semay (vermicelli) for special occasions");
    }

    @Override
    public void sleeps() {
        System.out.println("[SLEEP] " + Name + " sleeps about 6 hours per day");
        System.out.println("   Early to bed, early to rise - a common lifestyle in Bangladesh!");
    }
    
}

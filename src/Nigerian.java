public class Nigerian  extends HumanProp implements Human {

    

    public Nigerian(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
        this.Name = name;
        this.age = age;
    }

    @Override
    public void move() {
        System.out.println("[RUN] " + Name + " moves energetically at 5 m/s");
        System.out.println("   Quick and agile, perfect for navigating Lagos traffic!");
    }

    @Override
    public void speaks() {
        System.out.println("[SPEAK] " + Name + " speaks multiple Nigerian languages");
        System.out.println("   English, Hausa, Yoruba, and Igbo - 'How far?' (How are you?)");
    }

    @Override
    public void eats() {
        System.out.println("[FOOD] " + Name + " loves authentic Nigerian dishes:");
        System.out.println("   [RICE] Jollof Rice (the pride of Nigeria!)");
        System.out.println("   [GRAIN] Garri (cassava flakes) - a versatile staple");
        System.out.println("   [VEG] Various local grains and vegetables");
    }

    @Override
    public void sleeps() {
        System.out.println("[SLEEP] " + Name + " enjoys a good 13 hours of sleep per day");
        System.out.println("   Rest is important in the hot Nigerian climate!");
    }
    
}

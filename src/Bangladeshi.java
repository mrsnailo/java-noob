public class Bangladeshi extends HumanProp implements Human{

    public Bangladeshi(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
        this.Name = name;
        this.age = age;
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println(Name + " Moves 3m/s ");
        
    }

    @Override
    public void speaks() {
        System.out.println(Name + " Speaks Bengali");
        
    }

    @Override
    public void eats() {
        // TODO Auto-generated method stub
        System.out.println(Name + " Eats Rice, Fish, Semay");
        
    }

    @Override
    public void sleeps() {
        // TODO Auto-generated method stub
        System.out.println(Name + " sleeps 6 Hours  a Day");
        
    }
    
}

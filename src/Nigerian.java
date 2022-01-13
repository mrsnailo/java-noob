public class Nigerian  extends HumanProp implements Human {

    

    public Nigerian(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
        this.Name = name;
        this.age = age;
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println(Name + " Moves At  5m/s ");
        
    }

    @Override
    public void speaks() {
        // TODO Auto-generated method stub
        System.out.println(Name + " Speaks Nigerian");
        
    }

    @Override
    public void eats() {
        System.out.println(Name + " Eats  Pearls, Jollof Rice , Garri");
        
    }

    @Override
    public void sleeps() {
        // TODO Auto-generated method stub
        System.out.println(Name + " sleeps 13 Hours  a Day");
        
    }
    
}

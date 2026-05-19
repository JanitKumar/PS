abstract class Pen{
    abstract void write();
    abstract void refill();
    abstract int price();
}

class ballpen extends Pen{
    public void write(){
        System.out.println("It writes beautifully");
    }
    public void refill(){
        System.out.println("It's refill costs only 5");
    }
    public int price(){
        return 10;
    }
}

class Monkey{
    public void jump(){
        System.out.println("Monkey is jumping...");
    }
    public void bite(){
        System.out.println("Monkey is biting...");
    }
}

interface BasicAnimal{
    public void eat();
    public void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Currently eating");
    }
    public void sleep(){
        System.out.println("Currently sleeping");
    }
}


public class abs {
    public static void main(String[] args){
    ballpen pentonic=new ballpen();
    pentonic.write();
    Human JK=new Human();
    JK.eat();
    JK.jump();
    }
}

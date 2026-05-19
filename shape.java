class circle{
    static final double pi=3.14;
    int radius;
    public void setRadius(int radius){
        this.radius=radius;
    }
    public double Area(){
        return pi*radius*radius;
    }
    public double volume(){
        return pi*radius*radius*height;
    }

}

class cylinder extends circle{
    int height;
    public void setHeight(int height){
        this.height=height;
    }
    @Override
    public double Area(){
          return 2*pi*radius*(radius*height);
    }
    
}




public class shape {
  public static void main(String[] args) {
    cylinder c1=new cylinder();
    c1.setHeight(22);
    c1.setRadius(7);
    System.out.println(c1.Area());
  }
}

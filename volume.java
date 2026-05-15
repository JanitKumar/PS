class cylinder{
    private int Radius;
    private int Height;

    void setPara(int Radius, int Height){
        this.Radius=Radius;
        this.Height=Height;
    }

    int getRadius(){
        return Radius;
    }

    int Height(){
        return Height;
    }

    double SurfaceArea(){
        return 2 * 3.14159 * Radius * Radius + 2 * 3.14159 * Radius * Height;
    }
}



public class volume {
    public static void main(String[] args){
        cylinder c1=new cylinder();
        c1.setPara(3,4);
        System.out.println(c1.SurfaceArea());
    }
    
}

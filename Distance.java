

public class Distance {

    public int feet;
    public int inches;
    public Distance(){
        feet=20;
        inches=36;
    }
    public Distance(int f,int i){
        feet=f;
        inches=i;
    }
    public void displayDistance(){
        System.out.println("Feet:"+feet+"\nInches:"+inches);
    }
    public static void main(String[]args){
        Distance d1=new Distance();
        d1.displayDistance();
        Distance d2=new Distance(25,56);
        d2.displayDistance();
    }
}

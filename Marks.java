public class Marks {
    public int english;
    public int math;
    public int computer;
    public Marks(){
        english=60;
        math=89;
        computer=91;

    }
    public Marks(int e,int m,int c){
        english=e;
        math=m;
        computer=c;

    }
    public void sum(){
        int sum;
        sum=english+math+computer;
        System.out.println("Sum of subjects is:"+sum);
    }
    public static void main(String[] args){
        Marks m1=new Marks();
        m1.sum();
        Marks m2=new Marks(70,80,78);
        m2.sum();

    }
}

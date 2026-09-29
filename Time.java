public class Time {
    public int hr,min,sec;
    public Time(){
        hr=6;
        min=35;
        sec=15;
    }
    public Time(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }
    public void showtime(){
        System.out.println("Hour:"+hr+"\tMinutes:"+min+"\tSeconds:"+sec);
    }
    public static void main(String[] args){
        Time t1=new Time();
        t1.showtime();
        Time t2=new Time(12,6,23);
        t2.showtime();
    }

}

public class UserData{
    String n;
    int a;
    public void d(){
        if(a<18){System.out.println(n+" is a minor");}else if(a>60){System.out.println(n+" is a senior");}else{System.out.println(n+" is an adult");}
    }
    public static void main(String args[]){
        UserData u=new UserData();u.n="Alice";u.a=25;u.d();
    }
}

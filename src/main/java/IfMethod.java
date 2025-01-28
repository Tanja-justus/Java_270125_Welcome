public class IfMethod {

    public static void main(String[] args) {

int zahl1=1;
int zahl2=2;
add(zahl1,zahl2);
int result=add(zahl1,zahl2);
System.out.println("Die Summe von " +zahl1+" + "+zahl2+" ist: "+result);




Summen.addDouble(1.2,2.2);
Double resultD= Summen.addDouble(1.2,2.2);
System.out.println(resultD);

    }




    public  static int add(int a,int b) {
      int sum=a+b;
        return sum;



    }
}



public class Throws
{
    void Division() throws ArithmeticException {
        int a=45,b=5,c;
        c = a / b;
        System.out.print("The result is : " + c);
    }
     public static void main(String[] args) {
    	 Throws T = new Throws();
         try {
            T.Division();
        }
        catch(ArithmeticException Ex) {
            System.out.print("Error : " + Ex.getMessage());
        }
        System.out.print("\nEnd of program.");
    }
}

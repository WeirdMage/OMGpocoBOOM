import java.security.PublicKey;

public class Main {

   public static void main(String[] args) throws Exception {
       Phone phone = new Phone ("Poco1500",PhonesColours.Blue, 1337000, 666);
       System.out.println(phone);
       phone.setPrice(4000);
       System.out.println(phone);
   }


}
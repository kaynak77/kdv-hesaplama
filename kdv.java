     import java.util.Scanner;
     public class kdv {
     public static void main(String[] args) {
      double tutar,kdvOranı=0.18,kdvtutar,kdvlitutar;
       
    
      
      Scanner input =new Scanner(System.in);
      System.out.println("ücret tutarını giriniz:");
      tutar =input.nextDouble();

      kdvtutar=tutar* kdvOranı;
     kdvlitutar=tutar+ kdvtutar;
     System.out.println("kdvsiz tutar:" +tutar);
     System.out.println("kdvoranı:" +kdvOranı);
     System.out.println("kdvtutarı:" +kdvtutar);
     System.out.println("kdvlitutar:" +kdvlitutar);
     



     }
       
     }
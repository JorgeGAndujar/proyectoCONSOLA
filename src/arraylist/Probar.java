
package arraylist;


public class Probar {

    public static void main(String[] args) {
       String clave = "LCVJ";
       String ingresoUsuario = "lcvj";
       if(clave.equals(ingresoUsuario)){
           System.out.println("SON IGUALES");
       }else {
           System.out.println("NO SON IGUALES");
       }
       
       String correo = "LCVJ@GMAIL.COM";
       String correoUsuario = "lcvj@gmail.com";
       if(correo.equalsIgnoreCase(correoUsuario)){
           System.out.println("SON IGUALES");
       }else {
           System.out.println("NO SON IGUALES");
       }
    }
    
}

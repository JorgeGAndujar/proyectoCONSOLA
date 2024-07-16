
package archivos_csv;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Escritura {

    public static void main(String[] args) {
         //ESCRITURA DE UN ARCHIVO TEXTO
        File f;//CONVERTIR EL ARCHIVO FISICO
        FileWriter fw;//ABRIR UNA CANALETA DE COMUNICACIÓN(ORIGEN-DESTINO)
        BufferedWriter bw;//ESCRIBIR 
        String fila = "";
        
        int[] n1 = {2,4,5};
        int[] n2 = {3,5,6};
        int[] n3 = {5,6,7};
        int[] n4 = {6,8,9};
        
        try{
            f = new File("data/NOTAS.csv");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);//escribir
            
            for(int i=0; i<n1.length; i++){
                fila = n1[i] + ";"+ n2[i] + ";"+ n3[i] + ";"+ n4[i];//csv
                bw.write(fila +"\r\n");  
            } 
            bw.flush();//GRABA EN DISCO(archivo)
        }catch(Exception e){
            System.out.println("ERROR: "+ e.getMessage());
        }
    }
    
}

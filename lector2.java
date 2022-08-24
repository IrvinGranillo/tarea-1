package com.mycompany.tarea1redessociales;

import java.util.Scanner;


/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
*/


public class lector2{

    public static void main(String[] args) {
         String tabla[][]=new String[19][15];
    
      //  String archivo = "C:\\Users\\ijgm9\\OneDrive\\Escritorio\\redes.csv";
 // BufferedReader lector = null;
 // String texto = "";
  
  
 // String tabla[][]=new String [15][19];
  //int filas=0;
  //int columna=0;
  
 /* try {
   lector = new BufferedReader(new FileReader(archivo));
   while((texto = lector.readLine()) != null) {
    
    String[] row = texto.split(", "); 
    for(String index : row) {
     System.out.printf("%-10s", index);
    // tabla[columna][filas]=index;
      //System.out.println(tabla[columna][filas]);
  
    }
    System.out.println();
   // filas++;
    //columna=0;
   }
  }
  catch(Exception e) {
   e.printStackTrace();
  }
  finally {
   try {
    lector.close();
   } catch (IOException e) {
    e.printStackTrace();
   }
  } 
  
 /* for(int i=0;i<14;i++){
       for(int j=0;i<18;j++){
           System.out.print("["+tabla[i][j]+"]");
  }
       System.out.println("");
             
  }*/
 tabla [0] [0]="RED SOCIAL";
tabla [0] [1]="CONCEPTO";
tabla [0] [2]="AÑO";
tabla [0] [3]="ENERO";
tabla [0] [4]="FEBRERO";
tabla [0] [5]="MARZO";
tabla [0] [6]="ABRIL";
tabla [0] [7]="MAYO";
tabla [0] [8]="JUNIO";
tabla [0] [9]="JULIO";
tabla [0] [10]="AGOSTO";
tabla [0] [11]="SEPTIEMBRE ";
tabla [0] [12]="OCTUBRE";
tabla [0] [13]="NOVIEMBRE";
tabla [0] [14]="DICIEMBRE";
tabla [1] [0]="FACEBOOK";
tabla [1] [1]="SEGUIDORES";
tabla [1] [2]="2020";
tabla [1] [3]="152,107";
tabla [1] [4]="156,957";
tabla [1] [5]="160,595";
tabla [1] [6]="165,180";
tabla [1] [7]="170,488";
tabla [1] [8]="178,413";
tabla [1] [9]="0";
tabla [1] [10]="0";
tabla [1] [11]="0";
tabla [1] [12]="0";
tabla [1] [13]="0";
tabla [1] [14]="0";
tabla [2] [0]="FACEBOOK";
tabla [2] [1]="CRECIMIENTO (seguidores)";
tabla [2] [2]="2020";
tabla [2] [3]="660";
tabla [2] [4]="4,850";
tabla [2] [5]="3,638";
tabla [2] [6]="4,585";
tabla [2] [7]="5,308";
tabla [2] [8]="7,925";
tabla [2] [9]="0";
tabla [2] [10]="0";
tabla [2] [11]="0";
tabla [2] [12]="0";
tabla [2] [13]="0";
tabla [2] [14]="0";
tabla [3] [0]="FACEBOOK";
tabla [3] [1]="PORCENTAJE DE CRECIMIENTO";
tabla [3] [2]="2020";
tabla [3] [3]="0.43%";
tabla [3] [4]="3";
tabla [3] [5]="2%";
tabla [3] [6]="3%";
tabla [3] [7]="3%";
tabla [3] [8]="4%";
tabla [3] [9]="0%";
tabla [3] [10]="0%";
tabla [3] [11]="0%";
tabla [3] [12]="0%";
tabla [3] [13]="0%";
tabla [3] [14]="0%";
tabla [4] [0]="FACEBOOK";
tabla [4] [1]="PUBLICACIONES";
tabla [4] [2]="2020";
tabla [4] [3]="45";
tabla [4] [4]="53";
tabla [4] [5]="52";
tabla [4] [6]="106";
tabla [4] [7]="98";
tabla [4] [8]="64";
tabla [4] [9]="0";
tabla [4] [10]="0";
tabla [4] [11]="0";
tabla [4] [12]="0";
tabla [4] [13]="0";
tabla [4] [14]="0";
tabla [5] [0]="FACEBOOK";
tabla [5] [1]="ME GUSTA EN PUBLICACIONES";
tabla [5] [2]="2020";
tabla [5] [3]="8771";
tabla [5] [4]="9002";
tabla [5] [5]="13556";
tabla [5] [6]="15,022";
tabla [5] [7]="38953";
tabla [5] [8]="16487";
tabla [5] [9]="0";
tabla [5] [10]="0";
tabla [5] [11]="0";
tabla [5] [12]="0";
tabla [5] [13]="0";
tabla [5] [14]="0";
tabla [6] [0]="FACEBOOK";
tabla [6] [1]="PUBLICACIONES COMPARTIDAS";
tabla [6] [2]="2020";
tabla [6] [3]="2338";
tabla [6] [4]="2680";
tabla [6] [5]="2802";
tabla [6] [6]="4214";
tabla [6] [7]=" 8415";
tabla [6] [8]="4240";
tabla [6] [9]="0";
tabla [6] [10]="0";
tabla [6] [11]="0";
tabla [6] [12]="0";
tabla [6] [13]="0";
tabla [6] [14]="0";
tabla [7] [0]="FACEBOOK";
tabla [7] [1]="COMENTARIOS (USUARIOS)";
tabla [7] [2]="2020";
tabla [7] [3]="902";
tabla [7] [4]="601";
tabla [7] [5]="775";
tabla [7] [6]="1100";
tabla [7] [7]="2614";
tabla [7] [8]="1268";
tabla [7] [9]="0";
tabla [7] [10]="0";
tabla [7] [11]="0";
tabla [7] [12]="0";
tabla [7] [13]="0";
tabla [7] [14]="0";
tabla [8] [0]="TWITTER";
tabla [8] [1]="SEGUIDORES (FOLLOWERS)";
tabla [8] [2]="2020";
tabla [8] [3]="62,404";
tabla [8] [4]="63,232";
tabla [8] [5]="64,149";
tabla [8] [6]="65,410";
tabla [8] [7]="66,355";
tabla [8] [8]="67,496";
tabla [8] [9]="0";
tabla [8] [10]="0";
tabla [8] [11]="0";
tabla [8] [12]="0";
tabla [8] [13]="0";
tabla [8] [14]="0";
tabla [9] [0]="TWITTER";
tabla [9] [1]="CRECIMIENTO DE FOLLOWERS";
tabla [9] [2]="2020";
tabla [9] [3]="863";
tabla [9] [4]="828";
tabla [9] [5]="917";
tabla [9] [6]="1,261";
tabla [9] [7]="945";
tabla [9] [8]="1,141";
tabla [9] [9]="0";
tabla [9] [10]="0";
tabla [9] [11]="0";
tabla [9] [12]="0";
tabla [9] [13]="0";
tabla [9] [14]="0";
tabla [10] [0]="TWITTER";
tabla [10] [1]="PORCENTAJE DE CRECIMIENTO";
tabla [10] [2]="2020";
tabla [10] [3]="1%";
tabla [10] [4]="1%";
tabla [10] [5]="1%";
tabla [10] [6]="2%";
tabla [10] [7]="1%";
tabla [10] [8]="1%";
tabla [10] [9]="0%";
tabla [10] [10]="0%";
tabla [10] [11]="0%";
tabla [10] [12]="0%";
tabla [10] [13]="0%";
tabla [10] [14]="0%";
tabla [11] [0]="TWITER";
tabla [11] [1]="PUBLICACIONES";
tabla [11] [2]="2020";
tabla [11] [3]="77";
tabla [11] [4]="84";
tabla [11] [5]="90";


tabla [11] [6]="135";


tabla [11] [7]="127";
tabla [11] [8]="82";
tabla [11] [9]="0";
tabla [11] [10]="0";
tabla [11] [11]="0";
tabla [11] [12]="0";
tabla [11] [13]="0";
tabla [11] [14]="0";
tabla [12] [0]="TWITTER";
tabla [12] [1]="RETUITS";
tabla [12] [2]="2020";
tabla [12] [3]="563";
tabla [12] [4]="601";
tabla [12] [5]="784";
tabla [12] [6]="847";
tabla [12] [7]="1,136";
tabla [12] [8]="780";
tabla [12] [9]="0";
tabla [12] [10]="0";
tabla [12] [11]="0";
tabla [12] [12]="0";
tabla [12] [13]="0";
tabla [12] [14]="0";
tabla [13] [0]="TWITTER";
tabla [13] [1]="ME GUSTA";
tabla [13] [2]="2020";
tabla [13] [3]="1224";
tabla [13] [4]="1225";
tabla [13] [5]="1601";
tabla [13] [6]="1,994";
tabla [13] [7]="2,667";
tabla [13] [8]="2069";
tabla [13] [9]="0";
tabla [13] [10]="0";
tabla [13] [11]="0";
tabla [13] [12]="0";
tabla [13] [13]="0";
tabla [13] [14]="0";
tabla [14] [0]="TWITTER";
tabla [14] [1]="IMPACTOS";
tabla [14] [2]="2020";
tabla [14] [3]="197275";
tabla [14] [4]="220118";
tabla [14] [5]="270310";
tabla [14] [6]="311,931";
tabla [14] [7]="409,684";
tabla [14] [8]="284147";
tabla [14] [9]="0";
tabla [14] [10]="0";
tabla [14] [11]="0";
tabla [14] [12]="0";
tabla [14] [13]="0";
tabla [14] [14]= "0"; 
tabla [15] [0]="YOUTUBE";
tabla [15] [1]="VIDEOS";
tabla [15] [2]="2020";
tabla [15] [3]="1";
tabla [15] [4]="2";
tabla [15] [5]="5";
tabla [15] [6]="4";
tabla [15] [7]="4";
tabla [15] [8]="4";
tabla [15] [9]="0";
tabla [15] [10]="0";
tabla [15] [11]="0";
tabla [15] [12]="3";
tabla [15] [13]="5";
tabla [15] [14]="0";
tabla [16] [0]="YOUTUBE";
tabla [16] [1]="VISUALIZACIONES";
tabla [16] [2]="2020";
tabla [16] [3]="12,226";
tabla [16] [4]="15,605";
tabla [16] [5]="";
tabla [16] [6]="19,602";
tabla [16] [7]="19,452";
tabla [16] [8]="21,805";
tabla [16] [9]="0";
tabla [16] [10]="0";
tabla [16] [11]="0";
tabla [16] [12]="0";
tabla [16] [13]="0";
tabla [16] [14]="0";
tabla [17] [0]="YOUTUBE";
tabla [17] [1]="COMENTARIOS";
tabla [17] [2]="2020";
tabla [17] [3]="0";
tabla [17] [4]="0";
tabla [17] [5]="2";
tabla [17] [6]="0";
tabla [17] [7]="6";
tabla [17] [8]="0";
tabla [17] [9]="0";
tabla [17] [10]="0";
tabla [17] [11]="0";
tabla [17] [12]="1";
tabla [17] [13]="3";
tabla [17] [14]="0";
tabla [18] [0]="YOUTUBE";
tabla [18] [1]="ME GUSTA";
tabla [18] [2]="2020";
tabla [18] [3]="4";
tabla [18] [4]="15";
tabla [18] [5]="15";
tabla [18] [6]="8";
tabla [18] [7]="30";
tabla [18] [8]="33";
tabla [18] [9]="0";
tabla [18] [10]="0";
tabla [18] [11]="0";
tabla [18] [12]="8";
tabla [18] [13]="23";
tabla [18] [14]="0";
 for(int i=0;i<19;i++){
           for(int j=0;j<15;j++){
               System.out.print("["+tabla[i][j]+"]");
       }
           System.out.println("");
       }
 
 
 
        int respuesta=1;
        int fila;
        int mes;
        int mes2;
        while(respuesta != 0){
         Scanner sc = new Scanner(System.in);
         System.out.println("seleccione la fila a comparar"
                 + "\n 0 para terminar ");
         respuesta=sc.nextInt();
         fila=respuesta;
         System.out.println("seleccione el primer mes de comparacion");
         respuesta=sc.nextInt();
         mes=respuesta;
         System.out.println("seleccione el segundo mes");
         respuesta=sc.nextInt();
         mes2=respuesta;
            System.out.println("la diferencia es de "+
                  (Integer.parseInt(tabla[fila][mes+3])-Integer.parseInt(tabla[fila][mes2+3]))                );
        }
         
        
       }
}


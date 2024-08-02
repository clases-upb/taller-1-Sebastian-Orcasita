/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {


    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    
    public static String Convertir_km_seg(int velocidad_kmseg){

        try {
            double velocidad_ms = 0;
            double velocidad_mh = 0;
            final int factor_kmseg_ms = 1000;
            final int factor_kmseg_mh = factor_kmseg_ms * 3600;
            velocidad_ms = velocidad_kmseg * factor_kmseg_ms;
            velocidad_mh = velocidad_kmseg * factor_kmseg_mh;
            return velocidad_ms + " m/s - " + velocidad_mh + " m/h";   
        } 
        
        catch (Exception e) {
            return "Error en la conversion";
        }

    }

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
      
    public static float Convertir_cm_lt(double cc){

        try {
            float litros = 0;
            float conversion_cc_lt = 1000;
            litros = (float) (cc / conversion_cc_lt);
            return litros;
        } 
        
        catch (Exception e) {
            return 0;
        }
    }

  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   
   public static int Convertir_us_cops(int dolares){

        try {
            int pesos = 0;
            int TRM = 4170;
            pesos = dolares * TRM;
            return pesos;
        }
        
        catch (Exception e) {
            return -1;
        }

    } 
  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */

   public static float Convertir_cent_far(float centigrados){

        try {
            float grados_fahrenheit = 0;
            grados_fahrenheit = 32 + ( 9 * centigrados / 5);
            return grados_fahrenheit;
        } 
        
        catch (Exception e) {
            return 0;
        }
    }       

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */

   public static int Calcular_segs(short dias, short horas, short minutos, short segundos){
        
        try {
            
            if (dias < 0 || horas < 0 || minutos < 0 || segundos < 0) {
                System.out.println("Los valores tienen que ser positivos");
            }
            int segundos_totales = 0;
            final byte segxmin = 60;
            final byte minxhora = 60;
            final byte horaxdias = 24;
            segundos_totales = (dias * horaxdias * minxhora * segxmin) + (horas * minxhora * segxmin) + (minutos * segxmin) + (segundos);
            return segundos_totales;

        } 
        
        catch (Exception e) {
            return -1;
        }

    }

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

   public static String Calcular_peso_carga(float camion_cargado, float camion_vacio){

        try {
            float carga_neta_ton = 0;
            float carga_neta_kg = 0;
            final short kgxton = 1000;
            carga_neta_ton = camion_cargado - camion_vacio;
            carga_neta_kg = carga_neta_ton * kgxton;
            return carga_neta_kg + " kilos - " + carga_neta_ton + " toneladas";

        } 
        
        catch (Exception e) {
            return "Error en la funcion Calcular_peso_carga";
        }

    }

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */

   public static float Calcular_horasxviaje(String destino, short distancia_kms, short velocidad_prom_kmh) {

        try {
            float horas_viaje = 0;
            horas_viaje = (float)(distancia_kms / velocidad_prom_kmh);
            return horas_viaje; 
        } 
        
        catch (Exception e) {
            return -1;
        }

    }
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

   public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4){

        try {
            float combustible_total = 0;
            final float consumo_por_km = 0.2f / 60.8f;
            final float consumo_despegue = 1.2f;
            final float consumo_aterrizaje = 0.4f;
            int[] rutas = new int[4];
                rutas[0] = ruta1;
                rutas[1] = ruta2;
                rutas[2] = ruta3;
                rutas[3] = ruta4;
            for (int ruta: rutas){
                combustible_total += consumo_despegue + (ruta * consumo_por_km) + consumo_aterrizaje;
            }
            return combustible_total;
        } 
        
        catch (Exception e) {
            return -1;
        }

    }
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
   
   public static double Calcular_peso_luna(byte peso_kilos){

        try {
        
            double equivale_peso_luna = 0;
            final double conver_kg_new = 9.81; 
            final double conver_peso_luna = 0.165;
            equivale_peso_luna = (peso_kilos * conver_kg_new) * conver_peso_luna;
            return equivale_peso_luna; 

        } 
        
        catch (Exception e) {
            return 0;
        }

    }
   
}

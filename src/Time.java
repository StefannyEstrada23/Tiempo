
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author APRENDIZ
 */
public class Time {
    
    
     public void alarma(int horas, int minutos) {

        if (horas >= 1) {

            int min = (horas * 60) - 1;
            horas = min;

            for (int hora = horas; hora >= 0; hora--) {

                for (int minuto = minutos; minuto >= 0; minuto--) {
                    stop();
                    System.out.println(hora + ":" + minuto + " sec.");

                    if (hora == 0 && minuto == 0) {
                        System.out.println("Suena la alarma Levantate....");
                        break;
                    } else if (minuto == 0) {
                        minuto = 59;
                        hora--;
                    }
                }
            }
        } else {
            System.out.println("Formato no permitido");
        }
    }

    public void stop() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

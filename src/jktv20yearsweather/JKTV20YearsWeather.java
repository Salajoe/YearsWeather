/*
 ** Sozdajom zubchatqj nassiv, hranjashij temperaturu kazhdogo dnja v godu
 * 
 * 
 */
package jktv20yearsweather;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV20YearsWeather {
    public static enum Month{
        Январь, Февраль, Март, Апрель, Май, Июнь,Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        int min = -20, max = 20, dayInMonth = 0; 
        Random random = new Random();
        // Sozdajom zubchatqj nassiv iz 12 strok
        int[][] yearsWeather = new int[12][];
        System.out.print("             ");
        for (int i = 0; i < 31; i++) {
            System.out.printf("%4d", i+1);
        }
        System.out.println();
   //    System.out.print("      ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < 12; i++){
            switch (i) {
                case 0: min = -20; max = -5; dayInMonth = 31; break;
                case 1: min = -20; max = -5; dayInMonth = 28; break;
                case 2: min = -15; max = 5; dayInMonth = 31; break;
                case 3: min = -10; max = 10; dayInMonth = 30; break;
                case 4: min = -5; max = 15; dayInMonth = 31; break;
                case 5: min = 5; max = 20; dayInMonth = 30; break;
                case 6: min = 10; max = 30; dayInMonth = 31; break;
                case 7: min = 10; max = 25; dayInMonth = 31; break;
                case 8: min = 0; max = 20; dayInMonth = 30; break;
                case 9: min = -5; max = 10; dayInMonth = 31; break;
                case 10: min = -10; max = 5; dayInMonth = 30; break;
                case 11: min = -15; max = 0; dayInMonth = 31; break;
                
            }
            //Добавляем в строку месяца ячейки дней
            yearsWeather[i] = new int[dayInMonth];
    
            System.out.printf("%11s: ", Month.values()[i]);
            for (int j = 0; j < yearsWeather[i].length; j++){
               //Инициируем 
                yearsWeather[i][j] = random.nextInt(max - min +1) + min;
                System.out.printf("%4d",yearsWeather[i][j]);
            }
            System.out.println();
        }
      
    }
} 

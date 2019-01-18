/**
 * El programa asimila los comportamientos de un Radio
 * @author Andy Castillo y Cristina Bautista
 * Carne: 18040 y 161260
 * @version 18/01/2019
 */

import java.util.Scanner;

/**
 * Este es el main que contiene el ciclo el cual al ejecutarse creara el radio con las especificaciones
 */
public class Main {

    /**
     * Este es uno de los dos menus (metodo), este se utiliza cuando el radio empiece apagado,
     * lo que hara es desplegar la opcion de poder encender el radio
     * @return el String del menu
     */
    public static String menuOff(){
        String menu = "";
        menu += "Presione e para encender el radio\n";
        return menu;
    }

    /**
     * Este es el otro menu (metodo), despliega todas las tareas que puede hacer el radio
     * @return el String del menu
     */
    public static String menuOn(){
        String menu = "";
        menu += "Presione e para apagar el radio\n";
        menu += "Presione s para cambiar de frecuencia\n";
        menu += "Presione d para cambiar de estacion\n";
        menu += "Presione c para guardar una estacion en un boton\n";
        menu += "Ingrese el numero del boton para cambiar su estacion favorita\n";
        return menu;
    }

    /**
     * Este es el main donde realizara todas las tareas, como cambiar de frecuencia,
     * subir o bajar de estacion dependiendo de la frecuencia
     * Guardara las estaciones en los botones
     * @param args
     */
    public static void main (String args[]){
        Radio radio = new RadioImp();
        while (4 < 5) {
            Scanner input = new Scanner(System.in);
            if (!radio.getState()){
                System.out.println(radio);
                System.out.println(menuOff());
                System.out.println("Ingrese la opcion que desea realizar\n");
                String option = input.nextLine();
                if (option.equals("e")){
                    radio.toggle();
                }
            }else {
                System.out.println(radio);
                System.out.println(menuOn());
                System.out.println("Ingrese la opcion que su corazon anhele\n");
                String option = input.nextLine();
                switch (option) {
                    case "e": radio.toggle();
                        break;
                    case "s": radio.changeFrequency();
                        break;
                    case "d":
                        boolean subirEstacion;
                        System.out.println("Desea subir de estacion? (si o no)\n");
                        String answer = input.nextLine();
                        if (answer.equals("si")){
                            subirEstacion = true;
                            radio.changeStation(subirEstacion);
                        } else if (answer.equals("no")){
                            subirEstacion = false;
                            radio.changeStation(subirEstacion);
                        }else {
                            System.out.println("Opcion invalida");
                        }
                        break;
                    case "c":
                        System.out.println("Ingrese el numero del boton donde desea guardar la estacion\n");
                        int numero = input.nextInt();
                        radio.saveStation(numero);
                        break;
                    case "1":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "2":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "3":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "4":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "5":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "6":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "7":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "8":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "9":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "10":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "11":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;
                    case "12":
                        radio.changeStationButton(Integer.parseInt(option));
                        break;


                }
            }
        }
    }

}


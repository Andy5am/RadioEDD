public class RadioImp implements Radio {
    /**
     *Esta es la clase que implementa los metodos de la interface
     */
    private boolean state;
    private boolean frecuency;
    private double station;
    private double[] buttonAM = new double[12];
    private double[] buttonFM = new double[12];

    /**
     * Este es el constructor de la clase Radio, inicializa la clase Radio
     */
    public RadioImp(){
        this.state = false;
        this.frecuency = true;
        this.station = 87.9;
    }

    /**
     * Este metodo lo usamos para cambiar de encendido a apagado
     */
    public void toggle(){
        this.state = !this.state;
    }

    /**
     *Este metodo se devuelve si esta encendido o apagado
     * @return
     */
    public boolean getState() {
        return state;
    }

    /**
     * Este metodo cambia de AM a FM y viceversa
     */
    public void changeFrecuency(){
        this.frecuency = !this.frecuency;
        if (this.frecuency) {
            this.station = 87.9;
        } else {
            this.station = 530;
        }
    }

    /**
     * Este metodo aumenta o disminuye la estacion, el parametro nos dice si sube o si baja de estacion
     * @param up
     */
    public void changeStation(boolean up){
        if (this.frecuency){
            if (up){
                this.station = this.station + 0.2;
                if (this.station > 107.9){
                    this.station = 87.9;
                }
            }
            else {
                this.station = this.station -0.2;
                if (this.station < 87.9){
                    this.station = 107.9;
                }
            }
        }
        else {
            if (up){
                this.station = this.station + 10;
                if (this.station > 1610){
                    this.station = 530;
                }
            }
            else{
                this.station = this.station -10;
                if (this.station < 530){
                    this.station = 1610;
                }
            }
        }
    }

    /**
     * Este metodo nos devuelve si esta en AM o FM
     * @return
     */
    public boolean getFrecuency(){
        return frecuency;
    }

    /**
     * Este metodo hace que se guarde una estacion
     * @param numButton
     */
    public void saveStation(int numButton){
        if (this.frecuency){
            this.buttonFM[numButton-1] = this.station;
        }
        else {
            this.buttonAM[numButton-1] = this.station;
        }
    }

    /**
     * Este metdo hace que se guarde el boton y el boton contiene la estacion que se quiere guardar
     * @param numButton
     */
    public void changeStationButton(int numButton){
        if (this.frecuency){
            this.station = this.buttonFM[numButton-1];
        }
        else {
            this.station = this.buttonAM[numButton-1];
        }
    }

    /**
     * Este metodo devuelve la estacion ya sea de AM o FM
     * @return
     */
    public double getStation(){
        return station;
    }

    /**
     * Este metodo que demuestra como esta conformada la radio
     * @return
     */
    @Override
    public String toString() {
        String str = "";

        String strFre = "";
        if (this.frecuency){
            strFre = "FM";
        }else{
            strFre = "AM";
        }

        if (this.state){
            str = "\tEncendido\n";
            str += "Estacion: "+this.station+"\n";
            str += "Frecuencia: "+strFre+"\n";
            str += "|1| |2| |3| |4| |5| |6|\n";
            str += "|7| |8| |9| |10| |11| |12|\n";

        }else {
            str = "\t Apagado\n";
        }
        return str;


    }
}

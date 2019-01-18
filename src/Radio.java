/**
 * Esta es la interface de Radio donde se especifica lo que debe hacer la Radio
 */
public interface Radio {
    public void toggle();
    public boolean getState();
    public void changeFrequency();
    public void changeStation(boolean up);
    public boolean getFrequency();
    public void saveStation(int numButton);
    public void changeStationButton(int numButton);
    public double getStation();
}


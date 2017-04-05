package practice170326;
abstract class Speaker {
    private int volumeRate;
    public void showCurrentState() {
        System.out.println("���� ũ��: " + volumeRate);
    }
    public void setVolume(int vol) {
        volumeRate=vol;
    }
    
public abstract void setBaseRate(int base);
}

class BaseEnSpeaker extends Speaker
{
    private int baseRate;
    public void showCurrentState() {
        super.showCurrentState();
        System.out.println("���̽� ũ��: " + baseRate);
    }
    public void setBaseRate(int base) {
        baseRate=base;
    }
}
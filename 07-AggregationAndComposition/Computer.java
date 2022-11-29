
public class Computer {
    
    private String rodzajSystemuOperacyjnego;
    private String kolorObudowy;
    private boolean isOn;
    private Processor processor;

    public void wlaczKomputer(){
        isOn = !isOn;
    }

    public void zmienTapete(){

    }

    public void uruchomProgram(){

    }

    public void aktualizujSystem(){

    }

    public Computer(String rodzajSystemuOperacyjnego, String kolorObudowy, boolean isOn){
        this.rodzajSystemuOperacyjnego = rodzajSystemuOperacyjnego;
        this.kolorObudowy = kolorObudowy;
        this.isOn = isOn;
        this.processor = new Processor("Intel", 3, 5, "1111");
    }

    public String toString(){
        return rodzajSystemuOperacyjnego + kolorObudowy + isOn;
    }
}

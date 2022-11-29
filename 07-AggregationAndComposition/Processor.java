public class Processor{

    public String nazwa;
    public double taktowanie;
    public int liczbaRdzeni;
    public String socket;


    public int sumujLiczby(int a, int b){
        return a + b;
    }

    public double dzielLiczby(int a, int b){
        return a/b;
    }

    public int odejmijLiczby(int a, int b){
        return a-b;
    }

    public int pomnozLiczby(int a, int b){
        return a*b;
    }

    public String toString(){
        return nazwa+ taktowanie + liczbaRdzeni + socket;
    }

    // public Processor(String nazwa, double taktowanie, int liczbaRdzeni, String socket){
    //     this.nazwa = nazwa;
    //     this.taktowanie = taktowanie;
    //     this.liczbaRdzeni = liczbaRdzeni;
    //     this.socket = socket;
    // }

}
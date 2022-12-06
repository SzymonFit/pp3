public class Audiobook extends Book{
    int minute;
    int seconds;

    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Audiobook(String title, String author, int minute, int seconds){
        super(title, author);
        this.minute = minute;
        this.seconds = seconds;
    }

    public void display(){
        System.out.println(title + author + minute + seconds);
    }
}

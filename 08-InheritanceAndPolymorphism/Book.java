public class Book{

    String title;
    String author;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    } 

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void display(){
        System.out.println(getTitle() + getAuthor());
    }



}
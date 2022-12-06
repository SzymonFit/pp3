public class Ebook extends Book{
    
    String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Ebook(String title, String author, String filename){
        super(title, author);
        this.filename = filename;
    }

    public void display(){
        System.out.println(author + title + filename);
    }
}

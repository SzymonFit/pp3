public class CinemaTicket{
    static String cinemaName = "Kino";
    String filmTitle;
    int row;
    String seat;
    int price;
    
    public void displayData(){
        System.out.println("Ticket for: " + filmTitle + " in " + cinemaName + ", row: " + row + ", seat" + seat +", price: " + price);
    }
    
    public double calculatePrice(){
        if (row <= 2){
            price = 10;
        }else{
            price = 25;
        }
        return price;
    }

    
    public static void main(String[] args) {
    CinemaTicket t1 = new CinemaTicket();
    t1.filmTitle = "Harry Potter";
    t1.row = 5;
    t1.seat = "11";
    t1.price = 30;
    t1.displayData();
        
    CinemaTicket t2 = new CinemaTicket();
    t2.filmTitle = "Transformers";
    t2.row = 10;
    t2.seat = "2";
    t2.price = 50;
    t2.displayData();
    }
    public CinemaTicket(String filmTitle, int row, String seat){
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
    }
}

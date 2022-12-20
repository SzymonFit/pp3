public class SMS extends Message{
    
    private String phoneNumReceiv;

    public String getPhoneNumReceiv() {
        return phoneNumReceiv;
    }

    public void setPhoneNumReceiv(String phoneNumReceiv) {
        this.phoneNumReceiv = phoneNumReceiv;
    }

    public SMS(String phoneNumReceiv){
        this.phoneNumReceiv = phoneNumReceiv;

    }
    public SMS(String text, String phoneNumReceiv){
        super(text);
        this.phoneNumReceiv = phoneNumReceiv;
    }

    public int charNumber(){
        return getText().length();
    }

    public String send(){
        return "Message: " + getText() +" send to: " + getPhoneNumReceiv();
    }

    public static void main(String[] args) {
        SMS s = new SMS("123456789");
        s.setText("Hello");
        System.out.println(s.charNumber());
        System.out.println(s.send());

        SMS s2 = new SMS("Proba", "987654321");
        System.out.println(s2.send());
    }


}

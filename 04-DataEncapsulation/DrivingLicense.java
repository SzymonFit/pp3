public class DrivingLicense {

    public String driverName;
    public String driverSurname;
    public String driverAddress;
    public String postalCode;
    public String city;
    public String licenseNumber;
    public int yearOfIssue;
    public String licenseCategory;

    //setters and getters

    public void setDriverName (String name) {
        this.driverName = name;
    }

    public String getDriverName (){
        return driverName;
    }

    public void setDriverSurname (String surname) {
        this.driverSurname = surname;
    }
    
    public String getDriverSurname () {
        return driverSurname;
    }

    public void setPostalCode (String address) {
        this.driverAddress = address;
    }

    public String getPostalCode () {
        return driverAddress;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public String getCity () {
        return city;
    }

    public void setLicenseNumber (String number) {
        this.licenseNumber = number;
    }

    public String getLicenseNumber () {
        return licenseNumber;
    }

    public void setYearOfIssue (Integer year) {
        this.yearOfIssue = year;
    }

    public int getYearOfIssue () {
        return yearOfIssue;
    }
    
    public void setLicenseCategory (String license) {
        this.licenseCategory = license;
    }

    public String getLicenseCategory () {
        return licenseCategory;
    }
    
    public String toString () {
        return getDriverName() + " " + getDriverSurname() + " " + getYearOfIssue();
    }


    public static void main(String[] args){
        DrivingLicense d1 = new DrivingLicense();
        d1.setDriverName("Mateusz");
        d1.setDriverSurname("Kowalski");
        System.out.println(d1.getDriverName());
        System.out.println(d1.getDriverSurname());
    }
}

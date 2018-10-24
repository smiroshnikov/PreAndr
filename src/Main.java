public class Main {
    public static void main(String[] args) {

        //DeskPhone sergeiMPhone; // this is a valid instantiation as well
        // interface usage

        ITelephone sergeiMPhone;
        sergeiMPhone = new DeskPhone(54686445);

        sergeiMPhone.powerOn();
        boolean flag = sergeiMPhone.callPhone(54686445);
        System.out.println("the phone ring status is :" + flag);

        sergeiMPhone.answer();

        //the line below is POSSIBLE only because they share same interface
        sergeiMPhone = new MobilePhone(234456);
        sergeiMPhone.powerOn();
        sergeiMPhone.callPhone(234456);

    }
}

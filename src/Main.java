public class Main {
    public static void main(String[] args) {
        //DeskPhone sergeiMPhone;

        // interface usage
        
        ITelephone sergeiMPhone;
        sergeiMPhone = new DeskPhone(54686445);

        sergeiMPhone.powerOn();
        sergeiMPhone.callPhone(54686445);
        sergeiMPhone.answer();


    }
}

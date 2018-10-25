package phone;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Phone is powered up ... ");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + "on a mobile phone");
        } else {
            System.out.println("Phone is OFF !");
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody Playing .....!");
        } else {
            isRinging = false;
            System.out.println("Mobile Phone turned off or number is different");
        }
        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void answer() {
        System.out.println("Answering mobile phone");
        isRinging = false;
    }
}

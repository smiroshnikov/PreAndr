package phone;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action , dial phone does not have power button !");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + "on deskphone");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring ring !");
        } else {
            isRinging = false;
        }
        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void answer() {
        System.out.println("Answering desk phone");
        isRinging = false;
    }
}

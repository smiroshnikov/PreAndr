package chckArrays;

public class recall {
    public static void main(String[] args) {
        Resume[] storage = new Resume[1000];

        System.out.println(storage.length);
        System.out.println(storage[0]);

        Resume r1 = new Resume();
        r1.uuid = "123";
        Resume r2 = new Resume();
        r2.uuid = "234";
        Resume r3 = new Resume();
        r3.uuid = "345";

        Resume r4 = new Resume();
        r4.uuid = "456";

        Resume r5 = new Resume();
        r5.uuid = "567";

        Resume r6 = new Resume();
        r6.uuid = "678";

        Resume r7 = new Resume();
        r7.uuid = "789";

        Resume r8 = new Resume();
        r8.uuid = "890";

        Resume r9 = new Resume();
        r9.uuid = "999";

        Resume r10 = new Resume();
        r10.uuid = "000";


        storage[0] = r1;
        storage[1] = r2;
        storage[2] = r3;
        storage[3] = r4;
        storage[4] = r5;
        storage[5] = r6;
        storage[6] = r7;
        storage[7] = r8;
        storage[8] = r9;


        if (storage[0] == null) {
            storage[0] = r1;
        } else
            for (Resume r : storage) {
                if (r == null) {
                    r = r1;
                }
            }

        for (Resume r : storage) {
            if (r ==null){
                break;
            }
            System.out.println(r.toString());
        }


    }
}

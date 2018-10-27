package chckArrays;


public class recall {


    private static boolean ifEmpty(Resume[] resumes) {
        boolean empty = true;

        for (Resume resume : resumes)
            if (resume != null) {
                empty = false;
                break;
            }
        return empty;
    }

    public static void main(String[] args) {
        Resume[] storage = new Resume[3];

        Resume r1 = new Resume();
        r1.uuid = "123";
//        Resume r2 = new Resume();
//        r2.uuid = "234";
//        Resume r3 = new Resume();
//        r3.uuid = "345";
//
//        Resume r4 = new Resume();
//        r4.uuid = "456";
//
//        Resume r5 = new Resume();
//        r5.uuid = "567";
//
//        Resume r6 = new Resume();
//        r6.uuid = "678";
//
//        Resume r7 = new Resume();
//        r7.uuid = "789";
//
//        Resume r8 = new Resume();
//        r8.uuid = "890";
//
//        Resume r9 = new Resume();
//        r9.uuid = "999";
//
//        Resume r10 = new Resume();
//        r10.uuid = "000";
//
//
        storage[0] = r1;
//        storage[1] = r2;
//        storage[2] = r3;
//        storage[3] = r4;
//        storage[4] = r5;
//        storage[5] = r6;
//        storage[6] = r7;
//        storage[7] = r8;
//        storage[8] = r9;

        //System.out.println(ifEmpty(storage));
        for (Resume resume : storage) {
            if (resume == null){
                System.out.println("null");
            }
            else {
                System.out.println(resume.toString() + " <----here!");
            }
        }
    }
}

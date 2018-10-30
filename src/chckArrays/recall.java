package chckArrays;


public class recall {


    private static boolean ifEmpty(Resume[] resumes) {
        boolean empty = true;

        for (Resume resume : resumes) {
            if (resume != null) {
                empty = false;
                System.out.printf("Storage is NOT empty \n");
                break;
            }
        }
        if (empty) {
            System.out.printf("Storage is EMPTY!\n");
        }

        return empty;
    }

    public static void addResume(Resume[] storage, int place, String uuid) {

        Resume r = new Resume();
        storage[place] = r;
        storage[place].uuid = uuid;
    }


    public static void main(String[] args) {

        Resume[] storage = new Resume[10];
        ifEmpty(storage);

        addResume(storage, 0, "3242");
        addResume(storage, 1, "32a2");
        addResume(storage, 2, "334232");
        addResume(storage, 3, "32dfdg");
        addResume(storage, 4, "3240002");
        addResume(storage, 5, "3242111");
        addResume(storage, 6, "324sdcgv21");
        addResume(storage, 7, "3242345df_45435");


        for (Resume resume : storage) {
            if (resume == null) {
                System.out.println("null");
            } else {
                System.out.println(resume.toString() + " <----here!");
            }
        }
        ifEmpty(storage);
    }
}

// find the rotation

public class removedSpecialCharString3 {
    public static boolean isRotation(String str1, String str2) {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAF";

        if (isRotation(str1, str2)) {
            System.out.println("Rotation is found");
        } else {
            System.out.println("rotation is not found");
        }
    }
}

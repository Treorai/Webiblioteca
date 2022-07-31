package classes;

public class pushArray {
    public static String[] push(String[] array, String push) {
    String[] newArr = new String[array.length + 1];
    System.arraycopy(array, 0, newArr, 0, array.length);
    newArr[array.length] = push;
    return newArr;
    }
}

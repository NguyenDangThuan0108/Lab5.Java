import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Object> myArrayList = new ArrayList<>();

       
        int number = 10;
        myArrayList.add(number);

        
        double decimal = 3.14;
        myArrayList.add(decimal);

       
        boolean bool = true;
        myArrayList.add(bool);

        
        String string = "Hello";
        myArrayList.add(string);

       
        for (int i = 0; i < 4; i++) {
            Object element = myArrayList.get(i);
            System.out.println("Element " + (i + 1) + ": " + element);
        }
    }
}

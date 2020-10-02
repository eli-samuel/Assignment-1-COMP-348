import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Driver {

    public static void main(String[] args) {
        Employee[] arr = new Employee[15];
        
        Scanner in;
        try {
            in = new Scanner(new FileInputStream("Records.txt"));
            int i=0;
            while (in.hasNextLine()) {
                arr[i] = Employee.parse(in.nextLine());
                System.out.println(arr[i]);
            }
            in.close();
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Stream<Employee> s = Arrays.stream(arr);


        System.out.println(Arrays.toString(s.toArray()));
    }
}

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 вид решения
        String text = "String";
        String[] array = {"A a", "B b", "C c", "D d", "E e", "F f", "G g", "H h", "I i", "J j", "K k", " l L", "M m", "N n", "O o",
                "P p", "Q q", "R r", "S s", "T t", "U u", "V v", "W w", "X x", "Y y", "Z z"};
        try (FileWriter fileWriter = new FileWriter("text.txt")) {
            for (int i = 0; i < array.length; i++) {
                fileWriter.write(array[i]+"\n");

            }
            // 2 вид решения
//                fileWriter.write(" A a \n");
//                fileWriter.write(" B b \n");
//                fileWriter.write(" C c \n");
//                fileWriter.write(" D d \n");
//                fileWriter.write(" E e \n");
//                fileWriter.write(" F f \n");
//                fileWriter.write(" G j \n");
//                fileWriter.write(" H h \n");
//                fileWriter.write(" I i \n");
//                fileWriter.write(" J j \n");
//                fileWriter.write(" K k \n");
//                fileWriter.write(" L l \n");
//                fileWriter.write(" M m \n");
//                fileWriter.write(" N n \n");
//                fileWriter.write(" O o \n");
//                fileWriter.write(" P p \n");
//                fileWriter.write(" Q q \n");
//                fileWriter.write(" R r \n");
//                fileWriter.write(" S s \n");
//                fileWriter.write(" T t \n");
//                fileWriter.write(" U u \n");
//                fileWriter.write(" V v \n");
//                fileWriter.write(" W w \n");
//                fileWriter.write(" X x \n");
//                fileWriter.write(" Y y \n");
//                fileWriter.write(" Z z \n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
       try( FileReader fileReader = new FileReader("text.txt")) {
           Scanner scanner = new Scanner(fileReader);
           int f=0;
           while (scanner.hasNext()){
               f++;
               System.out.println(f+ " : " + scanner.nextLine());
           }
       }catch (IOException e){
           System.out.println(e.getMessage());
       }



    }
}
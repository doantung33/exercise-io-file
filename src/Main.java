import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Preson>list= IOFile.read();
    AddShow addShow= new AddShow(list);
    int n;
    do {
        System.out.println("1.add");
        System.out.println("2.show");
        System.out.println("0.exit");
        n = scanner.nextInt();
        switch (n){
            case 1:
                scanner.nextLine();
                System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter year old");
                int yearOld = Integer.parseInt(scanner.nextLine());
                Preson preson= new Preson(name,yearOld);
                addShow.add(preson);
                break;
            case 2:
                addShow.show();
                break;
            case 3:
                n=0;
        }
    }while (n!=0);
}
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        System.out.println("Would you like to run (enter int):\n"+
                            "1. Varrr\n"+
                            "2. Fact\n"+
                            "3. \n"+
                            "4. \n"+
                            "5. \n");
        int choice = inp.nextInt();
        //switch
        switch (choice) {
            case 1:
                Varrrr Var = new Varrrr(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Boolean.parseBoolean(args[3]), Boolean.parseBoolean(args[3]), Boolean.parseBoolean(args[3]));
                Var.core();
                break;
            case 2:
                Fact F = new Fact(Integer.parseInt(args[0]));
                F.core();
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            default:
                break;
        }
    }
}

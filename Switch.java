import java.util.*;

class Switch{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Button Number:");
        int button = sc.nextInt();

    switch (button) {
        case 1: System.out.println("Hello");
                break;
        case 2: System.out.println("Namaste");
                break;
        case 3: System.out.println("Kaise hain>..");
                break;
        default: System.out.println("Invalid Button");
                break;
    }
        
    }
}
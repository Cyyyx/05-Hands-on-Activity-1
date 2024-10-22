import java.util.Scanner;

public class RunBloodDataPartwo {
    public static void main(String[] args) {
        Scanner cy = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
        String inputBloodtype = cy.nextLine();

        System.out.print("Enter the Rhesus Factor (+ or -): ");
        String inputRHfactor = cy.nextLine();

        BloodDataPartwo bd = new BloodDataPartwo(); 

        if (!inputBloodtype.isEmpty() && !inputRHfactor.isEmpty()) {
            bd.setBloodType(inputBloodtype);
            bd.setRhFactor(inputRHfactor);
        }

        bd.display();
    }
}
package exceptionHandeling;

import java.util.Scanner;

public class ex {
    public static void main(String[] args) throws InvalidWeightException{
        Scanner scanner = new Scanner(System.in);

        // Fill the code here
        System.out.println("Enter the number of item entries");
        int itemEntries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i<=itemEntries; i++) {
            System.out.println("Enter item " + i + " details");
            String itemDetails = scanner.nextLine();
            String[] arr = itemDetails.split(":");
            WeightValidatorUtil aa = new WeightValidatorUtil();
            try {
                if (aa.validateItemWeight(Integer.parseInt(arr[2]))) {
                    System.out.println("Stock successfully updated");
                }
            }
            catch (InvalidWeightException a) {
                System.out.println(a);
            }
        }
    }
}



class InvalidWeightException extends Exception
{
    public InvalidWeightException(String message)
    {
        super(message);
    }
}


class WeightValidatorUtil {
    public boolean validateItemWeight(int itemWeight) throws InvalidWeightException {
        if (itemWeight >= 100 && itemWeight <= 5000) {
            return true;
        }
        else {
            throw new InvalidWeightException("Invalid item Weight");
        }

    }
}

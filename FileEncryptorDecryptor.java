package Level2;

import java.io.*;

public class FileEncryptorDecryptor {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // Prompt the user to choose encryption or decryption
            System.out.println("Choose an option:");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = Integer.parseInt(reader.readLine());

            // Prompt the user to input the file name or path
            System.out.print("Enter the file name or path: ");
            String fileName = reader.readLine();

            switch (choice) {
                case 1:
                    encryptFile(fileName);
                    break;
                case 2:
                    decryptFile(fileName);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1 for encryption or 2 for decryption.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void encryptFile(String fileName) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter("encrypted_" + fileName))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                StringBuilder encryptedLine = new StringBuilder();
                for (char ch : line.toCharArray()) {
                    // Simple encryption algorithm: shift each character by 1
                    char encryptedChar = (char) (ch + 1);
                    encryptedLine.append(encryptedChar);
                }
                fileWriter.write(encryptedLine.toString());
                fileWriter.newLine();
            }
            System.out.println("File encrypted successfully. Encrypted file saved as encrypted_" + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void decryptFile(String fileName) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter("decrypted_" + fileName))) {

            String line;
            while ((line = fileReader.readLine()) != null) {
                StringBuilder decryptedLine = new StringBuilder();
                for (char ch : line.toCharArray()) {
                    // Simple decryption algorithm: shift each character back by 1
                    char decryptedChar = (char) (ch - 1);
                    decryptedLine.append(decryptedChar);
                }
                fileWriter.write(decryptedLine.toString());
                fileWriter.newLine();
            }
            System.out.println("File decrypted successfully. Decrypted file saved as decrypted_" + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

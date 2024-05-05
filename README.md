### File Encryptor and Decryptor 💻🔐

This Java program allows users to encrypt and decrypt text files using a simple encryption algorithm. Below is an explanation of each part of the code:

#### Description ℹ️

The `FileEncryptorDecryptor` program provides a command-line interface for users to choose between encryption and decryption options and specify the file to process. 

#### Main Method 🚀

The `main` method serves as the entry point of the program. It prompts the user to choose between encryption and decryption and reads the user's input using `BufferedReader`.

#### Encryption and Decryption Methods 🔒

- **Encrypt File (`encryptFile`):** This method reads each line from the specified file, encrypts it using a simple algorithm (shifting each character by 1), and writes the encrypted text to a new file.

- **Decrypt File (`decryptFile`):** Similar to the encryption method, this function reads each line from the specified file, decrypts it using the reverse of the encryption algorithm, and writes the decrypted text to a new file.

#### Error Handling 🛠️

The program handles `IOExceptions` that may occur during file operations, such as file not found or permission denied, ensuring a smooth user experience.

#### Usage 💡

1. Compile the Java file: `javac FileEncryptorDecryptor.java`
2. Run the program: `java FileEncryptorDecryptor`
3. Choose between encryption (1) or decryption (2) and input the file name or path as prompted.

#### Note 📝

- The encryption algorithm used here is for demonstration purposes only and is not suitable for real-world encryption needs.




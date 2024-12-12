package file.reader.writer;

import java.io.*;

public class JavaInputOutput {
    public static void main(String[] args) throws IOException {
        /** ---Character-Oriented I/O---
         *  FileReader and FileWriter
         */

        try (FileReader fileReader = new FileReader("src/file/reader/writer/demo.txt")) {
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
/**
 * I use the true because i don't want to overwrite my code.
 */
        try (FileWriter fileWriter = new FileWriter("src/file/reader/writer/demo.txt", true)) {
            fileWriter.write(" Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
/**
 * if i don't have existing file with this name demo1.txt then FileWrite created a new file for me
 */
        try (FileWriter fileWriter = new FileWriter("src/file/reader/writer/demo1.txt", true)) {
            fileWriter.write("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         *  BufferReader: A wrapper around a Reader that buffers input to improve efficiency.
         */

        try (BufferedReader br = new BufferedReader(new FileReader("src/file/reader/writer/demo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * BufferWriter: it holds a block of data in memory before writing it to the file
         */
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/file/reader/writer/demoBufferedFile.txt", true))) {
            bw.write("Buffered Text");
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * FileInputStream; Reading Files Using FileInputStream
         */

        try (FileInputStream fis = new FileInputStream("src/file/reader/writer/demo.avif")) {
            byte[] buffer = new byte[1024]; // Buffer to store chunks of data
            int bytesRead;

            // Read the file in chunks
            while ((bytesRead = fis.read(buffer)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print(buffer[i] + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         *  FileInputStream
         */
        try (FileInputStream fis = new FileInputStream("src/file/reader/writer/demo.avif")) {
            int byteRead;  // Variable to store the byte read

            while ((byteRead = fis.read()) != -1) {
                // Print the byte as a character (or process it as needed)
                System.out.print((char) byteRead); // Assuming the file is text
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * FileOutputStream: Used to write binary data to a file,
         */

        try (FileOutputStream fos = new FileOutputStream("src/file/reader/writer/demo.avif")) {
                String text = "Hello, world!";
                fos.write(text.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
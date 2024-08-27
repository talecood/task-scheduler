package com.taskscheduler;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFiles {
	
    public static void main(String[] args) {
        // File paths for input and output files
        String inputFilePath = "C:\\Users\\nedim göktuð tabak\\Desktop\\TaskSchedulerInput.txt";
        String outputFilePath = "C:\\Users\\nedim göktuð tabak\\Desktop\\outputtest.txt";

        try (
            //BufferedReader to read from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            //BufferedWriter to write to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Write the line to the output file
                writer.write(line);
                // Add a new line in the output file after each line
                writer.newLine();
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            // Handle exceptions, such as file not found or read/write errors
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

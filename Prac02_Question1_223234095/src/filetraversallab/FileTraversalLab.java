package filetraversallab;

import filetraversallab.FileTraversal.Stats;
import static filetraversallab.FileTraversal.listFiles;
import java.io.File;

public class FileTraversalLab {
 // Main method (Step 4 & 5)
    public static void main(String[] args) {
        // Create a File object, passing the path as an argument.
        // Replace "C:\\Sandbox\\Praclab_02" with your actual test directory path.
        File folder = new File("C:\\Bachelor's Degree in Comp Eng\\BPETCP - 2nd Year\\Betech_2nd_2025\\Software Design_2_S2\\Projects\\Praclab_02");

        // Create an object of the Stats class
        Stats stats = new Stats();

        // Call the listFiles method, passing the folder, starting depth (0), and stats object
        listFiles(folder, 0, stats);

        // Print the summary statistics collected
        System.out.println("\n=== SUMMARY ===");
        System.out.println("Directories: " + stats.dirs);
        System.out.println("Files: " + stats.files);
        System.out.println("Total Size: " + stats.bytes + " bytes");
    }

}

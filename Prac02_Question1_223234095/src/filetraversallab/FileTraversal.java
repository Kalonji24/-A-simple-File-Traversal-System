package filetraversallab;

import java.io.File;

public class FileTraversal {

    // Step 5: Create a static Stats class
    static class Stats {
        long files = 0;
        long dirs = 0;
        long bytes = 0;
    }

    // Modified method as per Step 5
    public static void listFiles(File folder, int depth, Stats s) {
        // Create a File object array for the contents of the folder
        File[] files = folder.listFiles();

        // Check if the object isn't null (i.e., if it's a accessible directory)
        if (files != null) {
            s.dirs++; // Increment directory count for the current folder

            // Loop through each item in the directory
            for (File f : files) {
                String indent = "  ".repeat(depth); // Create indentation based on depth

                if (f.isDirectory()) {
                    // If it's a directory, print its name and make a recursive call
                    System.out.println(indent + "[DIR] " + f.getName());
                    listFiles(f, depth + 1, s); // Recursive call with increased depth
                } else {
                    // If it's a file, print its name with indentation and update stats
                    System.out.println(indent + "File: " + f.getName());
                    s.files++; // Increment file count
                    s.bytes += f.length(); // Add file size to total bytes
                }
            }
        } 
    }
}
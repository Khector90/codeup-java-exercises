package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;

public class fileIO {
    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath); //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void main(String[] args) throws IOException {

        Path filepath = Paths.get("./src/fileIO/wcw.txt");

        printPoem(filepath);
        // Absolute vs Relative - what's the difference?
//        Relative paths = good for our business, we want to start wiht out project root vs. a very specific user's         file system (absolute)

        Path examplePath = Paths.get("/nota/", "realpath");
        System.out.println("examplePath = " + examplePath);

//         boolean is it true or false thatsomething EXISTS where this Path object goes?

//        this is false nothing on the end of this tunnel 'path'
        System.out.println("Files.exists(examplePath) = " + Files.exists(examplePath));

//        this is true: We saw the poem earlier
        System.out.println("Files.exists(filepath) = " + Files.exists(filepath));
        System.out.println("~~~~~~~");
        System.out.println("examplePath = " + examplePath);
        System.out.println("filepath = " + filepath);

//        Alright - so, I know I can create a Path (an 'address' of sorts) for java to work with - know i can t/f is        something at the end of my path, but what else can I do


//        CRUD - Create directories/files, Reading directories/files

//        Let's make some new stuff in out project
//        Let's create: A directory and a new file for some groceries :D

//        Alright, I need a DIRECTORY to save it and a FILENAME
//        We can combine the two("/dir/file") or split it into two:
        String directory = "./src/data";

        String filename = "groceryList.txt";

        Path dataDirectory = Paths.get(directory);

        Path dataFile = Paths.get(directory, filename);

        System.out.println("dataDirectory = " + dataDirectory);
        System.out.println("dataFile = " + dataFile);


    }

}

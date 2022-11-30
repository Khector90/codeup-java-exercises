package fileIO;

import java.io.File;
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

//        Got the whole address - now let's ask java to do something at that Path

//        if(directorDoesnotExist){do stuff}
        if(Files.notExists(dataDirectory)){
            Files.createDirectories(dataDirectory);
        }

//        if(fileDoesNotExist){do more stuff}
        if(Files.notExists(dataFile)){
            Files.createFile(dataFile);
        }

//        Allright - created directories and a file for the first time, I got a file to work with - how do I                interact with this file?

//        Lets write some groceries into our groceryList.txt
//        lets get the OAth for the file first
        Path groceryListPath = Paths.get(directory, filename);

        System.out.println("Files.exists(groceryListPath) = " + Files.exists(groceryListPath));


//        That's WHERE we want to go, lets give it WHAT to send that way
        List<String> groceryList = new ArrayList<>();

        String item1 = "loaf of bread";

        groceryList.add(item1);
        groceryList.add("breakfast cereal");
        groceryList.add("cat food");
        groceryList.add("whole chicken");
        groceryList.add("asparagus");


        System.out.println("groceryList = " + groceryList);



    }

}

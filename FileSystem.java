/**
 * Work on this file for the quesiton File System.
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FileSystem {
    public static void main(String[] arg) {
        Folder root = new Folder("root");
        Folder currentFolder = root;
        Scanner scanner = new Scanner(System.in);
        do {
            String input;
            printMenu();
            currentFolder.printContent();
            switch(scanner.nextLine()) {
                case "1": input = scanner.nextLine(); //get folder name
                          currentFolder.createFolder(input); 
                          break;
                case "2": input = scanner.nextLine(); //get folder name
                          currentFolder = currentFolder.enterFolder(input);
                          break;
                case "3": input = scanner.nextLine(); //get filename
                          currentFolder.createFile(input);
                          break;
                case "4": if (currentFolder != root)
                              currentFolder = currentFolder.goUp();
                          break;
                case "Q": System.out.println("Bye");
                          return;
            }
        } while (true);
    }
    public static void printMenu() {
        System.out.println("Instruction: \n----------------");
        System.out.println("1\t Create folder");
        System.out.println("2\t Enter folder");
        System.out.println("3\t Create file");
        System.out.println("4\t Go up one folder");
        System.out.println("Q\t Exit");
    }
}

class File {
    private final String name;
    public final Folder parent;

    //Not sure how these methods can be useful to you
    //You can't change this class.
    protected Folder getThisFolder() { return parent; }
    public String getName() { return name; }
    protected Folder getParent() { return parent; }
    public String toString() { return "[File]\t" + name; }
    public File(String name, Folder parent) { 
        this.name = name; 
        this.parent=parent; 
    }

}


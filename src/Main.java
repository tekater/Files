import java.io.File;
public class Main {
    public static void main(String[] args) {
        // Terminal: new-item -path .\text.txt -value 'Hello world!'
        
        // тема урока Files
        // Windows работает с backslash '\'
        // Linux работает с slash '/'
        File fileOnLinux = new File ("/home/username/Documents");
        // Директория в UNIX системе
        File fileOnWindows = new File("C:\\Users\\user\\documents.pdf");
        // файл в Windows
        System.out.println(File.separator);
        if (File.separator.equals("\\")) {
            System.out.println("Windows");
        } else {
            System.out.print("Linux");
        }

        
        // абсолютный путь
        File file = new File("C:\\Users\\user\\IdeaProjects\\Files\\text.txt");

        // относительный путь
        File file2 = new File(".\\test.txt");

        System.out.println(file.getPath());
        System.out.println(file2.getPath());

        System.out.println(fileOnLinux.getName());
        System.out.println(fileOnWindows.getName());
        System.out.println(file.getName());
        System.out.println(file2.getName());

        // file.isDirectory() // true | false // папка или не папка
        // file.isFile() // true | false // файл или не файл
        // file.exists() // существует ли файл или папка

        System.out.println(file.getParent());
    }
}

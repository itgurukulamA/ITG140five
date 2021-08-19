import java.io.*;
public class FileNotFoundException1 {
public static void main(String rags[])
{
try
{
File file=new File("Desktop:/miracle/swethak/Demo1.txt");
FileReader fr = new FileReader(file);
}
catch(FileNotFoundException e){

System.out.println(e);
}
}
}
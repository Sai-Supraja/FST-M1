package Activities;

abstract class Book{
    String title;
    abstract void setTitle(String value);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{
public void setTitle(String value){
    title= value;
}
}
public class Activity5 {
    public static void main(String[] args){
        String title="English Novel";
        Book newNovel= new MyBook();
        newNovel.setTitle(title);
        System.out.println("The title of the book is: "+newNovel.getTitle());
    }
}

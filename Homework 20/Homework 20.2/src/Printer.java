public class Printer {
    String queue = "";
    int pagesCount = 0;
    int documentCount = 0;
    int totalDocumentsCount = 0;
    int totalPagesCount = 0;

    public void append(String documentName){
        append(documentName, "нет",1);
    }

    public  void append(String documentName, String containsText){
        append(documentName, containsText,1);
    }

    public void append(String documentName, String containsText, int pages){
        queue = queue + "\nИмя документа: " + documentName + "\nТекст документа: " + containsText + "\nКоличество страниц: " + pages;
        pagesCount = pagesCount + pages;
        documentCount++;
        totalDocumentsCount++;
        totalPagesCount = totalPagesCount + pages;
    }

    public void print(String title){
        if (queue.isEmpty()){
            System.out.print("\n" + title);
            System.out.print("\nКорзина пуста!");
            return;
        }
        System.out.print(title);
        System.out.println(queue);
        clear();
    }

    public void getPagesCount(){
        System.out.println("Общее количество страниц на печать: " + pagesCount);
    }

    public void getDocumentCount(){
        System.out.println("Общее количество документов на печать: " + documentCount);
    }

    public void printerCheck(){
        System.out.println("Количество уже распечатанных документов: " + totalDocumentsCount);
        System.out.println("Количество уже распечатанных страниц: " + totalPagesCount);
    }

    public void clear(){
        queue = "";
        pagesCount = 0;
        documentCount = 0;
    }
}
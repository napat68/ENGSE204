package Lab501;

import java.util.Scanner;

class DocumentLab511 {
    protected String title;

    public DocumentLab511(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocumentLab511 extends DocumentLab511 {
    protected int wordCount;

    public TextDocumentLab511(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocumentLab511 extends DocumentLab511 {
    protected int pageCount;

    public PDFDocumentLab511(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Lab511 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String t1Title = input.nextLine();
        int t1Words = input.nextInt();
        input.nextLine();

        String p1Title = input.nextLine();
        int p1Pages = input.nextInt();
        input.nextLine();

        String t2Title = input.nextLine();
        int t2Words = input.nextInt();
        input.nextLine();

        String p2Title = input.nextLine();
        int p2Pages = input.nextInt();

        DocumentLab511[] docs = new DocumentLab511[4];
        docs[0] = new TextDocumentLab511(t1Title, t1Words);
        docs[1] = new PDFDocumentLab511(p1Title, p1Pages);
        docs[2] = new TextDocumentLab511(t2Title, t2Words);
        docs[3] = new PDFDocumentLab511(p2Title, p2Pages);

        int totalPages = 0;

        for (DocumentLab511 d : docs) {
            d.displayDetails();

            if (d instanceof PDFDocumentLab511) {
                PDFDocumentLab511 pdf = (PDFDocumentLab511) d;
                totalPages += pdf.pageCount;
            }
        }

        System.out.println("Total Pages: " + totalPages);

        input.close();
    }
}


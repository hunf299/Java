package b2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DocManagement dm = new DocManagement();
        while (true) {
            System.out.println("Enter 1 to add new document");
            System.out.println("Enter 2 to delete document based on its id");
            System.out.println("Enter 3 to show all documents");
            System.out.println("Enter 4 to search for document based on its type");
            String num = sc.nextLine();
            switch (num) {
                case "1": {
                    System.out.println("Enter a to import a new book");
                    System.out.println("Enter b to import a new magazine");
                    System.out.println("Enter c to import a new newspaper");
                    String line = sc.nextLine();
                    switch (line) {
                        case "a": {
                            System.out.println("Enter document ID: ");
                            String docID = sc.nextLine();
                            System.out.println("Enter publisher's name: ");
                            String publisherName = sc.nextLine();
                            System.out.println("Enter the number of copy: ");
                            int copies = sc.nextInt();
                            System.out.println("Enter author's name: ");
                            sc.nextLine();
                            String authorName = sc.nextLine();
                            System.out.println("Enter the number of page: ");
                            int pageNo = sc.nextInt();
                            Book b1 = new Book(docID, publisherName, copies, authorName, pageNo);
                            dm.addDoc(b1);
                            System.out.println(b1.toString());
                            break;
                        }
                        case "b": {
                            System.out.println("Enter document ID: ");
                            String docID = sc.nextLine();
                            System.out.println("Enter publisher's name: ");
                            String publisherName = sc.nextLine();
                            System.out.println("Enter the number of copy: ");
                            int copies = sc.nextInt();
                            System.out.println("Enter release number: ");
                            int releaseNo = sc.nextInt();
                            System.out.println("Enter release month: ");
                            int releaseMonth = sc.nextInt();
                            Magazine m1 = new Magazine(docID, publisherName, copies, releaseNo, releaseMonth);
                            dm.addDoc(m1);
                            System.out.println(m1.toString());
                            break;
                        }
                        case "c": {
                            System.out.println("Enter document ID: ");
                            String docID = sc.nextLine();
                            System.out.println("Enter publisher's name: ");
                            String publisherName = sc.nextLine();
                            System.out.println("Enter the number of copy: ");
                            int copies = sc.nextInt();
                            System.out.println("Enter release day: ");
                            int releaseDay = sc.nextInt();
                            Newspaper n1 = new Newspaper(docID, publisherName, copies, releaseDay);
                            dm.addDoc(n1);
                            System.out.println(n1.toString());
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter id: ");
                    String id = sc.nextLine();
                    System.out.println(dm.deleteDoc(id));
                    break;
                }
                case "3": {
                    dm.showInfoDoc();
                    break;
                }
                case "4": {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search journal");
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "a": {
                            dm.searchDocBook().forEach(doc -> {
                                System.out.println(doc.toString());
                            });
                            break;
                        }
                        case "b": {
                            dm.searchDocMaga().forEach(doc -> {
                                System.out.println(doc.toString());
                            });
                            break;
                        }
                        case "c":
                            dm.searchDocNews().forEach(doc -> {
                            System.out.println(doc.toString());
                        });
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}

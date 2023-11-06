package b3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TuyenSinh ts = new TuyenSinh();
        while(true) {
            System.out.println("Enter 1 to add new candidate");
            System.out.println("Enter 2 to show the information and subject of candidates");
            System.out.println("Enter 3 to search candidate based on id number");
            System.out.println("Enter 4 to exit the program");
            String num = sc.nextLine();
            switch (num) {
                case "1":{
                    System.out.println("Enter a to add new block A candidate");
                    System.out.println("Enter b to add new block B candidate");
                    System.out.println("Enter c to add new block C candidate");
                    String line = sc.nextLine();
                    switch (line) {
                        case "a": {
                            System.out.println("Enter Id number: ");
                            String ID_num = sc.nextLine();
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter address: ");
                            String address = sc.nextLine();
                            System.out.println("Enter priority level: ");
                            int priority_level = sc.nextInt();
                            StudentA a1 = new StudentA(ID_num,name,address,priority_level);
                            ts.addCandidate(a1);
                            break;
                        }
                        case "b": {
                            System.out.println("Enter Id number: ");
                            String ID_num = sc.nextLine();
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter address: ");
                            String address = sc.nextLine();
                            System.out.println("Enter priority level: ");
                            int priority_level = sc.nextInt();
                            StudentB b1 = new StudentB(ID_num,name,address,priority_level);
                            ts.addCandidate(b1);
                            break;
                        }
                        case "c": {
                            System.out.println("Enter Id number: ");
                            String ID_num = sc.nextLine();
                            System.out.println("Enter name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter address: ");
                            String address = sc.nextLine();
                            System.out.println("Enter priority level: ");
                            int priority_level = sc.nextInt();
                            StudentC c1 = new StudentC(ID_num,name,address,priority_level);
                            ts.addCandidate(c1);
                            break;
                        }
                        default: {
                            System.out.println("Invalid");
                            break;
                        }
                    }
                    break;
                }
                case "2": {
                    ts.showInfoCandidate();
                    break;
                }
                case "3": {
                    System.out.println("Enter Id_num: ");
                    String id = sc.nextLine();
                    ts.searchCandidate(id).forEach(candidate -> {
                        System.out.println(candidate.toString());
                    });
                    break;
                }
                case "4": {
                    return;
                }
                default: {
                    System.out.println("Invalid");
                    continue;
                }
            }
        }
    }
}
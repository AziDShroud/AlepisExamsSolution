package nightmare_app;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException { //Menu...
       while (true){  // available options to choose from
           System.out.println("Εισάγετε επιλογή:");
           System.out.println("1. Προβολή όλων των διαθέσιμων καταγεγραμμένων μελών");
           System.out.println("2. Προσθήκη νέου μέλους");
           System.out.println("3. Αναζήτηση βάσει ονόματος");
           System.out.println("4. Αναζήτηση βάσει κωδικού");
           System.out.println("5. Επεξεργασία στοιχείων μέλους βάσει κωδικού");
           System.out.println("6. Διαγραφή μέλους βάσει κωδικού");
           System.out.println("7. Έξοδος από την εφαρμογή");
           Scanner myObj = new Scanner(System.in);
           int select = myObj.nextInt(); //asks for int from user
           switch (select){
               case 1:
                   ViewMember();
                   break;
               case 2:
                   AddMember();
                   break;
               case 3:
                   SearchMemberViaName();
                   break;
               case 4:
                   SearchMemberViaID();
                   break;
               case 5:
                   EditMemberViaID();
                   break;
               case 6:
                   DeleteMemberViaID();
                   break;
               case 7:
                   return;
               default:
                   System.out.println("Εισάγετε αριθμό από 1-7");
           }

       }
    }
    static void serializeMember(Member m){
        try {
            List<Member> MemberList = deserializeMember("member.ser"); //creating list of members by deserializing the already existing file
            FileOutputStream fileOutputStream = new FileOutputStream("member.ser");// creating new serializable file
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(m);//writing to file one member "m"
            for (Member mi : MemberList){ // rewrite the old data in the new file
                objectOutputStream.writeObject(mi);
            }
            objectOutputStream.close();
            fileOutputStream.close(); // closing file...
            System.out.println("Done!");
        } catch (FileNotFoundException e) { //in case sth goes wrong ¯\_(ツ)_/¯
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static List deserializeMember(String fileName) throws IOException {
        List<Member> MemberList = new ArrayList<Member>(); //creating empty list of members
        FileInputStream fileInputStream = null; //creating var of fileinputstream type
        ObjectInputStream objectInputStream= null; // creating obj of objectinputstream type
        try {
             fileInputStream = new FileInputStream(fileName); //trying to open file ಥ_ಥ
             objectInputStream = new ObjectInputStream(fileInputStream);
             while(true){
                 MemberList.add((Member) objectInputStream.readObject()); //reading members from file and appending them to the list
             }


        } catch (FileNotFoundException e) { //in case sth goes wrong ¯\_(ツ)_/¯
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally { //closing file
            if (objectInputStream != null){
            objectInputStream.close();
            }
           if (fileInputStream != null){
            fileInputStream.close();
           }

            return MemberList;
        }
    }

    static void AddMember(){ //adding members and their info
        System.out.println("Εισαγωγή κωδικού");
        Scanner myObj = new Scanner(System.in);
        String id  = myObj.nextLine();
        System.out.println("Εισαγωγή ονόματος");
        String name  = myObj.nextLine();
        System.out.println("Εισαγωγή email");
        String email = myObj.nextLine();
        System.out.println("Εισαγωγή ιδιότητας");
        String WutRu = myObj.nextLine();
        Member m = new Member(id,email,name,WutRu);//creating a new object...
        serializeMember(m); //saving to file

    }

    static void ViewMember() throws IOException { //shows on screen all members in file currently
        List<Member> MemberList = deserializeMember("member.ser"); //deserializing current file...
        for (Member m : MemberList){ //printing on screen every member...
            System.out.println(m.getEmail());
            System.out.println(m.getId());
            System.out.println(m.getName());
            System.out.println(m.getWutRu());
            System.out.println("-------");
        }

    }
    static void SearchMemberViaID() throws IOException {
        List<Member> MemberList = deserializeMember("member.ser"); //deserializing file and saving its contents to list
        System.out.println("Εισαγωγή κωδικού");
        Scanner myObj = new Scanner(System.in);
        String id  = myObj.nextLine();
        for (Member m : MemberList){ //searching in all members...
            if (id.equals(m.getId())){//...for matching id
                System.out.println(m.getEmail());
                System.out.println(m.getId());
                System.out.println(m.getName());
                System.out.println(m.getWutRu());
                System.out.println("-------");
                return; //if member found the process is terminated because code is unique
            }
        }
        System.out.println("Ο χρήστης δεν βρέθηκε");
    }

    static void SearchMemberViaName() throws IOException { //similarly like above  but with name
        List<Member> MemberList = deserializeMember("member.ser");
        boolean found=false;
        System.out.println("Εισαγωγή ονόματος");
        Scanner myObj = new Scanner(System.in);
        String name = myObj.nextLine();
        for (Member m : MemberList){
            if (name.equals(m.getName())){
                System.out.println(m.getEmail());
                System.out.println(m.getId());
                System.out.println(m.getName());
                System.out.println(m.getWutRu());
                System.out.println("-------");
                found = true; // instead of terminating we set variable 'found' to true
            }
        }
        if(!found){
            System.out.println("Ο χρήστης δεν βρέθηκε");
        }

    }

    static void EditMemberViaID() throws IOException {
        List<Member> MemberList = deserializeMember("member.ser");
        System.out.println("Εισαγωγή κωδικού");
        Scanner myObj = new Scanner(System.in);
        String id  = myObj.nextLine();
        for (Member m : MemberList){
            if (id.equals(m.getId())){ //checking id...
                System.out.println("Τί θέλετε να αλλάξετε;");
                System.out.println("1. όνομα ;");
                System.out.println("2. Email; ");
                System.out.println("3. Ιδιοτητα;");



                int select = myObj.nextInt(); //asks for int from user
                myObj.nextLine(); //skips the \n character
                switch (select){
                    case 1:

                        String name= myObj.nextLine();
                        m.setName(name);
                        break;
                    case 2:
                        String Email= myObj.nextLine();
                        m.setEmail(Email);

                        break;
                    case 3:
                        String WutRu = myObj.nextLine();
                        m.setWutRu(WutRu);

                        break;


                    default:
                        System.out.println("Μη εγκυρη επιλογη");
                }
                MemberList.remove(m); //removing existing member from list
                try{
                    FileOutputStream fileOutputStream = new FileOutputStream("member.ser");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(m); //writing member in file
                    for (Member mi : MemberList){ //adding rest of the members of the list
                        objectOutputStream.writeObject(mi);
                    }
                    objectOutputStream.close();
                    fileOutputStream.close(); //closing file...
                    System.out.println("Done!");
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return;

            }
        }
        System.out.println("Ο χρήστης δεν βρέθηκε");
    }

    static void DeleteMemberViaID() throws IOException {
        List<Member> MemberList = deserializeMember("member.ser");
        System.out.println("Εισαγωγή κωδικού");
        Scanner myObj = new Scanner(System.in);
        String id  = myObj.nextLine();
        for (Member m : MemberList){
            if (id.equals(m.getId())){
                MemberList.remove(m); //removing member from list
                try{
                    FileOutputStream fileOutputStream = new FileOutputStream("member.ser");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    for (Member mi : MemberList){
                        objectOutputStream.writeObject(mi); //writing every member except from the deleted one
                    }
                    objectOutputStream.close();
                    fileOutputStream.close(); //closing...
                    System.out.println("Done!");
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return;
            }
        }
        System.out.println("Ο χρήστης δεν βρέθηκε");
    }

}

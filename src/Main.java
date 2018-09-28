/**
 * Classe criada por Nilo dia 27/09/2018
 */
public class Main {
    public static void main(String [] args){

        ContactsManager myContactManager = new ContactsManager();
        Contact contact1 = new Contact();
        contact1.name = "Nilo";
        contact1.phoneNumber = "(11) 980229210";
        myContactManager.addContact(contact1);
        Contact contact2 = new Contact();
        contact2.name = "Fulano";
        contact2.phoneNumber = "(11) 998765432";
        myContactManager.addContact(contact2);
        Contact contact3 = new Contact();
        contact3.name = "Beltrano";
        contact3.phoneNumber = "(11) 987654321";
        myContactManager.addContact(contact3);
        Contact contact4 = new Contact();
        contact4.name = "Ciclano";
        contact4.phoneNumber = "(11) 912348567";
        myContactManager.addContact(contact4);

        System.out.println(myContactManager.searchContact("Fulano").phoneNumber);
    }

}

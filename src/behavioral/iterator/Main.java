package behavioral.iterator;

public class Main {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator it = namesRepository.getIterator(); it.hasNext(); ) {
            String name = (String) it.next();
            System.out.println("Name : " + name);
        }
    }
}

public class main {
    static void main(String[] args) {
        PCs PCeUno = new PCs("Ryzen 5 5600X", "RTX 2060", 16, "1 TB SSD");
        PCs PCeDos = new PCs("Intel Core i7-14700K", "RTX 4070", 32, "2 TB SSD");
        PCs PCeTres = new PCs("Ryzen 7 7800X3D", "RTX 4080", 64, "2 TB SSD");

        DoublyLinkedList<PCs> DoublyPCs = new DoublyLinkedList<>();

        DoublyPCs.insertFirst(PCeUno);
        DoublyPCs.insertLast(PCeDos);
        DoublyPCs.insertLast(PCeTres);

        System.out.println("==De atras hacia delante==");
        DoublyPCs.traverseBackward();
        System.out.println("==De adelante hacia atras==");
        DoublyPCs.traverse();


    }
}

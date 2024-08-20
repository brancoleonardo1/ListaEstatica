public class Main {
    public static void main(String[] args) {

        StaticList list = new StaticList(5);


        System.out.println("A lista está vazia? " + list.isEmpty());


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        System.out.println("Tamanho da lista: " + list.getSize());


        list.add(25, 2);


        System.out.println("Elementos da lista após adições:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Elemento na posição " + i + ": " + list.getData(i));
        }


        int removed = list.remove(3);
        System.out.println("Elemento removido: " + removed);


        System.out.println("Elementos da lista após remoção:");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Elemento na posição " + i + ": " + list.getData(i));
        }


        list.setData(35, 2);

        System.out.println("Elemento na posição 2 após setData: " + list.getData(2));


        System.out.println("A lista está cheia? " + list.isFull());

        int pos = list.find(35);
        System.out.println("Posição do elemento 35: " + pos);

        list.clear();
        System.out.println("A lista foi limpa. Tamanho da lista: " + list.getSize());
    }
}

package BinarySortTree;

public class T {
    public static void main(String[] args){
        BinarySortTree b = new BinarySortTree(5);

        BinarySortTree.addb(3,b);
        BinarySortTree.addb(1,b);
        BinarySortTree.addb(4,b);
        BinarySortTree.addb(6,b);
        BinarySortTree.addb(9,b);


        BinarySortTree.find(7,b);

        BinarySortTree.showAllData(b);
    }
}

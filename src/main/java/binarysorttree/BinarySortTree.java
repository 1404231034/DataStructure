package binarysorttree;

/**
 *
 * @author lpc
 * @date 2019.10.28
 */
public class BinarySortTree {

    private int value;
    private BinarySortTree left;
    private BinarySortTree right;

    public static void addb(int i, BinarySortTree b) {
        if (i <= b.getValue()) {
            if (b.left == null) {
                b.setLeft(new BinarySortTree(i));
            } else {
                addb(i, b.getLeft());
            }
        } else {
            if (b.getRight() == null) {
                b.setRight(new BinarySortTree(i));
            } else {
                addb(i, b.getRight());
            }
        }
    }

    public static void find(int i, BinarySortTree b){
        if(findb(i,b)){
            System.out.println("you find i " + i);
        } else {
            System.err.println("there is no i " + i);
        }
    }

    public static void showAllData(BinarySortTree b){
        System.out.println(b.value);
        if(b.getLeft() == null && b.getRight() == null){
            return;
        }

        if(b.getRight() != null){
            showAllData(b.getRight());
        }
        if(b.getLeft() != null){
            showAllData(b.getLeft());
        }
    }


    public static boolean findb(int i,BinarySortTree b){

        if(b.getValue() == i){
            return true;
        }
        if(i < b.getValue()){
            if(b.getLeft() == null){
                return false;
            }else {
                return findb(i,b.getLeft());
            }
        }else{
            if(b.getRight() == null){
                return false;
            }else {
                return findb(i,b.getRight());
            }
        }
    }

    public BinarySortTree(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinarySortTree getLeft() {
        return left;
    }

    public void setLeft(BinarySortTree left) {
        this.left = left;
    }

    public BinarySortTree getRight() {
        return right;
    }

    public void setRight(BinarySortTree right) {
        this.right = right;
    }


}

package binarytree;

public class T {
    public static void main(String[] args){

        System.out.println("-------初始化树-------");
        BinaryTree b = new BinaryTree("A");
        System.out.println("------初始化成功------");
        BinaryTree.insertL(b,"B");
        BinaryTree.insertR(b,"E");
        System.out.println("-------先序遍历-------");
        BinaryTree.showx(b);System.out.println();
        BinaryTree.insertR(b.getLchild(),"C");
        BinaryTree.insertL(b.getLchild().getRchild(),"D");
        BinaryTree.insertR(b.getRchild(),"F");
        BinaryTree.insertL(b.getRchild().getRchild(),"G");
        BinaryTree.insertL(b.getRchild().getRchild().getLchild(),"H");
        BinaryTree.insertR(b.getRchild().getRchild().getLchild(),"K");
        System.out.println("------完整树构建------");
        System.out.println("-------先序遍历-------");
        BinaryTree.showx(b);System.out.println();
        System.out.println("-------先中遍历-------");
        BinaryTree.showz(b);System.out.println();
        System.out.println("-------后序遍历-------");
        BinaryTree.showh(b);System.out.println();
        System.out.println("-------层次遍历-------");
        BinaryTree.showc(b);
        System.out.println("-------叶子节点-------");
        System.out.println(BinaryTree.countleaf(b));
        System.out.println("-------查询---------");
        BinaryTree target = new BinaryTree();
        target = BinaryTree.find(b,target,"G");
        System.out.println("target's value is " + target.getValue());
        System.out.println("target's lchild is " + (target.getLchild()==null?"空":target.getLchild().getValue()));
        System.out.println("target's rchild is " + (target.getRchild()==null?"空":target.getRchild().getValue()));

    }
}

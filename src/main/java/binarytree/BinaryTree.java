package binarytree;

/**
 * @author lpc
 * @date 2019.10.29
 */
public class BinaryTree {
    private String value;
    private BinaryTree lchild;
    private BinaryTree rchild;


    /**
     * @param b      树根
     * @param x      值x
     * @param target 目标节点
     * @return 值为x的节点
     */
    public static BinaryTree find(BinaryTree b, BinaryTree target, String x) {
        if (b == null) {
            return null;
        }

        target = find(b.lchild, target, x);
        if(target != null){
            return target;
        }
        target = find(b.rchild, target, x);
        if(target != null){
            return target;
        }
        if (x.equals(b.getValue())) {
            target = b;
        }
        return target;
    }

    /**
     * 将值s插入到树b的左子中
     *
     * @param b
     * @param s
     */
    public static void insertL(BinaryTree b, String s) {
        if (b.getLchild() != null) {
            b.getLchild().setValue(s);
        } else {
            b.setLchild(new BinaryTree(s));
        }
        System.out.println(b.getValue() + "左子插" + s + "入成功");
    }

    /**
     * 将值s插入到树b的右子中
     *
     * @param b
     * @param s
     */
    public static void insertR(BinaryTree b, String s) {
        if (b.getRchild() != null) {
            b.getRchild().setValue(s);
        } else {
            b.setRchild(new BinaryTree(s));
        }
        System.out.println(b.getValue() + "右子插" + s + "入成功");
    }

    /**
     * 删除左子
     *
     * @param b
     */
    public static void deleteL(BinaryTree b) {
        if (b.getLchild() != null) {
            System.out.println("删除" + b.getValue() + "左子" + b.getLchild().getValue());
            b.lchild = null;
        }
    }

    /**
     * 删除左子
     *
     * @param b
     */
    public static void deleteR(BinaryTree b) {
        if (b.getRchild() != null) {
            System.out.println("删除" + b.getValue() + "右子" + b.getRchild().getValue());
            b.lchild = null;
        }
    }

    /**
     * 先序遍历
     *
     * @param b
     */
    public static void showx(BinaryTree b) {
        if (b == null) {
            return;
        }
        System.out.print(b.getValue());
        showx(b.getLchild());
        showx(b.getRchild());
        //System.out.println();
    }

    /**
     * 中序遍历
     *
     * @param b
     */
    public static void showz(BinaryTree b) {
        if (b == null) {
            return;
        }
        showz(b.getLchild());
        System.out.print(b.getValue());
        showz(b.getRchild());
        //System.out.println();
    }

    /**
     * 后序遍历
     *
     * @param b
     */
    public static void showh(BinaryTree b) {
        if (b == null) {
            return;
        }
        showh(b.getLchild());
        showh(b.getRchild());
        System.out.print(b.value);
        //System.out.println();
    }

    /**
     * 计算树的深度
     *
     * @param b
     * @return
     */
    public static int deep(BinaryTree b) {
        int lh, rh, h;
        if (b == null) {
            return 0;
        } else {
            lh = deep(b.getLchild());
            rh = deep(b.getRchild());
            h = (lh > rh ? lh : rh) + 1;
        }
        return h;
    }

    /**
     * 层次遍历
     *
     * @param b
     */
    public static void showc(BinaryTree b) {
        if (b == null) {
            return;
        }
        int num = (int) Math.pow(2,deep(b));
        //这里用list和数组作用类似
        BinaryTree[] a = new BinaryTree[num];
        BinaryTree t;

        int front = -1, end = 0;
        a[end] = b;
        while (front != end) {
            t = a[++front];
            System.out.print(t.getValue());
            if (t.getLchild() != null) {
                a[++end] = t.getLchild();
            }
            if (t.getRchild() != null) {
                a[++end] = t.getRchild();
            }
        }
        System.out.println();
    }

    /**
     * 计算叶子节点
     * @param b
     * @return
     */
    public static int countleaf(BinaryTree b) {
        if (b == null) {
            return 0;
        }
        if (b.getRchild() == null && b.getLchild() == null) {
            return 1;
        } else {
            return countleaf(b.getLchild()) + countleaf(b.getRchild());
        }
    }

    public BinaryTree() {
    }

    public BinaryTree(String value) {
        this.value = value;
    }

    public BinaryTree(String value, BinaryTree lchild, BinaryTree rchild) {
        this.value = value;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BinaryTree getLchild() {
        return lchild;
    }

    public void setLchild(BinaryTree lchild) {
        this.lchild = lchild;
    }

    public BinaryTree getRchild() {
        return rchild;
    }

    public void setRchild(BinaryTree rchild) {
        this.rchild = rchild;
    }
}

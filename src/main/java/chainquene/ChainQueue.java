package chainquene;



/**
 * @author lpc
 * @date 2019.10.31
 *
 * 链表队列
 */
public class ChainQueue {
    private ListNode begin;
    private ListNode end;


    public ChainQueue(){
        ListNode t = new ListNode();
        this.begin = t;
        this.end = t;
    }

    public boolean isEmpty(){
        if(this.begin == this.end){
            System.err.println("队列为空");
            return true;
        }else {
            return false;
        }
    }

    public void push(int i){
        ListNode node = new ListNode(i);
        this.end.setNext(node);
        this.end = node;
        System.out.println(i + " 入队列成功");
    }

    public void pop(){
        if(this.isEmpty()){
            //return;
        }else {
            int x = this.begin.getNext().getValue();
            this.begin.setNext(this.begin.getNext().getNext());
            System.out.println(x + "出队列成功");
        }
    }

    public void show(){
        this.isEmpty();
        ListNode node = this.getBegin().getNext();
        int i = 1;
        while (node != null){
            System.out.println("第" + i++ + "个元素是" + node.getValue());
            node = node.getNext();
        }
    }

    public ListNode getBegin() {
        return begin;
    }

    public void setBegin(ListNode begin) {
        this.begin = begin;
    }

    public ListNode getEnd() {
        return end;
    }

    public void setEnd(ListNode end) {
        this.end = end;
    }
}

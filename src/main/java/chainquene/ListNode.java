package chainquene;

/**
 * @author lpc
 * @date 2019.10.31
 *
 * 链表
 */
public class ListNode {
    private int value;
    private ListNode next;

    public ListNode(){}

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}

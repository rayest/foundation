package cn.rayest.dataStructures.list.linkList;

/**
 * Created by Rayest on 2016/8/5 0005.
 */


class Node<ElementType> {
    // 节点类，包含节点的数据和指向下一个节点的引用
    private ElementType element;
    private Node<ElementType> next = null;

    // 新建一个空节点
    public Node() {
    }

    // 新建一个非空节点
    public Node(ElementType element){
        this.element = element;
    }

    public ElementType getElement() {
        return element;
    }

    public void setElement(ElementType element) {
        this.element = element;
    }

    public Node<ElementType> getNext() {
        return next;
    }

    public void setNext(Node<ElementType> next) {
        this.next = next;
    }

    // 返回节点的 element 元素
    @Override
    public String toString() {
        return "" + element;
    }
}

// 单链表的实现
public class LinkedList<Element>{

    // 链表三要素：头结点、尾节点、长度
    private Node<Element> head = null;
    private Node<Element> tail = null;
    private int size = 0;

    // 建立一个空链表
    public LinkedList() {
        head = new Node<Element>();
        tail = head;
    }

    // 向链表尾部添加一个元素
    public boolean add(Element element){
        Node<Element> newNode = new Node<Element>(element);
        tail.setNext(newNode); // 把 newNode 节点设置为尾节点
        tail = tail.getNext();
        ++size;
        return true;
    }

    // 向链表的 index 位置插入元素 element
    public boolean insert(int index, Element element){
        validateIndex(index);
        Node<Element> newNode = new Node<Element>(element); // 新建节点
        Node preNode = getNode(index - 1);   // 获取 index 位置的前节点
        newNode.setNext(preNode.getNext()); //  将 preNode 的下一个节点设置为 newNode 的下一个节点
        preNode.setNext(newNode); // 再将 preNode 的下一个节点设置为 newNode
        return true;              // 可以通过 C 语言的指针更加清楚地描述
    }

    // 获取指定位置节点的元素
    public Element getElement(int index){
        validateIndex(index);
        Node<Element> node = getNode(index);
        return node.getElement();
    }

    // 删除指定位置的节点
    public boolean delete(int index){
        Node<Element> curNode = null;
        if (index == 0){
            curNode = head.getNext();    // 头结点指向第一个节点
            Node<Element> nextNode = curNode.getNext();   // 第一个节点指向第二个节点
            head.setNext(nextNode);    // 头结点指向第二个节点
            // 或者直接： head.setNext(head.getNext().getNext());
        }
        else {
            validateIndex(index);
            curNode = getNode(index); // 获取待删除的节点
            Node<Element> preNode = getNode(index - 1); // 获取待删除节点的前节点
            preNode.setNext(curNode.getNext()); // 前节点指向待删除节点的下一个节点
        }
        curNode.setNext(null); // 待删除节点指向 null
        return true;
    }

    // 设置指定节点的 element
    public void setNode(int index, Element element){
        validateIndex(index);
        Node<Element> node = getNode(index);
        node.setElement(element);
    }

    // 获取链表大小
    public int getSize(){
        return size;
    }

    /*
        单链表的操作需要从表的头节点遍历，直到要进行操作的 index 位置
        获取 index 位置的节点，需要从头结点开始遍历查找
    */
    private Node<Element> getNode(int index){
        validateIndex(index);
        Node<Element> node = head;
        for (int i = 0; i < index; ++i) {
            node = node.getNext(); // 从头结点开始遍历，直到 index 位置
        }
        return node;  // 返回找到的 index 位置的节点
    }

    public void validateIndex(int index){
        if (index < 0 || index > size){
            throw new RuntimeException("无效的下标：" + index);
        }
    }

    @Override
    public String toString() {
        String str = "";
        Node<Element> node = head;
        while (node != tail){
            str += " " + node.getNext().getElement();
            node = node.getNext(); // 移向下一个节点
        }
        return str;
    }
}

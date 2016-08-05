package cn.rayest.dataStructures.list.linkList;

/**
 * Created by Rayest on 2016/8/5 0005.
 */


class Node<ElementType> {
    // �ڵ��࣬�����ڵ�����ݺ�ָ����һ���ڵ������
    private ElementType element;
    private Node<ElementType> next = null;

    // �½�һ���սڵ�
    public Node() {
    }

    // �½�һ���ǿսڵ�
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

    // ���ؽڵ�� element Ԫ��
    @Override
    public String toString() {
        return "" + element;
    }
}

// �������ʵ��
public class LinkedList<Element>{

    // ������Ҫ�أ�ͷ��㡢β�ڵ㡢����
    private Node<Element> head = null;
    private Node<Element> tail = null;
    private int size = 0;

    // ����һ��������
    public LinkedList() {
        head = new Node<Element>();
        tail = head;
    }

    // ������β�����һ��Ԫ��
    public boolean add(Element element){
        Node<Element> newNode = new Node<Element>(element);
        tail.setNext(newNode); // �� newNode �ڵ�����Ϊβ�ڵ�
        tail = tail.getNext();
        ++size;
        return true;
    }

    // ������� index λ�ò���Ԫ�� element
    public boolean insert(int index, Element element){
        validateIndex(index);
        Node<Element> newNode = new Node<Element>(element); // �½��ڵ�
        Node preNode = getNode(index - 1);   // ��ȡ index λ�õ�ǰ�ڵ�
        newNode.setNext(preNode.getNext()); //  �� preNode ����һ���ڵ�����Ϊ newNode ����һ���ڵ�
        preNode.setNext(newNode); // �ٽ� preNode ����һ���ڵ�����Ϊ newNode
        return true;              // ����ͨ�� C ���Ե�ָ��������������
    }

    // ��ȡָ��λ�ýڵ��Ԫ��
    public Element getElement(int index){
        validateIndex(index);
        Node<Element> node = getNode(index);
        return node.getElement();
    }

    // ɾ��ָ��λ�õĽڵ�
    public boolean delete(int index){
        Node<Element> curNode = null;
        if (index == 0){
            curNode = head.getNext();    // ͷ���ָ���һ���ڵ�
            Node<Element> nextNode = curNode.getNext();   // ��һ���ڵ�ָ��ڶ����ڵ�
            head.setNext(nextNode);    // ͷ���ָ��ڶ����ڵ�
            // ����ֱ�ӣ� head.setNext(head.getNext().getNext());
        }
        else {
            validateIndex(index);
            curNode = getNode(index); // ��ȡ��ɾ���Ľڵ�
            Node<Element> preNode = getNode(index - 1); // ��ȡ��ɾ���ڵ��ǰ�ڵ�
            preNode.setNext(curNode.getNext()); // ǰ�ڵ�ָ���ɾ���ڵ����һ���ڵ�
        }
        curNode.setNext(null); // ��ɾ���ڵ�ָ�� null
        return true;
    }

    // ����ָ���ڵ�� element
    public void setNode(int index, Element element){
        validateIndex(index);
        Node<Element> node = getNode(index);
        node.setElement(element);
    }

    // ��ȡ�����С
    public int getSize(){
        return size;
    }

    /*
        ������Ĳ�����Ҫ�ӱ��ͷ�ڵ������ֱ��Ҫ���в����� index λ��
        ��ȡ index λ�õĽڵ㣬��Ҫ��ͷ��㿪ʼ��������
    */
    private Node<Element> getNode(int index){
        validateIndex(index);
        Node<Element> node = head;
        for (int i = 0; i < index; ++i) {
            node = node.getNext(); // ��ͷ��㿪ʼ������ֱ�� index λ��
        }
        return node;  // �����ҵ��� index λ�õĽڵ�
    }

    public void validateIndex(int index){
        if (index < 0 || index > size){
            throw new RuntimeException("��Ч���±꣺" + index);
        }
    }

    @Override
    public String toString() {
        String str = "";
        Node<Element> node = head;
        while (node != tail){
            str += " " + node.getNext().getElement();
            node = node.getNext(); // ������һ���ڵ�
        }
        return str;
    }
}

public class OrderedLinkedList implements List {
    class Node { //데이터 관리로 사용
        int value;
        Node next;

        //...
    }

    //오름차순으로 정렬

    public void insert(int value) {
        //value값 대입
    }

    public int getFirst() {
        //가장 작은 값 선택
        int min = 0;

        return min;
    }

    public int removeFirst() {
        //가장 작은 값 제거
    }

    public boolean isEmpty() {
        //빈 리스트인지 확인
        return size==0;
    }

    public static void main(String[] args) {
        OrderedLinkedList list = new OrderedLinkedList();

        System.out.println("isEmpty : " + list.isEmpty());
        list.insert(10);
        list.insert(5);
        System.out.println("getFirst : " + list.getFirst());
        list.insert(7);
        list.removeFirst();
        System.out.println("isEmpty : " + list.isEmpty());
        System.out.println("getFirst : " + list.getFirst());
        list.insert(12);
        list.insert(3);
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("getFirst : " + list.getFirst());
        list.removeFirst();
        System.out.println("isEmpty : " + list.isEmpty());
    }
}

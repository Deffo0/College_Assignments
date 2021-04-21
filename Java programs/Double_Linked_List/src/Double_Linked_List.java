
import java.util.*;

interface ILinkedList {

    public void add(int index, Object element);


    public void add(Object element);


    public Object get(int index);


    public void set(int index, Object element);


    public void clear();


    public boolean isEmpty();


    public void remove(int index);


    public int size();


    public ILinkedList sublist(int fromIndex, int toIndex);


    public boolean contains(Object o);
}


public class Double_Linked_List implements ILinkedList {


    static class Node {
        private int data;
        private Node next, prev;

        public Node(Integer a, Node b, Node c) {
            this.data = a;
            this.next = b;
            this.prev = c;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() { return prev; }

        public void setPrev(Node prev) { this.prev = prev; }
    }

    //using the dummy header node
    private  Node head = new Node(0, null,null);
    private  Node tail = new Node(0,null,null);
    private int size = 0;

    public void add(int index, Object element) {
        Node p, q;
        Node req = new Node(0, null,null);
        //casting the element to the required type
        req.setData((Integer) element);
        if (index < 0) {
            throw new RuntimeException();
        } else if (index == 0) {
            p = head.getNext();
            head.setNext(req);
            req.setPrev(head);
            req.setNext(p);
            p.setPrev(req);
            size++;
        } else {
            if (head.getNext() == null) {
                throw new RuntimeException();
            } else {
                p = head.getNext();
                int i = 0;
                while (i < index - 1) {
                    if (p.getNext() == tail) {
                        throw new RuntimeException();

                    } else {
                        p = p.getNext();
                        i++;
                    }
                }
                if (p.getNext() == tail) {
                    throw new RuntimeException();
                } else {
                    q = p.getNext();
                    p.setNext(req);
                    req.setNext(q);
                    req.setPrev(p);
                    q.setPrev(req);
                    size++;
                }
            }
        }
    }

    public void add(Object element) {
        Node req = new Node(0, null,null);
        //casting the element to the required type
        req.setData((Integer) element);
        if (head.getNext() == null) {
            head.setNext(req);
            tail.setPrev(req);
            req.setPrev(head);
            req.setNext(tail);
            size++;
        } else {
            Node p = tail.getPrev();

            p.setNext(req);
            req.setNext(tail);
            req.setPrev(p);
            tail.setPrev(req);
            size++;
        }
    }

    public Object get(int index) {
        Node p;
        if (head.getNext() == null || index < 0) {
            throw new RuntimeException();

        } else {
            p = head.getNext();
            int i = 0;
            while (i < index) {
                if (p.getNext() == tail) {
                    throw new RuntimeException();
                } else {
                    p = p.getNext();
                    i++;
                }
            }
            return p.getData();
        }
    }

    public void set(int index, Object element) {
        Node p;
        if (head.getNext() == null || index<0) {
            throw new RuntimeException();
        } else {
            p = head.getNext();
            int i = 0;
            while (i < index) {
                if (p.getNext() == tail) {
                    throw new RuntimeException();
                } else {
                    p = p.getNext();
                    i++;
                }
            }
            p.setData((Integer) element);
        }
    }

    public void clear() {
        head.setNext(null);
        tail.setPrev(null);
        size = 0;
    }

    public boolean isEmpty() {
        return head.getNext() == null;
    }

    public void remove(int index) {
        Node p, q;
        if (index < 0) {
            throw new RuntimeException();
        } else if (index == 0) {
            p = head.getNext();
            head.setNext(p.getNext());
            (p.getNext()).setPrev(head);
            p.setNext(null);
            p.setPrev(null);
            size--;
        } else {
            if (head.getNext() == null) {
                throw new RuntimeException();
            } else {
                p = head.getNext();
                int i = 0;
                while (i < index - 1) {
                    if (p.getNext() == tail) {
                        throw new RuntimeException();
                    } else {
                        p = p.getNext();
                        i++;
                    }
                }
                if (p.getNext() == tail) {
                    throw new RuntimeException();
                } else {
                    q = p.getNext();
                    p.setNext(q.getNext());
                    (q.getNext()).setPrev(p);
                    q.setNext(null);
                    q.setPrev(null);
                    size--;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public ILinkedList sublist(int fromIndex, int toIndex) {
        Double_Linked_List res = new Double_Linked_List();
        Node p;
        if (toIndex > size - 1 || fromIndex < 0 || fromIndex > toIndex || head.getNext() == null) {
            throw new RuntimeException();
        } else {
            p = head.getNext();
            int i = 0;
            while (i < fromIndex) {
                if (p.getNext() == tail) {
                    throw new RuntimeException();
                } else {
                    p = p.getNext();
                    i++;
                }
            }
            for (int j = i; j <= toIndex; j++) {
                res.add(p.getData());
                if (p.getNext() == tail) {
                    break;
                } else {
                    p = p.getNext();

                }
            }
            return res;
        }

    }

    public boolean contains(Object o) {
        int comp = (Integer) o;
        Node p;
        if (head.getNext() == null) {
            throw new RuntimeException();
        } else {
            p = head.getNext();
            while (comp != p.getData()) {
                if (p.getNext() == tail) {
                    return false;
                } else {
                    p = p.getNext();
                }
            }
            return true;
        }
    }

    public void printLinkedList() {
        Node p;
        if (head.getNext() == null) {
            System.out.println("[]");
        } else {
            p = head.getNext();
            System.out.print("[");
            for (int i = 0; i < size; i++, p = p.getNext()) {
                if (i == size - 1) {
                    System.out.print(p.getData());
                } else {
                    System.out.print(p.getData() + ", ");
                }
            }
            System.out.print("]");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("\\[|]", "");
        String[] s = sin.split(", ");
        int[] arr = new int[s.length];
        if (s.length == 1 && s[0].isEmpty())
            arr = new int[]{};
        else {
            for (int i = 0; i < s.length; ++i)
                arr[i] = Integer.parseInt(s[i]);
        }
        Double_Linked_List array = new Double_Linked_List();
        for (int j : arr) {
            array.add(j);
        }
        String operator = sc.nextLine();
        try {
            switch (operator) {
                case "add":
                    int element1 = sc.nextInt();
                    array.add(element1);
                    array.printLinkedList();
                    break;
                case "addToIndex":
                    int index1 = sc.nextInt();
                    int element2 = sc.nextInt();
                    array.add(index1, element2);
                    array.printLinkedList();
                    break;
                case "get":
                    int index2 = sc.nextInt();
                    System.out.println(array.get(index2));
                    break;
                case "set":
                    int index3 = sc.nextInt();
                    int element3 = sc.nextInt();
                    array.set(index3, element3);
                    array.printLinkedList();
                    break;
                case "clear":
                    array.clear();
                    array.printLinkedList();
                    break;
                case "isEmpty":
                    if (array.isEmpty()) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "remove":
                    int index4 = sc.nextInt();
                    array.remove(index4);
                    array.printLinkedList();
                    break;
                case "sublist":
                    int index5 = sc.nextInt();
                    int index6 = sc.nextInt();
                    Double_Linked_List sub;
                    sub = (Double_Linked_List) array.sublist(index5, index6);
                    sub.printLinkedList();
                    break;
                case "contains":
                    int element4 = sc.nextInt();
                    if (array.contains(element4)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "size":
                    System.out.println(array.size());
                    break;
                default:
                    System.out.println("Error");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
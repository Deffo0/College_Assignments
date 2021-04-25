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


class SingleLinkedList implements ILinkedList {


    static class Node {
        private int data;
        private Node next;

        public Node(Integer a, Node b) {
            this.data = a;
            this.next = b;
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
    }

    //using the dummy header node
    private final Node head = new Node(0, null);
    private int size = 0;

    public Node head() {
        return head;
    }

    public void add(int index, Object element) {
        Node p, q;
        Node req = new Node(0, null);
        //casting the element to the required type
        req.setData((Integer) element);
        if (index < 0) {
            throw new RuntimeException();
        } else if (index == 0) {
            p = head.getNext(); //head is a dummy node, with value zero, next pointing to null, p = null
            head.setNext(req); //head next will be the requested
            req.setNext(p);
            size++;
        } else {
            if (head.getNext() == null) {
                throw new RuntimeException();
            } else {
                p = head.getNext();
                int i = 0;
                while (i < index - 1) {
                    if (p.getNext() == null) {
                        throw new RuntimeException();

                    } else {
                        p = p.getNext();
                        i++;
                    }
                }
                if (p.getNext() == null) {
                    throw new RuntimeException();
                } else {
                    q = p.getNext();
                    p.setNext(req);
                    req.setNext(q);
                    size++;
                }
            }
        }
    }

    public void add(Object element) {
        Node req = new Node(0, null);
        //casting the element to the required type
        req.setData((Integer) element);
        if (head.getNext() == null) {
            head.setNext(req);
            size++;
        } else {
            Node p = head;
            do {
                p = p.getNext();

            } while (p.getNext() != null);
            p.setNext(req);
            req.setNext(null);
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
                if (p.getNext() == null) {
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
        if (head.getNext() == null || index < 0) {
            throw new RuntimeException();
        } else {
            p = head.getNext();
            int i = 0;
            while (i < index) {
                if (p.getNext() == null) {
                    throw new RuntimeException();
                } else {
                    p = p.getNext();
                    i++;
                }
            }
            p.setData((Integer) element);
        }
    }

    //Used for multiplication method in Polynomial Solver
    public void addto(int index, Object element) {
        Node p;
        if (head.getNext() == null || index < 0) {
            throw new RuntimeException();
        } else {
            p = head.getNext();
            int i = 0;
            while (i < index) {
                if (p.getNext() == null) {
                    throw new RuntimeException();
                } else {
                    p = p.getNext();
                    i++;
                }
            }
            int q = p.getData();
            p.setData((Integer) q + (Integer) element);
        }
    }

    public void clear() {
        head.setNext(null);
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
            p.setNext(null);
            size--;
        } else {
            if (head.getNext() == null) {
                throw new RuntimeException();
            } else {
                p = head.getNext();
                int i = 0;
                while (i < index - 1) {
                    if (p.getNext() == null) {
                        throw new RuntimeException();
                    } else {
                        p = p.getNext();
                        i++;
                    }
                }
                if (p.getNext() == null) {
                    throw new RuntimeException();
                } else {
                    q = p.getNext();
                    p.setNext(q.getNext());
                    q.setNext(null);
                    size--;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public ILinkedList sublist(int fromIndex, int toIndex) {
        SingleLinkedList res = new SingleLinkedList();
        Node p;
        if (toIndex > size - 1 || fromIndex < 0 || fromIndex > toIndex || head.getNext() == null) {
            throw new RuntimeException();
        } else {
            p = head.getNext();
            int i = 0;
            while (i < fromIndex) {
                if (p.getNext() == null) {
                    throw new RuntimeException();
                } else {
                    p = p.getNext();
                    i++;
                }
            }
            for (int j = i; j <= toIndex; j++) {
                res.add(p.getData());
                if (p.getNext() == null) {
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
                if (p.getNext() == null) {
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

    public SingleLinkedList addition(Node h) {
        boolean flag1 = false;
        boolean flag2 = false;
        SingleLinkedList res = new SingleLinkedList();
        if (head.getNext() == null || h.getNext() == null) {
            throw new RuntimeException();
        } else {
            Node p = head.getNext();
            Node c = h.getNext();
            while (p.getNext() != null && c.getNext() != null) {
                if (p.getNext() != null && c.getNext() != null) {
                    res.add(p.getData() + c.getData());
                    p = p.getNext();
                    c = c.getNext();
                } else if (p.getNext() != null && c.getNext() == null) {
                    if (!flag1) {
                        res.add(p.getData() + c.getData());
                        flag1 = true;
                    } else {
                        res.add(p.getData());
                    }
                    p = p.getNext();

                } else if (p.getNext() == null && c.getNext() != null) {
                    if (!flag2) {
                        res.add(p.getData() + c.getData());
                        flag2 = true;
                    } else {
                        res.add(c.getData());
                    }
                    c = c.getNext();

                }
            }
            if (!flag1 && !flag2) {
                res.add(p.getData() + c.getData());
            } else if (flag1) {
                res.add(p.getData());
            } else {
                res.add(c.getData());
            }
            return res;
        }
    }

    public SingleLinkedList subtraction(Node h) {
        boolean flag1 = false;
        boolean flag2 = false;
        SingleLinkedList res = new SingleLinkedList();
        if (head.getNext() == null || h.getNext() == null) {
            throw new RuntimeException();
        } else {
            Node p = head.getNext();
            Node c = h.getNext();
            while (p.getNext() != null && c.getNext() != null) {
                if (p.getNext() != null && c.getNext() != null) {
                    res.add(p.getData() - c.getData());
                    p = p.getNext();
                    c = c.getNext();
                } else if (p.getNext() != null && c.getNext() == null) {
                    if (!flag1) {
                        res.add(p.getData() - c.getData());
                        flag1 = true;
                    } else {
                        res.add(p.getData());
                    }
                    p = p.getNext();

                } else if (p.getNext() == null && c.getNext() != null) {
                    if (!flag2) {
                        res.add(p.getData() - c.getData());
                        flag2 = true;
                    } else {
                        res.add(-1 * c.getData());
                    }
                    c = c.getNext();

                }
            }
            if (!flag1 && !flag2) {
                res.add(p.getData() - c.getData());
            } else if (flag1) {
                res.add(p.getData());
            } else if (flag2) {
                res.add(-1 * c.getData());
            }
            return res;
        }
    }

}


interface IPolynomialSolver {
    /**
     * Set polynomial terms (coefficients & exponents)
     *
     * @param poly:  name of the polynomial
     * @param terms: array of [coefficients][exponents]
     */
    void setPolynomial(char poly, int[][] terms);

    /**
     * Print the polynomial in ordered human readable representation
     *
     * @param poly: name of the polynomial
     * @return: polynomial in the form like 27x^2+x-1
     */
    String print(char poly);

    /**
     * Clear the polynomial
     *
     * @param poly: name of the polynomial
     */
    void clearPolynomial(char poly);

    /**
     * Evaluate the polynomial
     *
     * @param poly:  name of the polynomial
     * @param value: the polynomial constant value
     * @return the value of the polynomial
     */
    float evaluatePolynomial(char poly, float value);

    /**
     * Add two polynomials
     *
     * @param poly1: first polynomial
     * @param poly2: second polynomial
     * @return the result polynomial
     */
    int[][] add(char poly1, char poly2);

    /**
     * Subtract two polynomials
     *
     * @param poly1: first polynomial
     * @param poly2: second polynomial
     * @return the result polynomial
     */
    int[][] subtract(char poly1, char poly2);

    /**
     * Multiply two polynomials
     *
     * @param poly1: first polynomial
     * @param poly2: second polynomial
     * @return: the result polynomial
     */
    int[][] multiply(char poly1, char poly2);
}

public class Polynomial_solver implements IPolynomialSolver {


    private SingleLinkedList A_SLL = new SingleLinkedList();
    private SingleLinkedList B_SLL = new SingleLinkedList();
    private SingleLinkedList C_SLL = new SingleLinkedList();
    private SingleLinkedList R_SLL = new SingleLinkedList();

    boolean AisSet = false;
    boolean BisSet = false;
    boolean CisSet = false;
    boolean RisSet = false;

    public void setPolynomial(char poly_name, int[][] arr) {
        switch (poly_name) {
            case 'A':
                convert2DtoSLL('A', arr);
                AisSet = true;
                break;
            case 'B':
                convert2DtoSLL('B', arr);
                BisSet = true;
                break;
            case 'C':
                convert2DtoSLL('C', arr);
                CisSet = true;
                break;
            default:
                throw new RuntimeException();
        }
    }

    public void convert2DtoSLL(char poly_name, int[][] arr) {
        switch (poly_name) {
            case 'A':
                for (int i = 0; i < arr.length; i++) {
                    A_SLL.add(arr[i][0]);
                }
                break;
            case 'B':
                for (int i = 0; i < arr.length; i++) {
                    B_SLL.add(arr[i][0]);
                }
                break;
            case 'C':
                for (int i = 0; i < arr.length; i++) {
                    C_SLL.add(arr[i][0]);
                }
                break;
            case 'R':
                for (int i = 0; i < arr.length; i++) {
                    R_SLL.add(arr[i][0]);
                }
                break;

            default:
                throw new RuntimeException();
        }
    }

    public int[][] convertLLSto2D(SingleLinkedList K) {
        int[][] poly = new int[K.size()][2];
        for (int i = 0; i < K.size(); i++) {
            poly[i][0] = (int) K.get(i);
            poly[i][1] = K.size() - i - 1;
        }
        return poly;
    }

    public int[][] add(char a, char b) {
        switch (a) {
            case 'A':
                switch (b) {
                    case 'A':
                        if (AisSet) {
                            R_SLL = A_SLL.addition(A_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'B':
                        if (AisSet && BisSet) {
                            R_SLL = A_SLL.addition(B_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'C':
                        if (AisSet && CisSet) {
                            R_SLL = A_SLL.addition(C_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                break;
            case 'B':
                switch (b) {
                    case 'A':
                        if (AisSet && BisSet) {
                            R_SLL = B_SLL.addition(A_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'B':
                        if (BisSet) {
                            R_SLL = B_SLL.addition(B_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'C':
                        if (BisSet && CisSet) {
                            R_SLL = B_SLL.addition(C_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                break;
            case 'C':
                switch (b) {
                    case 'A':
                        if (CisSet && AisSet) {
                            R_SLL = C_SLL.addition(A_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'B':
                        if (CisSet && BisSet) {
                            R_SLL = C_SLL.addition(B_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'C':
                        if (CisSet) {
                            R_SLL = C_SLL.addition(C_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                break;
            default:
                throw new RuntimeException();
        }

        int[][] poly = convertLLSto2D(R_SLL);
        RisSet = true;
        return poly;
    }

    public int[][] subtract(char a, char b) {
        switch (a) {
            case 'A':
                switch (b) {
                    case 'A':
                        if (AisSet) {
                            R_SLL = A_SLL.subtraction(A_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'B':
                        if (AisSet && BisSet) {
                            R_SLL = A_SLL.subtraction(B_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'C':
                        if (AisSet && CisSet) {
                            R_SLL = A_SLL.subtraction(C_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                break;
            case 'B':
                switch (b) {
                    case 'A':
                        if (AisSet && BisSet) {
                            R_SLL = B_SLL.subtraction(A_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'B':
                        if (BisSet) {
                            R_SLL = B_SLL.subtraction(B_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'C':
                        if (BisSet && CisSet) {
                            R_SLL = B_SLL.subtraction(C_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                break;
            case 'C':
                switch (b) {
                    case 'A':
                        if (CisSet && AisSet) {
                            R_SLL = C_SLL.subtraction(A_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'B':
                        if (CisSet && BisSet) {
                            R_SLL = C_SLL.subtraction(B_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'C':
                        if (CisSet) {
                            R_SLL = C_SLL.subtraction(C_SLL.head());

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                break;
            default:
                throw new RuntimeException();
        }

        int[][] poly = convertLLSto2D(R_SLL);
        RisSet = true;
        return poly;
    }

    public String print(char poly) {
        String result = "";
        switch (poly) {
            case 'A':
                if (AisSet == false) {
                    throw new RuntimeException();
                } else {
                    for (int i = 0; i < A_SLL.size() - 1; i++) {
                        Integer exponent = A_SLL.size() - i - 1;
                        if ((int) A_SLL.get(i) == 0) {
                            continue;
                        } else if (i == 0 || (int) A_SLL.get(i-1) == 0) {
                            if ((int) A_SLL.get(i) == 1 && exponent == 1) {
                                result = result + "x";
                            } else if ((int) A_SLL.get(i) != 1 && exponent == 1) {
                                result = result + A_SLL.get(i) + "x";
                            } else if ((int) A_SLL.get(i) == 1 && exponent != 1) {
                                result = result + "x^" + exponent.toString();
                            } else if ((int) A_SLL.get(i) != 1 && exponent != 1) {
                                result = result + A_SLL.get(i) + "x^" + exponent.toString();
                            }
                        } else if ((int) A_SLL.get(i) > 0 ) {
                            if ((int) A_SLL.get(i) == 1 && exponent == 1) {
                                result = result + "+" + "x";
                            } else if ((int) A_SLL.get(i) != 1 && exponent == 1) {
                                result = result + "+" + A_SLL.get(i) + "x";
                            } else if ((int) A_SLL.get(i) == 1 && exponent != 1) {
                                result = result + "+" + "x^" + exponent.toString();
                            } else if ((int) A_SLL.get(i) != 1 && exponent != 1) {
                                result = result + "+" + A_SLL.get(i) + "x^" + exponent.toString();
                            }
                        } else if ((int) A_SLL.get(i) < 0) {
                            if ((int) A_SLL.get(i) != 1 && exponent == 1) {
                                result = result + A_SLL.get(i) + "x";
                            }  else if ((int) A_SLL.get(i) != 1 && exponent != 1) {
                                result = result + A_SLL.get(i) + "x^" + exponent.toString();
                            }
                        }
                    }
                    if ((int) A_SLL.get(A_SLL.size() - 1) == 0  ) {

                    } else if ((int) A_SLL.get(A_SLL.size() - 1) > 0) {
                        result = result + "+" + A_SLL.get(A_SLL.size() - 1);
                    } else if ((int) A_SLL.get(A_SLL.size() - 1) < 0) {
                        result = result + A_SLL.get(A_SLL.size() - 1);
                    }
                }
                break;
            case 'B':
                if (BisSet == false) {
                    throw new RuntimeException();
                } else {
                    for (int i = 0; i < B_SLL.size() - 1; i++) {
                        Integer exponent = B_SLL.size() - i - 1;
                        if ((int) B_SLL.get(i) == 0) {
                            continue;
                        } else if (i == 0 || (int) B_SLL.get(i-1) == 0) {
                            if ((int) B_SLL.get(i) == 1 && exponent == 1) {
                                result = result + "x";
                            } else if ((int) B_SLL.get(i) != 1 && exponent == 1) {
                                result = result + B_SLL.get(i) + "x";
                            } else if ((int) B_SLL.get(i) == 1 && exponent != 1) {
                                result = result + "x^" + exponent.toString();
                            } else if ((int) B_SLL.get(i) != 1 && exponent != 1) {
                                result = result + B_SLL.get(i) + "x^" + exponent.toString();
                            }
                        } else if ((int) B_SLL.get(i) > 0) {
                            if ((int) B_SLL.get(i) == 1 && exponent == 1) {
                                result = result + "+" + "x";
                            } else if ((int) B_SLL.get(i) != 1 && exponent == 1) {
                                result = result + "+" + B_SLL.get(i) + "x";
                            } else if ((int) B_SLL.get(i) == 1 && exponent != 1) {
                                result = result + "+" + "x^" + exponent.toString();
                            } else if ((int) B_SLL.get(i) != 1 && exponent != 1) {
                                result = result + "+" + B_SLL.get(i) + "x^" + exponent.toString();
                            }
                        } else if ((int) B_SLL.get(i) < 0) {
                            if ((int) B_SLL.get(i) != 1 && exponent == 1) {
                                result = result + B_SLL.get(i) + "x";
                            }else if ((int) B_SLL.get(i) != 1 && exponent != 1) {
                                result = result + B_SLL.get(i) + "x^" + exponent.toString();
                            }
                        }
                    }
                    if ((int) B_SLL.get(B_SLL.size() - 1) == 0) {

                    } else if ((int) B_SLL.get(B_SLL.size() - 1) > 0) {
                        result = result + "+" + B_SLL.get(B_SLL.size() - 1);
                    } else if ((int) B_SLL.get(B_SLL.size() - 1) < 0) {
                        result = result + B_SLL.get(B_SLL.size() - 1);
                    }
                }
                break;
            case 'C':
                if (CisSet == false) {
                    throw new RuntimeException();
                } else {
                    for (int i = 0; i < C_SLL.size() - 1; i++) {
                        Integer exponent = C_SLL.size() - i - 1;
                        if ((int) C_SLL.get(i) == 0) {
                            continue;
                        } else if (i == 0 || (int) C_SLL.get(i-1) == 0) {
                            if ((int) C_SLL.get(i) == 1 && exponent == 1) {
                                result = result + "x";
                            } else if ((int) C_SLL.get(i) != 1 && exponent == 1) {
                                result = result + C_SLL.get(i) + "x";
                            } else if ((int) C_SLL.get(i) == 1 && exponent != 1) {
                                result = result + "x^" + exponent.toString();
                            } else if ((int) C_SLL.get(i) != 1 && exponent != 1) {
                                result = result + C_SLL.get(i) + "x^" + exponent.toString();
                            }
                        } else if ((int) C_SLL.get(i) > 0) {
                            if ((int) C_SLL.get(i) == 1 && exponent == 1) {
                                result = result + "+" + "x";
                            } else if ((int) C_SLL.get(i) != 1 && exponent == 1) {
                                result = result + "+" + C_SLL.get(i) + "x";
                            } else if ((int) C_SLL.get(i) == 1 && exponent != 1) {
                                result = result + "+" + "x^" + exponent.toString();
                            } else if ((int) C_SLL.get(i) != 1 && exponent != 1) {
                                result = result + "+" + C_SLL.get(i) + "x^" + exponent.toString();
                            }
                        } else if ((int) C_SLL.get(i) < 0) {
                            if ((int) C_SLL.get(i) != 1 && exponent == 1) {
                                result = result + C_SLL.get(i) + "x";
                            } else if ((int) C_SLL.get(i) != 1 && exponent != 1) {
                                result = result + C_SLL.get(i) + "x^" + exponent.toString();
                            }
                        }
                    }
                    if ((int) C_SLL.get(C_SLL.size() - 1) == 0) {

                    } else if ((int) C_SLL.get(C_SLL.size() - 1) > 0) {
                        result = result + "+" + C_SLL.get(C_SLL.size() - 1);
                    } else if ((int) C_SLL.get(C_SLL.size() - 1) < 0) {
                        result = result + C_SLL.get(C_SLL.size() - 1);
                    }
                }
                break;
            case 'R':
                if (RisSet == false) {
                    throw new RuntimeException();
                } else {
                    for (int i = 0; i < R_SLL.size() - 1; i++) {
                        Integer exponent = R_SLL.size() - i - 1;
                        if ((int) R_SLL.get(i) == 0) {
                            continue;
                        } else if (i == 0 || (int) R_SLL.get(i-1) == 0) {
                            if ((int) R_SLL.get(i) == 1 && exponent == 1) {
                                result = result + "x";
                            } else if ((int) R_SLL.get(i) != 1 && exponent == 1) {
                                result = result + R_SLL.get(i) + "x";
                            } else if ((int) R_SLL.get(i) == 1 && exponent != 1) {
                                result = result + "x^" + exponent.toString();
                            }  else if ((int) R_SLL.get(i) != 1 && exponent != 1) {
                                result = result + R_SLL.get(i) + "x^" + exponent.toString();
                            }
                        } else if ((int) R_SLL.get(i) > 0) {
                            if ((int) R_SLL.get(i) == 1 && exponent == 1) {
                                result = result + "+" + "x";
                            } else if ((int) R_SLL.get(i) != 1 && exponent == 1) {
                                result = result + "+" + R_SLL.get(i) + "x";
                            } else if ((int) R_SLL.get(i) == 1 && exponent != 1) {
                                result = result + "+" + "x^" + exponent.toString();
                            } else if ((int) R_SLL.get(i) != 1 && exponent != 1) {
                                result = result + "+" + R_SLL.get(i) + "x^" + exponent.toString();
                            }
                        } else if ((int) R_SLL.get(i) < 0) {
                              if ((int) R_SLL.get(i) != 1 && exponent == 1) {
                                result = result + R_SLL.get(i) + "x";
                            }  else if ((int) R_SLL.get(i) != 1 && exponent != 1) {
                                result = result + R_SLL.get(i) + "x^" + exponent.toString();
                            }
                        }
                    }
                    if ((int) R_SLL.get(R_SLL.size() - 1) == 0) {

                    } else if ((int) R_SLL.get(R_SLL.size() - 1) > 0) {
                        result = result + "+" + R_SLL.get(R_SLL.size() - 1);
                    } else if ((int) R_SLL.get(R_SLL.size() - 1) < 0) {
                        result = result + R_SLL.get(R_SLL.size() - 1);
                    }
                }
                break;
            default:
                throw new RuntimeException();
        }
        return result;
    }

    public float evaluatePolynomial(char poly, float value) {
        float result = 0f;
        switch (poly) {
            case 'A':
                if (AisSet == false) {
                    throw new RuntimeException();
                } else {
                    for (int i = 0; i < A_SLL.size(); i++) {
                        Integer exponent = A_SLL.size() - i - 1;
                        result += (int) A_SLL.get(i) * (float) Math.pow((double) value, (double) exponent);
                    }
                }
                break;
            case 'B':
                if (BisSet == false) {
                    throw new RuntimeException();
                } else {
                    for (int i = 0; i < B_SLL.size() - 1; i++) {
                        Integer exponent = B_SLL.size() - i - 1;
                        result += (int) B_SLL.get(i) * (float) Math.pow((double) value, (double) exponent);
                    }
                }
                break;
            case 'C':
                if (CisSet == false) {
                    throw new RuntimeException();
                } else {
                    for (int i = 0; i < C_SLL.size() - 1; i++) {
                        Integer exponent = C_SLL.size() - i - 1;
                        result += (int) C_SLL.get(i) * (float) Math.pow((double) value, (double) exponent);
                    }
                }
                break;
            case 'R':
                if (RisSet == false) {
                    throw new RuntimeException();
                } else {
                    for (int i = 0; i < R_SLL.size() - 1; i++) {
                        Integer exponent = R_SLL.size() - i - 1;
                        result += (int) R_SLL.get(i) * (float) Math.pow((double) value, (double) exponent);
                    }
                }
                break;
            default:
                throw new RuntimeException();
        }
        return result;

    }

    public void clearPolynomial(char poly) {
        switch (poly) {
            case 'A':
                if(!AisSet){
                    throw new RuntimeException();
                }else {
                    A_SLL.clear();
                    AisSet = false;
                }
                break;
            case 'B':
                if(!BisSet){
                    throw new RuntimeException();
                }else {
                    B_SLL.clear();
                    BisSet = false;
                }
                break;
            case 'C':
                if(!CisSet){
                    throw new RuntimeException();
                }else {
                    C_SLL.clear();
                    CisSet = false;
                }
                break;
            case 'R':
                if(!RisSet){
                    throw new RuntimeException();
                }else {
                    R_SLL.clear();
                    RisSet = false;
                }
                break;
            default:
                throw new RuntimeException();
        }
    }

    public SingleLinkedList multiplication(SingleLinkedList M1, SingleLinkedList M2) {
        SingleLinkedList M3 = new SingleLinkedList();
        for (int i = 0; i < M1.size() + M2.size() - 1; i++) {
            M3.add(0);
        }
        for (int i = 0; i < M1.size(); i++) {
            for (int j = 0; j < M2.size(); j++) {
                int deg1 = M1.size() - i - 1;
                int deg2 = M2.size() - j - 1;
                int exponent = deg1 + deg2;
                int coeff = (int) M1.get(i) * (int) M2.get(j);
                int M3_index = M3.size() - exponent - 1;
                M3.addto(M3_index, coeff);
            }
        }
        return M3;
    }


    public int[][] multiply(char a, char b) {

        switch (a) {
            case 'A':
                switch (b) {
                    case 'A':
                        if (AisSet) {
                            R_SLL = multiplication(A_SLL, A_SLL);

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'B':
                        if (AisSet && BisSet) {
                            R_SLL = multiplication(A_SLL, B_SLL);

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'C':
                        if (AisSet && CisSet) {
                            R_SLL = multiplication(A_SLL, C_SLL);

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                break;
            case 'B':
                switch (b) {
                    case 'A':
                        if (AisSet && BisSet) {
                            R_SLL = multiplication(B_SLL, A_SLL);

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'B':
                        if (BisSet) {
                            R_SLL = multiplication(B_SLL, B_SLL);

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'C':
                        if (BisSet && CisSet) {
                            R_SLL = multiplication(B_SLL, C_SLL);

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                break;
            case 'C':
                switch (b) {
                    case 'A':
                        if (CisSet && AisSet) {
                            R_SLL = multiplication(C_SLL, A_SLL);

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'B':
                        if (CisSet && BisSet) {
                            R_SLL = multiplication(C_SLL, B_SLL);

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    case 'C':
                        if (CisSet) {
                            R_SLL = multiplication(C_SLL, C_SLL);

                        } else {
                            throw new RuntimeException();
                        }
                        break;
                    default:
                        throw new RuntimeException();
                }
                break;
            default:
                throw new RuntimeException();
        }

        int[][] poly = convertLLSto2D(R_SLL);
        RisSet = true;
        return poly;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Polynomial_solver PS = new Polynomial_solver();
        try {
            while (sc.hasNext()) {
                String result;
                String operator = sc.nextLine();
                char poly1_name;
                char poly2_name;
                char poly_name;
                switch (operator) {
                    case "set":
                        poly_name = sc.nextLine().charAt(0);
                        String sin = sc.nextLine().replaceAll("\\[|]", "");
                        String[] s = sin.split(",");
                        int[][] arr = new int[s.length][2];

                        if (s.length == 1 && s[0].isEmpty())
                            throw new RuntimeException();
                        else {
                            for (int i = 0; i < s.length; ++i) {
                                arr[i][0] = Integer.parseInt(s[i]);
                                arr[i][1] = s.length - i - 1;
                            }
                        }
                        PS.setPolynomial(poly_name, arr);

                        break;
                    case "print":
                        poly_name = sc.nextLine().charAt(0);
                        result = PS.print(poly_name);
                        System.out.println(result);
                        break;
                    case "add":
                        poly1_name = sc.nextLine().charAt(0);
                        poly2_name = sc.nextLine().charAt(0);
                        int[][] add_poly = PS.add(poly1_name, poly2_name);
                        result = PS.print('R');
                        System.out.println(result);
                        break;

                    case "sub":
                        poly1_name = sc.nextLine().charAt(0);
                        poly2_name = sc.nextLine().charAt(0);
                        int[][] subtract_poly = PS.subtract(poly1_name, poly2_name);
                        result = PS.print('R');
                        System.out.println(result);
                        break;

                    case "eval":
                        poly_name = sc.nextLine().charAt(0);
                        float x_value = sc.nextFloat();
                        float poly_value = PS.evaluatePolynomial(poly_name, x_value);
                        System.out.println((int) poly_value);
                        break;
                    case "clear":
                        poly_name = sc.nextLine().charAt(0);
                        PS.clearPolynomial(poly_name);
                        System.out.println("[]");
                        break;

                    case "mult":
                        poly1_name = sc.nextLine().charAt(0);
                        poly2_name = sc.nextLine().charAt(0);
                        int[][] mult_poly = PS.multiply(poly1_name, poly2_name);
                        result = PS.print('R');
                        System.out.println(result);
                        break;
                    default:
                        throw new RuntimeException();
                }

            }
        }catch (RuntimeException e){
            System.out.println("Error");
        }
    }
}
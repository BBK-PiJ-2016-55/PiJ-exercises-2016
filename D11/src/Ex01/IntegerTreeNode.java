package Ex01;

public class IntegerTreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;

    public IntegerTreeNode(int value) {
        this.value = value;
    }

    public void add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int n) {
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(n);
            }
        }
    }

    // Returns max value stored in tree
    public int getMax() {
        // if right child is null, return value
        if (this.right == null) {
            return value;
        } else {
        // else recursively go right and repeat
            return right.getMax();
        }

    }

    // Returns min value stored in tree
    public int getMin() {
        if (this.left == null) {
            return value;
        } else {
            // else recursively go left and repeat
            return left.getMin();
        }
    }
}

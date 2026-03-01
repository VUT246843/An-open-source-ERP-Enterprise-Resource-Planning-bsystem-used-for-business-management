
        this.FixupRoot();
            return other.clone();
        if (y.left.isNotSentinel()) {
                    if (this.afterLast) {
                    } else if (this.afterLast) {
        }
                        offset -= next.offset;

        }
                    return this.currentLocation.offset + (this.currentLocation.node == null ? 0 : this.currentLocation.node.offset);
                        next = node.parent;

    
                    next = node.parent;
                Node<T> newNode = new Node<>(location.offset, value, true, null, null);
                    // FIXME this does happen apparently, so we need another removal strategy
                        // right is sentinel
                    node = parent;
            this.root = y;                  // at rbTree, set it to y
    }
        } else {
                if (location.isLeft) {
import java.util.function.Function;
    private static <T> Iterable<T> flatten(T node, Function<T, Iterable<T>> childrenSelector) {
            this.node = node;
        T oldValue;
                    } else {
    }
        while (node.left.isNotSentinel()) {
        public void refreshBlackHeight() {
        private final Iterator<T> childrenIterator;
        Node<T> node = location.node;
        y.right = x;                        // put x on y's right
                if (y.isRed) {
                    return this.currentLocation.node != null;
        // A node to be deleted will be: 
            x.refreshBlackHeight();
            throw new IllegalStateException("relative offsets invariant being positive violated during balancing rotation procedure");
        return new NodeAndOffset<>(node, offset);

                }
 *
        NodeAndParentAtOffset<T> result = this.findImpl(position);
                        next = node.right;
            if (prev != null && prev.right == node) {
                return new FlatteningIterator<>(node, childrenSelector);
            @Override
                t.offset -= y.offset; // so fix it up
                boolean afterLast = false;
                    y.isRed = false;
            x.parent = y;
                if (this.tombstonesCount > this.size / 2) {
                    if (next != null && next.right == node) {
            Pair<OffsetKeyedTreeMap<T>, OffsetKeyedTreeMap<T>> headPair = tailPair.getFirst().split(position);
            return this.current != null;
                    } else {
                t.right.right.isRed = false;
        public Node<T> parent = null;
            location.node.offset += delta;
            }
        this.root = sentinel();
                        newNodes.push(newNode);

                boolean afterLast = position > OffsetKeyedTreeMap.this.root.offset;
        this.size = 0;
        public boolean hasNext() {

            throw new IllegalStateException();
    
        public final Node<T> parent;
        //      return ⟨join(L,T.key,L'),R)⟩
                x.parent.right = y;         // set right parent to y
        }
        return (Node<T>) Node.SENTINEL;
                        NodeAndOffset<T> parentLocation = new NodeAndOffset<>(

        }
            this.root = new Node<>(pos, value, false, null, null);
        } else if (this.root == x) {
            }
                }
                        // left will be created later
        while (node.right.isNotSentinel()) {
        // x and y are used as variable names for brevity, in a more formal
                return;
    public OffsetKeyedTreeMap() {
            if (x == x.parent.left) {         // determine sub tree from parent
    
    public NodesIterator<T> nodesIteratorAt(int position) {
                    } else {

                    this.rotateLeft(x.parent.parent);
                }
                }
            this.root.parent = null;
    private Pair<OffsetKeyedTreeMap<T>, OffsetKeyedTreeMap<T>> split(int pos) {
            }
        if (!y.isRed) {
    private NodeAndOffset<T> findFirst(NodeAndOffset<T> location) {
            x = y.right;
    }
        // implementation, you should probably change the names
                    this.afterLast = this.currentLocation.node == null;
            } else {
                xy.getFirst().put(root.offset, root.content, null);
                    } else {
                    x.parent.isRed = true;
    public interface NodesIterator<T> {
        long count = this.root.isSentinel() ? 0 : StreamSupport.stream(flatten(
                    } else if (this.beforeFirst) {
                next = next.left;

            throw new IllegalStateException("Cloning procedure inconsistency detected");
                    x.parent.parent.isRed = true;
    public OffsetKeyedTreeMap<T> concat(OffsetKeyedTreeMap<T> other) {
                    throw new IllegalStateException("Inconsistency during right-hand concat procedure");
                    // both subnodes are ready, rightmost was the last one
                        // right will be created later
                        action.accept(currOffset + node.offset, node.content);
                }
        } else {
                @Nullable
        }

                    } else {
                        y.left.isRed = false;

                    return null;
        // at this point, y contains the replacement node. it's content will be copied to the values in the node to be deleted
                xy.getFirst().prepend(root.right, root.offset);
                }
                this.right.parent = this;
        }
    }
            if (this.right.isNotSentinel()) {
                }

                    } else {
        public final Node<T> node;
                final Node<T> theOnlyNode = OffsetKeyedTreeMap.this.root;
            // parent node is .Colored red; 
        @Override
                relPos -= node.offset;
//                y = y.left;

                y = x.parent.left;
        if (location.node.isNotSentinel()) {
        if (bh.size() != 1 || !bh.stream().findFirst().get().equals(this.root.blackHeight)) {
        
            Node<T> t = new Node<>(roff - loff, null, true, TL, TR);
        return new OffsetKeyedTreeMap<>(newNodes.size() > 0 ? newNodes.pop() : sentinel(), count);
                        t.put(it.getCurrOffset(), it.getCurrValue());

                            initialLocation.parent, position - initialLocation.offset - (initialLocation.isLeft ? 0 : initialLocation.parent.offset)
        if (!TR.isRed && TR.blackHeight == TL.blackHeight) {
        if (y.isNotSentinel()) {
                        next = node.right;

            }
        if (node.left.isNotSentinel()) {
                public int getCurrOffset() {
//            }
        int count = 0;


        if (node.right.isNotSentinel()) {
                    .map(c -> evaluateNodeBlackHeight(c, n.offset)).toList()
        Pair<OffsetKeyedTreeMap<T>, OffsetKeyedTreeMap<T>> pair = this.split(position);
            } while (xx != this.root);

            return this.clone();
                public boolean next() {
            this.right = right != null ? right : sentinel();
                @Nullable
            if (next != null) {
            this.root.left.refreshBlackHeight();
            while (prev.right.isNotSentinel()) {
            y.left.parent = x;              // sets y's left parent to x
        if (root.isNotSentinel()) {
 */
                } else {
            throw new IllegalStateException("Black height constraint violation");
            }
                } else {


        if (x.isNotSentinel()) {            // set y as x's parent
    private void splice(OffsetKeyedTreeMap<T> other) {
        if (y != z) {
    private NodeAndOffset<T> findNext(NodeAndOffset<T> location) {
            this.parent = null;
                @Nullable
        stringifyNode(sb, depth, offCtx + node.offset, node, prefix);
        x.parent = y.parent;
        Node<T> y = x.left;            // get x's left node, this becomes y
                }
            if (ts.node.isRed && ts.node.left.isRed)
        boolean next();
                        this.currentLocation = findNext(this.currentLocation);
        private final Function<T, Iterable<T>> childrenSelector;
                    }
                        // node's left is empty, go to the right
                    while (parent != null && node == parent.right) {
    public T put(int pos, T value, RemappingFunction<T> remappingFunction) {
                t.refreshBlackHeight();
              
                        this.currentLocation = findLast(new NodeAndOffset<>(OffsetKeyedTreeMap.this.root, 0));
        } else {
    /// RotateLeft
            t.refreshBlackHeight();
        // replace x's parent with y's parent and link x to proper subtree in parent; this removes y from the chain

        }
                    x = x.parent.parent;
            t.refreshParentRefs();
        if (l.blackHeight > r.blackHeight) {
            }
                // this code is the same as above with "left" and "right" swapped
            this.left = left != null ? left : sentinel();
            } else {
        x.offset -= y.offset;
                    x.parent.isRed = false;
            }
                y = x.parent.parent.right;          // get uncle
                    }
        if (y.parent != null) {

                @Override
        return concatImpl(this.root, 0, other.root, 0);
                    this.root, n -> Stream.of(n.left, n.right).filter(Node::isNotSentinel).toList()
                    this.rotateRight(x.parent);
                }

        Set<Integer> bh = this.root.isSentinel() ? Set.<Integer>of(0) : StreamSupport.stream(
        //      ⟨L',R'⟩ = split(L,k)
        //    if k < T.key

        }
            }
        return new NodeAndParentAtOffset<>(parent, node, isLeft, relPos);
    }
        int offset = location.offset;
import java.util.stream.Collectors;
                    }
                    var right = newNodes.pop();
                }
        }
            return new Subtree<>(t, 1);
        }
        }
    ///</summary>
                public boolean next() {
                this.restoreAfterInsert(newNode);
                    y.right.isRed = false;
                    y.isRed = false;
                node = next;
                    action.accept(currOffset + node.offset, node.content);
            this.root = y;                     // at rbTree, set it to y
    }
    /// Additions to red-black trees usually destroy the red-black 
                    next = node.parent;
                    if (n != this.root && n.parent == null || n.parent == sentinel()) {
            Node<T> node = root;
//            while (y.left.isNotSentinel()) {    // to find next node in sequence
                    x.parent.isRed = false;
        y.offset += x.offset;

    public void removeBefore(int position) {
        if (x.parent != null) {   // determine which side of it's parent x was on
            y.parent = x.parent;            // set y's parent to x's parent
        public NodeAndParentAtOffset(Node<T> parent, Node<T> node, boolean isLeft, int offset) {
        OffsetKeyedTreeMap<T> b = cloneSubtree(r);
                // determine traversal path
        }

    
                    if (this.initial && initialLocation.node.isSentinel()) {

        if (this.root.isSentinel()) {
                        this.beforeFirst = false;
    }
    }
            if (ts.node.isRed && ts.node.right.isRed)
        return new Iterable<T>() {
                }

 * See the License for the specific language governing permissions and
        while (x != this.root && x.parent.isRed) {
        // replaces x (since x < y), and y's right child becomes x's left child 

        if (delta < 0) {
                } else if (prev == node.left) {
    ///<summary>
            }
            Node<T> prev = null;
            if (relPos < node.offset) {
    }
    private OffsetKeyedTreeMap<T> concatImpl(Node<T> l, int loff, Node<T> r, int roff) {
        NodeAndParentAtOffset<T> location = this.findImpl(position);
            return this != SENTINEL;
            this.value = value;
                x.parent.left = y;          // set left parent to y

    public static class ValueAndOffset<T> {
            throw new UnsupportedOperationException("Negative delta not supported at the moment");
    }
import java.util.stream.Stream;
                this.current = null;
        Node<T> prev;
        int getCurrOffset();
    private Node<T> root;
                if (node == parent.left) {
        //    1. a leaf with no children
            this.offset = offset;
        }
                        );
                }
                    y = x.parent.right;
                        next = node.right;
    @FunctionalInterface
    private NodeAndOffset<T> findPrev(NodeAndOffset<T> location) {
    }
        public String toString() {
    
            if (x == x.parent.right) {
            this.offset = offset;
                        next = node.parent;
            if (location.node.isNotSentinel()) {
    }
                if (y != null && y.isRed) {
        return splitImpl(this.root, pos);     // TODO can be optimized
    }
                    // a leaf has only black children 
                    throw new IllegalStateException("RB-tree inconsistency detected");
        }
    }
    
        public final boolean isLeft;
        this.splice(pair.getFirst());
                prev = node;
        public int blackHeight = 0; // blackHeight needed for efficient split-join operations, which we are not using at the moment  

                    } else if (node.right.isNotSentinel()) {
        return switch (this.size) {

        // replaces x (since y > x), and y's left child becomes x's right child 
            node = node.left;
}
                    while (it.prev()) {
            }
    private static <T> void stringifyNode(StringBuilder sb, int depth, int offset, Node<T> node, String prefix) {
                    } else if (this.beforeFirst) {
                    parent = node.parent;
    private void prepend(Node<T> other, int off) {
        public final T value;
            this.deleteNode(location.node);
    @SuppressWarnings("unchecked")
                    parent.right = newNode;
                this.size++;
    /// required to restore it
                    y.isRed = x.parent.isRed;
                @Override
        
        { // TODO consider an approach of retrieving the center node from one of the subtrees being merged

                }
                        this.rotateRight(y);
    private void restoreAfterInsert(Node<T> x) {
            // y's offset was applied to x-rooted subtree, now y is gone, so apply the delta explicitly
        return new NodeAndOffset<>(prev, prev == null ? Integer.MIN_VALUE : offset);
        T apply(int pos, T newValue, T oldValue);
                    newNodes.push(newNode);

        if (z.left.isSentinel() || z.right.isSentinel()) {
                    newNode.refreshBlackHeight();
        int offset = location.offset;
                this.blackHeight = Math.max(this.left.blackHeight, this.right.blackHeight) + (this.isRed ? 0 : 1);
            };
                        y.right.isRed = false;
                x.parent.left = y;          // set left parent to y
        int relPos = pos;
                if (next.right == node) {
                    x = x.parent.parent;    // continue loop with grandparent
        } else {
        }
                y.parent.left = x;
    ///<summary>
    }
    }
                @Override
                z.content = null;
                    }
            this.root.isRed = false;
                xy.getSecond().put(root.offset, root.content, null);
            xDelta = y.offset;
        }

        }
                        currOffset += node.offset;
        
        return y;

                }
                        NodeAndOffset<T> parentLocation = new NodeAndOffset<>(
                    currOffset -= node.parent != null && node.parent.right == node ? node.parent.offset : 0;
                        this.currentLocation = findPrev(this.currentLocation);
            location.parent.offset += delta;
            if (x == x.parent.left) {
    public boolean removeAt(int position) {

                    }
                prev = node;
            if (y == y.parent.left) {
                        next = node.parent;
        }
                }
        public T content;
        // set x's right link
        } else {
                    y.isRed = true;
        while (node.isNotSentinel()) {
                }
    private NodeAndParentAtOffset<T> findImpl(int pos) {
                // x's parent is on the right subtree

        
            next = node.parent;
                    y.isRed = x.parent.isRed;
    private Node<T> rotateLeft(Node<T> x) {
                if (oldValue == null) {
        if (this.root.isNotSentinel()) {
    
                        // right is sentinel

package org.jkiss.dbeaver.model.sql.semantics;
                node = prev;
            if (!(!l.isRed && !r.isRed)) {
        T getCurrValue();
            } else {
                        x = x.parent;
                @Override
            xDelta = 0;
                }
    }
    }
        if (y.isNotSentinel()) {
        var newNodes = new Stack<Node<T>>();
                        next = node.parent;
        y.left = x;                         // put x on y's left 


        } else {
        if (node.left.isNotSentinel()) {
    ///</summary>
                    next = node.parent;

        }
        }
    private void fixupRoot() {
    
        };
            parent = node;
    private static <T> NodeAndOffset<T> evaluateNodeBlackHeight(Node<T> node, int p) {
import java.util.function.BiConsumer;
        public NodeAndOffset(Node<T> node, int offset) {
        return new NodeAndOffset<>(node, p + (node.isRed ? 0 : 1));
                        this.currentLocation = initialLocation.isLeft ? parentLocation : findNext(parentLocation);
    public String collect() {
    
                if (y.isRed) {   // x is black, y is red - make both black and rotate
        this.tombstonesCount = 0;
            this.childrenSelector = childrenSelector;
        
                    if (x == x.parent.left) {
            }

                        // make x a left child

                        newNode.refreshBlackHeight();
                if (prev == node.parent || prev == null) {


        
    }
    }
                    } else {
                    throw new IllegalStateException("relative offsets invariant being positive violated during after-delete fixup");
                } else {
        // (since it's < x but > y).
        if (this.size == 0) {
                location.node.content = newValue;
            while (parent != null) {
                    }
        var node = root;
            x.right.refreshBlackHeight();
                    if (x == x.parent.right) {   // yes, x is greater than parent; rotate left
                    this.tombstonesCount--;
    private static <T> OffsetKeyedTreeMap<T> cloneSubtree(Node<T> root) { // TODO we can get rid of this thing... theoretically
            Subtree<T> crsr = concatImplJoinRight(TL.right, loff + TL.offset, TR, roff);
        if (!TL.isRed && TL.blackHeight == TR.blackHeight) {
        
        if (location.node.isSentinel() && location.isLeft) {
            return new Pair<>(new OffsetKeyedTreeMap<T>(), new OffsetKeyedTreeMap<T>());
    }
    private Subtree<T> concatImplJoinRight(Node<T> TL, int loff, Node<T> TR, int roff) {
            }

            }
                    x.parent.parent.isRed = true;
        }
            if (y.left.isNotSentinel()) { // FIXME standard rb-tree removal strategy cannot be applied, just mark z as tombstone for now
        if (x.isNotSentinel()) {            // set y as x's parent
        public FlatteningIterator(T node, Function<T, Iterable<T>> childrenSelector) { 

    }
import org.jkiss.code.Nullable;
            oldValue = null;
            this.parent = parent;
            if (!TL.isRed && t.right.isRed && t.right.right.isRed) {
                while (next != null && next.left != node) {
    private int size, tombstonesCount;
                Node<T> parent = location.parent;
        if (y.left.isNotSentinel()) {
        if (root.isSentinel()) {
                    }
                        this.beforeFirst = false;
                    y.left.isRed = false;

                        // right will be created later
            this.root.refreshBlackHeight();
            return;
        } else {
                if (prev == node.parent || prev == null) {
    private void restoreAfterDelete(Node<T> x) {
        
import java.util.Set;
    public T find(int position) {
            } else {
            return result;

    private static class NodeAndOffset<T> {
                        currOffset += node.offset;
 *
        Node<T> node = location.node;
                    x = this.root;
            // TODO consider merging with the same loop below
                    this.root = t.root;
            newRoot.refreshBlackHeight();
                } else if (prev == node.right) {
    }
                if (t.left.left.isSentinel())
            prev = node.parent;
            public Iterator<T> iterator() {

        public boolean isRed = false;
    }
        this.size = 0;
            Subtree<T> ts = concatImplJoinLeft(a.root, loff, b.root, roff);


    }
        }
        return bh.stream().findFirst().get();
        }
            case 0 -> new NodesIterator<T>() {
            Node<T> t = new Node<>(TL.offset, TL.content, TL.isRed, TL.left, crsr.node); // is it TL.right = cr ??
    }
 * You may obtain a copy of the License at
                        currOffset -= node.parent != null && node.parent.right == node ? node.parent.offset : 0;

                }
        public Node<T> right = null;
                        this.beforeFirst = true;
                    return false;
        NodeAndParentAtOffset<T> initialLocation = this.findImpl(position);
            );
                        );

                oldValue = null;
        // link x and y 
            this.root.parent = null;
                );
            super(node, offset);
        return sb.toString();
                this.tombstonesCount++;
                        throw new IllegalStateException("Missing parent reference detected");
        return new NodeAndOffset<>(node, offset);
        while (node != null && node.parent != null) {
        // If the deleted node is red, the red black properties still hold.
        }
                t.refreshBlackHeight();
        
                public boolean next() {
        
        }
            this.node = node;
        var xx = x;
    
        }
                    var newNode = new Node<>(node.offset, node.content, node.isRed, left, right); count++;
    
                } else if (prev == node.right) {
        x.refreshBlackHeight();
    
            prev = node.left;
    public void applyOffset(int position, int delta) {
        if (this.root.isNotSentinel()) {
        
                if (t.offset < 0) {
        
    public T put(int pos, T value) {
                    // we've just arrived, so investigate left, then right
        return this.put(pos, value, null);
        if (newNodes.size() > 1) {

                        // both left and right are sentinels, so this is leaf
                        this.afterLast = false;
                }

                xx.right.refreshBlackHeight();
                t.refreshBlackHeight();
    }
            .append(node.content).append("\n");
        this.root = sentinel();
            this.root.refreshBlackHeight();
        }
            this.expansionIterator = null;
            this.childrenIterator = childrenSelector.apply(node).iterator();
    }
                    throw new IllegalStateException("RB-tree inconsistency detected");
                    if (this.beforeFirst) {
            for (Node<T> t = x; t.isNotSentinel(); t = t.left) {
            return true;
                boolean beforeFirst = position < OffsetKeyedTreeMap.this.root.offset;
                        return false;
    
                    // no, x is less than parent
            return new OffsetKeyedTreeMap<>(ts.node, a.size + b.size + ts.size);
        int offset = location.offset;
            newRoot.refreshParentRefs();
        int xDelta;
            do {

    public OffsetKeyedTreeMap<T> clone() {

                this.current = this.expansionIterator.hasNext() ? this.expansionIterator.next() : null;
    
                ts.node.isRed = false;
        public Node(int offset, T content, boolean isRed, Node<T> left, Node<T> right) {

                if (!y.right.isRed && !y.left.isRed) {
        return result.node.isNotSentinel() ? result.node.content : null;
                        return false;


    public void removeFragment(int position, int length) {
                    x.parent.isRed = false;
                    }
                offset += prev.offset;
    private Subtree<T> concatImplJoinLeft(Node<T> TL, int loff, Node<T> TR, int roff) {
                @Override
                public int getCurrOffset() {
            NodeAndParentAtOffset<T> location = this.findImpl(pos);
                return new Subtree<>(this.rotateRight(t), clsl.size);
        }
                T newValue;
                @Override
    }
                    // should never happen due to consistency rules, as we already applied xDelta
            t.refreshParentRefs();
                this.root, n -> Stream.of(n.left, n.right).filter(Node::isNotSentinel).toList()
                } else if (prev == node.left) {
        x.left = y.right;                   // y's right child becomes x's left child
                    while (this.currentLocation.node != null && this.currentLocation.node.content == null) { // due to tombstones
                    x = x.parent;                   // move up the tree
                        newNodes.push(sentinel());
        // pushing node x down and to the right to balance the tree. x's left child (y)
                if (y != null && y.isRed) {   // uncle is red; change x's parent and uncle to black

        Node<T> node = location.node;
        }
                        this.rotateLeft(y);
            this.splice(headPair.getFirst().concat(tailPair.getSecond()));
    }
    }
                    parent.offset += delta;

                        y = x.parent.right;
            return new OffsetKeyedTreeMap<>(newRoot, a.size + b.size + 1);
            this.isRed = isRed;
                public boolean prev() {
                    x.parent.isRed = false;    // make parent black
            while (next.left.isNotSentinel()) {
            if (!TR.isRed && t.left.isRed && t.left.left.isRed) {
                    } else if (this.afterLast) {
                    // grandparent must be red. Why? Every red node that is not 
        NodeAndParentAtOffset<T> location = this.findImpl(position);

        Pair<OffsetKeyedTreeMap<T>, OffsetKeyedTreeMap<T>> pair = this.split(position);
        //    2. have one child
            z.content = y.content;
                        this.currentLocation = findPrev(this.currentLocation);
        }
                    return position;
    private NodeAndOffset<T> findLast(NodeAndOffset<T> location) {
            }
        //func split(T, k)
        
            } else {
        public int offset = 0;
                    this.initial = false;
                newRoot.isRed = false;
        OffsetKeyedTreeMap<T> clone = cloneSubtree(this.root);
                    x.parent.isRed = false;
                    // left is ready, prepare right
            for (Node<T> t = z.right; t.isNotSentinel(); t = t.left) { // but it'll affect the whole right subtree, which is unwanted,
                do {
            this.root.parent = null;
            }
        @Override
                public T getCurrValue() {
        private Iterator<T> expansionIterator;

    }
        }
        }
    public interface RemappingFunction<T> {
        Node<T> next;
        collectImpl(sb, 0, 0, this.root, "");
                    y.isRed = true;     // change parent to red
                Pair<OffsetKeyedTreeMap<T>, OffsetKeyedTreeMap<T>> xy = this.splitImpl(root.left, pos);
                @Override
    public void removeAfter(int position) {
    }
                    }
    }
                    }
                offset -= prev.offset;
                    this.initial = false;
            if (x.parent == x.parent.parent.left) {
                }
            } else {
            case 1 -> new NodesIterator<T>() {

    private Node<T> rotateRight(Node<T> x) {

        // copy the values from y (the replacement node) to the node being deleted.

                    // we've just arrived, so investigate left, then right
                        y.isRed = true;
        StringBuilder sb = new StringBuilder();
    /// Rebalance the tree by rotating the nodes to the right

        }
                    x.parent.parent.isRed = true;       // make grandparent black
        x.right = y.left;                   // y's left child's becomes x's right child
                        this.currentLocation = initialLocation.isLeft ? findPrev(parentLocation) : parentLocation;
                    if (node.right.isNotSentinel()) {
                ts.node.isRed = false;
            Pair<OffsetKeyedTreeMap<T>, OffsetKeyedTreeMap<T>> tailPair = this.split(position + length);

        x.refreshBlackHeight();
        // x (y's only child) is the node that will be linked to y's old parent. 
        } else if (l.blackHeight < r.blackHeight) {
    /// RestoreAfterInsert
    ///</summary>
    public int validateBlackHeights() {
        
            } else {
                    } else {

                } else {
        return new NodeAndOffset<>(next, next == null ? Integer.MAX_VALUE : offset);
                        var newNode = new Node<>(node.offset, node.content, node.isRed, null, null); count++;
        boolean isLeft = false;
            }
public class OffsetKeyedTreeMap<T> {
        this.root = other.root;
        this.splice(this.concatImpl(other, off, this.root, 0));
                        if (newNode.left.isNotSentinel())
                        newNodes.push(newNode);
                        parent = node.parent;
                } else if (remappingFunction == null) {
                    this.tombstonesCount = 0;
 * limitations under the License.
        // modify parents
            
                        next = node.left;
        //    3. have two children
            T result = this.current;
                xx.refreshBlackHeight();
                    if (node.left.isNotSentinel()) {
        }
                    } else if (node.right.isNotSentinel()) {
                } while (!this.expansionIterator.hasNext() && childrenIterator.hasNext());
                    this.rotateRight(x.parent);
            x.parent = y;
        this.fixupRoot();
            y = z;                      // node has sentinel as a child
    }
        if (x.parent != null) {             // null=rbTree, could also have used rbTree

                    }
        }
                    var left = newNodes.pop();
        // set x's right link
            if (pos < root.offset) {
                        y.isRed = true;
                    while (this.currentLocation.node != null && this.currentLocation.node.content == null) { // due to tombstones

    public void clear() {
        while (x != this.root && !x.isRed) {
        }
    private static <T> Node<T> sentinel() {

    private static class Node<T> {
    /*
            y.right.parent = x;             // sets y's right parent to x
            if (this.left.isNotSentinel()) {
                        newNode.refreshBlackHeight();
        // pushing node x down and to the left to balance the tree. x's right child (y)
            return new OffsetKeyedTreeMap<>(ts.node, a.size + b.size + ts.size);
                    return !this.beforeFirst && !this.afterLast ? this.theOnlyNode.content : null;
            } else {
                    if (!y.right.isRed) {
                        this.currentLocation = findNext(this.currentLocation);
            return false;
        this.size = other.size;
            return;


            throw new IllegalStateException("size property is inconsistent");

        if (xDelta > 0) {
    // TODO there is a mess with relative offsets at the moment not sure how to solve it correctly
                    newValue = value;
            } else {   // right subtree - same as code above with right and left swapped
    }
/*
                        action.accept(currOffset + node.offset, node.content);
                }
                    return this.currentLocation.node != null;
    
                    this.expansionIterator = flatten(childrenIterator.next(), this.childrenSelector).iterator();

        if (count != (long) this.size) {
            int currOffset = 0;
                }
    }
            } else {
        y.refreshBlackHeight();
        private T current;
            return this.getClass().getSimpleName() + (this.isSentinel() ? "[SENTINEL]" : ("[" + this.offset + ", '" + this.content + "']"));
                
        Node<T> y = x.right;           // get x's right node, this becomes y
                boolean beforeFirst = false;
        }
            y.parent = x.parent;            // set y's parent to x's parent
            Node<T> t = new Node<>(null, true, TL, TR);
                prev = prev.right;
            this.root.right.refreshBlackHeight();;
            Node<T> t = new Node<>(TR.content, TR.isRed, clsl.node, TR.right);  // is it TR.left = cl ??
        }
                if (t.right.right.isSentinel())
            StreamSupport.stream(
                    }
                        // both left and right are sentinels, so this is leaf
                    newValue = remappingFunction.apply(pos, value, oldValue);
            collectImpl(sb, depth + 1, offCtx, node.left, "L");

        y.refreshBlackHeight();
        }
            .append("[").append(offset).append(" as ").append(node.offset).append("] ")
                } else {
        sb.append(String.join("", "  ".repeat(depth))).append(prefix)
                xx.left.refreshBlackHeight();
        }
            this.offset = offset;
        
                    var t = new OffsetKeyedTreeMap<T>();
            Subtree<T> ts = concatImplJoinRight(a.root, loff, b.root, roff);
            Subtree<T> clsl = concatImplJoinLeft(TL, TR.left);

                y.parent.right = x;
            t.refreshBlackHeight();
import java.util.Iterator;
                    if (node.left.isNotSentinel()) {
                        return false;
        //    else 
        return this.size - this.tombstonesCount;
            next = node.right;
        }
        }
        this.size--;
        public boolean isSentinel() {
            flatten(
        }
        // (since it's < y but > x).
        // If the deleted node is black, the tree needs rebalancing

            this.root = x;         // make x the root node
                break;
            Node<T> node = root, prev = null, next = null;
            }
    
                prev = node.parent;
                node = node.right;
        {
        if (this.root.isSentinel()) {
                    }

        if (other.root.isSentinel()) {
                    this.size = t.size;
                public int getCurrOffset() {
            do {
            x = y.left;
            while (prev != null && prev.right != node) {
                x.parent.right = y;         // set right parent to y
                            newNode.left.parent = newNode;
                        // left will be created later
                return xy;
                ).spliterator(), false).forEach(n -> {
            }
                public boolean prev() {
                @Override
        //        return ⟨nil, nil⟩
    /// properties. Examine the tree and restore. Rotations are normally 

        }
                } else {
        }
            offset += node.offset;
            // determine which side of it's parent x was on
                this.left.parent = this;
    private void collectImpl(StringBuilder sb, int depth, int offCtx, Node<T> node, String prefix) {
            Node<T> next = null;
            .map(xn -> xn.offset).collect(Collectors.toSet());
                boolean initial = true;



                    x = this.root;

    private Pair<OffsetKeyedTreeMap<T>, OffsetKeyedTreeMap<T>> splitImpl(Node<T> root, int pos) {
    }
                    y = x.parent.left;
                    x.parent.isRed = true;
            }
    */
                public T getCurrValue() {

            collectImpl(sb, depth + 1, offCtx + node.offset, node.right, "R");
        public T next() {
        }
    }
                        newNode.left.parent = newNode;
                        return false;
    
        if (xx != this.root) {
                public T getCurrValue() {


            default -> new NodesIterator<T>() {
    private void deleteNode(Node<T> z) {
            // z has two children, find replacement node which will be the leftmost node greater than z
        }
            ).spliterator(), false).filter(xn -> xn.node.left.isSentinel() && xn.node.right.isSentinel())
                return new Subtree<>(t, crsr.size);
        Node<T> y;
                    parent.left = newNode;
                }
        if (delta == 0) {
    ///<summary>
        
            ).spliterator(), false).count();
                    // left is ready, prepare right
        public void refreshParentRefs() {
    }
                        this.afterLast = false;
                }
                        this.currentLocation = findFirst(new NodeAndOffset<>(OffsetKeyedTreeMap.this.root, 0));
            node = node.right;
        }
                node = next;
    }
                }
                    if (this.initial && initialLocation.node.isSentinel()) {


    }
                        currOffset -= node.parent != null && node.parent.right == node ? node.parent.offset : 0;
                    NodesIterator<T> it = this.nodesIteratorAt(Integer.MAX_VALUE);
            z.offset += y.offset; // z's global position should be the same as y's now, 
        public static final Node<?> SENTINEL = new Node<>(0, null, false, null, null);
        }
    
                    }
        // maintain Red-Black tree balance after deleting node
        // link x and y 
    }
                        this.rotateLeft(x);
                    initialLocation.node.isSentinel() ? null : initialLocation.node, 
            } while (node != root.parent);
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        // note: this effectively deletes the node. 
                @Override
                    this.rotateLeft(x.parent);
                    this.rotateLeft(x.parent);
                    x.parent.isRed = false;
        if (root.isNotSentinel()) {
        //      return ⟨L',join(R',T.key,R)⟩
        }
        public final int offset;
                flatten(

    
            };
        if (length > 0) {

        private final T node;
            }
                    throw new IllegalStateException("Inconsistency during left-hand concat procedure");
                    initialLocation.node.isSentinel() ? position : position - initialLocation.node.offset
                            position - initialLocation.offset - (initialLocation.isLeft ? 0 : initialLocation.parent.offset)
        boolean prev();
        if (clone.size != this.size) {
                        // the exact initial position not found, so proceed with its parent
        //      ⟨L',R'⟩ = split(R,k)
                        this.afterLast = true;
        if (node.right.isNotSentinel()) {
                if (!y.left.isRed && !y.right.isRed) {   // children are both black
                    return this.currentLocation.node == null ? null : this.currentLocation.node.content;
        public boolean isNotSentinel() {
        }
                Pair<OffsetKeyedTreeMap<T>, OffsetKeyedTreeMap<T>> xy = this.splitImpl(root.right, pos - root.offset);
            this.size++;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                this.current = this.expansionIterator.next();
                @Override
            offset += node.offset;
    }
        Node<T> y;                 // work node
                oldValue = location.node.content;
            do {
                return new Subtree<>(this.rotateLeft(t), crsr.size);
                @Override
        }





            }
                    this.rotateRight(x.parent.parent);                   // rotate right
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
                        node = parent;
            } else if (childrenIterator.hasNext()) {
                        return false;

 * you may not use this file except in compliance with the License.
            Node<T> parent = node.parent;
            return new Subtree<>(t, 1);

    private static class NodeAndParentAtOffset<T> extends NodeAndOffset<T> {
                    newValue = value;
                    if (newNode.right.isNotSentinel())
                t.offset += xDelta;
            Node<T> newRoot = new Node<T>(roff - loff, null, true, l, r); // TODO validate position
                public boolean prev() {


                        // node's left is empty, go to the right
                    }
            this.current = node;
        int offset = location.offset;
                        x = x.parent;
                        return true;

                }
            this.content = content;
                isLeft = true;
                    if (node.right.isNotSentinel()) {
                }
    
        
                return xy;
 *
        Node<T> node = location.node;
        public ValueAndOffset(T value, int offset) {
    }
            return this == SENTINEL;
                } else {
                }
        OffsetKeyedTreeMap<T> a = cloneSubtree(l);

            }
    
        }
        return oldValue;
        public final int offset;

        }
        Node<T> x; // work node to contain the replacement node
                    y.isRed = false;
        }
                n -> Stream.of(n.node.left, n.node.right).filter(Node::isNotSentinel)
                // is it on the left or right subtree?
                t.refreshBlackHeight();
        }
            t.refreshParentRefs();
            }
                    // both subnodes are ready, rightmost was the last one
        Node<T> parent = this.root;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    /// Rebalance the tree by rotating the nodes to the left
                        var newNode = new Node<>(node.offset, node.content, node.isRed, newNodes.pop(), sentinel()); count++;
            }
        this.splice(this.concatImpl(this.root, 0, other, off));

        }
                        return false;
        } else {
                    return this.beforeFirst ? Integer.MIN_VALUE : (this.afterLast ? Integer.MAX_VALUE : this.theOnlyNode.offset);
                        newNode.right.parent = newNode;
    public void forEach(BiConsumer<Integer, T> action) {
        
    }
            this.restoreAfterDelete(x);
                } else {
        }

            t.refreshParentRefs();
                xy.getSecond().append(root.right, root.offset);
    private void append(Node<T> other, int off) {
                        return true;
            y = z.right;                        // traverse right subtree
            };
                        this.rotateRight(x);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // modify parents
                    }
import java.util.stream.StreamSupport;
                isLeft = false;
        }
        if (x.offset < 0) { // should never happen due to consistency rules 
        } else {
            }
                @Override
        
            x.left.refreshBlackHeight();
                    x = x.parent;
        };
                        next = node.right;
                        next = node.left;
            this.isLeft = isLeft;
        if (y.right.isNotSentinel()) {
    }
        } else if (this.root == x) {
                    offset -= next.offset;
                    if (newNode.left.isNotSentinel())
    }
                    }
            if (this.isNotSentinel()) {
        return y;
        
                    x.parent.parent.isRed = true;
        if (location.node.isNotSentinel()) {
        public Node<T> left = null;
                    // uncle is black; determine if x is greater than parent
    }
                evaluateNodeBlackHeight(this.root, 0), 
        } else {
                newNode.parent = parent;
                NodeAndOffset<T> currentLocation = new NodeAndOffset<>(
                t.left.left.isRed = false;
                    } else if (this.beforeFirst) {
                node = node.left;
                            initialLocation.parent,

 * distributed under the License is distributed on an "AS IS" BASIS,
                    }
                    this.beforeFirst = this.currentLocation.node == null;
        // maintain red-black tree properties after adding x
        Node<T> y;
        this.splice(pair.getSecond());
        this.tombstonesCount = 0;
                    node = next;
                } else {
    
            } else {
                y = x.parent.right;         // y is x's sibling 
                y = x.parent.parent.left;
                    } else if (this.afterLast) {
            return clone;
        }
    private static class FlatteningIterator<T> implements Iterator<T> {
                    // FIXME take a look at AVL tree or something with rotation-based balancing, as rotations seems to be ok
            } while (node != root.parent);
    public int size() {
        //    if T = nil
                    if (!y.left.isRed) {
            if (expansionIterator != null && this.expansionIterator.hasNext()) {
        x.isRed = false;

        Node<T> node = location.node.isSentinel() ? location.parent : location.node;
                    y.isRed = false;
            } else if (relPos > node.offset) {
        // find the replacement node (the successor to x) - the node one with at *most* one child. 
        
    /// RotateRight
                    return false;
                        y = x.parent.left;
                xx = xx.parent;
                return new Subtree<>(t, clsl.size);

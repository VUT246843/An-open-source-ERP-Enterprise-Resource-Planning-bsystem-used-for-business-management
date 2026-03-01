

    @NotNull
        } else {
     */
    /**
import org.antlr.v4.runtime.tree.ErrorNode;
    default List<STMTreeNode> findChildrenOfName(@NotNull String nodeName) {
    default List<STMTreeNode> findNonErrorChildren() {
    default List<STMTreeNode> getChildren() {

     * Returns child node by index
            if (cn != null && cn.getNodeName().equals(nodeName)) {
            return this.getChildren();
    @NotNull
            }

        throw new UnsupportedOperationException();
    @NotNull
    /**
    }

     */
    /**
        };
            public int size() {
    String getNodeName();
        return null;
        }
        for (int i = 0; i < this.getChildCount(); i++) {
            STMTreeNode cn = this.getChildNode(i);

                if (cn != null && !(cn instanceof ErrorNode)) {
        return null;
import org.antlr.v4.runtime.misc.Interval;
    /**
    }
        if (this.hasErrorChildren()) {
        if (this.hasErrorChildren()) {

                }
                return cn;
    }
    default STMTreeNode getParentNode() {
    }
        }
        }
    @Nullable
    @NotNull
    boolean hasErrorChildren();

    @NotNull
        return -1;
        }
     */
            @Override
     */
     * Return all child nodes, except error nodes

import org.jkiss.code.NotNull;

     *
                }
            }

public interface STMTreeNode extends Tree {
    }
    @Nullable
        for (int i = 0; i < this.getChildCount(); i++) {
    @Nullable
    }
            for (int i = 0; i < this.getChildCount(); i++) {
     * Returns last found child node by name
        return null;
import org.antlr.v4.runtime.tree.Tree;
            STMTreeNode cn = this.getChildNode(i);
import org.jkiss.code.Nullable;
            List<STMTreeNode> children = new ArrayList<>(this.getChildCount());
            return this.getChildNode(this.getChildCount() - 1);
    @NotNull
            @Override

    int getAtnState();
    /**
                    return cn;
            STMTreeNode cn = this.getChildNode(i);
            }
                }
     */
     * Returns all child nodes by name
 * The interface describing the node of the syntax tree
    }
    @Nullable
                STMTreeNode cn = this.getChildNode(i);
                STMTreeNode cn = this.getChildNode(i);
                STMTreeNode cn = this.getChildNode(i);
            }
        }
    String getText();
    /**
                    children.add(cn);
    /**
            public STMTreeNode get(int index) {
                if (cn != null && !(cn instanceof ErrorNode)) {
     */

     * Get the text fragment provided by antlr (without hidden channel tokens)
            for (int i = this.getChildCount() - 1; i >= 0; i--) {
    default STMTreeNode findLastNonErrorChild() {

    /**
    }
     *
        List<STMTreeNode> children = new ArrayList<>(this.getChildCount());
     */
                children.add(cn);
                if (cn != null && !(cn instanceof ErrorNode)) {
        } else if (this.getChildCount() > 0) {
        for (int i = this.getChildCount(); i >= 0; i--) {
}
     * Get the text fragment covered by the node

    default STMTreeNode getChildNode(int index) {


    /**

            }
     */
        return null;
     */
                return getChildNode(index);
    default STMTreeNode findFirstChildOfName(@NotNull String nodeName) {
     * Get the name of the syntax tree node
    /**
    }
            if (cn != null && cn.getNodeName().equals(nodeName)) {
            }
    }
    @Nullable
        return getParent() instanceof STMTreeNode parent ? parent : null;
import java.util.*;
            return children;
 */
        }



                return cn;
     * Returns first found child node by name
            if (cn != null && cn.getNodeName().equals(nodeName)) {
     * Get the state of the antlr parser finite state machine associated with the entry point to the corresponding syntax rule for the text
    @NotNull
    /**
        } else if (this.getChildCount() > 0) {
package org.jkiss.dbeaver.model.stm;
    void fixup(@NotNull STMParserOverrides parserCtx);
     */
            for (int i = 0; i < this.getChildCount(); i++) {
                    return cn;
    Interval getRealInterval();
    default STMTreeNode findFirstNonErrorChild() {
                return getChildCount();
    String getTextContent();
/**
    default STMTreeNode findLastChildOfName(@NotNull String nodeName) {
            return this.getChildNode(0);
            }
        return children;
     */

     * Get the text range interval covered by the node
        if (this.hasErrorChildren()) {
    default int getNodeKindId() {
     * Provides information about the grammar rule to the syntax tree nodes
        return new AbstractList<>() {
            }

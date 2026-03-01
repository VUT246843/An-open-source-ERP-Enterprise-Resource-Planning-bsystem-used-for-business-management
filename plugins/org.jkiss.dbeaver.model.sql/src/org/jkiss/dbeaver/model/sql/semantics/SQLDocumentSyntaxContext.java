    }
    private int lastAccessedItemOffset = Integer.MAX_VALUE;
        this.resetLastAccessCache();

        SQLDocumentScriptItemSyntaxContext scriptItem = new SQLDocumentScriptItemSyntaxContext(
        for (SQLDocumentSyntaxContextListener listener : this.listeners) {
        int droppedCount = 0;
        }
     * Get all script items from the document syntax context
    private SQLDocumentScriptItemSyntaxContext lastAccessedScriptItem = null;

    public int getLastAccessedTokenOffset() {
                    this.forEachListener(l -> l.onScriptItemInvalidated(currItem));
                    this.forEachListener(l -> l.onScriptItemInvalidated(currItem3));
                        this.forEachListener(l -> l.onScriptItemInvalidated(currItem2));
            queryModel,
                scriptItem.item.applyDelta(offset, oldLength, newLength);
            elementOriginalText,
            this.lastTokenAccessOffset = offset;
    /**
        int actualStart = it1.next() ? it1.getCurrOffset() : Integer.MAX_VALUE;
                                                              // area behind the query belongs to prepending query
import java.util.HashSet;

        return affectedRegion;
        this.lastTokenAccessOffset = Integer.MAX_VALUE;
     * Reset the cached information about document context items
            // TODO:
            //   if oldLength fits in one scriptItem, them remove some part of it using split-join operation
     * Introduce new script item to the document syntax context
    @NotNull
 *
                this.lastAccessedTokenEntry = token.entry;
     */
    @Nullable

    private SQLQuerySymbolEntry lastAccessedTokenEntry = null;
                    affectedRegion = new Region(firstAffectedOffset, lastAffectedOffset - firstAffectedOffset - oldLength + newLength);
    private static final Log log = Log.getLog(SQLDocumentSyntaxContext.class);
        return scriptItem;
                } else {
                this.lastAccessedItemOffset = Integer.MAX_VALUE;
        NodesIterator<SQLDocumentScriptItemSyntaxContext> it2 = this.scriptItems.nodesIteratorAt(Integer.MAX_VALUE);

 *
        while (it.next()) {
        int length,
        boolean hasContextBoundaryAtLength
                    lastAffectedOffset = currOffset + currItem.length();
        int off1 = it1.getCurrOffset();
                itemOffset = it.getCurrOffset();
        List<SQLScriptItemAtOffset> result = new ArrayList<>();
                int affectedStart = Math.min(scriptItem.offset, offset);
        this.lastAccessedScriptItem = null;
        }
            this.forEachListener(l -> l.onScriptItemInvalidated(it2.getCurrValue()));
    public SQLDocumentSyntaxContext() {
        this.resetLastAccessCache();
 * distributed under the License is distributed on an "AS IS" BASIS,
                        keyOffsetsToRemove = ListNode.push(keyOffsetsToRemove, currOffset);
                int start = it.prev() && it.getCurrValue() != null ? it.getCurrOffset() + it.getCurrValue().length() : 0;
    }
 */
                if (currItem != null) {
            action.accept(listener);
import org.jkiss.code.NotNull;


    private final OffsetKeyedTreeMap<SQLDocumentScriptItemSyntaxContext> scriptItems = new OffsetKeyedTreeMap<>();
        @NotNull SQLQueryModel queryModel,
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
        for (ListNode<Integer> kn = keyOffsetsToRemove; kn != null; kn = kn.next) {
            //   otherwise, drop all the scriptItems in oldLength range and apply newLength-oldLength as offset for all the tailing
        } else if (offset >= this.lastAccessedItemOffset && this.lastAccessedScriptItem != null &&
        this.forEachListener(l -> l.onScriptItemIntroduced(scriptItem));
                for (ListNode<Integer> kn = keyOffsetsToRemove; kn != null; kn = kn.next) {
import org.jkiss.dbeaver.model.sql.semantics.OffsetKeyedTreeMap.NodesIterator;
            this.forEachListener(l -> l.onScriptItemInvalidated(oldScriptItem));
        }
    private final Set<SQLDocumentSyntaxContextListener> listeners = new HashSet<>();
                    currOffset = it.getCurrOffset();
        if (oldLength > 0) {
     */
    }
                    lastAffectedOffset = currOffset + currItem3.length();
            this.scriptItems.applyOffset(offset, newLength);
            this.forEachListener(l -> l.onScriptItemInvalidated(it1.getCurrValue()));
    
                }
    }
                    if (currOffset <= offset && currOffset + currItem2.length() > offset) {
                int lastAffectedOffset = currOffset;
        return this.lastAccessedItemOffset;
     */
     * Find script item from the document syntax context at the provided offset
    @NotNull
        return this.lastAccessedTokenOffset;
    }
        if (offset == this.lastTokenAccessOffset) {
                }
            {
            // found, do nothing
    private void forEachListener(@NotNull Consumer<SQLDocumentSyntaxContextListener> action) {
        }
    public SQLScriptItemAtOffset findScriptItem(int offset) {
            this.forEachListener(l -> l.onScriptItemInvalidated(it1.getCurrValue()));
                    keyOffsetsToRemove = ListNode.push(keyOffsetsToRemove, currOffset);
     */
     */

        this.listeners.add(listener);
        return this.lastAccessedScriptItem == null ?
        }
        this.scriptItems.clear();
            } else {
        NodesIterator<SQLDocumentScriptItemSyntaxContext> it1 = this.scriptItems.nodesIteratorAt(0);
    public List<SQLScriptItemAtOffset> getScriptItems() {
 * limitations under the License.

                this.lastAccessedTokenEntry = null;
        } else if (offset >= this.lastAccessedTokenOffset && this.lastAccessedTokenEntry != null &&
    /**
        SQLDocumentScriptItemSyntaxContext oldScriptItem = this.scriptItems.put(offset, scriptItem);

        int rangeEnd = actualFragment.b;
    /**
    }
        );
    public IRegion applyDelta(int offset, int oldLength, int newLength) {
        NodesIterator<SQLDocumentScriptItemSyntaxContext> it = this.scriptItems.nodesIteratorAt(Integer.MIN_VALUE);
public class SQLDocumentSyntaxContext {
    /**
        } else {

            if (token != null) {
            length
            keyOffsetsToRemove = ListNode.push(keyOffsetsToRemove, off1);
        }
        }
                int affectedEnd = Math.max(scriptItem.offset + scriptItem.item.length(), offset + newLength);
        return actualEnd >= actualStart ? new Interval(actualStart, actualEnd) : new Interval(actualStart, 0);
                while (it.next() && it.getCurrValue() != null && (delta < 0 || lastAffectedOffset <= (offset + oldLength))) {
        @NotNull String elementOriginalText,
            this.forEachListener(l -> l.onScriptItemInvalidated(it2.getCurrValue()));
            droppedCount++;

                    currOffset = it.getCurrOffset();
        }
     */
import org.eclipse.jface.text.Region;
    }
        this.lastAccessedTokenEntry = null;
import org.antlr.v4.runtime.misc.Interval;
        // TODO use split operation here
            } else {
                affectedRegion = new Region(affectedStart, affectedEnd - affectedStart);
import org.jkiss.code.Nullable;
            SQLDocumentScriptItemSyntaxContext scriptItem = it.getCurrValue();
    }
                scriptItem = it.getCurrValue();

            offset < this.lastAccessedTokenOffset + this.lastAccessedTokenEntry.getInterval().length()) {
            SQLScriptItemAtOffset scriptItem = this.findScriptItem(offset);
    public int getLastAccessedScriptElementOffset() {
    public SQLQuerySymbolEntry findToken(int offset) {
            this.lastItemAccessOffset = offset;

import java.util.function.Consumer;
    public void resetLastAccessCache() {
     * Reset document syntax context state
        }
            new SQLScriptItemAtOffset(this.lastAccessedItemOffset, this.lastAccessedScriptItem);
        } else { // simple insertion
 * you may not use this file except in compliance with the License.
        IRegion affectedRegion;
                } else if (it.prev() && it.getCurrValue() != null) {
        if (it2.getCurrValue() != null && off2 > rangeEnd) {
    @Nullable
 * Unless required by applicable law or agreed to in writing, software


                        lastAffectedOffset = currOffset + currItem2.length();
 *
        int actualEnd = it1.prev() ? it2.getCurrOffset() : 0;

        if (affectedRegion == null) {
        this.lastAccessedItemOffset = Integer.MAX_VALUE;
                    this.scriptItems.applyOffset(offset, delta);
                    affectedRegion = null;
            if (scriptItem != null) {

                    SQLDocumentScriptItemSyntaxContext currItem3 = it.getCurrValue();
    @Nullable
            SQLTokenEntryAtOffset token = scriptItem == null || scriptItem.item == null ? null : scriptItem.item.findToken(offset - scriptItem.offset);
                if (keyOffsetsToRemove != null) {
            }
                int length = it.next() ? (it.getCurrOffset() - start) : Integer.MAX_VALUE;
                SQLDocumentScriptItemSyntaxContext currItem = it.getCurrValue();
    @Nullable
            keyOffsetsToRemove = ListNode.push(keyOffsetsToRemove, off1);
                }

            }

     * Update script items according to the document text changes
                NodesIterator<SQLDocumentScriptItemSyntaxContext> it = this.scriptItems.nodesIteratorAt(offset);
        int rangeStart = actualFragment.a;


                this.lastAccessedScriptItem = scriptItem;
    public SQLDocumentScriptItemSyntaxContext registerScriptItemContext(
        this.lastAccessedTokenOffset = Integer.MAX_VALUE;
                affectedRegion = new Region(start, length);

        ListNode<Integer> keyOffsetsToRemove = null;
     */
        return result;
    @NotNull
        this.forEachListener(SQLDocumentSyntaxContextListener::onAllScriptItemsInvalidated);
        while (it1.next() && it1.getCurrValue() != null && (off1 = it1.getCurrOffset()) + it1.getCurrValue().length() < rangeStart) {
/*

            result.add(new SQLScriptItemAtOffset(it.getCurrOffset(), it.getCurrValue()));
import org.jkiss.dbeaver.model.sql.semantics.model.SQLQueryModel;
                ListNode<Integer> keyOffsetsToRemove = null;

    /**
                    }
        scriptItem.setHasContextBoundaryAtLength(hasContextBoundaryAtLength);
            if (scriptItem != null && itemOffset <= offset) { // && itemOffset + scriptItem.length() > offset) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public void removeListener(@NotNull SQLDocumentSyntaxContextListener listener) {
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        int off2 = it2.getCurrOffset();
import org.jkiss.dbeaver.Log;
        this.listeners.remove(listener);
    }
    ) {
                if (delta > 0) { // when delta is non-negative, we are dropping only the affected region and applying offset for the rest
                }
        }
        if (offset == this.lastItemAccessOffset) {
                    this.scriptItems.removeAt(kn.data);

                    firstAffectedOffset = kn.data;
    }
    @NotNull
 * You may obtain a copy of the License at
            SQLScriptItemAtOffset scriptItem = this.findScriptItem(offset);
                }
     * Find token by offset
        }
import org.jkiss.dbeaver.utils.ListNode;
    private int lastItemAccessOffset = Integer.MAX_VALUE;
            this.lastTokenAccessOffset = offset;
            offset,
                // otherwise just drop the whole tail being affected
     * Add syntax context event listener
                    lastAffectedOffset = offset + oldLength;
                int firstAffectedOffset = 0;
            affectedRegion = new Region(offset, newLength);
import java.util.List;
        return this.lastAccessedTokenEntry;
        this.lastItemAccessOffset = Integer.MAX_VALUE;
            }
            // found, do nothing
    @NotNull
        }
        if (it1.getCurrValue() != null && off1 + it1.getCurrValue().length() < rangeStart) {
            int itemOffset = it.getCurrOffset();
    public void clear() {
            keyOffsetsToRemove = ListNode.push(keyOffsetsToRemove, off2);
    public Interval dropInvisibleScriptItems(@NotNull Interval actualFragment) {
    /**
    }
import java.util.Set;
     * Drop script items outside the given text fragment range
                NodesIterator<SQLDocumentScriptItemSyntaxContext> it = this.scriptItems.nodesIteratorAt(offset);
                } else {
    private int lastAccessedTokenOffset = Integer.MAX_VALUE;
    private int lastTokenAccessOffset = Integer.MAX_VALUE;
        while (it2.prev() && it2.getCurrValue() != null && (off2 = it2.getCurrOffset()) > rangeEnd) {
import org.eclipse.jface.text.IRegion;

            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (oldScriptItem != scriptItem && oldScriptItem != null) {
     */

            offset < this.lastAccessedItemOffset + this.lastAccessedScriptItem.length()) {
    }
    /**
    }
            } else {

            this.scriptItems.removeAt(kn.data);
            }
            int delta = newLength - oldLength;
}
    public void addListener(@NotNull SQLDocumentSyntaxContextListener listener) {
            null :
 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
    /**
     */
    }
                this.lastAccessedItemOffset = itemOffset;
            // TODO removeAtRange(..) is needed either way
            NodesIterator<SQLDocumentScriptItemSyntaxContext> it = this.scriptItems.nodesIteratorAt(offset);
            if (scriptItem == null && it.prev()) {
        } else {
package org.jkiss.dbeaver.model.sql.semantics;
                int currOffset = it.getCurrOffset();
                this.lastAccessedScriptItem = null;
    /**

            this.lastItemAccessOffset = offset;
            // temporary solution - just explicitly drop what was invalidated starting at the current position
            keyOffsetsToRemove = ListNode.push(keyOffsetsToRemove, off2);
     * Remove syntax context event listener
                    SQLDocumentScriptItemSyntaxContext currItem2 = it.getCurrValue();
import java.util.ArrayList;
                this.lastAccessedTokenOffset = token.offset + scriptItem.offset;
                this.lastAccessedTokenOffset = Integer.MAX_VALUE;
        int offset,

                    keyOffsetsToRemove = ListNode.push(keyOffsetsToRemove, currOffset);

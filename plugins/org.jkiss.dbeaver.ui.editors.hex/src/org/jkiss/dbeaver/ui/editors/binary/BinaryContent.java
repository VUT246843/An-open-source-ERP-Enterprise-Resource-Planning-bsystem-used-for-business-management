     * @param length   number of bits to copy
            ranges.add(secondRange);

        for (Range range : ranges) cloned.add((Range)range.clone());
    }
        }
        if (secondRange != null)
        commitChanges();
        int previous = changeList.get((int) (position - changesPosition));
        long positionSoFar = position - positionShift;

/**
    public void dispose()
     * @return length of content in byte units
        }
    }
            overwriteInternal(new Range(position, source, true));
    private ActionHistory actions = null;  // undo/redo actions history
    }
                subList.clear();
                clone.length = 1L;
        Range range = getRangeAt(position);
     * @param listener to be notified of the change
    {

        if (!tailTree.hasNext()) return;
     * @param dst      where to write the read result to
            long lowerLimit = changesPosition;
        throws IOException
        initSubtreeTraversing(start, 0L);
        } else if (action[0] == ActionHistory.ActionType.INSERT) {
                RandomAccessFile randomFile = (RandomAccessFile) value;
                if (length > 1) actions.endAction();
            listener.modified();

            src.limit((int) (sourceRange.dataOffset + sourceRange.length));
        } else {
     *
//		} else if (changeList != null && changesPosition >= changesPosition && changesInserted &&
    }
     * not considered in action history so undoing/redoing takes effect on the whole byte.<P>
                          positionSoFar + positionShift, rangesModified);
    }
        for (Range myRange : ranges) {
        if (actions != null)
    public boolean canRedo()
            actions = null;
        return result.toString();
        if (listeners == null) return;
            insertRange(new Range(changesPosition, store, true));
     * dispose() is optional, but it will let use of files immediately in the operating system, instead of
import org.jkiss.dbeaver.utils.ContentUtils;
     * previous content 0000 0000, source stuv wxyz, offset 2, length 5 -> resulting content 00vw xyz0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            length = aLength;
            actions.endAction();
     * Redoes last action on BinaryContent. Action history should be on: setActionHistory()
            firstRange.length = delta;
        overwriteRange(newRange);
            if (other.position < position && other.exclusiveEnd() <= position) return 1;
        throws IOException
     *
                goingRange = null;
    {
    {
     * @throws IOException when i/o problems occur. The content will be empty but valid
        long exclusiveEnd()
    }
     * Create new empty content.
}
            if (src.remaining() > dst.remaining() || src.remaining() > maxCopyLength) {



     * Reads a sequence of bytes from this content into the given file
        return dirty;
            long delta = exclusiveEnd - lastRange.position;
                    changeList.add((int) (position - changesPosition), 0);
        throws IOException
        throws IOException
    private void fillWithRange(ByteBuffer dst, Range sourceRange, long overlapBytes, long position,
     * Lists the ranges that back this content

        }
        dirty = true;
        result[0] = result[1] = currentAction.get(0).position;
        lastUpperNibblePosition = -1L;
                positionShift = changeList.size();
        return get(dst, null, position);
                    buffer = channel.map(FileChannel.MapMode.READ_WRITE, position, partLength);

                randomFile.seek(position);
            positionShift = (int) Math.min(changeList.size(), position - changesPosition);
        long fileLength = aFile.length();
    /**
    public void overwrite(byte source, int offset, int length, long position)
        @Override
    {
                actions.eventPreModify(ActionHistory.ActionType.OVERWRITE, position, true);
        }
    {

    }
        if (endSoFar > exclusiveEnd) {
import java.nio.ByteBuffer;


     *
        tailTree = result.iterator();
    {

        int i = (int) relativePosition;
        if (length + offset > 8)
     * Inserts a sequence of bytes from the given file into this content, starting at the given position
     * Undoes last action on BinaryContent. Action history should be on: setActionHistory()
                        changeList.add(getFromRanges(position));
    }
            if (sourceRange.dirty) {
        Range newRange = new Range(position, source, true);
            result += changeList.size();
            this(aPosition, aBuffer.remaining());
    private long[] insertRanges(List<Range> ranges)
                int partLength = (int) Math.min(mappedFileBufferLength, length - position);
    {
     * @param length number of bytes to read
 * A binary content provider. Content backed by files has no effect on memory footprint. Content
        }
        SortedSet<Range> subSet = ranges.tailSet(new Range(position, 1L));
        if (actions == null) return null;
        return result;
     * @param start  first byte in sequence
        } else {
        splitAndShift(firstRange.position, 0);
        if (!insert)
     * http://forum.java.sun.com/thread.jspa?forumID=4&threadID=158689
        if (relativePosition < 0L || relativePosition >= changesSize)
            List<Integer> subList = changeList.subList(deleteStart, deleteStart + (int) length);
    /**
     * @param source   byte
                    }
//		currentRange.dirty = true;
     *
            fillWithRange(dst, partialRange, positionSoFar - partialRange.position,
        Range secondRange = null;
        long[] result = null;

        if (actions == null) return null;

    private ActionHistory actionsTemp = null;
        actionsOn(false);
     */
     *

        if (lastRange != null && lastRange.position < exclusiveEnd &&
     *
        notifyListeners();
     * Used to notify changes in content
    /**
            }
    public int get(ByteBuffer dst, List<Long> rangesModified, long position)

     * @param position starting overwrite point
    {
    public interface ModifyListener extends EventListener {
        if (action == null) return null;
     *
    /**
    /**
        if (fileLength < 1L || position > length()) return;
    {
    {
        }
        }
    }
        }


        {
    }
    }
        throws IOException
     * keyboard, in which nibbles are input in different calls to this method: the lower nibble input is

            if (limit > 0)
        notifyListeners();
     */
        if (actions != null)
     * @param position overwrite point
            // 0 to size - 1: overwritten ranges, last one: overwrite range
            overlapBytes += added;
            }
        throws IOException
    }

            FileChannel channel = dst.getChannel();
            if (lastUpperNibblePosition == position && offset == 4 && length == 4)
        shiftRemainingRanges(increment);
        if (position < 0 || position >= length() || length < 1L) return;

        if (aFile.length() > 0L && position < length())
        changesInserted = insert;
        } else if (action[0] == ActionHistory.ActionType.INSERT) {
                    ((MappedByteBuffer) buffer).force();
        lastUpperNibblePosition = actions != null && offset == 0 && length == 4 ? position : -1L;
     */
                lastRange = tailTree.next();
        if (action[0] == ActionHistory.ActionType.DELETE) {
        }
            position = aPosition;
            positionSoFar + positionShift < changesPosition + changeList.size()) {
        throws IOException
            secondRange.length = exclusiveEnd - secondRange.position;  // actions
    }
     * @param aFile   The file is not copied internally, changes after this call will result in
    public long length()
        }
    public long get(File destinationFile, long start, long length)
        StringBuilder result = new StringBuilder("BinaryContent: {length:").append(length()).append("}\n");
            dst.put(changeList.get(i).byteValue());
     * @return true: the content has been modified
    {
     * and shifting the existing ones.
 * Copyright (C) 2010-2024 DBeaver Corp and others
                if (lastRange.exclusiveEnd() <= exclusiveEnd) {
            }

        }
        if (rangesModified != null) rangesModified.clear();
    BinaryContent()
            }
        }
    public void insert(byte source, long position)
            deleteAndShift(position, length);
    {
    {
    }
        }
 *
     * @return number of bytes read
    void setActionsHistory()
        }
    private int getFromRanges(long position)
        if (ranges == null) return;
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
        insertRange(newRange);
        if (endSoFar < exclusiveEnd) {
                    // gcj 4.3.0 channel maps work differently than sun's:
//			clone.dirty = true;
                    result = getRangeAt(position);
    /**
                } else {
            return obj instanceof Range && compareTo((Range)obj) == 0;
     *                 undefined behaviour.
    private List<Integer> changeList = null;
     * behaviour.
 * you may not use this file except in compliance with the License.
            result = insertRanges(currentAction);
     */
        for (ModifyListener listener : listeners) {
            while (goingRange != null && goingRange.exclusiveEnd() <= lastRange.exclusiveEnd()) {
     * @param position starting insert point
        RandomAccessFile dst = new RandomAccessFile(destinationFile, "rws");
        shiftRemainingRanges(-length);
 * modified.
        throws IOException
     *
    {

        if (action[0] == ActionHistory.ActionType.DELETE) {
        changeList = null;
    public void insert(ByteBuffer source, long position)
     */


            actions.eventPreModify(ActionHistory.ActionType.OVERWRITE, newRange.position, false);


        insertRange(newRange);

        int result = 0;

    }
//			splitAndShift(position, 0);  // mark them as dirty
    }
 * @author Jordi
        }

        if (source.remaining() > 0 && position < length())
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        {
                    deleted.add(lastRange);  // actions
        if (actions != null) {

    private long[] deleteRanges(List<Range> currentAction)
     */


    {
    public int get(ByteBuffer dst, long position)
    private void deleteInternal(long startPosition, long length)
                actions.addDeleted(position, subList, length == 1L);
 * You may obtain a copy of the License at
                                            (int) Math.min(changesPosition - position, Integer.MAX_VALUE));
        {
        }
                    channel.write(buffer, position);
        changeList.set((int) (position - changesPosition), source & 0x0ff);
        Range range = updateChanges(position, false);
    {

        if (exclusiveEnd > length())
     * @throws IOException when i/o problems occur. The content stays unchanged and valid

     * Add a listener to the list of listeners to be notified when there is a change in the content

            }
            long upperLimit = changesPosition + changeList.size();
     * @param length   number of bytes to delete
            RandomAccessFile src = (RandomAccessFile) sourceRange.data;
                if (insert) {
        commitChanges();
                src.limit(src.position() + Math.min(dst.remaining(), maxCopyLength));
                return super.clone();
        actionsOn(true);
import org.jkiss.code.NotNull;
        if (subSet.isEmpty())
     * Inserts a sequence of bytes from the given buffer into this content, starting at the given position
    BinaryContent(File aFile)
        Range firstRange = tailTree.next();
    */

                    buffer.limit(partLength);
        }
     */
     *
            firstRange.position += increment;
        {
        return dst.position() - dstInitialPosition;
        throws IOException
            return 0;
            overwriteInternal(new Range(position, aFile, true));
    final static class Range implements Comparable<Range>, Cloneable {
        if (position < changesPosition) {
    private void insertRange(Range newRange)
            lastRange.dataOffset += delta;

                result = data.get((int) (position - range.position)) & 0x0ff;
    /**
    {
    void commitChanges()
    public void delete(long position, long length)
 * Keeps track of the positions where changes have been done. Files that back this content must not be
    {

 * DBeaver - Universal Database Manager
        this();
            secondRange.position = startPosition;  // actions
     * Closes all files before termination. After this call the object is no longer valid. Calling
        Range partialRange;
    }

            else
        if (aFile == null || aFile.length() < 1L)
    private boolean changesInserted = false;
        deleted.add(secondRange);  // actions
    public boolean canUndo()
     * @param source   bytes. The buffer is not copied internally, changes after this call will result in
        this.ranges.addAll(cloned);
                actions.addLostRange(clone);
     */
                //	rangesModified.add(Long.valueOf(changesPosition));
            currentRange.position += increment;

     * and shifting the existing ones.
            Range goingRange = tailTree.next();
    {

    }
        changeList.set((int) (position - changesPosition), newValue);
                    } else if (changesPosition + changeList.size() <= position) {
     *
         * Notifies the listener that the content has just been changed
        if (ranges.size() > 0) {
        changeList.add(getFromRanges(position));
        public String toString()
                    buffer.limit(partLength);
            }
    {
                    buffer = null;
    /**
        }
                tailTree.remove();
            secondRange.position = secondRange.position + delta + increment;
    {

                    buffer.position(0);
    private static final long mappedFileBufferLength = 2048 * 1024;  // for mapped file I/O
     * previous content 0000 0000, source 1111 1111, offset 0, length 8 -> resulting content 1111 1111



     *
        long endSoFar = secondRange.exclusiveEnd();

                actions.addLostByte(position, previous);

        }
     * Examples:
                actions = actionsTemp;
            length = length() - position;
            return;
        if (actions != null) {
        if (changeList != null) {
     *
        }
        lastUpperNibblePosition = -1L;
    }
    /**
            lastUpperNibblePosition = -1L;
        dirty = true;

        notifyListeners();

    {
        if (actions == null) {
            }
    public long[] redo()
    private void overwriteInternal(Range newRange)
        public boolean equals(Object obj)

     * @return number of bytes read
            ByteBuffer buffer = null;

        for (; remaining > 0 && i < changesSize; ++i, --remaining) {
        }
        List<Range> currentAction = (List<Range>) action[1];
public class BinaryContent {
            int deleteStart = (int) (position - changesPosition);
     * @return 2 elements long array, first one the start point (inclusive) of finished undo operation,
     * Inserts a byte into this content at the given position
        throws IOException
        if (tailTree.hasNext()) {
        void modified();
        initSubtreeTraversing(positionSoFar, dst.remaining());
        BinaryContent.Range firstRange = ranges.get(0);
        exclusiveEnd = position + length;
     * Reads a sequence of bytes from this content into the given buffer, starting at the given position

        }
        ranges = null;
    }
                        changesPosition = position;
        } else if (action[0] == ActionHistory.ActionType.OVERWRITE) {

    /**
                beforeLastRange.length = exclusiveEnd - beforeLastRange.position;
    * Does not check changeList
        commitChanges();

            }
    public String toString()
     * @param source   bytes. The buffer is not copied internally, changes after this call will result in
            ContentUtils.close(dst);
        for (Range range : ranges) cloned.add((Range)range.clone());
                } else {
        Set<Range> result = ranges.tailSet(new Range(position, 1L));
            while (tailTree.hasNext() && lastRange == null) {
     * A subset of data contained in a ByteBuffer or a File
import java.util.*;

                boolean bufferFromMap = true;
     *
    private long[] overwriteRanges(List<Range> ranges)
        notifyListeners();
     *
        if (actions != null)
            actions.addInserted((Range) newRange.clone());
            overwriteRange(new Range(changesPosition, store, true));
            if (changesInserted)


                if (tailTree.hasNext())
            if (dst.remaining() > length) {
    protected void finalize() throws Throwable
    }
     * @param aFile the backing content provider
     * <P>When action history is on, considers the special case of user generated input(in hex) from a
        if (actions != null)
        if (position > length()) return;

        throws IOException

        Range lastRange = null;
    private void overwriteRange(Range aRange)

                try {
        if (changesInserted)
    Range getRangeAt(long position)
    private Iterator<Range> tailTree = null;

     *         second one the end point (exclusive). <code>null</code> if redo is not performed
            actions.eventPreModify(ActionHistory.ActionType.INSERT, position, false);
        }
        long positionSoFar = position;
     * previous content 0000 0000, source 1111 1111, offset 1, length 2 -> resulting content 0110 0000
        Range result = null;
            if (position < other.position && exclusiveEnd() <= other.position) return -1;
/*
        int mask = (0x0ff >>> offset) & (0x0ff << (8 - offset - length));



    private long exclusiveEnd = -1L;
 * See the License for the specific language governing permissions and
    {
            result = deleteRanges(currentAction);
    {
     * Reads a sequence of bytes from this content into the given buffer, starting at the given position
        changesInserted = false;
    }
            if (length < changeList.size()) {
        changeList = new ArrayList<>();
     *
        long[] result = null;
    }
     * @param source   byte
        public int compareTo(@NotNull Range other)

        if (actions != null)
    public void overwrite(byte source, long position)
    }

        ranges.add(new Range(0L, aFile, false));
        }
     */
                    // gcj won't accept two calls to channel.map with a different position, sun does
            }
        List<Range> cloned = new ArrayList<>(ranges.size());
    {
        lastUpperNibblePosition = -1L;
        if (length > length() - position)
        throws IOException
     */
    /**
                limit = dst.limit();
     * @param position starting read point
        }
                rangesModified.add(positionSoFar - position);
            } else {  // length == changeList.size()
            firstRange.length = startPosition - firstRange.position;
        {


        Range secondRange = (Range) firstRange.clone();  // will be tail part of firstRange
     * @param position starting overwrite point
     *
            catch (CloneNotSupportedException e) {
            actionsTemp = actions;
                rangesModified.add((long)changesAdded);
            actions.addLostRanges(deleted);
    {

            return position + length;
     */
        }
    }
     * @param offset   bit offset (0 <= offset < 8)

                return null;  // reuse without expanding
     *


                clone.position = position;
    }
            toBeAdded = true;
                    // to access past the 2Gb barrier there is no choice but use plain ByteBuffers in gcj

                ContentUtils.close((Closeable) value.data);
        } else {
    private void splitAndShift(long position, long increment)
            if (actions != null) {
    private void shiftRemainingRanges(long increment)
        if (firstRange.position < startPosition) {
    public void overwrite(File aFile, long position)
    }
        long length = -1L;
        if (actions != null) {


        long[] result = new long[2];
        }
        listeners = null;
     * Deletes length bytes from the content at the given position
     */


import java.io.File;
     *

        return length;
                }
                positionSoFar + positionShift > changesPosition)
            actions.eventPreModify(ActionHistory.ActionType.DELETE, position, length == 1L);
                positionSoFar += changesAdded;
            try {

     * @param position starting insert point
import java.io.Closeable;
    /**
    {
                data.limit(data.capacity());
                if (bufferFromMap) {

                        buffer = ByteBuffer.allocateDirect((int) mappedFileBufferLength);
        @SuppressWarnings("unchecked")
            lastRange.exclusiveEnd() > exclusiveEnd) {
    private Set<Range> initSubtreeTraversing(long position, long length)
     */
        }
            int size = currentAction.size();
     * @param position insert point

                    bufferFromMap = false;
    {
    }
    {
        commitChanges();
 *
         */
    private long lastUpperNibblePosition = -1L;
                dst.limit(limit);
        return result;
 * modified while the content is still in use.
        return dstInitialRemaining - dst.remaining();
        changesPosition = -1L;

     */
        changesPosition = position;
    private int fillWithPartOfRange(ByteBuffer dst, Range sourceRange, long overlapBytes, int maxCopyLength)
        if (on) {

    /**
                }
     * Number of bytes in content
                       currentAction.get(currentAction.size() - 1).exclusiveEnd() - result[0]);
    private Range updateChanges(long position, boolean insert)
        initSubtreeTraversing(position, 0);
 * backed by memory buffers is limited by amount of memory. Notifies ModifyListeners when it has been
            else
            length = 8 - offset;

            if (length < 0L) throw new IOException("File error");
                //rangesModified.add(Long.valueOf(positionSoFar - changesPosition));
 * Unless required by applicable law or agreed to in writing, software
    {
        return subSet.first();
            positionSoFar < this.changesPosition + changeList.size() && overlapBytes < sourceRange.length) {

        if (rangesModified != null) {
    }
            }

     */
     * and overwriting the existing ones.
    {
                rangesModified.add(position);

            // 0 to size - 1: overwritten ranges, last one: overwrite  range
     */
        commitChanges();
        List<Range> cloned = new ArrayList<>(ranges.size());
                    buffer.position(0);


    }
            result = overwriteRanges(currentAction.subList(0, currentAction.size() - 1));
    }
            if (toBeAdded) ranges.add(lastRange);
        int changesAdded = 0;
     */

        deleteInternal(start, length);
    }
            if (value instanceof ByteBuffer) {
    private List<ModifyListener> listeners = null;
                               List<Long> rangesModified)
        if (range != null) {
        java.util.List<Range> deleted = new ArrayList<>();
        } else if (action[0] == ActionHistory.ActionType.OVERWRITE) {
    {
        Object data = null;
     */
        ranges.add(newRange);
            return "Range {position:" + position + ", length:" + length + '}';
        ranges.add(aRange);
            actions.addInserted((Range) newRange.clone());
     * Writes a byte into this content at the given position with bit offset and length bits
    /**
 */
    /**

        finally {
        deleteAndShift(result[0],
     * Sets action history on. After this call the content will remember past actions to undo and redo
        int dstInitialRemaining = dst.remaining();
            int added = fillWithPartOfRange(dst, sourceRange, overlapBytes,
                    goingRange = tailTree.next();
                }
    /**

        dirty = true;
     *         second one the end point (exclusive). <code>null</code> if undo is not performed
    /**
                result = randomFile.read();
        lastUpperNibblePosition = position;
     * @throws IOException when i/o problems occur. The content stays unchanged and valid

        BinaryContent.Range lastRange = ranges.get(ranges.size() - 1);
import java.nio.channels.FileChannel;
        {

import java.nio.MappedByteBuffer;
            secondRange = (Range) firstRange.clone();  // will be tail part of firstRange
            if (!insert) --lowerLimit;
            if (actions == null)
        }
    public void overwrite(ByteBuffer source, long position)
     */
        Range(long aPosition, long aLength)
     * Tells whether an undo is possible
//		firstRange.dirty |= increment != 0;
    {

        @Override
    public void insert(File aFile, long position)


        dispose();
        if (firstRange.position < position) {
            }
    /**
     * @return number of bytes read
    }
    {
    /**
                Range clone = (Range) range.clone();
        long relativePosition = position - changesPosition;
            listeners = new ArrayList<>();
    }
            lastRange.length -= delta;

        }

        }
    private long changesPosition = -1L;
    }
     */
        if (changeList != null && changesInserted && changesPosition <= position &&
        return result;
        initSubtreeTraversing(startPosition, length);

            changesAdded = fillWithChanges(dst, positionSoFar);
                return result;
                commitChanges();
        long result = 0L;
            channel.force(true);
        if (actions != null)

     * @return true if something can be redone
            Object value = range.data;
    }
        overwrite(source, 0, 8, position);
        if (sourceRange.data instanceof ByteBuffer) {
    {
    }
        return result;
        }
    public long[] undo()

    private boolean dirty = false;
            src.position((int) (sourceRange.dataOffset + overlapBytes));

     * @param position overwrite point
        if (increment == 0L) return;

    @Override
            } else {

        Object[] action = actions.undoAction();
            dirty = isDirty;
            dst.setLength(length);
        notifyListeners();
            lastRange.position += delta;
     * Create new content from a file
                    lastRange = null;
        List<Range> currentAction = (List<Range>) action[1];
        @SuppressWarnings("unchecked")
            store.put(myChange.byteValue());
 * limitations under the License.
                Range beforeLastRange = (Range) lastRange.clone();

    private TreeSet<Range> ranges = new TreeSet<>();

     * @param aFile    with source bytes.
            secondRange.length -= delta;
    }
        store.position(0);
     * Writes a byte into this content at the given position

            positionSoFar = partialRange.exclusiveEnd();
        } else {  // firstRange.position == startPosition
        }
            secondRange.length = secondRange.exclusiveEnd() - startPosition;  // actions
        return i - (int) relativePosition;
    {
        if (changeList != null && changesInserted) {
        if (changeList != null && changesInserted && position > changesPosition)

        if (actions != null) {
     *
        }
        super.finalize();
            data = new RandomAccessFile(aFile, "r");


        return actions != null && actions.canUndo();
            return 0;  // overlap

            }
     * virtual machine combined with some dumb os, files won't be freed after this call. See
                catch (IOException e) {
        notifyListeners();
            actions.eventPreModify(ActionHistory.ActionType.INSERT, position, false);
        return new long[]{firstRange.position, lastRange.exclusiveEnd()};
        Range firstRange = tailTree.next();
                ByteBuffer data = (ByteBuffer) value;
        {
            result = deleteRanges(currentAction);

        deleteInternal(aRange.position, aRange.length);

            Range currentRange = tailTree.next();


        this.ranges.addAll(cloned);
        dirty = true;
        throws IOException
                rangesModified.add((long)size);
        return actions != null && actions.canRedo();
        splitAndShift(lastRange.exclusiveEnd(), 0);

        Range(long aPosition, ByteBuffer aBuffer, boolean isDirty)

            if (value.data instanceof Closeable) {

        notifyListeners();
    private void notifyListeners()
            commitChanges();
        actionsOn(true);
        if (listeners == null)
        return result;
            } else if (changesAdded > 0) {//&& !changesInserted) {
        } else if (sourceRange.data instanceof RandomAccessFile) {
     */
            return null;
     */

     * @param source   byte, interesting bits are to the right
            ByteBuffer src = (ByteBuffer) sourceRange.data;
        if (source.remaining() < 1 || position > length()) return;
     */
        long position = -1L;
    /**
        if (!tailTree.hasNext()) return;
            if (!insert && position >= lowerLimit && position < upperLimit)
                actionsOn(false);
            }
    {
            if (rangesModified != null) {
        int remaining = dst.remaining();
import java.io.IOException;
        long dataOffset = 0L;
    {

            secondRange.dataOffset += delta;
            result = overwriteRanges(currentAction.subList(size - 1, size));
        updateChanges(position, true);
        while (tailTree.hasNext()) {

                throw new IllegalStateException(e);
            tailTree.remove();
                changeList = null;
        }

    {
    public boolean isDirty()
    }
    /**
        notifyListeners();
        try {
     * @return true if something can be undone

            actions = new ActionHistory(this);
 *
    }
            secondRange.dataOffset += startPosition - secondRange.position;  // actions
            changesPosition + changeList.size() >= position + length) {

package org.jkiss.dbeaver.ui.editors.binary;
    {
     * @param position start deletion point
        throws IOException
        Range(long aPosition, File aFile, boolean isDirty)
            }
            long delta = position - firstRange.position;
        dirty = true;
    /**
        }
            if (range == null)
    /**
                    tailTree.remove();
        if (action == null) return null;
    }
        }

    public long get(File destinationFile)
     * @param position starting read point

    {
            actions = null;

            lastRange = (Range) secondRange.clone();
        return get(destinationFile, 0L, length());
     * @param dst      where to write the read result to
        BinaryContent.Range lastRange = ranges.get(ranges.size() - 1);
            int limit = -1;

 *     http://www.apache.org/licenses/LICENSE-2.0

    {
        int changesSize = changeList.size();
            exclusiveEnd = length();
        positionSoFar += fillWithPartOfRange(dst, sourceRange, overlapBytes, Integer.MAX_VALUE);
        return new long[]{firstRange.position, lastRange.exclusiveEnd()};
        splitAndShift(firstRange.position, lastRange.exclusiveEnd() - firstRange.position);
     */
import java.io.RandomAccessFile;
    }
                    // gcj will happily accept maps of size bigger than available memory, sun won't
        long positionShift = 0;
                rangesModified.add(positionSoFar + positionShift);
        if (start < 0L || length < 0L || start + length > length()) return 0L;
    /**
 */

        }
     *
        if (changeList == null) return;
                clone.dataOffset = range.dataOffset + position - range.position;

            }
        for (Integer myChange : changeList) {
            if (changeList != null && changesInserted &&
            } else if (value instanceof RandomAccessFile) {
            result = getRangeAt(position);
        for (Range value : ranges) {
 *
                    if (buffer == null)
    }
     * Tells whether a redo is possible
     * @return 2 elements long array, first one the start point (inclusive) of finished undo operation,
    }

            }
                        changeList.add(0, getFromRanges(position));

                //		positionSoFar - changesPosition > 0) {
        listeners.add(listener);
     *
     *                 undefined behaviour.
        Object[] action = actions.redoAction();
        ByteBuffer store = ByteBuffer.allocate(changeList.size());
            positionSoFar += added;
                    if (changesPosition > position) {
     * Reads the sequence of all bytes from this content into the given file
                }
                deleted.add(beforeLastRange);
            channel.close();
    public void addModifyListener(ModifyListener listener)
            actions.eventPreModify(ActionHistory.ActionType.INSERT, position, true);
            int length = (int) Math.min(sourceRange.length - overlapBytes, maxCopyLength);
            int size = fillWithChanges(dst, positionSoFar + positionShift);
     *                 undefined behaviour.

            dirty = isDirty;
        }
    /**
//		secondRange.dirty |= increment != 0;
     * and overwriting the existing ones. Changes to the file after this call will result in undefined
            result = ranges.last().exclusiveEnd();
    }
     * @return number of bytes read
        if (actions != null)

            dst.put(src);
            commitChanges();


            if (lastRange != null && lastRange.position < exclusiveEnd) {  // actions
            actions.dispose();
            data = aBuffer;
            return;
        int newValue = previous & ~mask | (source << (8 - offset - length)) & mask;
        BinaryContent.Range firstRange = ranges.get(0);
        splitAndShift(newRange.position, newRange.length);
        long changesPosition = positionSoFar;

        initSubtreeTraversing(firstRange.position, 0L);
            result.append(myRange).append('\n');
                overlapBytes += changesAdded;
        while (tailTree.hasNext() && (partialRange = tailTree.next()).position < exclusiveEnd) {
    private void deleteAndShift(long start, long length)
     * @see Object#finalize()
        if (length < 1L) return;

        return result;
            for (long position = 0L; position < length; position += mappedFileBufferLength) {

            src.getChannel().read(dst, start);


    private int fillWithChanges(ByteBuffer dst, long position)
    /**
            throws IOException
    {
    void actionsOn(boolean on)
        private boolean dirty = true;
            else {
    {
        Range newRange = new Range(position, aFile, true);
                get(buffer, start + position);
    /*
        int dstInitialPosition = dst.position();
            long start = sourceRange.dataOffset + overlapBytes;
     * Tells whether changes have been done to the original content

        boolean toBeAdded = false;
            this(aPosition, aFile.length());
        if (actions != null)
     * Closes all files for termination

    }
    /**
            if (insert == changesInserted && position >= lowerLimit && position <= upperLimit) { // reuse

        if (dst.remaining() > 0 && changeList != null &&
    }
        {
     * Writes a sequence of bytes from the given file into this content, starting at the given position

                data.position((int) range.dataOffset);
                }
        return result;
                rangesModified.add(changesPosition);

        if (offset < 0 || offset > 7 || length < 0 || position >= length())
        if (changeList != null && positionSoFar >= this.changesPosition &&
            actions.addRangeToCurrentAction((Range) newRange.clone());
        /**
     * having to wait until the object is garbage collected. Note: apparently due to a bug in the java

            result = insertRanges(currentAction);
        public Object clone()
    {

        else
        }
     * Writes a sequence of bytes from the given buffer into this content, starting at the given position
        dirty = true;

        if (actions != null)


     */

                dst.limit(dst.position() + length);

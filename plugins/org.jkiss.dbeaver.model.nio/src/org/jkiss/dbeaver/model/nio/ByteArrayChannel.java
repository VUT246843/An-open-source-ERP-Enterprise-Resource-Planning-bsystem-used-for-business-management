            return Arrays.copyOf(buf, last);
        this.pos = 0;
     * Some VMs reserve some header words in an array.

        }
            throw new OutOfMemoryError("Required length exceeds implementation limit");
     * @param minCapacity the desired minimum capacity
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * questions.
            ensureOpen();

        rwlock.writeLock().lock();
            pos = 0;
 * published by the Free Software Foundation.  Oracle designates this

    private void grow(int minCapacity) {
        if (closed)
                throw new IllegalArgumentException("Illegal position " + pos);
        }
            // avoid copy if last == bytes.length?
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
import java.util.concurrent.locks.ReadWriteLock;
            ensureOpen();
    }
            return n;
    private boolean closed;
            last = 0;
        return (minCapacity > MAX_ARRAY_SIZE) ?
        beginWrite();
            return n;
     * Note: no defensive copy of the 'buf', used directly.
            }
    @Override
    /*
        rwlock.readLock().unlock();
public abstract class ByteArrayChannel implements SeekableByteChannel {
 *
    public SeekableByteChannel truncate(long size) throws IOException {
    private final ReadWriteLock rwlock = new ReentrantReadWriteLock();
        } finally {
    public byte[] toByteArray() {
            this.pos = Math.min((int) pos, last);

            endWrite();
        ensureOpen();
            ensureCapacity(pos + n);
     *
        int oldCapacity = buf.length;
            throw new ClosedChannelException();
    @Override
            buf = null;
    @Override
            dst.put(buf, pos, n);

 * under the terms of the GNU General Public License version 2 only, as
import java.io.IOException;
import java.nio.ByteBuffer;
        rwlock.readLock().lock();

import java.nio.file.OpenOption;
            if (pos == last)
                writeToFile();
     */
        }
    private static int hugeCapacity(int minCapacity) {
        }
    public int write(ByteBuffer src) throws IOException {
    protected abstract void createNewFile() throws IOException;
        return !closed;
    /**
            newCapacity = minCapacity;
     * Increases the capacity to ensure that it can hold at least the
        try {
            ensureOpen();
    public long position() throws IOException {
     */
// modification of of jdk.nio.zipfs.ByteArrayChannel
        beginRead();
    /**
    }


            endWrite();
import java.util.Arrays;
 *
    protected byte buf[];
        if (newCapacity - minCapacity < 0)
import java.util.Set;
        beginRead();
        } finally {
            newCapacity = hugeCapacity(minCapacity);
            return pos;
        } finally {
            closed = true;
        throw new UnsupportedOperationException();
        this.last = buf.length;
    }
            endRead();
        }

     */
     * @return the current contents of this channel, as a byte array.
    private void ensureOpen() throws IOException {
            }
 * accompanied this code).
package org.jkiss.dbeaver.model.nio;
        } finally {
    }
        }
            return this;
        beginRead();
                return -1;
        buf = Arrays.copyOf(buf, newCapacity);
        int newCapacity = oldCapacity << 1;
     * have been copied into it.
    private final void beginRead() {
import java.nio.channels.SeekableByteChannel;
    }
        } finally {
            ensureOpen();
        if (minCapacity < 0) // overflow
            return;
    private int pos;

        try {
    @Override
    }
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
    }
                last = pos;
    @Override
        this.buf = buf;
    }
            pos += n;
    }

    /*
    private final void endRead() {
 * 2 along with this work; if not, write to the Free Software Foundation,
        try {
        try {
            endRead();
     * size of this channel and the valid contents of the buffer
        try {
 * particular file as subject to the "Classpath" exception as provided
            endRead();

    }
        try {

    final void endWrite() {
            grow(minCapacity);
     */
            int n = Math.min(dst.remaining(), last - pos);
            endWrite();

    protected abstract void writeToFile() throws IOException;
            }
    final void beginWrite() {
import java.util.concurrent.locks.ReentrantReadWriteLock;
            pos += n;
     */



 * by Oracle in the LICENSE file that accompanied this code.
        } finally {
        beginWrite();
    @Override
     */
    public ByteArrayChannel(byte[] buf, Set<? extends OpenOption> options) {
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
    @Override
     * The current position of this channel.
     * The maximum size of array to allocate.

            if (options.contains(StandardOpenOption.CREATE_NEW)) {
 */
    protected abstract void deleteFile() throws IOException;
        }
     * Creates a ByteArrayChannel with its 'pos' at 0 and its 'last' at buf's end.
 * This code is free software; you can redistribute it and/or modify it
 * version 2 for more details (a copy is included in the LICENSE file that
        try {
     *

import java.nio.file.StandardOpenOption;
        // overflow-conscious code
    }

        if (minCapacity - buf.length > 0) {
    public int read(ByteBuffer dst) throws IOException {
     * OutOfMemoryError: Requested array size exceeds VM limit
    }
     * Attempts to allocate larger arrays may result in

                createNewFile();
 *
     * number of elements specified by the minimum capacity argument.
            endWrite();
        if (newCapacity - MAX_ARRAY_SIZE > 0)
    }
 * This code is distributed in the hope that it will be useful, but WITHOUT
     * Creates a newly allocated byte array. Its size is the current
        this.options = options;
        beginWrite();
    private int last;

/*
 * or visit www.oracle.com if you need additional information or have any
            }


        // overflow-conscious code
import java.nio.channels.ClosedChannelException;
    public SeekableByteChannel position(long pos) throws IOException {
            MAX_ARRAY_SIZE;
    }
 *
        beginWrite();
    private void ensureCapacity(int minCapacity) {
        if (closed)
    }

 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or

    /**
            src.get(buf, pos, n);
                deleteFile();

        }
            int n = src.remaining();
    /*

    public void close() throws IOException {
    }
            if (options.contains(StandardOpenOption.WRITE) && buf != null) {
            return last;

        rwlock.writeLock().unlock();


 * You should have received a copy of the GNU General Public License version
    @Override
    public boolean isOpen() {
            ensureOpen();
    }
            if (pos < 0 || pos >= Integer.MAX_VALUE)
     * The index that is one greater than the last valid byte in the channel.
        } finally {
    private final Set<? extends OpenOption> options;
}            if (pos > last) {
    public long size() throws IOException {
            if (options.contains(StandardOpenOption.DELETE_ON_CLOSE)) {
    }
            Integer.MAX_VALUE :
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
 * Copyright (c) 2018, 2020, Oracle and/or its affiliates. All rights reserved.

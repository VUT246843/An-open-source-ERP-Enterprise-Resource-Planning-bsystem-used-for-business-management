
        throws IOException
 *
        int currentPartFoundUnicode = findUnicodeMatchInPart();

     * @param literal the char sequence to find

 * You may obtain a copy of the License at
     * @param beSensitive set to true will not match 'a' with 'A'
        bufferPosition = newPos;
        boolean isAsciiCompatible = true;
 *
    public void setDirectionForward(boolean goForward)
            size = (int) (bufferPosition + literalByteLength - 1L - newPos);
    {
     * Sets new search start point in the file. Inclusive in forward finds, exclusive in backward ones.
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
            return 0L;
        if (!directionForward)
    public void stopSearching()
            if (previous == '\\' && aChar == 'E')
        for (int encoding = 0; encoding < 4; ++encoding) {
        if (bufferPosition < 0L)
        stopSearching = true;
        throws IOException

     * @param aContent provider to be traversed
    {
    private boolean directionForward = true;
        if (isAsciiCompatible)
    private int currentPartFound = -1;  // relative positions
        populatePart();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        long resultPosition = bufferPosition + currentPartFound;
    /**
 * limitations under the License.
        byteBuffer.limit(size);
            }
            literal = literal.subSequence(0, MAX_SEQUENCE_SIZE / 2);

    private boolean stopSearching = false;
                byte matcher = byteFindSequence[j];
     * @return an array with 2 elements, the first one a Long (position in the file),
        if (startPoint < 0L || startPoint > getContentLength())
        if (caseSensitive == beSensitive) return;

    void findAllMatches()
 *

            } else if (encoding == 1 && byteBuffer.limit() > 0) {
     * @param aContent  provider to be traversed
    }
        throws IOException
            result = -1;

        }
    private ByteBuffer byteBuffer = null;
    public Number[] getNextMatch()
    {
    /**
        directionForward = goForward;
import java.util.regex.Matcher;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        {
                if (directionForward) {
        currentPartFound = findHexAsciiMatchInPart();
        return bufferPosition;
    private byte[] byteFindSequence = null;
    {
            while (matcher.find()) {
        long newPos = bufferPosition + byteBuffer.limit() - literalByteLength + 1L;
    private long bufferPosition = -1L;

     */
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
            bufferPosition = 0L;
            inclusiveEnd = 0;
 * Unless required by applicable law or agreed to in writing, software
            return null;
            currentPartFoundIsUnicode = true;
            tmpBytes[i] = (byte) aChar;
        return -1;
    }
                    break;

    }
                regex.append("\\\\E\\Q");
        throws IOException
        literalByteLength = literal.length() * 2;
        populatePart(size);
        }
            if (matchesSoFar) {
        pattern = Pattern.compile(regex.toString(), ignoreCaseFlags);
            previous = aChar;
                if (existing != matcher) {
    void populatePart(int size)
 *
        currentPosition = 0L;

package org.jkiss.dbeaver.ui.editors.binary;
            start = inclusiveEnd;

    {
        return byteBuffer;
        if (currentPartFoundUnicode >= 0 && (currentPartFound < 0 ||


     * Create a finder object for a sequence of characters; uses unicode and ascii traversing



     * Sets the case sensitiveness. The default is always case sensitive (not ignore case)
                        matcher > 'z' || existing - matcher != 32 && matcher - existing != 32)
    /**
    }
            if (encoding == 0) {
        content.get(byteBuffer, bufferPosition);
 * See the License for the specific language governing permissions and
        if (content == null) return;
                        matchesSoFar = false;

        }
    {

    {
    /**
            char aChar = literal.charAt(i);
            findAllMatches();
    public BinaryTextFinder(byte[] sequence, BinaryContent aContent)
            if (nextPart() == null || stopSearching) {
                byte existing = byteBuffer.get(i + j);
        if (size < literalByteLength)
        int result = Integer.MAX_VALUE;
            directionForward && currentPartFound > currentPartFoundUnicode ||


        for (int i = 0; i < literal.length(); ++i) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//		byteBuffer = ByteBuffer.allocate(MAP_SIZE);
 * The search is either binary or text based. Text based search uses standard java unicode (all of big
     */
            System.arraycopy(sequence, 0, byteFindSequence, 0, MAX_SEQUENCE_SIZE);
        return result;
        }

            initSearchUnicodeAscii();
import java.io.IOException;
}
        byteBuffer.position(0);
            }
    }

    public long getSearchPosition()
        if (sequence.length > MAX_SEQUENCE_SIZE) {
    }

     * @param sequence the byte sequence to find

    private boolean caseSensitive = true;
                    if (caseSensitive || existing < 'A' || existing > 'z' || matcher < 'A' ||
        char previous = '\0';
            for (int j = 0; j < byteFindSequence.length && matchesSoFar; ++j) {
/*
        if (newPos < 0L)
 * you may not use this file except in compliance with the License.
            if (aChar > 255) isAsciiCompatible = false;
        Matcher matcher = pattern.matcher(byteBuffer.asCharBuffer());
    {
            byteFindSequence = new byte[MAX_SEQUENCE_SIZE];
            regex.append(aChar);
     *         and the second one an Integer (byte length of the matching literal),
        //content.get(byteBuffer, myCurrentPosition);
import java.nio.ByteBuffer;
        bufferPosition = 0L;


            }

 */


    private CharSequence literal = null;


    private int literalByteLength = -1;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            result = -1;
    private BinaryContent content = null;
        if (literal.length() * 2 > MAX_SEQUENCE_SIZE)  // 16 bit Unicode chars
            byteFindSequence = tmpBytes;

        populatePart(size);
     * Sets the search direction. The default search direction is always forward
    void initSearchHex(byte[] sequence)
        if (!directionForward) {
     *         or null if there are no matches
     *
    private int findHexAsciiMatchInPart()

            }


        if (!directionForward)
     */
        if (!caseSensitive) ignoreCaseFlags = Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE;
        this.literal = literal;
public class BinaryTextFinder {
     *


     *
        currentPosition = 0L;
     *
        byteBuffer.position(0);
                }
        }
//		byteBuffer = null;
//	if (byteBuffer == null)

    private boolean currentPartFoundIsUnicode = false;
//		byteBuffer = ByteBuffer.allocate(MAP_SIZE);

            directionForward && i <= inclusiveEnd || !directionForward && i >= inclusiveEnd;
        if (result == Integer.MAX_VALUE) {
 * and little endian, odd and even address) plus ascii when the literal falls within ascii char limits.
        bufferPosition = startPoint;
        throws IOException
    }

        }
        }
import java.util.regex.Pattern;
 * Given a literal, finds its position in the file. It is possible to get subsequent finds.

    /**

        int inclusiveEnd = byteBuffer.limit() - byteFindSequence.length;
     *
            matcher.reset(byteBuffer.asCharBuffer());

        int size = MAP_SIZE;
     */
    /**
    {
    }
/**

        currentPartFoundIsUnicode = false;
    void initSearchUnicodeAscii()

    {
    private int findUnicodeMatchInPart()

 * Licensed under the Apache License, Version 2.0 (the "License");
        throws IOException
                return i;
    {



    {
     *
    public static final int MAX_SEQUENCE_SIZE = 2 * 1024;  // a search string of 2K should be enough

        for (int i = start;
 * DBeaver - Universal Database Manager
    }
                stopSearching = false;
        int start = 0;
        int size = (int) Math.min(MAP_SIZE, getContentLength() - newPos);
            size = (int) Math.min(MAP_SIZE, currentPosition);
    }
        if (content == null) {
            newPos = 0L;
        return new Number[]{resultPosition, length};

    }
    /**
    void populatePart()
    public BinaryTextFinder(CharSequence literal, BinaryContent aContent)
                byteBuffer.position(1);
        setNewStart(resultPosition + (directionForward ? 1 : length - 1));
            currentPartFound = currentPartFoundUnicode;
import java.nio.ByteOrder;
    }
        content = aContent;
        }
    }
    {
        }

        return content.length();
                return null;  // end of file
        }
            } else if (encoding == 2) {
    public void setCaseSensitive(boolean beSensitive)
     */
     *
        regex.append("\\E");
            boolean matchesSoFar = true;
     * Get the next position and length of a matching literal
        //byteBuffer.position(0);

            bufferPosition = startPoint - MAP_SIZE;
//	try {

    private Pattern pattern = null;
        if (literal != null)
     * @param goForward set to true for forward search


        byteBuffer.limit(byteBuffer.position());
    }
        StringBuilder regex = new StringBuilder("\\Q");  // everything-quoted regular expression
    /**
     * Stop searching. Long running searches can be stopped from another thread.
        if (!directionForward) {
     * @param startPoint next match search will start from this point
        while (currentPartFound < 0) { // end of part
    {
     * @return position in the content
 * Copyright (C) 2010-2024 DBeaver Corp and others
            }
                }

        findAllMatches();
    public static final int MAP_SIZE = 64 * 1024;

                if (directionForward && result > index || !directionForward && result < index) {
        byte[] tmpBytes = new byte[literal.length()];
        int ignoreCaseFlags = 0;
 * @author Jordi
 * Find helper class to find binary and string literals in files.
        initSearchUnicodeAscii();
            newPos = bufferPosition - MAP_SIZE + literalByteLength - 1L;


            return;
        if (!directionForward) {
     */
    ByteBuffer nextPart()
        int length = currentPartFoundIsUnicode ? literalByteLength : byteFindSequence.length;
        if (byteFindSequence == null) return -1;
        //}
        }
                    result = index;
        initSearchHex(sequence);
    private long currentPosition = 0L;  // absolute value, start of forward finds, end(exclusive) of backward finds
        }

        if (!directionForward) {
    public void setNewStart(long startPoint)
        byteBuffer = ByteBuffer.allocate(MAP_SIZE);

        caseSensitive = beSensitive;
    {
        throws IOException
 */
        stopSearching = false;
                int index = matcher.start() * 2 + (encoding >= 2 ? 1 : 0);
     */
            !directionForward && currentPartFound < currentPartFoundUnicode)) {
        literalByteLength = byteFindSequence.length;
    {
            i += directionForward ? 1 : -1)
     * Get the current location being searched in the content. Approximate value.
        currentPosition = startPoint;
        content = aContent;

    long getContentLength()
        bufferPosition = 0L;
    {

    }
//	} catch (OutOfMemoryError e) {
        byteFindSequence = sequence;
        if (pattern == null) return -1;
     * Create a finder object for a raw sequence of bytes
        //	byteBuffer.limit(size);

        byteBuffer = null;  // multiple FileChannel.read(byteBuffer) leak memory, so don't reuse buffer
                }
    }

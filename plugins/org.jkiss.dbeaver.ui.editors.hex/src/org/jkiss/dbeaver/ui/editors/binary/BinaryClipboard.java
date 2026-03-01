    /**
import org.jkiss.dbeaver.Log;
                catch (IOException e) {
                    aFile.deleteOnExit();
            }
     * @see Clipboard#dispose()
            }
            }
    private final Clipboard clipboard;
            emptyClipboardFile();
import org.jkiss.utils.StandardConstants;
                log.warn(e);
            ContentUtils.close(file);
                                    new Transfer[]{SimpleByteArrayTransfer.getInstance()});
            if (updateLock(lock, -count)) {  // lock deleted
    /**
            clipboard.dispose();
                    return 0L;  // would overflow
                    file.setLength(0L);
        }
                    content.insert(file, start);

            if (!clipboardFile.equals(lastPaste))  // null

    private static final File clipboardFile = new File(clipboardDir, "dbeaver-binary-clipboard.tmp");
            try {
            return instance;
     *
import java.io.*;

                try {
    * The file is being reference counted. It will be deleted as soon as no binary process is
            if (!isSupportedType(transferData)) return null;
    {
     */
            content.overwrite(buffer, start);
    {
    /**
 * See the License for the specific language governing permissions and
        protected int[] getTypeIds()

    /**

            File lastPaste = (File) clipboard.getContents(FileByteArrayTransfer.getInstance());
                return null;
                file.seek(0);
    @Override
        }
            }
            for (int i = 0; i < files.length; ++i) {
    }
     */
        clipboard = new Clipboard(aDisplay);
            catch (IOException ex) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    if (!lastPaste.exists() || lastPaste.delete())
                filesReferencesCounter.put(lastPaste, value + 1);
 * limitations under the License.
        ByteBuffer buffer = ByteBuffer.wrap(byteArray);
        }
                file.writeInt(references);
            try {

        }
    {
    {
                content.overwrite(lastPaste, start);
    public void dispose()
                return total;
        }
    private static final long maxClipboardDataInMemory = 4 * 1024 * 1024;  // 4 Megs for byte[], 4 Megs for text
        @Override
    public BinaryClipboard(Display aDisplay)
        if (insert) {
                }  // copy nothing then

    {
/**
            }

                log.warn(e);
                    // write data to a byte array and then ask super to convert to pMedium
                success = false;
        {
    private static final File clipboardDir = new File(System.getProperty(StandardConstants.ENV_TMP_DIR, "."));
                    content.overwrite(file, start);
            int count = filesReferencesCounter.get(aFile);
     */
                    byte[] buffer = myType.getAbsolutePath().getBytes(Charset.defaultCharset());
     * @return true: data is available
        if (!clipboard.isDisposed()) {
            else


        total = tryGettingMemoryByteArray(content, start, insert);

     * Dispose system clipboard and file resources

        try {
    }
    }
            clipboard.setContents(
                transfers = new Transfer[]{FileByteArrayTransfer.getInstance()};
            clipboard.setContents(new Object[]{new byte[1]},
            if (success) {
        if (lastPaste == null) return -1L;
                    writeOut.writeInt(buffer.length);
                start += file.length();
 *     http://www.apache.org/licenses/LICENSE-2.0

            }
            if (file.length() >= 4)

        return false;


        dispose();
                    return null;
            content.insert(buffer, start);
        }

            }  // ok, leave it alone
            if (object == null || !(object instanceof File)) return;
                data = new Object[]{clipboardFile};
package org.jkiss.dbeaver.ui.editors.binary;
        Transfer[] transfers;
    private static final Log log = Log.getLog(HexEditControl.class);
            return -1L;
            File file = new File(files[i]);

    }
            if (value != null)
        try {
    public boolean hasContents()
                }
        }
                    buffer = out.toByteArray();
                return true;
                data = new Object[]{byteArrayData, textData};
        long total = lastPaste.length();
    public void setContents(BinaryContent content, long start, long length)
            if (insert)
        if (length < 1L) return;
    long tryGettingFiles(BinaryContent content, long start, boolean insert)
                transfers =
            clipboard.clearContents();
                    new Transfer[]{SimpleByteArrayTransfer.getInstance(), TextTransfer.getInstance()};
        {
        }
    }
            if (SimpleByteArrayTransfer.getInstance().isSupportedType(available[i]) ||
            DataInputStream readIn = new DataInputStream(new ByteArrayInputStream(buffer));

        {
     */

            }
 * A clipboard for binary content. Data up to 4Mbytes is made available as text as well
        public void javaToNative(Object object, TransferData transferData)
                log.warn(ex);
            try {
        return new File(name.substring(0, name.length() - 3) + "lock");

            catch (IOException e) {
            Integer value = filesReferencesCounter.put(lastPaste, 1);
     *
            if (isSupportedType(transferData)) {
     *
                }
        throws IOException
        }
            return true;
        return total;
            return;  // copy nothing then

import org.jkiss.dbeaver.ui.SimpleByteArrayTransfer;
    boolean updateLock(File lock, int references)

        try {
     */
    }
                    DataOutputStream writeOut = new DataOutputStream(out);
    * referencing it anymore.
        total = tryGettingFileByteArray(content, start, insert);
            if (!clipboardFile.renameTo(lastPaste)) {
    {
    }
}
        return total;
            if (text != null) {
                lastPaste = new File(clipboardDir, name.toString() + ".tmp");
    }
        if (references < 1) {
                if (readIn.read(nameBytes) < size){
            if (buffer == null) {

        }
                updateLock(lock, 1);
 *
                else
            boolean success = true;
        if (!insert && total > content.length() - start) return 0L;
    static class FileByteArrayTransfer extends ByteArrayTransfer {
                byte[] byteArrayData = new byte[(int) length];
                return new File(new String(nameBytes));
                File myType = (File) object;
     * Set the clipboard contents with a BinaryContent
                if (!aFile.delete()) {
        }



                TextTransfer.getInstance().isSupportedType(available[i]) ||
        String name = lastPaste.getAbsolutePath();

                file = file.getCanonicalFile();
        if (clipboardFile.equals(lastPaste)) {
                }
        RandomAccessFile file = new RandomAccessFile(lock, "rw");
    {
 *
                }
import org.eclipse.swt.widgets.Display;

            } else {
            return new int[]{FORMAT_ID};
        } else if (total <= content.length() - start) {
        static final int FORMAT_ID = registerType(FORMAT_NAME);
        }
        private FileByteArrayTransfer()
 * Unless required by applicable law or agreed to in writing, software

        } finally {
    /**
    /*
                int size = readIn.readInt();
        File lastPaste = (File) clipboard.getContents(FileByteArrayTransfer.getInstance());
                RandomAccessFile file = new RandomAccessFile(clipboardFile, "rw");
        for (int i = files.length - 1; i >= 0; --i) {  // for some reason they are given in reverse order
        if (byteArray == null)
import java.nio.ByteBuffer;
        static final FileByteArrayTransfer instance = new FileByteArrayTransfer();
            String text = (String) clipboard.getContents(TextTransfer.getInstance());
            }
    }
                    return null;
                try {
    {
            catch (IOException e) {
            if (references > 0) {
    }
                byte[] nameBytes = new byte[size];
            File lock = getLockFromFile(aFile);
 * distributed under the License is distributed on an "AS IS" BASIS,
        for (File aFile : filesReferencesCounter.keySet()) {
                }
                }
            try {
            try {
import org.eclipse.swt.dnd.*;
        }
        return 0L;
                    ContentUtils.close(file);
    long tryGettingFileByteArray(BinaryContent content, long start, boolean insert)
public class BinaryClipboard {

        throws IOException
     * Dispose system clipboard resources
            return new String[]{FORMAT_NAME};
        return false;
        super.finalize();
                content.get(clipboardFile, start, length);
                        break;
            if (lastPaste.exists() || lock.exists()) {


        String[] files = (String[]) clipboard.getContents(FileTransfer.getInstance());
    {
            }
                total += file.length();
        }
    /**

            }
            }
        if (!insert) {

        if (files == null)
        }
                new Object[]{lastPaste},
 */
        static FileByteArrayTransfer getInstance()
        }
        } else {
            }  // use non-canonical one then
            for (int i = 0; ; ++i) {
    {
                byteArray = text.getBytes(Charset.defaultCharset());


        } else {
            }
                if (total > content.length() - start) {
                lock = new File(clipboardDir, name.append(".lock").toString());
            catch (IOException e) {

        TransferData[] available = clipboard.getAvailableTypes();
        }
                    writeOut.close();
        }
        }
import java.util.Map;
            catch (IOException e) {
                if (!lock.exists())
import java.nio.charset.Charset;
        {
        if (total >= 0L) return total;


     * Tells whether there is valid data in the clipboard
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * you may not use this file except in compliance with the License.

        protected String[] getTypeNames()
        }
            }
            total = 0L;
            if (length <= maxClipboardDataInMemory) {
        public Object nativeToJava(TransferData transferData)
 * You may obtain a copy of the License at
            if (!lock.delete()) {
                emptyClipboardFile();
            total = 0L;
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
        }
    static File getLockFromFile(File lastPaste)
        if (byteArray == null) {

        }
     */
                File file = new File(files[i]);
        File lock;
    private final Map<File, Integer> filesReferencesCounter = new HashMap<>();
    }
     * Init system resources for the clipboard
                    writeOut.write(buffer);
        @Override
        long total = tryGettingFiles(content, start, insert);
            }
        if (total > 0L) {
     * @see Object#finalize()

        long total = 0L;
 *
 */
                new Transfer[]{FileByteArrayTransfer.getInstance()});
    void emptyClipboardFile()
            byte[] buffer = (byte[]) super.nativeToJava(transferData);
    {
 * @author Jordi
        return total;
                content.get(ByteBuffer.wrap(byteArrayData), start);
        catch (IOException e) {
                total += file.length();
                String textData = new String(byteArrayData);
                StringBuilder name = new StringBuilder("binaryPasted").append(i);
                log.warn("Cannot delete lock file '" + lock.getAbsolutePath() + "'");
            }
            }
        catch (IOException e) {
    long tryGettingMemoryByteArray(BinaryContent content, long start, boolean insert)
                return 0L;

        clipboard.setContents(data, transfers);
    protected void finalize() throws Throwable
                    log.warn(e);
            }
                content.insert(lastPaste, start);

        for (int i = 0; i < available.length; ++i) {
                log.warn("Can't rename clipboard temp file");
        long total = byteArray.length;
 * DBeaver - Universal Database Manager
                filesReferencesCounter.remove(lastPaste);


            return -1L;
                return null;

                if (size <= 0) {
    public long getContents(BinaryContent content, long start, boolean insert)
            }
        byte[] byteArray = (byte[]) clipboard.getContents(SimpleByteArrayTransfer.getInstance());
                references += file.readInt();
        {
    }
        if (clipboardFile.canWrite() && clipboardFile.length() > 0L) {
        static final String FORMAT_NAME = "BinaryFileByteArrayTypeName";
        @Override
    }
        {
     * Paste the clipboard contents into a BinaryContent

            }
/*
    */

                if (insert)
        if (total >= 0L) return total;
        if (total >= 0L) return total;

            }
                FileTransfer.getInstance().isSupportedType(available[i]))

                } finally {

        @Override

 *
        Object[] data;
        total = 0L;

            lock = getLockFromFile(lastPaste);
                FileByteArrayTransfer.getInstance().isSupportedType(available[i]) ||

 * Licensed under the Apache License, Version 2.0 (the "License");
                    super.javaToNative(buffer, transferData);
import org.jkiss.dbeaver.utils.ContentUtils;
import java.util.HashMap;
    {


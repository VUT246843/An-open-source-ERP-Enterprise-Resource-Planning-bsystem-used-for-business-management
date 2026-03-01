            return null;
     * The data object is not converted to bytes. It is held onto in a field.

        object = obj;
     * @return The Object
     *
     * @see org.eclipse.swt.dnd.Transfer#nativeToJava(org.eclipse.swt.dnd.TransferData)
    public void javaToNative(Object object, TransferData transferData) {
 * Subclasses should maintain a

     *
 * single instance of their Transfer and provide a static method to obtain that
    @Override
				transferData
     *
     */
    public Object nativeToJava(TransferData transferData) {
/**
package org.jkiss.dbeaver.ui.dnd;
		}
			super.javaToNative(
     */
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
public abstract class LocalObjectTransfer<OBJECT_TYPE> extends ByteArrayTransfer {
    public void setObject(OBJECT_TYPE obj) {
}
     *
import java.nio.charset.Charset;
    public OBJECT_TYPE getObject() {
    /**
    /**
    /**

 * instance.
     * Instead, a checksum is written out to prevent unwanted drags across
 * This Transfer will only work when dragging within the same instance of Eclipse.
 * Copyright (C) 2010-2026 DBeaver Corp and others
     * @see org.eclipse.swt.dnd.Transfer#javaToNative(Object, org.eclipse.swt.dnd.TransferData)
 * See the License for the specific language governing permissions and
 *
     * multiple running. copies of Eclipse.
     * Instead, a checksum is written out to prevent unwanted drags across
    }
        setObject((OBJECT_TYPE) object);
     * multiple running copies of Eclipse.

		if (transferData != null) {
 *
        long startTime = Long.parseLong(new String(bytes));
				String.valueOf(startTime).getBytes(Charset.defaultCharset()),

     */
 * Unless required by applicable law or agreed to in writing, software
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
     * Sets the Object.
    }
        startTime = System.currentTimeMillis();
import org.eclipse.swt.dnd.ByteArrayTransfer;
/*
 *
        return (this.startTime == startTime) ? getObject() : null;
import org.eclipse.swt.dnd.TransferData;
        byte[] bytes = (byte[]) super.nativeToJava(transferData);
     * @param obj The Object
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
			);


 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
        return object;

        //noinspection unchecked
    private OBJECT_TYPE object;
     */
    /**
    }
    @Override
     * Returns the Object.
    private long startTime;
    }
     * The data object is not converted to bytes. It is held onto in a field.
        if (bytes == null) {
 * limitations under the License.


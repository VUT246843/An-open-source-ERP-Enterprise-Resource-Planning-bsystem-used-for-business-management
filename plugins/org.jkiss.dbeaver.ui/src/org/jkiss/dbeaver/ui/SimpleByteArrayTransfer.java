        if (isSupportedType(transferData)) {
        return new String[]{FORMAT_NAME};
        if (isSupportedType(transferData)) {
    }

package org.jkiss.dbeaver.ui;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
    @Override
        if (object == null || !(object instanceof byte[])) return;
    public static SimpleByteArrayTransfer getInstance() {
        return instance;
    @Override
            result = super.nativeToJava(transferData);
 *
    }
    public void javaToNative(Object object, TransferData transferData) {
        }
    private static final String FORMAT_NAME = "BinaryMemoryByteArrayTypeName";
 *
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,

        Object result = null;
 * DBeaver - Universal Database Manager
        return result;
        return new int[]{FORMAT_ID};
            super.javaToNative(buffer, transferData);
 */


import org.eclipse.swt.dnd.ByteArrayTransfer;
    protected int[] getTypeIds() {
            byte[] buffer = (byte[]) object;

 * you may not use this file except in compliance with the License.
    @Override
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.dnd.TransferData;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

public class SimpleByteArrayTransfer extends ByteArrayTransfer {
    private static final int FORMAT_ID = registerType(FORMAT_NAME);
 * limitations under the License.
}
    public Object nativeToJava(TransferData transferData) {
 * Unless required by applicable law or agreed to in writing, software

/*
    @Override

        }
 *
    private SimpleByteArrayTransfer() {

    private static final SimpleByteArrayTransfer instance = new SimpleByteArrayTransfer();
    }
    protected String[] getTypeNames() {



 * Licensed under the Apache License, Version 2.0 (the "License");

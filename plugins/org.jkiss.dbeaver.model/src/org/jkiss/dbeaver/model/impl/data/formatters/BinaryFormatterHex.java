        return bytes;
    }
    }
        return chars;
    }
    {
        int length = string.length();
    public String getId()
            chars[i * 2] = hex.charAt(0);
            length--;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.utils.GeneralUtils;

public class BinaryFormatterHex implements DBDBinaryFormatter {
 * Unless required by applicable law or agreed to in writing, software
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0


package org.jkiss.dbeaver.model.impl.data.formatters;
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return "Hex";
 * See the License for the specific language governing permissions and
    {
 * Licensed under the Apache License, Version 2.0 (the "License");
            String hex = GeneralUtils.byteToHex[bytes[offset + i] & 0x0ff];
 * you may not use this file except in compliance with the License.
        for (int i = 0; i < length; i++) {
            chars[i * 2 + 1] = hex.charAt(1);
        byte bytes[] = new byte[length / 2];
    protected static char[] toHexChars(byte[] bytes, int offset, int length) {
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
 * Hex formatter
 */
        }
    @Override
    @Override
    @Override

        return new String(toHexChars(bytes, offset, length));


    public String toString(byte[] bytes, int offset, int length)
 * limitations under the License.
 * DBeaver - Universal Database Manager
    public byte[] toBytes(String string)
/**
    {

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }
            bytes[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4)
 *
        }
        return "hex";
    public static final BinaryFormatterHex INSTANCE = new BinaryFormatterHex();
        for (int i = 0; i < length; i += 2) {
                + Character.digit(string.charAt(i + 1), 16));
 *
        if (length > 0 && length % 2 != 0) {
        char[] chars = new char[length * 2];
 *
        }
    {

 * You may obtain a copy of the License at
    public String getTitle()
}

 */

 *
    public byte[] toBytes(String string)
 *
 * you may not use this file except in compliance with the License.
 * Formats binary data to hex with preceding 0x
    public static final BinaryFormatterHexNative INSTANCE = new BinaryFormatterHexNative();
        return "hex_native";
 * Copyright (C) 2010-2024 DBeaver Corp and others
public class BinaryFormatterHexNative extends BinaryFormatterHex {



    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    @Override
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        return HEX_PREFIX + super.toString(bytes, offset, length);
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    {
/**

}
    }
    private static final String HEX_PREFIX2 = "0X";
 */
    {
    public String getId()
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
/*
    private static final String HEX_PREFIX = "0x";

 */
        return super.toBytes(string);
    {
    @Override
    {
    }
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
    @Override
package org.jkiss.dbeaver.model.impl.data.formatters;
    public String toString(byte[] bytes, int offset, int length)
        if (string.startsWith(HEX_PREFIX) || string.startsWith(HEX_PREFIX2)) {
        return "Hex";
            string = string.substring(2);
 * Hex formatter.
    public String getTitle()

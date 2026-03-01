import org.jkiss.dbeaver.model.DBPDataKind;
                        return String.valueOf(value);
                }
import org.jkiss.code.Nullable;
import org.jkiss.utils.CommonUtils;
    }
                    bytes = (byte[]) cachedValue;
                    return new UUID(mostSigBits, leastSigBits).toString();

 *

            this.isUpperCase = isUpperCase;
        Version1,
                        return String.valueOf(value);
 * you may not use this file except in compliance with the License.
                            + ((long)(bytes[7] & 255) << 32)
                            + ((bytes[1] & 255) <<  0);
                    } catch (Exception e) {

    }
import java.util.List;
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
                    long leastSigBits = ((long)bytes[8] << 56)// ________-____-____-XXXX-...
                    throw new IllegalArgumentException("UUID length must be at least 16 bytes (actual length = " + bytes.length + ")");
                    try {
import org.jkiss.dbeaver.utils.GeneralUtils;
                bytes = (byte[]) value;
 * Licensed under the Apache License, Version 2.0 (the "License");
    private static final String PROP_CASE = "case";
                } else if (cachedValue instanceof String string) {
                } else if (uuidVersion == UUIDVersion.Version2) {
 * limitations under the License.
            byte[] bytes = null;
                            return GeneralUtils.getUUIDFromBytes(bytes).toString().toUpperCase(Locale.ENGLISH);
 *  @see <a href="https://www.percona.com/blog/2014/12/19/store-uuid-optimized-way/">Store UUID in an optimized way</a>
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (cachedValue instanceof byte[]) {
        UUIDVersion uuidVersion = getUUIDVersion(options);
 *
                    } catch (Exception e) {
        public String getValueDisplayString(@NotNull DBSTypedObject column, @Nullable Object value, @NotNull DBDDisplayFormat format) {

    }
import org.jkiss.code.NotNull;
    enum UUIDVersion {
                }
    private static final String PROP_TYPE = "type";
                        if (isUpperCase) {
                            return GeneralUtils.getMixedEndianUUIDFromBytes(bytes).toString().toUpperCase(Locale.ENGLISH);
}
 */
        public UUIDValueHandler(DBDValueHandler target, UUIDVersion uuidVersion, boolean isUpperCase) {
                        }
 * See the License for the specific language governing permissions and
 *
        private boolean isUpperCase;
                    long mostSigBits = ((long)bytes[4] << 56) // XXXXXXXX-____-____-...
                        return GeneralUtils.getMixedEndianUUIDFromBytes(bytes).toString();
                    // byte shift operations from Ebean ORM project pull request #1308
/**
import java.util.Locale;
                    }
            if (value instanceof byte[]) {
                    try {
                if (uuidVersion == UUIDVersion.Ordered) {
    private UUIDVersion getUUIDVersion(Map<String, Object> options) {
        Version2,

import org.jkiss.dbeaver.DBException;
                        }
            } else if (value instanceof DBDContentCached) {
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Transforms binary attribute value into UUID.
                            + ((long)(bytes[2] & 255) << 24)      // ________-XXXX-____-...
                            + ((bytes[13] & 255) << 16)
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.impl.data.transformers;
import org.jkiss.dbeaver.model.data.*;
                else {
                Object cachedValue = ((DBDContentCached) value).getCachedValue();
    private class UUIDValueHandler extends ProxyValueHandler {
 * DBeaver - Universal Database Manager
    public void transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding attribute, @NotNull List<Object[]> rows, @NotNull Map<String, Object> options) throws DBException {

                            + ((long)(bytes[12] & 255) << 24)

                            + ((bytes[14] & 255) <<  8)
        attribute.setTransformHandler(new UUIDValueHandler(attribute.getValueHandler(), uuidVersion, isUpperCase));
            new TransformerPresentationAttribute(attribute, "UUID", -1, DBPDataKind.BINARY));
                        if (isUpperCase) {
 * You may obtain a copy of the License at
        private UUIDVersion uuidVersion;
                    }
                }
            this.uuidVersion = uuidVersion;
 *

    @Override
                            + ((long)(bytes[11] & 255) << 32)
                    bytes = string.getBytes();
                            + ((bytes[0] & 255) <<  8)            // ________-____-XXXX-...
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
                }
        }
import org.jkiss.dbeaver.model.impl.data.ProxyValueHandler;
                            + ((long)(bytes[5] & 255) << 48)
                    if (isUpperCase) {
            if (bytes != null) {
    private static final String PROP_UPPER_CASE = "Upper case";
 * Copyright (C) 2010-2024 DBeaver Corp and others
                            + ((bytes[3] & 255) << 16)
            return super.getValueDisplayString(column, value, format);
    }
                if (bytes.length < 16) {
                            + ((long)(bytes[6] & 255) << 40)
                            + ((long)(bytes[9] & 255) << 48)
                            + ((long)(bytes[10] & 255) << 40)     // ________-____-____-____-XXXXXXXXXXXX
        return CommonUtils.valueOf(UUIDVersion.class, CommonUtils.toString(options.get(PROP_TYPE)), UUIDVersion.Version1);
 *  Ordered UUID storage format saves space and improves INSERT performance as described in the linked article.
        boolean isUpperCase = CommonUtils.equalObjects(options.get(PROP_CASE), PROP_UPPER_CASE);
                        return GeneralUtils.getUUIDFromBytes(bytes).toString();
public class UUIDAttributeTransformer implements DBDAttributeTransformer {

import java.util.UUID;
        @Override
 */
        Ordered
        @NotNull
            super(target);

                            + ((bytes[15] & 255) <<  0);
            }
                    }
        attribute.setPresentationAttribute(

/*
import java.util.Map;

                        return new UUID(mostSigBits, leastSigBits).toString().toUpperCase(Locale.ENGLISH);
 *

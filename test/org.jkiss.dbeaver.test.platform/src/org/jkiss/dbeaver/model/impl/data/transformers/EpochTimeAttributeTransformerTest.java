        assertEquals(42L, getValue("1970-01-01 01:00:42"));
        }
        @Override

import static org.junit.Assert.assertEquals;
        proxyHandler = attributeBinding.getValueHandler();
        assertEquals("1970-01-01 00:59:59", getDisplayString(-1));
        assertEquals(0L, getValue("1970-01-01 00:00:00.000000000"));
        @Override
        @Override
        @Override
        }
    @Test
            return null;
        }
        setOptions(NANOS, "UTC");
        assertEquals(0L, getValue("1970-01-01 01:00:00"));
        public int getOrdinalPosition() {
        }
    }
        @Nullable
            map.put(EpochTimeAttributeTransformer.PROP_UNIT, unit);
        public String getRowIdentifierStatus() {
        @Nullable
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
    private DBDValueHandler proxyHandler;
            return proxyHandler.getValueFromObject(session, column, o, false, false);
        public DBPDataSource getDataSource() {

        if (unit != null) {
        public String getName() {

        assertEquals(1_000_000_420L, getValue("1970-01-01 00:00:01.000000420"));
public class EpochTimeAttributeTransformerTest extends DBeaverUnitTest {
        }
        assertEquals(-420L, getValue("1969-12-31 23:59:59.999999580"));
        attributeBinding = new DBDAttributeBindingTestDouble(handler);
            return 0;
            return null;
            return null;
        assertEquals(42L, getValue("1970-01-01 00:00:00.042"));

import org.junit.Test;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        }
    }
    public void testNanosAndUTC() {

        public Integer getScale() {
        }
        } catch (DBCException e) {
        @Nullable
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private String getDisplayString(Object o) {
        assertEquals("1970-01-01 00:00:00.000000000", getDisplayString(0));

        assertEquals("1969-12-31 23:59:58.999999580", getDisplayString(-1_000_000_420));
        }
            return 0;

import java.util.Map;
        @NotNull
            return null;

    private final EpochTimeAttributeTransformer transformer = new EpochTimeAttributeTransformer();

            return 0;
        @Nullable

        @Override
        assertEquals("1969-12-31 23:59:59.999999580", getDisplayString(-420));
        public DBSEntityAttribute getEntityAttribute() {
        return proxyHandler.getValueDisplayString(column, o, DBDDisplayFormat.UI);
        @NotNull
            map.put(EpochTimeAttributeTransformer.ZONE_ID, timezoneID);
        assertEquals(0L, getValue("1970-01-01 00:00:00.000"));
import org.jkiss.code.NotNull;
        assertEquals("1970-01-01 01:00:00", getDisplayString(0));
        @Nullable
        @NotNull
    @Before
import static org.mockito.Mockito.mock;
        @Override
        @Nullable
        assertEquals("1970-01-01 00:00:00.000000420", getDisplayString(420));
        assertEquals("1970-01-01 00:00:00.042", getDisplayString(42));
        assertEquals("1970-01-01 01:00:42", getDisplayString(42));
        public int getTypeID() {
    private final DBSTypedObject column = mock(DBSTypedObject.class);
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;
    private static final String MILLIS = "milliseconds";
 *

            return null;
        @Override
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        public Object extractNestedValue(@NotNull Object ownerValue, int itemIndex) throws DBCException {

            return 0;
package org.jkiss.dbeaver.model.impl.data.transformers;
import org.jkiss.dbeaver.model.exec.DBCException;
            return null;
    private final DBCSession session = mock(DBCSession.class);
            throw new RuntimeException(e);
            return null;
    public void init() {
        public long getMaxLength() {
        }
            return null;
    private Object getValue(Object o) {
 * you may not use this file except in compliance with the License.
        }
        }
            return null;
        }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void testSecondsAndParis() {
            return false;
import org.jkiss.dbeaver.model.data.DBDValueHandler;

/*


            transformer.transformAttribute(session, attributeBinding, Collections.emptyList(), Collections.unmodifiableMap(map));
import org.jkiss.dbeaver.model.DBPDataKind;


        @Override


        public boolean isRequired() {
        public long getTypeModifiers() {

            return false;
            return null;
            return null;
        @Nullable
        @Override
 * You may obtain a copy of the License at


 *
        public DBPDataKind getDataKind() {
    @Test
        assertEquals("1970-01-01 00:00:01.000000420", getDisplayString(1_000_000_420));
    private static final String NANOS = "nanoseconds";
        }
        setOptions(MILLIS, "UTC");
        assertEquals(-1L, getValue("1969-12-31 23:59:59.999"));
        @Override

        }
        @Override
        @Override
import org.jkiss.code.Nullable;

        @Nullable
        @Override
}

        @Override

        }
 * Unless required by applicable law or agreed to in writing, software
        public boolean isAutoGenerated() {
import org.jkiss.dbeaver.model.DBPDataSource;
    }
            super(valueHandler);

        @Override

            return null;
    private static class DBDAttributeBindingTestDouble extends DBDAttributeBinding {
 * DBeaver - Universal Database Manager
        try {
import java.util.Collections;
        @Override
    }
        public DBDAttributeBinding getParentObject() {
            return null;
        public List<DBSEntityReferrer> getReferrers() {
    private final DBDValueHandler handler = mock(DBDValueHandler.class);
    private DBDAttributeBinding attributeBinding;
        public String getFullTypeName() {
    private static final String SECONDS = "seconds";

        if (timezoneID != null) {
            return null;
import org.junit.Before;
import org.jkiss.dbeaver.model.exec.DBCSession;
        @Override
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;

        public Integer getPrecision() {
        try {


        }

            return null;
    private void setOptions(@Nullable String unit, @Nullable String timezoneID) {
        setOptions(SECONDS, "Europe/Paris");
    }
        public String getLabel() {
        @NotNull
import java.util.HashMap;
        }
 *

    public void testMillisAndUTC() {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    @Test
        assertEquals("1970-01-01 00:00:00.000", getDisplayString(0));
        assertEquals(420L, getValue("1970-01-01 00:00:00.000000420"));
            throw new RuntimeException(e);
        @Override
 * See the License for the specific language governing permissions and
import java.util.List;
        }



        }

        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import org.jkiss.junit.DBeaverUnitTest;

        } catch (DBException e) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
    }

        assertEquals("1969-12-31 23:59:59.999", getDisplayString(-1));
import org.jkiss.dbeaver.DBException;
        Map<String, Object> map = new HashMap<>(2, 1);

        }
 * limitations under the License.
        }
        protected DBDAttributeBindingTestDouble(@NotNull DBDValueHandler valueHandler) {

        public String getTypeName() {
        public DBDRowIdentifier getRowIdentifier() {
import org.jkiss.dbeaver.model.data.DBDRowIdentifier;
        public DBCAttributeMetaData getMetaAttribute() {
        assertEquals(-1L, getValue("1970-01-01 00:59:59"));
 */

    }
        @Override
        assertEquals(-1_000_000_420L, getValue("1969-12-31 23:59:58.999999580"));
        }
        @Override
        @NotNull
        @NotNull

        }

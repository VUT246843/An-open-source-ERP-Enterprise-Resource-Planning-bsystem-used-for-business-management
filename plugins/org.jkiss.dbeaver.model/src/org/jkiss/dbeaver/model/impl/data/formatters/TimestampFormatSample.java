 */
package org.jkiss.dbeaver.model.impl.data.formatters;
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;

        ts.setNanos(ts.getNanos() + new Random(System.currentTimeMillis()).nextInt(99999));
 * See the License for the specific language governing permissions and

        return Collections.singletonMap(
        return ts;
    }
 *
    }
 * you may not use this file except in compliance with the License.

        Timestamp ts = new Timestamp(System.currentTimeMillis());
 * Unless required by applicable law or agreed to in writing, software


 * DBeaver - Universal Database Manager
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Collections;
public class TimestampFormatSample implements DBDDataFormatterSample {
 * limitations under the License.
            DateTimeDataFormatter.PROP_PATTERN,
    @Override
import org.jkiss.dbeaver.model.DBConstants;
import java.util.Locale;

    public Object getSampleValue() {
import org.jkiss.dbeaver.model.data.DBDDataFormatterSample;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
    public Map<String, Object> getDefaultProperties(Locale locale) {
 *
            DBConstants.DEFAULT_TIMESTAMP_FORMAT);
import java.util.Random;
 * You may obtain a copy of the License at
import java.sql.Timestamp;

import java.util.Collections;

 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Random;
}
 *
 *
import java.util.Map;
import org.jkiss.dbeaver.model.DBConstants;
 * Unless required by applicable law or agreed to in writing, software
            DBConstants.DEFAULT_TIMESTAMP_TZ_FORMAT);
package org.jkiss.dbeaver.model.impl.data.formatters;
        return ts;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.data.DBDDataFormatterSample;
        return Collections.singletonMap(
import java.util.Locale;
            DateTimeDataFormatter.PROP_PATTERN,

public class TimestampTzFormatSample implements DBDDataFormatterSample {

 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
    public Object getSampleValue() {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.sql.Timestamp;

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * limitations under the License.
    public Map<String, Object> getDefaultProperties(Locale locale) {
    }

        Timestamp ts = new Timestamp(System.currentTimeMillis());
/*
 */
    @Override
 *

        ts.setNanos(ts.getNanos() + new Random(System.currentTimeMillis()).nextInt(99999));

import java.util.Date;
import java.util.Collections;
import org.jkiss.dbeaver.model.data.DBDDataFormatterSample;
 *
 * limitations under the License.

 *
        return Collections.singletonMap(DateTimeDataFormatter.PROP_PATTERN, DEFAULT_TIME_PATTERN);
public class TimeFormatSample implements DBDDataFormatterSample {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.dbeaver.model.DBConstants;
 * See the License for the specific language governing permissions and
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static final String DEFAULT_TIME_PATTERN = DBConstants.DEFAULT_TIME_FORMAT;
/*
    }
 * DBeaver - Universal Database Manager

package org.jkiss.dbeaver.model.impl.data.formatters;
 * Unless required by applicable law or agreed to in writing, software

    public Map<String, Object> getDefaultProperties(Locale locale) {


    }
 * you may not use this file except in compliance with the License.
    @Override


 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Locale;
 * You may obtain a copy of the License at
        return new Date();
    public Object getSampleValue() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
import java.util.Map;

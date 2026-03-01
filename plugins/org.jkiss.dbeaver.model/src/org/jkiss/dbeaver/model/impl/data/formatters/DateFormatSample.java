import java.util.Locale;

public class DateFormatSample implements DBDDataFormatterSample {
 */

import org.jkiss.dbeaver.model.DBConstants;
import java.util.Collections;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public Object getSampleValue() {
 * you may not use this file except in compliance with the License.
import java.util.Map;
    public Map<String, Object> getDefaultProperties(Locale locale) {

 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 *

 * limitations under the License.
 *
package org.jkiss.dbeaver.model.impl.data.formatters;

 * You may obtain a copy of the License at
    public static final String DEFAULT_DATE_PATTERN = DBConstants.DEFAULT_DATE_FORMAT;
        return new Date();
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
        return Collections.singletonMap(
import java.util.Date;
    @Override
 * Unless required by applicable law or agreed to in writing, software
    }
    @Override
            DateTimeDataFormatter.PROP_PATTERN, DEFAULT_DATE_PATTERN);
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.data.DBDDataFormatterSample;

 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 *

        return new Date();
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
import java.util.Locale;
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 *
 *
import org.jkiss.dbeaver.model.DBConstants;
    public Object getSampleValue() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class TimeTzFormatSample implements DBDDataFormatterSample {
    @Override


 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.model.data.DBDDataFormatterSample;
        return Collections.singletonMap(DateTimeDataFormatter.PROP_PATTERN, DBConstants.DEFAULT_TIME_TZ_FORMAT);

    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.impl.data.formatters;
    public Map<String, Object> getDefaultProperties(Locale locale) {
 * limitations under the License.
import java.util.Date;
import java.util.Collections;

import java.util.Map;
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 */
    }
/*
 *
}

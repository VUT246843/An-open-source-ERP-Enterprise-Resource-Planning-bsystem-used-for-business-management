    @Nullable
    public LocalDateTime getTo() {
        );
        return from;

    private final LocalDateTime from;
            from != null ? from.withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime() : null,
    }
import java.time.LocalDateTime;
 * limitations under the License.
 * you may not use this file except in compliance with the License.

        return to;
    }


 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.to = to;
    public QMDateRange(@Nullable LocalDateTime from, @Nullable LocalDateTime to) {
    }
 */
    private final LocalDateTime to;
 *

}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            to != null ? to.withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime() : null
/*
 * Unless required by applicable law or agreed to in writing, software
 *
import java.time.ZonedDateTime;
        this(
 * DBeaver - Universal Database Manager
public class QMDateRange {
package org.jkiss.dbeaver.model.qm.filters;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    public QMDateRange(@Nullable ZonedDateTime from, @Nullable ZonedDateTime to) {
 *

    public LocalDateTime getFrom() {
    @Nullable
        this.from = from;
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;

 * See the License for the specific language governing permissions and
import java.time.ZoneOffset;
 * distributed under the License is distributed on an "AS IS" BASIS,

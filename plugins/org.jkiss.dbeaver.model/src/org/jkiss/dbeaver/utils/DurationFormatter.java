 * <ul>
 * </ul>
        int seconds = duration.toSecondsPart();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            case LONG -> formatLong(duration);
import java.text.MessageFormat;
import java.text.DecimalFormat;
    private DurationFormatter() {

    }
        }
 * limitations under the License.

            return String.format("%dh %dm %ds", hours, minutes, seconds);
    @NotNull
        } else if (seconds >= 10) {
        int minutes = duration.toMinutesPart();

    private static final Format LONG_HOURS_FORMAT = new MessageFormat(ModelMessages.duration_formatter_hours);
/**
 *
            joiner.add(LONG_HOURS_FORMAT.format(new Object[]{hours}));
    private static final Format LONG_MILLISECONDS_FORMAT = new MessageFormat(ModelMessages.duration_formatter_milliseconds);

 *     For example, the format might be '2m 56s', or '1.512s'.</li>
        int seconds = duration.toSecondsPart();
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     <li>{@link DurationFormat#SHORT} - Short duration style.
}
 * The following formats are supported:
 * See the License for the specific language governing permissions and
    private static final Format LONG_MINUTES_FORMAT = new MessageFormat(ModelMessages.duration_formatter_minutes);
import org.jkiss.code.NotNull;
    private static String formatLong(@NotNull Duration duration) {
    private static final Format LONG_SECONDS_FORMAT = new MessageFormat(ModelMessages.duration_formatter_seconds);

/*
        }
        } else {
import org.jkiss.dbeaver.model.messages.ModelMessages;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     For example, the format might be '2m 56s', or '1.5s'/</li>
        }

    }
import java.text.Format;
 */
            var format = medium ? MEDIUM_SECONDS_FORMAT : SHORT_SECONDS_FORMAT;
            return String.format("%dm %ds", minutes, seconds);
 * Formats a duration in a human-readable form.
 * You may obtain a copy of the License at

        long hours = duration.toHours();
        if (joiner.length() == 0) {
 *     <li>{@link DurationFormat#MEDIUM} - Medium duration style, similar to short.
        } else if (minutes > 0) {
            case MEDIUM -> formatShortOrMedium(duration, true);

        };
            joiner.add(LONG_MINUTES_FORMAT.format(new Object[]{minutes}));
            joiner.add(LONG_MILLISECONDS_FORMAT.format(new Object[]{duration.toMillis()}));
 *     <li>{@link DurationFormat#LONG} - Long duration style.
 *     For example, the format might be '1 hour, 30 minutes, 5 seconds, 100 milliseconds'.</li>
 * you may not use this file except in compliance with the License.
        int millis = duration.toMillisPart();
        StringJoiner joiner = new StringJoiner(", ");
        if (hours > 0) {
        if (hours > 0) {

        if (minutes > 0) {
            return String.format("%ds", seconds);
 */
    private static final Format SHORT_SECONDS_FORMAT = new DecimalFormat("#.#s");

 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.utils;
        }
        }
import java.time.Duration;
 * DBeaver - Universal Database Manager
        if (seconds > 0) {
public final class DurationFormatter {
        int minutes = duration.toMinutesPart();
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    private static final Format MEDIUM_SECONDS_FORMAT = new DecimalFormat("#.###s");
            return format.format(seconds + millis * 0.001);
    @NotNull
        return switch (format) {
        long hours = duration.toHours();
import java.util.StringJoiner;

        return joiner.toString();
            joiner.add(LONG_SECONDS_FORMAT.format(new Object[]{seconds}));
    public static String format(@NotNull Duration duration, @NotNull DurationFormat format) {
 * <p>


 * Unless required by applicable law or agreed to in writing, software
    private static String formatShortOrMedium(@NotNull Duration duration, boolean medium) {
            case SHORT -> formatShortOrMedium(duration, false);
    }
    }
 *

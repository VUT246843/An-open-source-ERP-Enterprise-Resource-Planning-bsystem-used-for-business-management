        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();


        return ZoneId.getAvailableZoneIds().stream()
        return "".equals(userDefaultTimezone) ? TimeZone.getDefault().getID() : userDefaultTimezone;
import java.time.ZoneId;
            } else if (!Objects.equals(currentTimeZone.getID(), customTimeZone)) {
    private static String userDefaultTimezone = "";
import org.jkiss.code.Nullable;


                preferenceStore.setValue(ModelPreferences.CLIENT_TIMEZONE, id.getId());
    private static final Log log = Log.getLog(TimezoneRegistry.class);

                if (updatePreferences) {
    public static String getGMTString(@NotNull String id) {
    @NotNull
import org.jkiss.code.NotNull;
}
import org.jkiss.dbeaver.Log;
 * limitations under the License.
 * you may not use this file except in compliance with the License.
import java.util.Objects;
        System.setProperty("user.old.timezone", userDefaultTimezone);
 *
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (customTimeZone != null && !customTimeZone.equals(DBConstants.DEFAULT_TIMEZONE)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ModelPreferences;
                    preferenceStore.setToDefault(ModelPreferences.CLIENT_TIMEZONE);
import org.jkiss.dbeaver.model.DBConstants;
package org.jkiss.dbeaver.registry.timezone;
            TimeZone currentTimeZone = TimeZone.getTimeZone(customTimeZone);
import java.util.TimeZone;

 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (updatePreferences) {
import java.util.Collection;
 * Unless required by applicable law or agreed to in writing, software
                log.debug("Time zone '" + customTimeZone + "' no recognized, falling back to GMT");
    }
    @NotNull
 * DBeaver - Universal Database Manager

                log.debug("Time zone '" + customTimeZone + "' differs from current '" + currentTimeZone.getID() + "'");
 * You may obtain a copy of the License at
        final String customTimeZone = preferenceStore.getString(ModelPreferences.CLIENT_TIMEZONE);
            .map(TimezoneRegistry::getGMTString).sorted(String::compareTo).collect(Collectors.toList());
            if (!GMT_TIMEZONE.equals(customTimeZone) && GMT_TIMEZONE.equals(currentTimeZone.getID())) {
    public static final String PROP_USER_TIMEZONE = "user.timezone";
    @NotNull

            log.debug("Overriding system time zone to '" + customTimeZone + "'");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
            }
    }
        DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static Collection<String> getTimezoneNames() {

        }
    public static String getUserDefaultTimezone() {
        Instant instant = Instant.now();
    public static String extractTimezoneId(@NotNull String timezone) {
import java.time.Instant;
        return  String.format("%s (UTC%s)", id, zonedDateTime.getOffset());
    }
    public static final String GMT_TIMEZONE = "GMT";
                TimeZone.setDefault(TimeZone.getTimeZone(userDefaultTimezone));
            System.setProperty(PROP_USER_TIMEZONE, id.getId());
        } else {
    public static void setDefaultZone(@Nullable ZoneId id, boolean updatePreferences) {

/*
            if (!TimeZone.getDefault().getID().equals(userDefaultTimezone)) {
 *

 * See the License for the specific language governing permissions and
    private TimezoneRegistry() {
public class TimezoneRegistry {
    }
import java.util.stream.Collectors;
    public static void overrideTimezone() {
            }
            System.setProperty(PROP_USER_TIMEZONE, customTimeZone);
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        userDefaultTimezone = System.getProperty(PROP_USER_TIMEZONE);
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull

import java.time.ZonedDateTime;
                System.setProperty(PROP_USER_TIMEZONE, userDefaultTimezone);
    }
 *
                }
            TimeZone.setDefault(currentTimeZone);
            TimeZone.setDefault(timeZone);
    }
        if (id != null) {
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of(id));

        return timezone.split(" ")[0];
            TimeZone timeZone = TimeZone.getTimeZone(id);
            }
    }

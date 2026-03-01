import org.jkiss.code.NotNull;


/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        return name;
    private static final Log log = Log.getLog(WorksheetUtils.class);
        if (originSheetName == null) {
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private static final Set<String> RESERVED_WORDS = Set.of("History");
/**
                result = name.substring(0, Math.min(name.length(), MAX_NAME_LENGTH - suffix.length())) + suffix;
 */
        if (RESERVED_WORDS.contains(result) || result.isBlank()) {
        return result;
    private static String toValidExcelSheetName(@Nullable String originSheetName) {
import org.apache.poi.ss.usermodel.Workbook;
        log.error("Unable to generate unique sheet name; using the original name instead");
        String name = toValidExcelSheetName(sheetName);
 * you may not use this file except in compliance with the License.
 * Xlsx sheet name validator.
                String suffix = String.valueOf(i);
 * Unless required by applicable law or agreed to in writing, software
    }
            return DEFAULT_SHEET_NAME;
            String result;
    public static String makeUniqueSheetName(@NotNull Workbook workbook, @Nullable String sheetName) {
            } else {

 *
 * You may obtain a copy of the License at
    private static final int MAX_NAME_GENERATION_ATTEMPTS = 1000;
import java.util.Set;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            if (i == 0) {
        result = result.substring(0, Math.min(result.length(), MAX_NAME_LENGTH)); // trim to max length
 * Follow the rules https://support.microsoft.com/en-us/office/rename-a-worksheet-3f1f7148-ee83-404d-8ef0-9ff99fbad1f9
 * DBeaver - Universal Database Manager

            if (workbook.getSheet(result) == null) {
                return result;
            }
            result = DEFAULT_SHEET_NAME;
 */
}

    private WorksheetUtils() {
        result = result.replaceAll("^'+|'+$", ""); // remove enclosing single quotes
        for (int i = 0; i < MAX_NAME_GENERATION_ATTEMPTS; i++) {

        String result = originSheetName;

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * limitations under the License.
        result = result.replaceAll("[\\\\/*\\[\\]:?]", "_"); // remove special characters
    @NotNull

package org.jkiss.dbeaver.data.office.export;
public class WorksheetUtils {
    private static final int MAX_NAME_LENGTH = 31;
    }

import org.jkiss.dbeaver.Log;
    @NotNull
                result = name;
    public static final String DEFAULT_SHEET_NAME = "CustomQuery";
import org.jkiss.code.Nullable;
        result = result.strip(); // remove redundant spaces
        }
            }

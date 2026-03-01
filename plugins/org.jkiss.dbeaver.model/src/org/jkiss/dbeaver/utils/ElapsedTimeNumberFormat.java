 *
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Formats a number into the specified string buffer.
    private static final long serialVersionUID = 1;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import java.text.NumberFormat;
     * This method returns <code>null</code> for all inputs.  This class cannot
                               FieldPosition pos) {
     *
/*
package org.jkiss.dbeaver.utils;
    /**
        super();
    public Number parse(String source, ParsePosition parsePosition) {
 * Elapsed time formatter
 */
     *
    }
        return null;

    public StringBuffer format(long number, StringBuffer toAppendTo,

     *
 * limitations under the License.
 * You may obtain a copy of the License at
    }
     * be used for parsing.
     * @param number  the number to format.
public class ElapsedTimeNumberFormat extends NumberFormat {
     */

import java.text.ParsePosition;
     * @param number  the number to format.
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
                               FieldPosition pos) {
     * @return The string buffer.
    public StringBuffer format(double number, StringBuffer toAppendTo,
 * Copyright (C) 2010-2024 DBeaver Corp and others
     */

    /**
    /**
     * @param parsePosition  the parse position.
 * Licensed under the Apache License, Version 2.0 (the "License");
        return toAppendTo.append(RuntimeUtils.formatExecutionTime(number));


     * @param pos  the field position (ignored here).
        return toAppendTo.append(RuntimeUtils.formatExecutionTime((long) number));
    @Override
     * @return <code>null</code>.
     * @param toAppendTo  the string buffer.
 * See the License for the specific language governing permissions and
    @Override
     * @return The string buffer.
 * Unless required by applicable law or agreed to in writing, software
import java.text.FieldPosition;
     * Formats a number into the specified string buffer.

     *
    public ElapsedTimeNumberFormat() {
     *
 *
     * @param pos  the field position (ignored here).
 * DBeaver - Universal Database Manager
    }
 */
}     * @param toAppendTo  the string buffer.
     * @param source  the source string.
 * you may not use this file except in compliance with the License.
/**
     */
     *
 *

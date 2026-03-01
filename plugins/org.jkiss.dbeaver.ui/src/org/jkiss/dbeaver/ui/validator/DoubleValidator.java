            return;
 * <p>
/**
    }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 * This will allow numbers from 0.0 up to 100.0 (inclusive),
        if (e.getSource() instanceof Text text) {

    }
    }
 */
 */
            e.doit = false;
 *
    private final boolean allowNegative;

            e.doit = false;
            double value = Double.parseDouble(text);
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.events.VerifyListener;
            if (value < minValue || value > maxValue) {
    private final double minValue;
    public void verifyText(VerifyEvent e) {
            String current = text.getText();
    @Override
        try {
 * }</pre>
        }
 * DBeaver - Universal Database Manager
 * disallowing negative input.

                    + current.substring(e.end);

 * you may not use this file except in compliance with the License.
 * VerifyListener for double (floating-point) values with optional range checks.
 * You may obtain a copy of the License at
        this.maxValue = maxValue;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    + e.text
 * Example:
public class DoubleValidator implements VerifyListener {

 * distributed under the License is distributed on an "AS IS" BASIS,
                e.doit = false;
            return;
        }
            }
        this.allowNegative = allowNegative;
 * <pre>{@code
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
        } catch (NumberFormatException ex) {
            String prospective =
                current.substring(0, e.start)
 * limitations under the License.
import org.eclipse.swt.widgets.Text;
 *
package org.jkiss.dbeaver.ui.validator;
        if (!allowNegative && text.startsWith("-")) {
    private void verifyText(VerifyEvent e, String text) {
 * See the License for the specific language governing permissions and
        this.minValue = minValue;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (text.isEmpty() || ".".equals(text)) {

        } else {

 *
 * text.addVerifyListener(new DoubleValidator(0.0, 100.0, false));
    private final double maxValue;
            verifyText(e, prospective);
            verifyText(e, e.text);
import org.eclipse.swt.events.VerifyEvent;
    public DoubleValidator(double minValue, double maxValue, boolean allowNegative) {
/*

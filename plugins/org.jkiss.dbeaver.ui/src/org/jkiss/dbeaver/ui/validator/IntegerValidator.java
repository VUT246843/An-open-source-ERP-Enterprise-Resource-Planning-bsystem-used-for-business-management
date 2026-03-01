
package org.jkiss.dbeaver.ui.validator;
import org.eclipse.swt.events.VerifyEvent;
    private final int minValue;
public class IntegerValidator implements VerifyListener {


 * Copyright (C) 2010-2025 DBeaver Corp and others

        }
import org.eclipse.swt.widgets.Text;
    @Override
        this.maxValue = maxValue;
 *
    private final int maxValue;
 * distributed under the License is distributed on an "AS IS" BASIS,
                current.substring(0, e.start)
import org.eclipse.swt.events.VerifyListener;

        } catch (NumberFormatException ex) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            String current = text.getText();
        }
 * limitations under the License.
    private void verifyText(VerifyEvent e, String text) {
 * DBeaver - Universal Database Manager
            return; // Allow empty input
 * Unless required by applicable law or agreed to in writing, software
 */
        if (e.getSource() instanceof Text text) {
            verifyText(e, e.text);
            String prospective =
    public void verifyText(VerifyEvent e) {

            }
                    + e.text
            verifyText(e, prospective);
                e.doit = false; // Reject input outside of range
    }
        } else {
                    + current.substring(e.end);
 * See the License for the specific language governing permissions and
 *
        try {
            if (value < minValue || value > maxValue) {
    public IntegerValidator(int minValue, int maxValue) {
 * you may not use this file except in compliance with the License.
        }
            int value = Integer.parseInt(text);
        if (text.isEmpty()) {
    }
 *
        this.minValue = minValue;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 * You may obtain a copy of the License at

            e.doit = false; // Reject non-integer input

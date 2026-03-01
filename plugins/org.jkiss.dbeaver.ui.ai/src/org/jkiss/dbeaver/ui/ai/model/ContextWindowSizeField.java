 * limitations under the License.
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                "",
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
    }
    public static Builder builder() {
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.ui.UIUtils;
    }
    private final Text text;
            text.setLayoutData(gridData);
}


import org.jkiss.utils.CommonUtils;

    public static class Builder {
import org.eclipse.swt.widgets.Text;

                SWT.BORDER
    }
 * DBeaver - Universal Database Manager
        }
        public Builder withParent(@NotNull Composite parent) {
    public boolean isComplete() {

 * Unless required by applicable law or agreed to in writing, software
    }
    public void setValue(@Nullable Integer value) {

        public ContextWindowSizeField build() {
    }
        public Builder withGridData(@NotNull GridData gridData) {
import org.jkiss.dbeaver.ui.validator.IntegerValidator;
                "Context window size",
        private Composite parent;
            this.gridData = gridData;
import org.eclipse.swt.SWT;
    private Integer value;
 *
    private ContextWindowSizeField(@NotNull Text text) {
            return this;
 * See the License for the specific language governing permissions and
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
                parent,
 * Licensed under the Apache License, Version 2.0 (the "License");
    public Integer getValue() {

import org.jkiss.code.NotNull;

            );
import org.eclipse.swt.widgets.Composite;
public class ContextWindowSizeField {
        }
import org.eclipse.swt.layout.GridData;
            text.addVerifyListener(new IntegerValidator(1, Integer.MAX_VALUE));
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
            this.parent = parent;
        this.value = value;
/*
        @NotNull
 *
        return new Builder();

            return this;
        this.text = text;
package org.jkiss.dbeaver.ui.ai.model;
 * You may obtain a copy of the License at
 */
            return new ContextWindowSizeField(text);
        this.text.addModifyListener(e -> value = CommonUtils.toInteger(text.getText(), null));
        private GridData gridData;



        return CommonUtils.toInt(text.getText(), 0) > 0;
    @Nullable
        @NotNull
            Text text = UIUtils.createLabelText(
        this.text.setText(value == null ? "" : value.toString());
        return value;

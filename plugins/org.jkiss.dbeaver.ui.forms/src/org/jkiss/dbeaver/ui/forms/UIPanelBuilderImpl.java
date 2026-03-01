    static UIPanelBuilderImpl group(@NotNull String text) {
            }
        Composite host;
            } else {
    private void buildRow(
        @NotNull Composite parent,
    @NotNull
                }
 * you may not use this file except in compliance with the License.
final class UIPanelBuilderImpl extends UIControlBuilderImpl<UIPanelBuilder, Control> implements UIPanelBuilder {
        handler.accept(this);
import java.util.ArrayList;
 * You may obtain a copy of the License at
        int columns
        int columns = rows.stream()
        indent++;
 * DBeaver - Universal Database Manager
            throw new IllegalStateException("Row cannot be empty");
import org.eclipse.swt.SWT;
    @Override
    public UIPanelBuilder margins(int horizontal, int vertical) {
        } else {
            .mapToInt(row -> row.controls.size())
    @NotNull
 *

    public UIPanelBuilder margins(int left, int top, int right, int bottom) {
    @Override

    protected Control create(@NotNull DataBindingContext context, @NotNull Composite parent) {
        }
    private int marginLeft = 5;
        this.expandable = expandable;
        return client;
    }
                if (size != null) {
import org.eclipse.ui.forms.widgets.ExpandableComposite;
    private int marginRight = 5;
 */
            if (i == row.controls.size() - 1) {
    static UIPanelBuilderImpl panel() {
        this.text = text;




        if (text != null && !expandable) {
        var builder = new UIRowBuilderImpl(indent);

            composite.setText(text);
 * See the License for the specific language governing permissions and
    @Override

        @NotNull DataBindingContext context,

            .max().orElseThrow();
            data.horizontalAlignment = builder.alignX;
    }
    private final String text;

        return new UIPanelBuilderImpl(text, true, expanded);
        @NotNull UIRowBuilderImpl row,
    private UIPanelBuilderImpl(@Nullable String text, boolean expandable, boolean expanded) {
    private int marginBottom = 5;
    @NotNull
    @Override
        if (expandable) {
            buildRow(context, row, client, columns);

            return composite;
            }
        return new UIPanelBuilderImpl(text, false, false);
            var data = new GridData();
            // Stretch the last control to span the remaining columns
            data.grabExcessHorizontalSpace = builder.grow;
    }
}
import java.util.function.Consumer;
import org.jkiss.code.Nullable;
        }

            data.verticalAlignment = builder.alignY;


        }
    private int marginTop = 5;
            control.setLayoutData(data);
            .applyTo(client);
    ) {
        }
import org.eclipse.jface.layout.GridLayoutFactory;
            client = UIControlFactory.createTitledComposite(host, text);
                    data.heightHint = size.y;
                    data.widthHint = size.x;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }
        marginLeft = left;

    private final boolean expanded;
            }
    }
import org.eclipse.core.databinding.DataBindingContext;
    @NotNull
    @NotNull
        return new UIPanelBuilderImpl(null, false, false);
            throw new IllegalStateException("Panel cannot be empty");
        for (UIRowBuilderImpl row : rows) {
 * limitations under the License.
            .extendedMargins(marginLeft, marginRight, marginTop, marginBottom)
import org.eclipse.swt.widgets.Composite;
            host = UIControlFactory.createExpandableComposite(parent);
                data.heightHint = builder.heightHint;
import org.eclipse.swt.widgets.Control;
    @NotNull
            var builder = (UIControlBuilderImpl<?, Control>) row.controls.get(i);
            var control = builder.build(context, parent, row);

            client = UIControlFactory.createComposite(host);
        marginTop = marginBottom = vertical;
    }
        marginLeft = marginRight = horizontal;
        }

    }
            data.grabExcessVerticalSpace = builder.grow;
        return this;
            composite.setClient(client);
                data.horizontalIndent = LayoutConstants.getIndent() * row.indent;
        marginTop = top;
        if (builder.controls.isEmpty()) {
    public UIPanelBuilder row(@NotNull Consumer<? super UIRowBuilder> handler) {
    @NotNull

    }
            host = parent;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
    @Override
            @SuppressWarnings("unchecked")
import org.jkiss.code.NotNull;

                data.widthHint = builder.widthHint;

    private final List<UIRowBuilderImpl> rows = new ArrayList<>();
        if (rows.isEmpty()) {
    private final boolean expandable;
import org.eclipse.swt.layout.GridData;
    public UIPanelBuilder indent(@NotNull Consumer<? super UIPanelBuilder> handler) {

            var composite = (ExpandableComposite) host;
        return this;
            .numColumns(columns)
                var size = builder.preferredSize(control);
import java.util.List;
            if (i == 0 && row.indent > 0) {
        }
        return this;
/*
        handler.accept(builder);
        this.expanded = expanded;
    }



        marginRight = right;
 *
        }
            // Indent the first control if needed
    @NotNull
        for (int i = 0; i < row.controls.size(); i++) {
        rows.add(builder);
 * Licensed under the Apache License, Version 2.0 (the "License");

        indent--;
 *     http://www.apache.org/licenses/LICENSE-2.0
            composite.setExpanded(expanded, true);
    private int indent = 0;
            if (builder.widthHint != SWT.DEFAULT && builder.heightHint != SWT.DEFAULT) {
package org.jkiss.dbeaver.ui.forms;
                data.horizontalSpan = columns - row.controls.size() + 1;
        return this;
        } else {
        if (expandable) {
        // Compute max number of columns based on rows' controls
        GridLayoutFactory.fillDefaults()
    static UIPanelBuilderImpl expandableGroup(@NotNull String text, boolean expanded) {
        Composite client;
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.layout.LayoutConstants;
        marginBottom = bottom;
    }

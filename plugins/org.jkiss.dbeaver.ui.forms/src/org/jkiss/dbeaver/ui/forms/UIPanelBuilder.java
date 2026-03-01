
import java.util.function.Consumer;
    }
 * The builder for a panel.
import org.eclipse.swt.widgets.Control;
 */


        return builder.build(new DataBindingContext(), parent, null);
 * See the License for the specific language governing permissions and
    @NotNull

    UIPanelBuilder row(@NotNull Consumer<? super UIRowBuilder> handler);
/*
package org.jkiss.dbeaver.ui.forms;
    @NotNull
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull

 * Copyright (C) 2010-2026 DBeaver Corp and others
/**
    static Control build(@NotNull Composite parent, @NotNull Consumer<? super UIPanelBuilder> handler) {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.databinding.DataBindingContext;
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
    UIPanelBuilder indent(@NotNull Consumer<? super UIPanelBuilder> handler);
    }
 * DBeaver - Universal Database Manager
    @NotNull
    default UIPanelBuilder row(@NotNull String label, @NotNull Consumer<? super UIRowBuilder> handler) {
 */
    UIPanelBuilder margins(int horizontal, int vertical);

        handler.accept(builder);
    @NotNull
 *
 * Unless required by applicable law or agreed to in writing, software

        return row(rb -> handler.accept(rb.label(label + ":")));
    UIPanelBuilder margins(int left, int top, int right, int bottom);
        var builder = UIPanelBuilderImpl.panel();
public sealed interface UIPanelBuilder extends UIControlBuilder<UIPanelBuilder> permits UIPanelBuilderImpl {

 * limitations under the License.
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
}

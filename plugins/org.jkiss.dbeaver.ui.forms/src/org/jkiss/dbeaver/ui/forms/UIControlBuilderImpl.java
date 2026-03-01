    }
                var value = (boolean) binding.get();

        public TextBuilder<T> toModel(
    @NotNull

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.binding = binding;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");

        if (tooltip != null) {
            super.bind(context, control, row);
            return UIControlFactory.createText(parent, style);
    public B align(@NotNull UIAlignX x, @NotNull UIAlignY y) {
    }

        @NotNull
    }
    int alignY = SWT.CENTER;
    public B tooltip(@NotNull String value) {
            Button button = UIControlFactory.createButton(parent, style, text);
        heightHint = height;
            @NotNull Function<? super String, ? extends T> targetToModelConverter
 * DBeaver - Universal Database Manager
    int heightHint = SWT.DEFAULT;
import org.eclipse.swt.events.SelectionEvent;
            return new Point(UIUtils.getDialogButtonWidth(control), SWT.DEFAULT);
        enabled = binding;
import org.eclipse.core.databinding.conversion.IConverter;

    private static <T> IObservableValue<T> delegate(@NotNull UIObservable<T> observable) {
        private Function<? super String, ? extends T> toModelConverter;
        return builder();
 * Unless required by applicable law or agreed to in writing, software
            }


        @Override
        @Override
        return (B) this;
            @NotNull Function<? super String, IStatus> afterGetValidator,
        TextBuilderImpl(int style, @NotNull UIObservable<T> text) {
        }
    }

    }
        return builder();
        }
        alignY = y.toSWT();

    int alignX = SWT.BEGINNING;
        return builder();
        protected void bind(@NotNull DataBindingContext context, @NotNull Button control, @Nullable UIRowBuilderImpl row) {
    private String tooltip;

import org.jkiss.code.NotNull;
        return null;
            @NotNull List<? extends T> items,
    protected abstract C create(@NotNull DataBindingContext context, @NotNull Composite parent);
            this.style = style;
            this.onSelect = onSelect;

        }
import org.eclipse.swt.graphics.Point;
        protected void bind(@NotNull DataBindingContext context, @NotNull Combo control, @Nullable UIRowBuilderImpl row) {
            control.setToolTipText(tooltip);

 *

    private B builder() {

    @Override
import org.eclipse.swt.widgets.*;
    @SuppressWarnings("unchecked")
    @Override
            }
            @NotNull Function<? super T, String> converter,
            return this;
                UpdateValueStrategy.create(IConverter.create(items::get)),
    }
            }
                    = (UpdateValueStrategy<String, ? extends T>) UpdateValueStrategy.create(IConverter.create(toModelConverter));
    }
            var binding = UIObservables.and(row != null ? row.enabled : null, enabled);
            context.bindValue(WidgetProperties.visible().observe(control), delegate);
        }

    }

        if (row != null && row.enabled != null || enabled != null) {
/*
            var delegate = delegate(binding);
        alignX = x.toSWT();
        public ButtonBuilder selected(@NotNull UIObservable<Boolean> binding) {
        }
                UpdateValueStrategy.create(IConverter.create(items::indexOf))
        }
    UIControlBuilderImpl.TextBuilderImpl, UIPanelBuilderImpl {
            this.text = text;
        private final int style;
        bind(context, control, row);

                button.addSelectionListener(SelectionListener.widgetSelectedAdapter(onSelect));

            return this;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
        @Override
            this.items = List.copyOf(items);

        @NotNull
 * you may not use this file except in compliance with the License.
            this.fromModelConverter = modelToTargetConverter;

            UpdateValueStrategy<String, ? extends T> toModelStrategy = null;
    @Override
    }
                toModelStrategy.setAfterGetValidator(toModelValidator::apply);
        private final Consumer<SelectionEvent> onSelect;
    public B accept(@NotNull Consumer<? super B> consumer) {
    @Nullable
        private final UIObservable<T> binding;
        ) {
 */
            // FIXME: Initially non-visible controls occupy space
        private final UIObservable<T> text;
                if (data.exclude == value) {

            }
    @NotNull
        return builder();
                toModelStrategy
    }
import org.jkiss.dbeaver.ui.UIUtils;
            this.style = style;
    }
import java.util.function.Function;
        }
    @NotNull
        private final String text;

            selected = binding;
        alignY = y.toSWT();
        @Override

import org.eclipse.core.databinding.DataBindingContext;
import org.jkiss.code.Nullable;
        widthHint = width;
            if (onSelect != null) {
    private UIObservable<Boolean> visible;
 * distributed under the License is distributed on an "AS IS" BASIS,
            );
            });
    }
            if (selected != null) {
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
package org.jkiss.dbeaver.ui.forms;
        }
        }
        C control = create(context, parent);
import org.eclipse.swt.events.SelectionListener;
        return ((UIObservableImpl<T>) observable).delegate();
            this.toModelConverter = targetToModelConverter;
        protected Button create(@NotNull DataBindingContext context, @NotNull Composite parent) {
        return builder();
import org.eclipse.core.databinding.UpdateValueStrategy;
        @NotNull
    @NotNull
        private final int style;
    @NotNull
        @Override

        }
        tooltip = value;
        @Override
            return UIControlFactory.createLabel(parent, style, text);

    public B align(@NotNull UIAlignX x) {

        @NotNull
    C build(@NotNull DataBindingContext context, @NotNull Composite parent, @Nullable UIRowBuilderImpl row) {
    }
        protected void bind(@NotNull DataBindingContext context, @NotNull Text control, @Nullable UIRowBuilderImpl row) {
        }
 *

            Combo combo = UIControlFactory.createCombo(parent, style);
    public B align(@NotNull UIAlignY y) {
        private final int style;
import org.eclipse.swt.layout.GridData;
        grow = true;
    static final class ComboBuilderImpl<T> extends UIControlBuilderImpl<ComboBuilder<T>, Combo> implements ComboBuilder<T> {
        @Override
import java.util.List;
    @NotNull

            if (fromModelConverter != null) {
        @Override
                    control.requestLayout();
    public B grow() {
        @NotNull

        protected Point preferredSize(@NotNull Button control) {
    @Override
            var target = WidgetProperties.text(SWT.Modify).observe(control);
        @Override
            return combo;
        if (row != null && row.visible != null || visible != null) {
        }
        }
        private Function<? super String, IStatus> toModelValidator;
        }
        consumer.accept(builder);
    @NotNull
    public B visible(@NotNull UIObservable<Boolean> binding) {
            this.text = text;
        ButtonBuilderImpl(@NotNull String text, @Nullable Consumer<SelectionEvent> onSelect, int style) {
        return builder();
        public TextBuilder<T> fromModel(@NotNull Function<? super T, String> modelToTargetConverter) {
    @NotNull
import org.eclipse.core.runtime.IStatus;
            return button;
        @NotNull
    @NotNull
            this.converter = converter;
                delegate(binding),
        private final String text;
                    data.exclude = !value;
        @NotNull
    static final class TextBuilderImpl<T> extends UIControlBuilderImpl<TextBuilder<T>, Text> implements TextBuilder<T> {
    @Override
        visible = binding;
 *
            return new Point(UIUtils.getFontHeight(control) * 15, SWT.DEFAULT);

        private Function<? super T, String> fromModelConverter;
    boolean grow = false;
        private final Function<? super T, String> converter;
    protected void bind(@NotNull DataBindingContext context, @NotNull C control, @Nullable UIRowBuilderImpl row) {
            this.style = style;

    static final class LabelBuilderImpl extends UIControlBuilderImpl<LabelBuilder, Label> implements LabelBuilder {


        @SuppressWarnings("unchecked")
                }
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.style = style;
        protected Combo create(@NotNull DataBindingContext context, @NotNull Composite parent) {
        private UIObservable<Boolean> selected;

    public B enabled(@NotNull UIObservable<Boolean> binding) {
        protected Label create(@NotNull DataBindingContext context, @NotNull Composite parent) {
    @Override
            var binding = UIObservables.and(row != null ? row.visible : null, visible);
        public ComboBuilderImpl(
            int style
        private final List<? extends T> items;
                context.bindValue(WidgetProperties.buttonSelection().observe(control), delegate(selected));
        protected Text create(@NotNull DataBindingContext context, @NotNull Composite parent) {

                var data = (GridData) control.getLayoutData();
        @Override
    @Override
                combo.add(converter.apply(item));
            UpdateValueStrategy<? super T, String> fromModelStrategy = null;

 * You may obtain a copy of the License at
            this.text = text;
            if (toModelConverter != null) {
        }
    }
 * limitations under the License.
        ) {
        }
    permits UIControlBuilderImpl.ButtonBuilderImpl, UIControlBuilderImpl.ComboBuilderImpl, UIControlBuilderImpl.LabelBuilderImpl,


    @Override
            delegate.addValueChangeListener(event -> {

            @NotNull UIObservable<T> binding,
        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        B builder = builder();
    @NotNull
}
        alignX = x.toSWT();
            super.bind(context, control, row);
    static final class ButtonBuilderImpl extends UIControlBuilderImpl<ButtonBuilder, Button> implements ButtonBuilder {
        return builder();
            context.bindValue(WidgetProperties.enabled().observe(control), delegate(binding));
        return builder;
    @NotNull
            return this;

        protected Point preferredSize(@NotNull Text control) {
    @Override
import java.util.function.Consumer;

            super.bind(context, control, row);

    int widthHint = SWT.DEFAULT;

    protected Point preferredSize(@NotNull C control) {
        }
        return builder();
    @NotNull
                WidgetProperties.singleSelectionIndex().observe(control),
        @Override
    }
            for (T item : items) {

        @NotNull
abstract sealed class UIControlBuilderImpl<B extends UIControlBuilder<B>, C extends Control> implements UIControlBuilder<B>
    @NotNull
import org.eclipse.core.databinding.observable.value.IObservableValue;
    private UIObservable<Boolean> enabled;
        @Override
            }
            var binding = context.bindValue(target, delegate(text), toModelStrategy, fromModelStrategy);

    }
            this.toModelValidator = afterGetValidator;
            context.bindValue(
        LabelBuilderImpl(@NotNull String text, int style) {
        @NotNull
                fromModelStrategy = UpdateValueStrategy.create(IConverter.create(fromModelConverter));
            ControlDecorationSupport.create(binding, SWT.TOP | SWT.LEFT);

        return control;
import org.eclipse.swt.SWT;
    public B hint(int width, int height) {
    }
        private final int style;

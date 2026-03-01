     * <i>horizontal</i> space. For multiple resizable controls, the

     * The builder for a label control.
}
     * The builder for a combo control.
            @NotNull Function<? super String, IStatus> afterGetValidator,
    B align(@NotNull UIAlignX x);
     * @return this builder
    sealed interface LabelBuilder extends UIControlBuilder<LabelBuilder> permits UIControlBuilderImpl.LabelBuilderImpl {


package org.jkiss.dbeaver.ui.forms;
     * The builder for a text control.
    @NotNull
import java.util.function.Consumer;
import org.jkiss.code.NotNull;
public sealed interface UIControlBuilder<B extends UIControlBuilder<B>>
    @NotNull
    B tooltip(@NotNull String value);
        );
     * The control becomes resizable and occupies all available

            @NotNull Function<? super String, ? extends T> targetToModelConverter
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
    B align(@NotNull UIAlignY y);

 * You may obtain a copy of the License at
/*
    /**
     *
    @NotNull

    @NotNull
    B accept(@NotNull Consumer<? super B> consumer);
     * extra space is equally divided between them.
    }
        @NotNull
    }
 * Unless required by applicable law or agreed to in writing, software
    sealed interface ButtonBuilder extends UIControlBuilder<ButtonBuilder> permits UIControlBuilderImpl.ButtonBuilderImpl {
    /**
import org.eclipse.core.runtime.IStatus;
     */
        TextBuilder<T> toModel(

 * you may not use this file except in compliance with the License.
    B enabled(@NotNull UIObservable<Boolean> binding);

 * DBeaver - Universal Database Manager
     */
        TextBuilder<T> fromModel(
 * The builder for a control.
    /**
 */
     */
    @NotNull

    sealed interface ComboBuilder<T> extends UIControlBuilder<ComboBuilder<T>> permits UIControlBuilderImpl.ComboBuilderImpl {
            @NotNull Function<? super T, String> modelToTargetConverter
        @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    @NotNull
    @NotNull
    B hint(int width, int height);
    permits UIControlBuilder.ButtonBuilder,UIControlBuilder.ComboBuilder, UIControlBuilder.LabelBuilder, UIControlBuilder.TextBuilder,

 * limitations under the License.

     */
 */
    B grow();
        @NotNull

    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 *
     */
        ButtonBuilder selected(@NotNull UIObservable<Boolean> binding);
    @NotNull
/**
    @NotNull
    UIControlBuilderImpl, UIPanelBuilder {
 *
    sealed interface TextBuilder<T> extends UIControlBuilder<TextBuilder<T>> permits UIControlBuilderImpl.TextBuilderImpl {
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
 *



     * The builder for a button control.
    B visible(@NotNull UIObservable<Boolean> binding);
    }
    B align(@NotNull UIAlignX x, @NotNull UIAlignY y);
import java.util.function.Function;
        );

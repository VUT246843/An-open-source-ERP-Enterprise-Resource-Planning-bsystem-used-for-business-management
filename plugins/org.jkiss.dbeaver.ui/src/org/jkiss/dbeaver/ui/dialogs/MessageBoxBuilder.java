

    /**

    }
    public MessageBoxBuilder setDefaultFocus(int index) {
    @NotNull
import org.eclipse.jface.dialogs.IDialogConstants;
        }
        return this;
    }
}
     */
     * @return builder
    @Nullable
    }
 */
                case IDialogConstants.CANCEL_ID -> Reply.CANCEL;
 *
            List<String> labels = new ArrayList<>(replies.size());
     * @param replies to set
    private MessageBoxBuilder(@Nullable Shell shell) {
                }
        if (replies != null) {
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return this;
        return this;
                Reply reply = replies.get(i);
        return new MessageBoxBuilder(null);
        int defaultIdx = 0;
    }
    /**
        if (replies != null) {
        return this;
        dialog.setCustomButton(customButton);
            }

     * Sets replies for the dialog. Replaces previously set replies.
        // create labels from replies, find default reply

        return this;
        this.replies = new ArrayList<>(Arrays.asList(replies));
     * Set custom labels
     */
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public MessageBoxBuilder setPrimaryImage(@NotNull DBPImage image) {
                case IDialogConstants.NO_ID -> Reply.NO;
        // Open dialog, detect reply
    private List<Reply> replies;
public final class MessageBoxBuilder {
    }
import java.util.Arrays;
    @Nullable
    }
import java.util.function.Consumer;
    public MessageBoxBuilder setCustomButton(@NotNull Consumer<? super Composite> customButton) {
                default -> null;
    @NotNull
    public static MessageBoxBuilder builder(@Nullable Shell shell) {
                case IDialogConstants.OK_ID -> Reply.OK;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        return replies.get(answerIdx);
            for (int i = 0; i < replies.size(); i++) {
            dialog.setLabels(labels);
                if (reply == defaultReply) {
    @NotNull
        dialog.setPrimaryImage(image);
    public MessageBoxBuilder setMessage(@NotNull String message) {

    @NotNull
    public MessageBoxBuilder setTitle(@NotNull String title) {
    public Reply showMessageBox() {
        this.defaultReply = defaultReply;
     * Set default focus value

        dialog.setTitle(title);

    public MessageBoxBuilder setDefaultReply(@NotNull Reply defaultReply) {
    private final MessageBoxModern dialog;
        this.replies = new ArrayList<>(replies);
    @NotNull
    @NotNull
    @NotNull
        return new MessageBoxBuilder(shell);
    }
/*


 * limitations under the License.

        int answerIdx = dialog.open();
    /**
 * Unless required by applicable law or agreed to in writing, software
        return this;
    // -----
    public MessageBoxBuilder setLabels(@NotNull String[] buttons) {
    
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Shell;

 * DBeaver - Universal Database Manager
        dialog.setCustomArea(customArea);
    public MessageBoxBuilder setReplies(@NotNull Reply... replies) {
    @NotNull
                labels.add(reply != null ? reply.getDisplayString() : "[null]");
        return this;
import java.util.ArrayList;
 * See the License for the specific language governing permissions and
    // ----- Builder methods
        return this;
 *
            dialog.setDefaultAnswerIdx(defaultIdx);
    @Nullable
    }
        dialog.setMessage(message);
        dialog.setDefaultAnswerIdx(index);
            return switch (dialog.getReturnCode()) {
    private Reply defaultReply;
    }
    @NotNull
    @NotNull
    }
        return this;
    public MessageBoxBuilder setReplies(@NotNull List<Reply> replies) {
package org.jkiss.dbeaver.ui.dialogs;
                    defaultIdx = i;

import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.model.DBPImage;
 * You may obtain a copy of the License at
     *
        dialog.setLabels(Arrays.asList(buttons));

 * you may not use this file except in compliance with the License.
import java.util.List;
        }
    public MessageBoxBuilder setCustomArea(@NotNull Consumer<? super Composite> customArea) {
    }


        }

            };
        if (replies == null || !CommonUtils.isValidIndex(answerIdx, replies.size())) {
    public static MessageBoxBuilder builder() {
    }

        dialog = new MessageBoxModern(shell);

     */
import org.jkiss.code.Nullable;
        return this;

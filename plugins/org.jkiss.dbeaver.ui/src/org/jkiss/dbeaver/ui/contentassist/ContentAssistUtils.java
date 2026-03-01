    ) {
 *     http://www.apache.org/licenses/LICENSE-2.0

        @NotNull IContentProposalProvider provider
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
            replace,
        return installContentProposal(control, contentAdapter, provider, labelProvider, null, autoActivation);
        @Nullable Boolean replace,
 *
        @NotNull IContentProposalProvider provider,
import org.jkiss.dbeaver.ui.UIUtils;
            control,
 * you may not use this file except in compliance with the License.
        IKeyLookup keyLookup = KeyLookupFactory.getDefault();
   
 * limitations under the License.
        @NotNull Control control,
        boolean autoActivation
 * See the License for the specific language governing permissions and
    private static final Log log = Log.getLog(UIUtils.class);

import org.eclipse.jface.fieldassist.ContentProposalAdapter;
        @Nullable ILabelProvider labelProvider,
        //proposalAdapter.setFilterStyle(ContentProposalAdapter.FILTER_CHARACTER);
        return proposalAdapter;
        boolean isSingleValueAdapter;
public class ContentAssistUtils {
 *
    }
    public static ContentProposalAdapter installContentProposal(
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.fieldassist.IControlContentAdapter;
        @NotNull Control control,

import org.eclipse.swt.graphics.Point;
        @NotNull IControlContentAdapter contentAdapter,
        boolean autoActivation

package org.jkiss.dbeaver.ui.contentassist;

    ) {
 *
import org.jkiss.dbeaver.ui.controls.CComboContentAdapter;
    
    ) {
            keyStroke,
    }
/*
    ) {
        proposalAdapter.setLabelProvider(labelProvider);
import org.eclipse.jface.bindings.keys.IKeyLookup;
        if (labelProvider == null) {
        boolean autoActivation
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull IControlContentAdapter contentAdapter,
import org.jkiss.code.Nullable;
    }

        @NotNull Control control,
            provider,

        final ContentProposalAdapter proposalAdapter = new ContentProposalAdapter(
import org.eclipse.swt.SWT;
            labelProvider = new ContentAssistLabelProvider();
        }
import org.jkiss.code.NotNull;

            () -> contentAdapter instanceof CComboContentAdapter || contentAdapter instanceof ComboContentAdapter
import org.eclipse.swt.widgets.Control;
        );
        @NotNull IControlContentAdapter contentAdapter,
import org.eclipse.jface.bindings.keys.KeyStroke;
    
    public static ContentProposalAdapter installContentProposal(
import org.jkiss.dbeaver.Log;

            contentAdapter,
 * DBeaver - Universal Database Manager
        KeyStroke keyStroke = KeyStroke.getInstance(keyLookup.getCtrl(), SWT.SPACE); //$NON-NLS-1$
        return installContentProposal(control, contentAdapter, provider, null, true);
    public static ContentProposalAdapter installContentProposal(
        @NotNull Control control,
}
        @NotNull IControlContentAdapter contentAdapter,
import org.eclipse.jface.bindings.keys.KeyLookupFactory;
        @Nullable ILabelProvider labelProvider,
        return installContentProposal(control, contentAdapter, provider, null, autoActivation);
 */
import java.util.Objects;
            autoActivation ? ".abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_$([{".toCharArray() : null);
    }
        @NotNull IContentProposalProvider provider,
 * Unless required by applicable law or agreed to in writing, software
    public static ContentProposalAdapter installContentProposal(
        proposalAdapter.setProposalAcceptanceStyle(isSingleValueAdapter ? ContentProposalAdapter.PROPOSAL_REPLACE : ContentProposalAdapter.PROPOSAL_INSERT);
        @NotNull IContentProposalProvider provider,
   
        proposalAdapter.setPopupSize(new Point(300, 200));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.ComboContentAdapter;
        isSingleValueAdapter = Objects.requireNonNullElseGet(

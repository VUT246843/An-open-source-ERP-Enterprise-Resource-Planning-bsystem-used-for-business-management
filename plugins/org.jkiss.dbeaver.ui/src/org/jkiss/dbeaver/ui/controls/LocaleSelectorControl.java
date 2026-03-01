            boolean found = false;
        Locale[] locales = Locale.getAvailableLocales();
        localeText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
}            int count = languageCombo.getItemCount();
        countryCombo.removeAll();
        GridLayout gl = new GridLayout(1, false);
import java.util.Locale;
        Set<String> variants = new TreeSet<>();

                    found = true;
        event.data = currentLocale;
            if (!found) {
    }
        String variant = getIsoCode(variantCombo.getText());
        }
            }
    }
        countryCombo.addModifyListener(e -> {
                    } else {
 */

 */
        super.notifyListeners(SWT.Selection, event);
                if (getIsoCode(languageCombo.getItem(i)).equals(currentLocale.getLanguage())) {
        try {
        UIUtils.createControlLabel(group, UIMessages.controls_locale_selector_label_language);
                countryCombo.select(countryCombo.getItemCount() - 1);
import org.eclipse.swt.widgets.Combo;
    }
/**
                    languageCombo.select(i);
import java.util.Set;


        Set<String> countries = new TreeSet<>();
 * LocaleSelectorControl
        } finally {
            defCountry = currentLocale.getCountry();
        UIUtils.createControlLabel(group, UIMessages.controls_locale_selector_label_locale);
        Composite parent,
        for (String language : languages) {
    public LocaleSelectorControl(
        }
    }


            variantCombo.add(variant);
        super(parent, SWT.NONE);

    }
                }
            if (getIsoCode(language).equals(currentLocale.getLanguage())) {
            }
            variantCombo.select(0);
        return value;
            currentLocale = Locale.getDefault();

public class LocaleSelectorControl extends Composite {
        if (defVariant == null) {
        languageCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            variantCombo.setText(currentLocale.getVariant());
        });
            if (language.equals(locale.getLanguage()) && !CommonUtils.isEmpty(locale.getCountry())) {
        variantCombo.addModifyListener(e -> calculateLocale());
        gl.marginHeight = 0;
        if (defCountry == null && countryCombo.getItemCount() > 0) {
        super.setEnabled(enabled);
        countryCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    break;
        for (int i = 0; i < value.length(); i++) {
        });
                countries.add(locale.getCountry() + " - " + locale.getDisplayCountry()); //$NON-NLS-1$


        if (defCountry == null) {
            if (defVariant != null && defVariant.equals(getIsoCode(variant))) {
                return value.substring(0, i);
 * Unless required by applicable law or agreed to in writing, software
import java.util.TreeSet;

                }
        variantCombo.removeAll();
 * You may obtain a copy of the License at
        languageCombo.addModifyListener(e -> {
            calculateLocale();
import org.eclipse.swt.widgets.Composite;
                }


 * Copyright (C) 2010-2026 DBeaver Corp and others
                        variants.add(locale.getVariant());
    private Locale currentLocale;
        Set<String> languages = new TreeSet<>();
        variantCombo = new Combo(group, SWT.DROP_DOWN);
                if (getIsoCode(countryCombo.getItem(i)).equals(currentLocale.getCountry())) {
        }
 *
        UIUtils.createControlLabel(group, UIMessages.controls_locale_selector_label_variant);

        }
        variantCombo.setEnabled(enabled);
            }
package org.jkiss.dbeaver.ui.controls;
        currentLocale = locale;
        for (Locale locale : locales) {
import org.eclipse.swt.layout.GridLayout;
            onCountryChange(currentLocale.getCountry());
        for (String variant : variants) {
                    break;
        if (localeChanging) {
        onLanguageChange(currentLocale.getCountry());
            }
import org.eclipse.swt.SWT;
    public Locale getSelectedLocale() {
    private static String getIsoCode(String value) {
        Event event = new Event();
            if (language.equals(locale.getLanguage()) && country.equals(locale.getCountry())) {
            found = false;

    @Override
            localeChanging = false;
        }
        localeText = new Text(group, SWT.BORDER | SWT.READ_ONLY);
                    found = true;
            }
        languageCombo.setEnabled(enabled);

                languageCombo.select(languageCombo.getItemCount() - 1);
        String language = getIsoCode(languageCombo.getText());

 * you may not use this file except in compliance with the License.
        }
    private void onLocaleChange() {
            if (!found) {
            calculateLocale();
                languageCombo.setText(currentLocale.getLanguage());
    private boolean localeChanging = false;
        String country = getIsoCode(countryCombo.getText());
    private final Combo languageCombo;
 * Licensed under the Apache License, Version 2.0 (the "License");
        onCountryChange(currentLocale.getVariant());
    private void calculateLocale() {
    private final Combo countryCombo;


            for (int i = 0; i < count; i++) {
        String country = getIsoCode(countryCombo.getText());
import org.eclipse.swt.layout.GridData;
        currentLocale = Locale.of(language, country, variant);
                variantCombo.select(variantCombo.getItemCount() - 1);
    private final Combo variantCombo;
    }
import org.eclipse.swt.widgets.Text;
        }
        if (currentLocale == null) {
            }

            countryCombo.add(country);
        currentLocale = defaultLocale;
        languageCombo = new Combo(group, SWT.DROP_DOWN);
    ) {
import org.jkiss.dbeaver.ui.internal.UIMessages;
 * DBeaver - Universal Database Manager
            }
        localeText.setText(currentLocale.toString());
        UIUtils.createControlLabel(group, UIMessages.controls_locale_selector_label_country);
            languages.add(locale.getLanguage() + " - " + locale.getDisplayLanguage()); //$NON-NLS-1$

import org.eclipse.swt.widgets.Event;

        String language = getIsoCode(languageCombo.getText());
        onLocaleChange();
                        variants.add(locale.getVariant() + " - " + locale.getDisplayVariant()); //$NON-NLS-1$
        if (defVariant == null && variantCombo.getItemCount() > 0) {
        }
        }

                if (!CommonUtils.isEmpty(locale.getVariant())) {
/*
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
        calculateLocale();
 * See the License for the specific language governing permissions and
                    countryCombo.select(i);

import org.jkiss.dbeaver.ui.UIUtils;
            return;
    private void onCountryChange(String defVariant) {
                    }
            onLanguageChange(currentLocale.getLanguage());
            if (defCountry != null && defCountry.equals(getIsoCode(country))) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        countryCombo.setEnabled(enabled);
        }
import org.jkiss.utils.CommonUtils;
            countryCombo.select(0);
    public void setLocale(Locale locale) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.setLayout(gl);
    }
    private final Text localeText;
        for (Locale locale : locales) {
            if (!Character.isLetter(value.charAt(i))) {
    private void onLanguageChange(String defCountry) {
        variantCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            onCountryChange(null);
            count = countryCombo.getItemCount();
        }
        Locale defaultLocale
            defVariant = currentLocale.getVariant();
            }
        String language = getIsoCode(languageCombo.getText());
            }
        Locale[] locales = Locale.getAvailableLocales();
    }
        Locale[] locales = Locale.getAvailableLocales();
        }
                    if (locale.getVariant().equals(locale.getDisplayVariant())) {
            onLanguageChange(null);
    }
 * limitations under the License.
                countryCombo.setText(currentLocale.getCountry());
        return currentLocale;

        }
        for (String country : countries) {
        Composite group = UIUtils.createTitledComposite(this, UIMessages.controls_locale_selector_group_locale, 2, GridData.FILL_BOTH);
            localeChanging = true;
        gl.marginWidth = 0;
    public void setEnabled(boolean enabled) {
            for (int i = 0; i < count; i++) {
            languageCombo.add(language);
        countryCombo = new Combo(group, SWT.DROP_DOWN);
        for (Locale locale : locales) {
 *
        }

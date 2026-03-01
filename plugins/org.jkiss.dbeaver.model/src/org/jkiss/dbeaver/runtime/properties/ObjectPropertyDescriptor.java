                    nodeReference.getReferencedNode() instanceof DBNDatabaseNode dbNode) {
                } else if (java.util.Collection.class.isAssignableFrom(argType)) {
        }

            case DBConstants.PROP_FEATURE_INFO -> this.isInfo();
                false,
import org.jkiss.dbeaver.model.DBConstants;
            value = finalResult[0];
        return false;
        return propInfo.required();
    }
                if (argType == Boolean.TYPE || argType == Boolean.class && !(value instanceof Boolean)) {
    private boolean getEditableValue(Object object) {
        if (!(propertySource instanceof IPropertySourceEditable pse) || !pse.isEditable(object)) {
    {
        return value;
        }

        return propInfo.href();
        }
            this.setter = BeanUtils.getSetMethod(


                DBExecUtils.tryExecuteRecover(progressMonitor, dbsObject.getDataSource(), param ->
            } catch (Exception e) {
    {
 * ObjectPropertyDescriptor
            }
    private final String propHint;
                valueRenderer = valueRendererClass.getConstructor().newInstance();
import java.lang.reflect.Method;
        return propInfo.linkPossible();
            } else {
        Method getter,
    }
            }
    @Override
    }
        if (getParent() != null) {
    }
        Method getter = getGetter();
    {
                } catch (Throwable e) {

    public boolean isLinkPossible() {
    private ResourceBundle getPluginResourceBundle(Bundle bundle, Class<?> ownerClass, String language) {
    private IPropertyValueValidator valueValidator;
        Class<?> propType = getGetter().getReturnType();
        }
                    return propLabel;
            if (editableValue == null) {
                        // Just skip it

    @Override
    {
    @Override
        return propInfo.requiredFeatures();
    }
    @NotNull

    public String getKeyName() {
                progressMonitor.subTask("Read " + this.getDisplayName());

    private IPropertyValueTransformer valueTransformer;
import org.jkiss.utils.CommonUtils;

    {

    public String getDisplayName() {
//        return ResourceBundle.getBundle("plugin", locale, ownerClass.getClassLoader()); //$NON-NLS-1$
            }
        }

            }
    }
        if (!expr.isEmpty()) {
import org.jkiss.utils.ArrayUtils;
                throw new IllegalAccessException("Lazy property can't be read with null progress monitor");
                    editableValue = dbNode.getObject();

    public boolean isRequired()
    }

            case DBConstants.PROP_FEATURE_NON_SECURED -> this.isNonSecuredProperty();
                    value = CommonUtils.toInt(value);
        if (this.isHref()) features.add(DBConstants.PROP_FEATURE_HREF);
        if (this.isRemote()) features.add(DBConstants.PROP_FEATURE_REMOTE);
        return CommonUtils.isEmpty(propInfo.category()) ?
        // Obtain value transformer
        return object instanceof DBPPersistedObject po && !po.isPersisted();
    }
    private Format displayFormat = null;
        return getEditableValue(object);
    @Override
    @NotNull
    public boolean isNonSecuredProperty() {
    }
            value = formatValue(object, value);
    {
    private Method setter;
import java.text.SimpleDateFormat;
    @Override
import java.util.List;
            if (format.isEmpty()) {
        final DBPPropertySource propertySource = getSource();
            params[0] = progressMonitor;
                if (getSource() instanceof DBNNodeReference nodeReference &&
                value = displayFormat.format(value);
        final String propertyName = BeanUtils.getPropertyNameFromGetter(getter.getName());
        return propInfo.info();
            case DBConstants.PROP_FEATURE_HIDDEN -> this.isHidden();


    }
                    log.error(e);
                        try {
            return isNew ? propInfo.editable() : propInfo.updatable();
                }

                    finalResult[0] = readPropertyMethod.get());
                } else if (argType == Integer.TYPE || argType == Integer.class) {
                if (result == null) {
                    if (va.annotationType() == NotNull.class) {
        } else {
            case DBConstants.PROP_FEATURE_NAME -> this.isNameProperty();
        this.propInfo = propInfo;
        if (value instanceof Number) {
        return AbstractDescriptor.evalExpression(exprString, object, this);
        // Copied from ResourceTranslator.getResourceBundle
import java.util.Arrays;
            case DBConstants.PROP_FEATURE_DATETME -> this.isDateTime();
    public void writeValue(Object object, Object value)
        return CommonUtils.nullIfEmpty(propInfo.hideExpr());
    {
            if (!result.equals(messageID)) {

        Object[] params = getter.getParameterCount() > 0 ?
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (labelProvider != null && getSource() != null) {
        };
    @Override
        return RuntimeUtils.getBundleLocalization(bundle, language);

                    displayFormat = formatClass.getConstructor().newInstance();
import java.text.Format;
    private String getLocalizedString(String string, String type, String defaultValue, boolean warnMissing, String locale) {
    }
        }
    @Override
            try {
                }
        return propInfo.password();
        }
        if (!CommonUtils.isEmpty(expr)) {
            }
                } else if (argType == Long.TYPE) {
            return false;
    }
        return propInfo.hashCode();
            case DBConstants.PROP_FEATURE_NUMERIC -> this.isNumeric();
        return displayFormat;
        if (propInfo.listProvider() != IPropertyValueListProvider.class) {
        if (valueTransformerClass != IPropertyValueTransformer.class) {
            try {
import java.util.Date;
                log.error(e);
                result = resourceBundle.getString(messageID);
            if (isNumeric()) {


            case DBConstants.PROP_FEATURE_LINK_POSSIBLE -> this.isLinkPossible();
            ResourceBundle resourceBundle = getPluginResourceBundle(bundle, propOwner, locale);
                        throw new IllegalArgumentException("Property '" + getId()  + "' can't be set into NULL");
        if (this.isNonSecuredProperty()) features.add(DBConstants.PROP_FEATURE_NON_SECURED);
                            result = parentResourceBundle.getString(messageID);
        } else {
            value = readPropertyMethod.get();
        return null;

                log.warn("Can't create value transformer", e);
        throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
        return propInfo.editable();
        if (this.isHidden()) features.add(DBConstants.PROP_FEATURE_HIDDEN);
                IPropertyValueValidator checker = visiblityCheckerClass.getConstructor().newInstance();
    }
        return propInfo.viewable() && !propInfo.hidden();
        return value;
        if (formatValue) {
        Class<?> propType = getGetter().getReturnType();
            return null;
            case DBConstants.PROP_FEATURE_PASSWORD -> this.isPassword();
        if (valueValidatorClass != IPropertyValueValidator.class) {
    public boolean equals(Object obj) {
    }
import org.jkiss.dbeaver.model.DBPPersistedObject;
    public boolean isEditPossible()
    @Override

            getParent() == null ? null : CommonUtils.notEmpty(getParent().getCategory()) :

            } catch (Exception e) {
            case DBConstants.PROP_FEATURE_REQUIRED -> this.isRequired();
import org.jkiss.code.NotNull;
                Property.DEFAULT_LOCAL_STRING.equals(propInfo.description()) ? propName : propInfo.description(),
 *
            }
                    }
                        }
            Object[] finalResult = new Object[1];

        labelProvider = null;
                if (propLabel != null) {
        return propType == Boolean.class || propType == Boolean.TYPE;
            try {
            }
 * You may obtain a copy of the License at
            return defaultValue;
                String propLabel = CommonUtils.toString(labelProvider.transform(editableValue, null), null);
            } catch (Exception e) {
                displayFormat = new DecimalFormat(format);
            if (value == null) {
                valueTransformer = valueTransformerClass.getConstructor().newInstance();
                return result;
            } catch (Exception e) {
/**
        Object value;
            } catch (Throwable e) {
            case DBConstants.PROP_FEATURE_VIEWABLE -> this.isViewable();
    @Nullable
            Class<?> propOwner = getter.getDeclaringClass();

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
    public Class<?> getDataType()
            String propertyName = BeanUtils.getPropertyNameFromGetter(getter.getName());
    public boolean allowCustomValue()
import java.text.DecimalFormat;

    private Object evaluateExpression(Object object, String exprString) {
 * DBeaver - Universal Database Manager
    public Object getDefaultValue()
                return null;
                } else if (argType == Double.TYPE) {

    @Override
        // Obtain value render
        return propHint;
 *
    public Object[] getPossibleValues(Object object)
                    try {
        return string;
        return propType != null && Date.class.isAssignableFrom(propType);
            Object editableValue = getSource().getEditableValue();
            case DBConstants.PROP_FEATURE_EXPENSIVE -> this.isExpensive();
        if (object == null) {
    public boolean isInfo() {
        }
    }
                } else if (argType == Float.TYPE) {

    }
        }
    public boolean isPropertyVisible(Object object, Object value) {
            try {
    public String getCategory() {

                c,
//        Locale locale = (language == null) ? Locale.getDefault() : new Locale(language);
import java.util.ResourceBundle;
        return propInfo.optional();
                }

    }
    public String[] getRequiredFeatures() {
            }
        return propInfo.hidden();
                    } else {
        }
import java.lang.annotation.Annotation;
    }
        }
        return propType != null && BeanUtils.isNumericType(propType);
    }
            } catch (Throwable e) {
    public PropertyLength getLength() {
                labelProvider = labelProviderClass.getConstructor().newInstance();

    public boolean isNumeric() {
    @Nullable
            propInfo.category();
    }
 *

            }
        declaringClass = getter.getDeclaringClass();
    }
    @Override
                        }
public class ObjectPropertyDescriptor extends ObjectAttributeDescriptor
                c = c.getSuperclass();
            }
    {
    }


 * Copyright (C) 2010-2026 DBeaver Corp and others
    {
                        // Leave as is
    {
    public ObjectPropertyDescriptor(
            value = valueRenderer.transform(object, value);
            return Boolean.TRUE.equals(evaluateExpression(object, expr));
                    value = false;
    public Object formatValue(Object object, Object value) {
                    } catch (Exception e1) {
    }
        return propInfo.nonSecuredProperty();
        if (setter != null) {
        String locale)
                log.debug("Don't know how to apply format to property " + getId());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return propInfo.desktop();
    public boolean hasListValueProvider() {
        return getGetter().getReturnType();
    @Override
    @Override
        return valueRenderer;
            } catch (Throwable e) {
                log.warn("Can't create value renderer", e);
        }
        }
        if (this.getLength() == PropertyLength.MULTILINE) features.add(DBConstants.PROP_FEATURE_MULTILINE);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                }
    private final Property propInfo;
            } else {
            final Format displayFormat = getDisplayFormat();
    public int hashCode()
            null :
    private IPropertyValueTransformer valueRenderer;
            }
        if (displayFormat == null) {
                return null;
    @Override

                displayFormat = new SimpleDateFormat(format);
        return obj instanceof ObjectPropertyDescriptor opd &&
    @Override
    public Class<?> getDeclaringClass()
        return declaringClass;
                log.debug(e);
{
            // Check for null
    public Object readValue(Object object, @Nullable DBRProgressMonitor progressMonitor, boolean formatValue)
 */
        return propInfo.editable();
                return checker.isValidValue(object, value);
                }
    public boolean isBoolean() {

            if (setter == null) {
import org.jkiss.dbeaver.model.DBPConditionalProperty;
    @Nullable
    @Nullable
    private final String propDescription;

                        ResourceBundle parentResourceBundle = getPluginResourceBundle(parentBundle, parentOwner, locale);
    @NotNull
import org.osgi.framework.Bundle;
    }

    }
                    value = 0.0;
            final Class<?> argType = setter.getParameterTypes()[0];
        }
                // Check for primitive argument

            Method getter = getGetter();
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        if (Property.DEFAULT_LOCAL_STRING.equals(string)) {

import org.jkiss.code.Nullable;
            Class<?> dataType = getDataType();

            final String format = propInfo.format();
    @Override
    public boolean isEditable(Object object) {
        if (displayFormat == null) {
        Class<? extends IPropertyValueTransformer> valueTransformerClass = propInfo.valueTransformer();
    public boolean isHidden()
        if (isLazy() && params != null) {
        return (propInfo.listProvider() != IPropertyValueListProvider.class);
    }


            } catch (Throwable e) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
            case DBConstants.PROP_FEATURE_EDIT_POSSIBLE -> this.isEditPossible();
        boolean isNew = isNewObject(object);
    public IPropertyValueValidator getValueValidator() {

                propertyName);
        return propName;
    }
    }
            try {
 * See the License for the specific language governing permissions and
        Property propInfo,
                        } catch (Exception e1) {
    public boolean isPassword() {
    }
        } else {
                        Method parentGetter = parent.getMethod(getter.getName(), getter.getParameterTypes());
            } else if (isDateTime()) {
    @Override

    public String getDescription()
    }

        if (valueRenderer != null) {
                }
        if (labelProviderClass != IPropertyValueTransformer.class) {
        }
        return true;
            object = getParent().getGroupObject(object, progressMonitor);

                for (Annotation va : valueAnnotations) {
                log.warn("Can't create value validator", e);
        this.propHint = CommonUtils.isEmpty(propInfo.hint()) ?
package org.jkiss.dbeaver.runtime.properties;
        String expr = propInfo.editableExpr();
    }
                } else if (argType == Long.TYPE || argType == Long.class) {
    }
    implements DBPPropertyDescriptor, DBPConditionalProperty, IPropertyValueListProvider<Object>
import org.jkiss.dbeaver.model.meta.*;
                // Use void monitor because this object already read by readValue
        return CommonUtils.nullIfEmpty(propInfo.readOnlyExpr());
    }
}
            try {
            }
    }
    public boolean isDateTime() {
    public IPropertyValueTransformer getValueRenderer() {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public String toString()
                } else if (argType == Boolean.TYPE) {
    }
            // List
                            break;
        }
    }
            if (formatClass != Format.class) {
        return valueTransformer;
        if (this.isViewable()) features.add(DBConstants.PROP_FEATURE_VIEWABLE);

            }
                try {

        return propDescription;
        while (setter == null && c != Object.class && c != null) {
        if (this.isExpensive()) features.add(DBConstants.PROP_FEATURE_EXPENSIVE);
            if (displayFormat != null) {
    public boolean hasFeature(@NotNull String feature) {
    }
                } else if (argType == Double.TYPE || argType == Double.class) {
                // Try to find the same property in parent classes
            try {
            }
            case DBConstants.PROP_FEATURE_HREF -> this.isHref();
        Class<? extends IPropertyValueTransformer> labelProviderClass = propInfo.labelProvider();
        // Obtain value validator
            if (getParent() != null) {

                            // Just skip it
        if (this.isRequired()) features.add(DBConstants.PROP_FEATURE_REQUIRED);
            getLocalizedString(propInfo.name(), Property.RESOURCE_TYPE_HINT, null, false, locale);
                log.error(e);
        Object finalObject = object;

            Bundle bundle = FrameworkUtil.getBundle(propOwner);
                throw new InvocationTargetException(e);
                    value = CommonUtils.toDouble(value);
                displayFormat = null;
        }
            throw new IllegalAccessError("No setter found for property " + getId());
            if (editableValue != null) {
            try {


            default -> ArrayUtils.contains(propInfo.features(), feature);
    public String getReadOnlyExpression() {
                return propInfo.listProvider().getConstructor().newInstance().allowCustomValue();
    }
*/
            case DBConstants.PROP_FEATURE_MULTILINE -> this.getLength() == PropertyLength.MULTILINE;
        if (this.isNumeric()) features.add(DBConstants.PROP_FEATURE_NUMERIC);

                        messageID = "meta." + parentOwner.getName() + "." + propertyName + "." + type;
    {
            if (dataType != null && dataType.isEnum()) {

import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
            Class<? extends Format> formatClass = propInfo.formatter();
            // List
                } else if (argType == Character.TYPE) {

                        if (parentBundle == null || parentBundle == bundle) {
                object = getParent().getGroupObject(object, new VoidProgressMonitor());
        }
    }
    public boolean isExpensive()
        if (propInfo.listProvider() != IPropertyValueListProvider.class) {
    public Format getDisplayFormat() {
        return propInfo.supportsPreview();
            );
        return propInfo.specific();

    public boolean isEditPossible(Object context) {
import org.jkiss.utils.BeanUtils;
                            continue;
            propInfo.equals(opd.propInfo) &&
    @Override
            }
                    value = (short)0;
        }
    @Override
                    value = 0;
import java.lang.reflect.InvocationTargetException;
            if (value == null) {
        DBPPropertySource source,
            return Boolean.TRUE.equals(evaluateExpression(context, expr));
                propInfo.name(),

                    }
    public String getHint()
        throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
            }
    }
    }
            setter.invoke(object, value);
                    value = ' ';
            }
 * you may not use this file except in compliance with the License.
        Class<? extends IPropertyValueValidator> visiblityCheckerClass = propInfo.visibleIf();
            }
        ObjectPropertyGroupDescriptor parent,

    {


    }
import org.jkiss.dbeaver.utils.RuntimeUtils;
            ? propName
    }
                Property.RESOURCE_TYPE_DESCRIPTION,
            }
    private final Class<?> declaringClass;
                throw new InvocationTargetException(e, e.getMessage());
        }
        }
                        Bundle parentBundle = FrameworkUtil.getBundle(parentOwner);
                        value = List.of(value);
    public boolean isSpecific() {
    }
    @Nullable
        InvocationSupplier<Object> readPropertyMethod = () -> {
            .collect(Collectors.toList());
            String messageID = "meta." + propOwner.getName() + "." + propertyName + "." + type;
        if (this.isOptional()) features.add(DBConstants.PROP_FEATURE_OPTIONAL);
        return features.toArray(new String[0]);
            }
    public boolean supportsPreview() {
    @Override
        String expr = isNew ? propInfo.editableExpr() : propInfo.updatableExpr();
                    value = (float)0.0;
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            String result = null;

import org.jkiss.dbeaver.model.navigator.DBNNodeReference;
                for (Class<?> parent = getter.getDeclaringClass().getSuperclass(); parent != null && parent != Object.class; parent = parent.getSuperclass()) {
    }
            : getLocalizedString(
    }
            }

    }
        if (this.isLinkPossible()) features.add(DBConstants.PROP_FEATURE_LINK_POSSIBLE);
    {
    }
        }
        return getId() + " (" + propInfo.name() + ")";
        Class<? extends IPropertyValueValidator> valueValidatorClass = propInfo.valueValidator();
                    if (value == null || argType.isAssignableFrom(value.getClass())) {
        if (this.isPassword()) features.add(DBConstants.PROP_FEATURE_PASSWORD);
                return dataType.getEnumConstants();
import org.jkiss.dbeaver.model.struct.DBSObject;
        super(source, parent, getter, propInfo.id(), propInfo.order());
                        log.debug("Resource '" + messageID + "' not found in bundle " + bundle.getSymbolicName());
                    value = CommonUtils.toBoolean(value);
            // Lazy (probably cached)
        }
    public String getHideExpression() {
        if (visiblityCheckerClass != IPropertyValueValidator.class) {
        // Obtain label provider
            case DBConstants.PROP_FEATURE_OPTIONAL -> this.isOptional();
        };
    private final String propName;
        return null;
    {
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                valueValidator = valueValidatorClass.getConstructor().newInstance();
    @Override
        return switch (feature) {
        if (this.isDateTime()) features.add(DBConstants.PROP_FEATURE_DATETME);
        Class<?> c = declaringClass;
            try {
            CommonUtils.equalObjects(getGetter(), opd.getGetter());

                Annotation[] valueAnnotations = setter.getParameterAnnotations()[0];
            if (object == null) {

                    }
/*
        Class<? extends IPropertyValueTransformer> valueRendererClass = propInfo.valueRenderer();
    public IPropertyValueTransformer getValueTransformer() {
    {

        if (this.isSpecific()) features.add(DBConstants.PROP_FEATURE_SPECIFIC);
                return getter.invoke(finalObject, params);
 * Unless required by applicable law or agreed to in writing, software
                log.warn("Can't create label provider", e);
                        // Make list from object
    public boolean isDesktop() {
 * limitations under the License.
            if (isLazy(object, true) && progressMonitor == null && !supportsPreview()) {
    private boolean isNewObject(Object object) {
                return propInfo.listProvider().getConstructor().newInstance().getPossibleValues(object);
    public boolean isViewable()
            }
    }
        return propInfo.expensive();
            } catch (Throwable e) {
    {
        if (valueRendererClass != IPropertyValueTransformer.class) {
        // Read-only or non-updatable property for non-new object

        List<String> features = Arrays.stream(propInfo.features())
        } else {

        return valueValidator;
                if (argType == Integer.TYPE) {
                }
    public String[] getFeatures() {
    public boolean isOptional() {
        if (this.isNameProperty()) features.add(DBConstants.PROP_FEATURE_NAME);
        Class<?> propType = getGetter().getReturnType();
                    return defaultValue;
    private IPropertyValueTransformer labelProvider;
        return propInfo.keyName();
    public boolean isHref() {
                    value = CommonUtils.toLong(value);
    {
        if (this.isEditPossible()) features.add(DBConstants.PROP_FEATURE_EDIT_POSSIBLE);
        if (progressMonitor != null && isLazy() && object instanceof DBSObject dbsObject) {

        this.propName = getLocalizedString(propInfo.name(), Property.RESOURCE_TYPE_NAME, getId(), !propInfo.hidden(), locale);
                }
            new Object[getter.getParameterCount()] : null;

                } else if (argType == Short.TYPE) {
            case DBConstants.PROP_FEATURE_SPECIFIC -> this.isSpecific();
import java.util.stream.Collectors;
import org.osgi.framework.FrameworkUtil;
    }

    }
                locale
                    value = 0L;
            }

                        Class<?> parentOwner = parentGetter.getDeclaringClass();
        return propInfo.length();
                    if (type.equals(Property.RESOURCE_TYPE_NAME) && warnMissing) {
            } catch (Exception e) {
        this.propDescription = CommonUtils.isEmpty(propInfo.description())
            try {

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    }
            }

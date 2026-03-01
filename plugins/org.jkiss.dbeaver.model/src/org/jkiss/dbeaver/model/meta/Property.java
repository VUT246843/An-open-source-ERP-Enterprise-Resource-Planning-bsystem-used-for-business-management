
    /**
 * Copyright (C) 2010-2026 DBeaver Corp and others
     */
    /**
    boolean optional() default false;
     */


    /**
     * Specific properties ae rendered separate from others
     * @return hint
     * Does not show the field in the connection window of CB when this property is true.
     */
    boolean supportsPreview() default false;
    /**

     * List of required application features to enable property

     * @return the string
     * Can be used to format numbers and date/time property values
     */
import java.lang.annotation.ElementType;


/**
    /**
    /**


    /**
     * Features list as a string with comma delimiter .

     */
     */

    /**

    String helpContextId() default ""; //NON-NLS-1
     * Property hint (optional)
 */
    /**
    String RESOURCE_TYPE_HINT = "hint"; //NON-NLS-1
    boolean specific() default false;
     * @return viewable flag
     */
    /**
     * Makes sense only for lazy properties. If set to true then this property value can be read

@Retention(RetentionPolicy.RUNTIME)
    /**
     * Hyperlink property
 * Unless required by applicable law or agreed to in writing, software
     * @return id
     * @return preview support flag
     * @return name
     * @return name
}
     * Property unique ID (unique within class)
    String hint() default DEFAULT_LOCAL_STRING;
    boolean desktop() default false;
import java.lang.annotation.RetentionPolicy;


    /**
     */


    Class<? extends IPropertyValueTransformer> labelProvider() default IPropertyValueTransformer.class;
    String[] features() default {};
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    Class<? extends IPropertyValueValidator> valueValidator() default IPropertyValueValidator.class;
     */


 * limitations under the License.
     *
     * Updatable flag. If set to true then property can be changed on any object

    /**
    /**
    int order() default Integer.MAX_VALUE;
    String RESOURCE_TYPE_NAME = "name"; //NON-NLS-1
    String description() default DEFAULT_LOCAL_STRING;
     */
    @NotNull String editableExpr() default "";


    /**
 * You may obtain a copy of the License at

     * @return editable flag
    /**
    PropertyLength length() default PropertyLength.LONG;
import java.lang.annotation.Retention;
     * Note that property editor contains all properties (except hidden).
    boolean editable() default false;
     */

     * @return updatable flag

     * @return the string
import org.jkiss.code.NotNull;

    /**



 *
    /**
/*


     */
    String RESOURCE_TYPE_DESCRIPTION = "description"; //NON-NLS-1
    boolean expensive() default false;
 *
     */
     * Expression to verify editable status
    boolean required() default false;
     */
    /**
    String id() default ""; //NON-NLS-1
     * Multiline properties usually contain some big texts
     */
     * Expression to verify updatable status
    String format() default ""; //NON-NLS-1
     * Indicates whether the property contains value for the information label
     */
    /**

    String name() default DEFAULT_LOCAL_STRING;
     *
    String[] requiredFeatures() default {};
     * Viewable flag. Viewable properties are displayed in lists.
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    String keyName() default DEFAULT_LOCAL_STRING;
     */
     * It is possible that value of this property will be an object which can be linked.
    String readOnlyExpr() default "";
    String DEFAULT_LOCAL_STRING = "#"; //NON-NLS-1

    boolean viewable() default false;
     * Property name which used on serialization
     */

     * Editable flag. If set to true then property may be edited for new objects.
    String category() default ""; //NON-NLS-1
import java.lang.annotation.Target;
{
 * Property
     * Property description (optional)
     */
    Class<? extends IPropertyValueTransformer> valueTransformer() default IPropertyValueTransformer.class;
     * Expression for determining the visibility of a property.
 * Licensed under the Apache License, Version 2.0 (the "License");
    boolean linkPossible() default false;

     */
    boolean updatable() default false;
     */
     */
    boolean nonSecuredProperty() default false;
    boolean href() default false;

 *
    Class<? extends IPropertyValueListProvider> listProvider() default IPropertyValueListProvider.class;
    Class<? extends IPropertyValueTransformer> valueRenderer() default IPropertyValueTransformer.class;
     * in non-lazy way with null progress monitor. In this case it will return "preview" value.
     * Used for cacheable properties which may return java.lang.Object ot DBSObject.
    /**

     *
    /**
     *
import java.text.Format;

    Class<? extends Format> formatter() default Format.class; //NON-NLS-1
     * Optional property. Won't be rendered at all if value is null.
     */


package org.jkiss.dbeaver.model.meta;

     * @return category

     * Property applies only for desktop products.
     *
 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
    @NotNull String updatableExpr() default "";
     * Expression for determining the activity of a property.
    boolean hidden() default false;
     */
     * @return description
    Class<? extends IPropertyValueValidator> visibleIf() default IPropertyValueValidator.class;
    boolean password() default false;

 * See the License for the specific language governing permissions and
    /**
 * you may not use this file except in compliance with the License.
     */
    /**
    /**
    String hideExpr() default "";
@Target(value = {ElementType.METHOD})
    boolean info() default false;
public @interface Property
     */
     * Property category (optional). A human readable string
     * Property holds password. Must be secured in UI.
 * DBeaver - Universal Database Manager

     * Property human readable name

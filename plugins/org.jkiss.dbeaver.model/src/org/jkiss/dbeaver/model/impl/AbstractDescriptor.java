
                    if (parameterTypes.length == args.length) {
            if (!icon.startsWith("platform:")) {
    }
            }
    private static final Map<String, Map<String, Boolean>> classInfoCache = new HashMap<>();
        IConfigurationElement[] elements = config.getChildren(expressionElementName);
import org.jkiss.utils.CommonUtils;
        return getImplClass(getContributorBundle(), className, type);

    public Class<?> getImplClass(@NotNull String className) {
                        if (matches) {
                    log.warn("Can't parse object type expression: " + condition, ex); //$NON-NLS-1$
            if (implClass == null) {
        classInfoCache.put(clazz.getName(), intCache);
        return (Class<T>) objectClass;
        synchronized (AbstractDescriptor.class) {
            return implName;

    @NotNull

        }
            return DBIcon.getImageById(icon.substring(1));

    // Descriptor itself
 * You may obtain a copy of the License at

            }
        }
                jexlEngine = new JexlBuilder()
        public Class<?> getImplClass() {
import org.osgi.framework.Bundle;
                IEvaluationContext context = new EvaluationContext(null, exprContext);
        }
 * you may not use this file except in compliance with the License.
                            }
    @NotNull
    public static final String VAR_OBJECT = "object";
        this.pluginId = pluginId;
    protected AbstractDescriptor(@NotNull String pluginId) {
        try {
        @Override
        }
    private static final List<JexlUberspect.PropertyResolver> POJO = List.of(
        public <T> void checkObjectClass(@NotNull Class<T> type) throws DBException {
    }

        public <T> T createInstance(@NotNull Class<T> type) throws DBException {
        try {

    public String getPluginId() {
                    return Boolean.TRUE.equals(result);
        return getImplClass(getContributorBundle(), className, null);
                return name.equals(VAR_OBJECT) ? object :
    public class ObjectType {
            } catch (CoreException e) {
            return JexlUberspect.MAP;
            objectClass = fromBundle.loadClass(className);
                return name.equals(VAR_OBJECT) && object != null ||
            }
            if (!type.isAssignableFrom(objectClass)) {
                        }
    public <T> Class<T> getImplClass(@NotNull String className, @NotNull Class<T> type) {
            if (originBundle == null) {
        DBPImage result = iconToImage(icon);
    }
        if (elements.length > 0) {
                try {
        }
        private static final String ATTR_IF = "if";
                } catch (DBException ex) {
            }
        return getObjectClass(getContributorBundle(), className, type);
            public void set(String name, Object value) {
        public ObjectType(@NotNull IConfigurationElement cfg) {
                    .cache(100)
            return implClass != null && implClass.isAssignableFrom(clazz);

            } catch (Exception e) {
import java.util.*;
            if (objectClass == null) {
            // Predefined image
                    return false;
            this(cfg, ATTR_NAME);
        JexlUberspect.JexlResolver.FIELD,
            if (objectClass == null) {


                    (name.equals(VAR_CONTEXT) ? context : null); //$NON-NLS-1$
            }

                    return ExpressionConverter.getDefault().perform(enablement[0]);
                                break;
import org.eclipse.core.runtime.IContributor;
 * Unless required by applicable law or agreed to in writing, software
                log.debug(e);
    /////////////////////////
            log.error("Bad expression: " + exprString, e);
            }
        public <T> Class<? extends T> getImplClass(Class<T> type) {
        try {
            }
 * Abstract registry descriptor
        public String toString() {
        }
        }

                    Object result = expression.evaluate(makeContext(object, context));
 *
        if (expression != null) {


                        boolean matches = true;
                throw new DBException("Can't load class '" + getImplName() + "'");
        return getObjectClass(getContributorBundle(), className, null);
                for (Constructor<?> c : objectClass.getConstructors()) {
        }
    @NotNull
    @NotNull
    public DBPImage iconToImage(@Nullable String icon) {
import org.eclipse.core.expressions.*;
        }
 * See the License for the specific language governing permissions and

            }
        } catch (Throwable ex) {
            }
    };
 *
    public static JexlContext makeContext(@Nullable Object object, @Nullable Object context) {
            throw new DBException("Bad expression", e);
                    name.equals(VAR_CONTEXT) && context != null;
        }
                throw new DBException("Class '" + implName + "' do not implements '" + type.getName() + "'");

            return expression.evaluate(AbstractDescriptor.makeContext(object, context));

        private final String implName;
        }
        if (type != null && !type.isAssignableFrom(objectClass)) {

    }
import org.apache.commons.jexl3.introspection.JexlUberspect;
        } catch (Throwable ex) {
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
    public <T> Class<T> getObjectClass(@NotNull String className, @NotNull Class<T> type) {
    public static <T> Class<T> getObjectClass(
                    this.expression = parseExpression(condition);
            }
            }
        }
            public Object get(String name) {
            if (objectClass == null) {
        @NotNull Bundle fromBundle,
        public String getImplName() {
        private Class<?> implClass;
    private static synchronized Map<String, Boolean> getTypeInfoCache(@NotNull Class<?> clazz) {
        }
    protected static Expression getEnablementExpression(@NotNull IConfigurationElement config, @NotNull String expressionElementName) {
            return (Class<? extends T>) implClass;
            if (!matchesType(object.getClass())) {
            log.error("Can't determine object class '" + className + "'", ex);
            @Override
            JexlExpression expression = AbstractDescriptor.parseExpression(exprString);

            return true;
package org.jkiss.dbeaver.model.impl;
        }
    }
    }
        Class<?> objectClass;
        @NotNull
            // data type mappings (no matter which type they refer)
                        for (int i = 0; i < parameterTypes.length; i++) {
import java.lang.reflect.Constructor;
        if (originBundle == null) {
                implClass = AbstractDescriptor.this.getObjectClass(implName, type);
        @Nullable Class<T> type
 * DBeaver - Universal Database Manager
            }
/*
            try {
import org.jkiss.code.NotNull;
            return null;
                }
            } catch (Exception e) {
            if (jexlEngine == null) {
            String condition = cfg.getAttribute(ATTR_IF);


            public boolean has(String name) {
}



import org.jkiss.dbeaver.model.DBIcon;
            return implName;
        if (intCache != null) {
            return null;
        JexlUberspect.JexlResolver.PROPERTY,

                return getTypeInfoCache(clazz).containsKey(implName);
                return objectClass.getDeclaredConstructor().newInstance();
    }
        }
                if (result != EvaluationResult.TRUE) {
        if (op == null && obj instanceof Map) {
            @Override
    @Nullable
        private boolean forceCheck;
        this.pluginId = contributor.getName();
                icon = "platform:/plugin/" + pluginId + "/" + icon;
            String fcAttr = cfg.getAttribute(ATTR_FORCE_CHECK);
    private static JexlEngine jexlEngine;
            objectClass = fromBundle.loadClass(className);
                     InvocationTargetException e) {
    private String pluginId;
    public static <T> Class<T> getImplClass(
                throw new DBException("Implementation class not specified");

            if (expression != null) {
import org.jkiss.dbeaver.model.DBPImage;


                }
        return true;
            if (implName == null) {
public abstract class AbstractDescriptor {
    private Bundle originBundle;
import org.jkiss.dbeaver.Log;
            return getObjectClass(Object.class);
import org.eclipse.core.runtime.Platform;
        for (Class<?> i : clazz.getInterfaces()) {
        private static final String ATTR_FORCE_CHECK = "forceCheck";
            originBundle = Platform.getBundle(pluginId);
            }
    @NotNull

        public boolean appliesTo(@NotNull Object object, @Nullable Object context) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }

                }
    }
            }

                throw new DBException("Can't instantiate class '" + getImplName() + "'", e);
        }
            collectInterface(i, intCache);
        this.pluginId = contributorConfig.getContributor().getName();
            }
        }
                log.debug(e);
        @Nullable
            try {
        }
        }
                                matches = false;
    @Nullable
            return (Class<? extends T>) implClass;

            return getImplClass(Object.class);
            try {
/**
        Map<String, Boolean> intCache = classInfoCache.get(clazz.getName());
            return intCache;
        @NotNull String className,
            return null;
    protected AbstractDescriptor(@NotNull IConfigurationElement contributorConfig) {
            }


    public static final String VAR_CONTEXT = "context";
        return (Class<T>) objectClass;

        }
        return getEnablementExpression(config, "enabledWhen");
 * limitations under the License.
                log.warn("Set is not implemented"); //$NON-NLS-1$
        return Objects.requireNonNullElse(result, defIcon);
            }
            Class<? extends T> objectClass = getObjectClass(type);
        if (CommonUtils.isEmpty(icon)) {

        }
            }
            }
                            return (T) c.newInstance(args);
 */

            Class<? extends T> objectClass = getObjectClass(type);
    }
        return intCache;
        return POJO;


            return jexlEngine.createExpression(exprString);
    }
            @Override
    private static final JexlUberspect.ResolverStrategy JEXL_STRATEGY = (op, obj) -> {
import org.jkiss.dbeaver.DBException;
                // Use only type name
    protected static Expression getEnablementExpression(@NotNull IConfigurationElement config) {

    @Nullable
        @NotNull
            }
        @NotNull String className,
    public Bundle getContributorBundle() {
import org.eclipse.core.runtime.CoreException;
    public static JexlExpression parseExpression(@NotNull String exprString) throws DBException {
    private static void collectInterface(@NotNull Class<?> clazz, @NotNull Map<String, Boolean> intCache) {
                            if (!parameterTypes[i].isInstance(args[i])) {
                    return false;
        public ObjectType(@NotNull IConfigurationElement cfg, @NotNull String typeAttr) {
            log.error("Object class '" + className + "' doesn't match requested type '" + type.getName() + "'");
        } else if (icon.startsWith("#")) {
    }
        } catch (JexlException e) {
        if (op == JexlOperator.ARRAY_GET) {

        Class<?> objectClass;
        public ObjectType(@NotNull String implName) {
                throw new IllegalStateException("Class name not specified");
            if (implClass == null) {
            }
            this.implName = cfg.getAttribute(typeAttr);
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        JexlUberspect.JexlResolver.CONTAINER);

                throw new IllegalStateException("Bundle '" + pluginId + "' not found in platform");
        public boolean matchesType(@NotNull Class<?> clazz) {
                } catch (Exception e) {

        return pluginId;
                throw new DBException("No implementation class name set for '" + type.getName() + "'");
    @NotNull
        intCache.put(clazz.getName(), Boolean.TRUE);
            return null;
                throw new DBException("Cannot find constructor matching args " + Arrays.toString(args));
import org.eclipse.core.runtime.IConfigurationElement;
        } catch (DBException e) {
            return JexlUberspect.MAP;
    }
    }
    private static final Log log = Log.getLog(AbstractDescriptor.class);
        @Nullable
            collectInterface(sc, intCache);
            try {
        }
        JexlUberspect.JexlResolver.DUCK,
    }

        @Nullable
        return new JexlContext() {

                return null;
                return false;
            // Check class only if bundle was loaded or forceCheck is set. Otherwise we'll load ALL bundles which have some
    ) {


                    .create();
            if (!CommonUtils.isEmpty(condition)) {
        public <T> Class<? extends T> getObjectClass(@NotNull Class<T> type) {
            }
            throw new IllegalStateException("Can't determine object class '" + className + "'", ex);
    }
    }
        @Nullable
        };
        return null;
    @NotNull
                EvaluationResult result = expression.evaluate(context);
        @NotNull Bundle fromBundle,
    @NotNull
                IConfigurationElement[] enablement = elements[0].getChildren();
                implClass = AbstractDescriptor.this.getImplClass(implName, type);
    protected void replaceContributor(@NotNull IContributor contributor) {
            return JexlUberspect.MAP;
            if (implName == null) {
    ) {
                    .strategy(JEXL_STRATEGY)

        }
                        }
        if (type != null && !type.isAssignableFrom(objectClass)) {
    @Nullable
            if (!CommonUtils.isEmpty(fcAttr)) {
        private static final String ATTR_NAME = "name";
        @NotNull
        @Nullable
                throw new DBException("Class '" + implName + "' not found");
    protected DBPImage iconToImage(String icon, @NotNull DBPImage defIcon) {

        }
    protected static boolean isExpressionTrue(@Nullable Expression expression, @Nullable Object exprContext) {
 */
    @Nullable
        public <T> T createInstance(@NotNull Class<T> type, @NotNull Object... args) throws DBException {

                return false;
 *
        @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
        intCache = new HashMap<>();
            if (implName == null) {
    @NotNull
        for (Class<?> sc = clazz; sc != null && sc != Object.class; sc = sc.getSuperclass()) {
        try {
                try {
            if (getContributorBundle().getState() != Bundle.ACTIVE && !forceCheck) {

                    }
                if (enablement.length > 0) {
        private JexlExpression expression;
            Class<? extends T> objectClass = getObjectClass(type);
            throw new IllegalStateException("Object class '" + className + "' doesn't match requested type '" + type.getName() + "'");
                    log.debug("Error evaluating EL expression '" + expression + "'", e);
            this.implName = implName;
        this.originBundle = null;
            getObjectClass();
        }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
            if (implName == null) {
        }
    @Nullable
        JexlUberspect.JexlResolver.LIST,
            return new DBIcon(icon);
    }
        @NotNull
        if (op == JexlOperator.ARRAY_SET) {
    }
        public Class<?> getObjectClass() {
        }

        JexlUberspect.JexlResolver.MAP,
                }

    }
        } else {
        }
    @Nullable
            }
                throw new DBException("Can't instantiate class '" + getImplName() + "'", e);
                    Class<?>[] parameterTypes = c.getParameterTypes();
    public static Object evalExpression(@NotNull String exprString, @Nullable Object object, @Nullable Object context) {
import java.lang.reflect.InvocationTargetException;
    }
    public Class<?> getObjectClass(@NotNull String className) {
            }
                forceCheck = CommonUtils.toBoolean(fcAttr);
        @Nullable Class<T> type
import org.apache.commons.jexl3.*;
                throw new DBException("Can't load class '" + getImplName() + "'");

            }
        }
import org.jkiss.code.Nullable;
    @NotNull

        return originBundle;
        }

        }
 * the slave variable.
    {

    public String[] getValues()
        fKey = DEFAULT_KEY;
 * which accompanies this distribution, and is available at
    @Override
    }
    {
        if (fValueMap != null) {
 * Copyright (c) 2000, 2011 IBM Corporation and others.
        }
    private TemplateVariableResolver resolver;
        return object.toString();
    }
        if (resolver != null) {
        setChoices(DEFAULT_KEY, values);
 * http://www.eclipse.org/legal/epl-v10.html
import org.eclipse.jface.text.templates.TemplateVariableType;
    {
    }
 *
import org.eclipse.jface.text.templates.TemplateVariable;
    }


    public void setCurrentChoice(Object currentChoice)
    }
 * All rights reserved. This program and the accompanying materials
    {
    public void setChoices(Object key, Object[] values)
        for (int j = 0; j < values.length; j++) {
    private Object fCurrentChoice;
public class SQLVariable extends TemplateVariable {

    public void setValues(String[] values)
     *
    }
    {
     * @param key the key
    }
    }
        return fCurrentChoice;
     *
    /**
        setChoices(values);
    private static final Object DEFAULT_KEY = new Object();
     * @param key    the key for which the values are valid
    {
    public SQLVariable(SQLContext context, TemplateVariableType type, String name, int[] offsets)

    public TemplateVariableResolver getResolver()
        Assert.isTrue(Arrays.asList(getChoices()).contains(currentChoice));
     * Sets the values of this variable under a specific key.
 * {@link org.jkiss.dbeaver.ui.editors.sql.templates.SQLVariable}s can store multiple sets of data; the currently active set is determined
    /**
        Assert.isTrue(fValueMap.containsKey(defaultKey));
import org.eclipse.jface.text.contentassist.ICompletionProposal;
    public String toString(Object object)
 */
    }
        fValueMap.put(fKey, new String[]{name});
 *******************************************************************************/
        return proposals;
    public void setResolver(TemplateVariableResolver resolver)
        for (int i = 0; i < result.length; i++)
/*******************************************************************************
        return resolver;
 * opaque {@link Object} arrays that are converted to the {@link String} values expected by
        }
    {
import java.util.HashMap;
        if (!fKey.equals(defaultKey)) {
        String[] result = new String[values.length];

     * Returns the choices for the set identified by <code>key</code>.

        fCurrentChoice = getChoices()[0];
 * {@link #getCurrentChoice() choice} of a master variable is the {@link #setKey(Object) key} for



    public String getDefaultValue()
                fCurrentChoice = getChoices()[0];
     */
            fKey = defaultKey;
     * @param values the possible values of this variable
 * by the active <em>key</em>. The key may be set via {@link #setKey(Object)}. Data sets are
    {

    }

    private SQLContext context;
}
            fValueMap.put(key, values);
    private final Map<Object, Object[]> fValueMap = new HashMap<>();
import org.eclipse.jface.text.templates.TemplateVariableResolver;
import java.util.Map;
        this.context = context;
    {
        return getChoices(fKey);
import org.eclipse.jface.text.Position;
        this.resolver = resolver;

        Object[] values = getChoices();
    @Override
            proposals[j] = new SQLVariableCompletionProposal(this, values[j], position, length);
    }
        super(type, name, name, offsets);
        ICompletionProposal[] proposals = new ICompletionProposal[values.length];
    @Override

     *         <code>null</code> if the set is not defined.
            resolver.resolve(this, context);
            if (key.equals(fKey))
    {
            fCurrentChoice = getChoices()[0];
            setResolved(true);
        return context;
import org.eclipse.core.runtime.Assert;
        return fValueMap.get(key);
import java.util.Arrays;

    private Object fKey;
    {
        fCurrentChoice = currentChoice;

        // no action when called from super ctor
    }
        return fValueMap.values().toArray(new Object[fValueMap.size()][]);
        Assert.isNotNull(key);
    public void setChoices(Object[] values)
        Assert.isTrue(values.length > 0);
    public Object[] getChoices(Object key)

        String[] values = getValues();
    {
    public Object[][] getAllChoices()
    {
     * @return the choices for this variable and the given set, or
            result[i] = toString(values[i]);
 *     IBM Corporation - initial API and implementation
    public SQLContext getContext()


    }

/**

    public Object[] getChoices()
package org.jkiss.dbeaver.ui.editors.sql.templates;
    public ICompletionProposal[] getProposals(Position position, int length)
        return result;
        }
 * {@link org.eclipse.jface.text.templates.TemplateVariable} using {@link Object#toString() toString}. The
    public Object getCurrentChoice()
    {
    public void setKey(Object defaultKey)

    {
        return toString(fCurrentChoice);
    {
    }
 * Contributors:
    {
    }
    }
 * are made available under the terms of the Eclipse Public License v1.0
    }
     */

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpmn2.validation;

import org.eclipse.bpmn2.DataOutput;
import org.eclipse.bpmn2.DataOutputAssociation;
import org.eclipse.bpmn2.EventDefinition;
import org.eclipse.bpmn2.OutputSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.bpmn2.CatchEvent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CatchEventValidator {
    boolean validate();

    boolean validateParallelMultiple(boolean value);

    boolean validateOutputSet(OutputSet value);

    boolean validateEventDefinitionRefs(EList<EventDefinition> value);

    boolean validateDataOutputAssociation(EList<DataOutputAssociation> value);

    boolean validateDataOutputs(EList<DataOutput> value);

    boolean validateEventDefinitions(EList<EventDefinition> value);
}

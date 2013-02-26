/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpmn2.validation;

import org.eclipse.bpmn2.DataInput;
import org.eclipse.bpmn2.DataOutput;
import org.eclipse.bpmn2.InputSet;
import org.eclipse.bpmn2.OutputSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.bpmn2.InputOutputSpecification}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InputOutputSpecificationValidator {
    boolean validate();

    boolean validateInputSets(EList<InputSet> value);

    boolean validateOutputSets(EList<OutputSet> value);

    boolean validateDataInputs(EList<DataInput> value);

    boolean validateDataOutputs(EList<DataOutput> value);
}

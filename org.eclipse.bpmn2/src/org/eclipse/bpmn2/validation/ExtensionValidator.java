/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpmn2.validation;

import org.eclipse.bpmn2.ExtensionDefinition;

/**
 * A sample validator interface for {@link org.eclipse.bpmn2.Extension}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExtensionValidator {
    boolean validate();

    boolean validateMustUnderstand(boolean value);

    boolean validateDefinition(ExtensionDefinition value);
}

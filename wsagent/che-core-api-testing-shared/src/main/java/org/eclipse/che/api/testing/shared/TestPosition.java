/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.testing.shared;

import org.eclipse.che.dto.shared.DTO;

import javax.validation.constraints.NotNull;

/**
 * Describes test position in document
 */
@DTO
public interface TestPosition {

    /**
     * @return the test framework name
     */
    @NotNull
    String getFrameworkName();

    void setFrameworkName(String name);

    TestPosition withFrameworkName(String name);

    /**
     * @return the test name(it can be method, suite, or class name)
     */
    @NotNull
    String getTestName();

    void setTestName(String testName);

    TestPosition withTestName(String name);

    /**
     * @return the document offset where test name begins
     */
    @NotNull
    int getTestNameStartOffset();

    void setTestNameStartOffset(int testNameStartOffset);

    TestPosition withTestNameStartOffset(int testNameStartOffset);

    /**
     * @return the test body length
     */
    @NotNull
    int getTestBodyLength();

    void setTestBodyLength(int length);

    TestPosition withTestBodyLength(int length);

    /**
     * @return the test name length
     */
    @NotNull
    int getTestNameLength();

    void setTestNameLength(int length);

    TestPosition withTestNameLength(int length);
}

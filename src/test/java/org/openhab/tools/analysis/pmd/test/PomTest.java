/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.tools.analysis.pmd.test;

import org.junit.Before;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;

/**
 * Test class that includes all custom PMD tests for the pom.xml files
 *
 * @author Svilen Valkanov
 *
 */
public class PomTest extends SimpleAggregatorTst {

    @Override
    @Before
    protected void setUp() {
        addRule("src/test/resources/checks/pmd/ruleset/pom.xml", "AvoidOverridingParentPomConfiguration");
    }
}

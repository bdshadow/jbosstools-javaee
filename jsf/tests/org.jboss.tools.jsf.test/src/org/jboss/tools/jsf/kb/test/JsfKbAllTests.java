/******************************************************************************* 
 * Copyright (c) 2010 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.jboss.tools.jsf.kb.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.jboss.tools.common.model.util.test.XProjectImportTestSetUp;
import org.jboss.tools.test.util.ProjectImportTestSetup;

/**
 * @author Alexey Kazakov
 */
public class JsfKbAllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(JsfKbAllTests.class.getName());
		suite.addTestSuite(FaceletsKbModelTest.class);
		ProjectImportTestSetup testSetup = new XProjectImportTestSetUp(suite,
				"org.jboss.tools.jsf.test",
				new String[]{"projects/TestKbModel"},
				new String[]{"TestKbModel"});
		return testSetup;
	}
}
/*
 * Created on Jun 20, 2014
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2014 the original author or authors.
 */
package org.assertj.core.api.comparable;

import static org.mockito.Mockito.verify;

import org.assertj.core.api.AbstractComparableAssertBaseTest;
import org.assertj.core.api.ConcreteComparableAssert;
import org.assertj.core.api.GenericComparableAssert;
import org.assertj.core.api.GenericComparableAssertBaseTest;


/**
 * Tests for <code>{@link org.assertj.core.api.GenericComparableAssert#isLessThanOrEqualTo(Comparable)}</code>.
 */
public class GenericComparableAssert_isLessThanOrEqualTo_Test extends GenericComparableAssertBaseTest {

  @Override
  protected GenericComparableAssert invoke_api_method() {
    return assertions.isLessThanOrEqualTo(8);
  }

  @Override
  protected void verify_internal_effects() {
    verify(comparables).assertLessThanOrEqualTo(getInfo(assertions), getActual(assertions), 8);
  }
}

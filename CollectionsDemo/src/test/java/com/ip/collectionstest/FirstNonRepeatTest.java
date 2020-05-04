package com.ip.collectionstest;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ip.collections.FirstNonRepeatCharacter;

public class FirstNonRepeatTest {

	@Test
	public void testNullString() {

		Assert.assertNull(FirstNonRepeatCharacter.getFirstNonRepeat(null));
	}

	@Test
	public void testEmptyString() {
		String actual = FirstNonRepeatCharacter.getFirstNonRepeat("");

		Assert.assertNull(actual);
	}

	@Test
	public void testSingleCharString() {

		Assert.assertEquals(FirstNonRepeatCharacter.getFirstNonRepeat("A"), "");
	}

}

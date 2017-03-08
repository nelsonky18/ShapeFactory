package org.cvtc.tests.substitutes;

public class MessageBoxSub implements DialogSub {
	@Override
	public int show(String message, String title) {
		return 0;
	}
}
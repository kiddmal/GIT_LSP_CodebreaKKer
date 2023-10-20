package org.howard.edu.lsp.midterm.problem2;

public class Range {
	private int start;
	private int end;
	
	public Range(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public boolean isValueInRange(int value) {
		return value >= start && value <= end;
	}
	
	public int size() {
		return  Math.abs(end-start);
	}
	
	public boolean doRangesOverlap(Range otherRange) {
		return this.start <= otherRange.end && this.end >= otherRange.start;
	}
}
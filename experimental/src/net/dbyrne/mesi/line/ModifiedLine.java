package net.dbyrne.mesi.line;

public class ModifiedLine extends Line{
	
	ModifiedLine(Integer value) {
		super(value);
	}

	@Override
	public boolean isWriteable() {
		return true;
	}
}

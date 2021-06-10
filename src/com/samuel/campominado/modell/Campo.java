package com.samuel.campominado.modell;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	private final int line;
	private final int column;
	
	private boolean open;
	private boolean mine;
	private boolean marked;
	
	private List <Campo> neighbors = new ArrayList<>();
	
	public Campo(int line, int column) {
		this.line = line;
		this.column = column;
	}
	
	
}

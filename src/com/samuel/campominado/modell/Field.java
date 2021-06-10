package com.samuel.campominado.modell;

import java.util.ArrayList;
import java.util.List;

public class Field {
	private final int line;
	private final int column;
	
	private boolean open;
	private boolean mine;
	private boolean marked;
	
	private List <Field> neighbors = new ArrayList<>();
	
	public Field(int line, int column) {
		this.line = line;
		this.column = column;
	}
	
		public boolean addNeighbor(Field neighbor) {
		boolean lineDif = line != neighbor.line;
		boolean columnDif = column != neighbor.column;
		boolean diagonal = lineDif && columnDif;
		
		int deltaLine = Math.abs(line - neighbor.line);
		int deltaComlumn = Math.abs(column - neighbor.column);
		int deltaGeral = deltaComlumn + deltaLine;
		
		if(deltaGeral == 1 && !diagonal) {
			neighbors.add(neighbor);
			return true;
		} else if(deltaGeral == 2 && diagonal) {
			neighbors.add(neighbor);
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
}

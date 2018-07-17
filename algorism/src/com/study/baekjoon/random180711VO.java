package com.study.baekjoon;

import java.util.Scanner;

public class random180711VO {
	
	int[][] numberBoard ;
	boolean[][] movienBoard ;
	int sum ;
	String move;

	int locationX ;
	int locationY ;
	
	public int getLocationX() {
		return locationX;
	}
	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public int getLocationY() {
		return locationY;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	public int[][] getNumberBoard() {
		return numberBoard;
	}
	public void setNumberBoard(int[][] numberBoard) {
		this.numberBoard = numberBoard;
	}
	public boolean[][] getMovienBoard() {
		return movienBoard;
	}
	public void setMovienBoard(boolean[][] movienBoard) {
		this.movienBoard = movienBoard;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}

}

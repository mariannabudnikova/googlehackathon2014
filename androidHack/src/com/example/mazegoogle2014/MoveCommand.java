package com.example.mazegoogle2014;

public class MoveCommand {
	
	public enum MoveDirection{
		UP,
		DOWN,
		RIGHT,
		LEFT
	};
	
	private MoveDirection moveDirection;
	
	public MoveCommand(MoveDirection moveDirection){
		this.moveDirection = moveDirection;
	}

	
	public MoveDirection getMoveDirection(){
		return moveDirection;
	}
}

package com.starcraft.command;


class SCV {
	public void move() {
		System.out.println("scv move");
	}
	
	public void stop() {
		System.out.println("scv stop");
	}
	
	public void attack() {
		System.out.println("scv attack!");
	}
	
	public void repair() {
		System.out.println("scv repair");
	}
}

class MoveCommand implements Command {
	private SCV scv;
	
	public MoveCommand(SCV scv) {
		this.scv = scv;
	}
	
	@Override
	public void execute() {
		scv.move();
	}
}

class StopCommand implements Command {
	private SCV scv;
	
	public StopCommand(SCV scv) {
		this.scv = scv;
	}
	
	@Override
	public void execute() {
		scv.stop();
	}
}

class AttackCommand implements Command {
	private SCV scv;
	
	public AttackCommand(SCV scv) {
		this.scv = scv;
	}
	
	@Override
	public void execute() {
		scv.attack();
	}
}

class RepairCommand implements Command {
	private SCV scv;
	
	public RepairCommand(SCV scv) {
		this.scv = scv;
	}
	
	@Override
	public void execute() {
		scv.repair();
	}
}

class Click {
	private Command command;
	
	public Click(Command command) {
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}
}

public class TestCommand {
	public static void main(String[] args) {
		SCV scv = new SCV();
		MoveCommand moveCommand = new MoveCommand(scv);
		Click moveClick = new Click(moveCommand);
		moveClick.click();
		
		StopCommand stopCommand = new StopCommand(scv);
		Click stopClick = new Click(stopCommand);
		stopClick.click();
		
		AttackCommand attackCommand = new AttackCommand(scv);
		Click attackClick = new Click(attackCommand);
		attackClick.click();
		
		RepairCommand repairCommand = new RepairCommand(scv);
		Click repairClick = new Click(repairCommand);
		repairClick.click();
	}
}




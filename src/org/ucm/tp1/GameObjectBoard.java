package org.ucm.tp1;

import org.ucm.tp1.SlayerList;
import org.ucm.tp1.VampireList;

public class GameObjectBoard {
	SlayerList slayerList;
	VampireList vampireList;
	
	public GameObjectBoard(SlayerList slayerList1, VampireList vampireList1) {
		this.slayerList = slayerList1;
		this.vampireList = vampireList1;
	}
}

package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ChessMatch chessmatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessmatch.getPieces());
			System.out.println();
			System.out.print("Origem: ");
			ChessPosition source = UI.readChessPositon(scan);
			
			System.out.println();
			System.out.print("Destino: ");
			ChessPosition target = UI.readChessPositon(scan);
			
			ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
			
			
		}
	}

}

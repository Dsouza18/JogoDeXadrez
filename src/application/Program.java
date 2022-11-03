package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ChessMatch chessmatch = new ChessMatch();

		while (true) {
			try {
				UI.cleanScreen();
				UI.printBoard(chessmatch.getPieces());
				System.out.println();
				System.out.print("Origem: ");
				ChessPosition source = UI.readChessPositon(scan);

				System.out.println();
				System.out.print("Destino: ");
				ChessPosition target = UI.readChessPositon(scan);

				ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				scan.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				scan.nextLine();
			}

		}
	}

}

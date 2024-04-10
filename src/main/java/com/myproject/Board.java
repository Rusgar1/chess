package main.java.com.myproject;

import main.java.com.myproject.piece.Pawn;
import main.java.com.myproject.piece.Piece;

import java.util.HashMap;

public class Board {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();


    public void setPiece(Coordinates coordinates, Piece piece){
        piece.coordinates =coordinates;
        pieces.put(coordinates, piece);
    }

    public void setupDefaultPiecesPositions(){
        for (File file: File.values()) {
            setPiece(new Coordinates(file,2), new Pawn(Color.WHITE, new Coordinates(file,2)));
            setPiece(new Coordinates(file,7), new Pawn(Color.BLACK, new Coordinates(file,7)));
        }
    }
}

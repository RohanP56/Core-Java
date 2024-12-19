
public class Interfaces {
    public static void main(String[] args) {

        Queen q = new Queen();   //Creating Queen object
        q.moves();
        /*q.num = 56;   --> we can't update it as (final) value
        System.out.println(q.num);*/
        
    }
}

//Creating a Interface for chess player
interface ChessPlayer{
    int num = 45;
    void moves();   //it's a blueprint for function which control the player moves
}

//Creating class for Queen 
class Queen implements ChessPlayer{          //class "Queen" implements chessplayer interface
    
   public void moves(){      // Here we have to maintion public bcoz in interface the void is by default public
        System.out.println("Can move every direction");
    }
}


//Creating class for Rook 
class Rook implements ChessPlayer{          //classm "Rook" implements chessplayer interface
    public void moves(){
        System.out.println("Can move up, down, left, right");
    }
}


//Creating class for Queen 
class King implements ChessPlayer{          //classm "Queen" implements chessplayer interface
    public void moves(){
        System.out.println("Can move every direction by 1 step");
    }
}

/*Interface method always should be public 

Abstract calss and inface do same work so why we create the interface??
we can use multiple interfaces in a class (like-- multiple inheritance).
here we can implement iterface in subclass of a class or child class
we can't modify properties in interfaces as they are (final)
*/
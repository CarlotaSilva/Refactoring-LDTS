package pt.up.fe.ldts.example5;

public class Turtle {
    Position position;

    public Turtle(int row, int column, char direction) {

        this.position = new Position(row, column, direction);
    }

    public int getRow() {

        return position.getRow();
    }

    public int getColumn() {

        return position.getColumn();
    }

    public char getDirection() {

        return position.getDirection();
    }

    public void setRow(int row) {

        position.setRow(row);
    }

    public void setColumn(int column) {

        position.setColumn(column);
    }

    public void setDirection(char direction) {

        position.setDirection(direction);
    }

    public void setPosition(Position position) {

        this.position = position;
    }

    public void execute(char command) {
        if (command == 'L') {
            setPosition(new CommandL(position).execute());
        }
        else if (command == 'R') {
            setPosition(new CommandR(position).execute());
        }
        else if (command == 'F'){
            setPosition(new CommandF(position).execute());
        }
    }
}


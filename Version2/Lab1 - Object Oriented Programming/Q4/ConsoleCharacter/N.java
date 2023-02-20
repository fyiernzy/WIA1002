package Lab1.Q4.ConsoleCharacter;

public class N extends ConsoleCharacter {

    public boolean[][] getUppercase() {
        int column = 5;
        boolean[][] buff = getBuff(column + 2);

        buff[1][1] = buff[2][2] = buff[3][3] = true;

        for (int i = 0; i < ConsoleCharacter.ROW; i++) {
            buff[i][0] = true;
            buff[i][4] = true;
        }

        return buff;
    }

    public boolean[][] getLowercase() {
        int column = 5;
        boolean[][] buff = getBuff(column + 2);
        plotVerticalLine(buff, 1, ROW - 1, 0);
        buff[2][1] = buff[1][2] = buff[2][3] = true;
        plotVerticalLine(buff, 2, ROW - 1, 4);
        return buff;
    }
}

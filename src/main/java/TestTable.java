/**
 * Created by IntelliJ IDEA.
 * TestTable.javaBDconnection
 *
 * @Autor: Andrey
 * @DateTime: 12.11.2020|16:05
 * @Version: TestTable: 1.0
 */

public class TestTable {

    private int id;
    private String firstCol;
    private String secondCol;
    private String thirdCol;
    private String fourthCol;
    private String fiveCol;
    private String sixthCol;

    public TestTable(int id, String firstCol, String secondCol, String thirdCol,
             String fourthCol,
             String fiveCol,
             String sixthCol) {
        this.id = id;
        this.firstCol = firstCol;
        this.secondCol = secondCol;
        this.thirdCol = thirdCol;
        this.fourthCol = fourthCol;
        this.fiveCol = fiveCol;
        this.sixthCol = sixthCol;
    }

    public TestTable() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstCol() {
        return firstCol;
    }

    public void setFirstCol(String firstCol) {
        this.firstCol = firstCol;
    }

    public String getSecondCol() {
        return secondCol;
    }

    public void setSecondCol(String secondCol) {
        this.secondCol = secondCol;
    }

    public String getThirdCol() {
        return thirdCol;
    }

    public void setThirdCol(String thirdCol) {
        this.thirdCol = thirdCol;
    }

    public String getFourthCol() {
        return fourthCol;
    }

    public void setFourthCol(String fourthCol) {
        this.fourthCol = fourthCol;
    }

    public String getFiveCol() {
        return fiveCol;
    }

    public void setFiveCol(String fiveCol) {
        this.fiveCol = fiveCol;
    }

    public String getSixthCol() {
        return sixthCol;
    }

    public void setSixthCol(String sixthCol) {
        this.sixthCol = sixthCol;
    }

    @Override
    public String toString() {
        return "TestTable{" +
                "id=" + id +
                ", firstCol='" + firstCol + '\'' +
                ", secondCol='" + secondCol + '\'' +
                ", thirdCol='" + thirdCol + '\'' +
                ", fourthCol='" + fourthCol + '\'' +
                ", fiveCol='" + fiveCol + '\'' +
                ", sixthCol='" + sixthCol + '\'' +
                '}';
    }
}

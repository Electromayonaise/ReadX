package model;

public class LibraryDisplay {

    private String[][] page;

    public LibraryDisplay() {
        page = new String[5][5];
    }

    public boolean fillDisplay(int row, int column, String id){
        boolean isFull = true;
        if (page[row][column] == null){
            page[row][column] = id;
            isFull = false;
        }
        return isFull;
    }

    public String libraryDisplay(){
        String result = "";
        for (int i = 0; i < page.length; i++) {
            for (int j = 0; j < page[0].length ; j++) {
                if (page[i][j] != null){
                    result += page[i][j] + " ";
                }else{
                    result += "null ";
                }
            }
            result += "\n";
        }
        return result;
    }
}

package model;

public class LibraryDisplay {

    private String[][] page;

    public LibraryDisplay() {
        page = new String[5][5];
    }

    public void fillDisplay(int row, int column, String id){
        System.out.println("row: " + row + " column: " + column + " id: " + id);
        if (page[row][column] == null){
            page[row][column] = id;
        }
    }

    public String libraryDisplay(){
        StringBuilder result = new StringBuilder(); 
        for (int i = 0; i < page.length; i++) {
            for (int j = 0; j < page[0].length ; j++) {
                if (page[i][j] != null){
                    // empty the string
                    result.append(page[i][j] + " ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}

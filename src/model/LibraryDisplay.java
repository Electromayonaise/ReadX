package model;

/**
 * Class that represents the library display
 */
public class LibraryDisplay {

    private String[][] page;

    /**
     * Constructor method for the LibraryDisplay class
     */
    public LibraryDisplay() {
        page = new String[5][5];
    }

    /**
     * Method that fills the display with the bibliographic products id
     * @param row the row in wich the id will be added
     * @param column the column in wich the id will be added
     * @param id the id of the bibliographic product
     */
    public void fillDisplay(int row, int column, String id){
        if (page[row][column] == null){
            boolean found = searchIfAdded(id);
            if (!found){
                page[row][column] = id;
            }
        }
    }

    /**
     * Method that searches if a bibliographic product has already been added to the display
     * @param id the id of the bibliographic product
     * @return true if the bibliographic product has already been added, false if not
     */
    public boolean searchIfAdded(String id){
        boolean found = false;
        for (int i = 0; i < page.length; i++) {
            for (int j = 0; j < page[0].length ; j++) {
                if (page[i][j] != null && page[i][j].equals(id)){
                    found = true;
                }
            }
        }
        return found;
    }

    /**
     * Method that displays the library
     * @return the library display
     */
    public String libraryDisplay(){
        StringBuilder result = new StringBuilder(); 
        for (int i = 0; i < page.length; i++) {
            for (int j = 0; j < page[0].length ; j++) {
                if (page[i][j] != null){
                    result.append(page[i][j] + " ");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    /**
     * Method that searches for a bibliographic product in the display by its position
     * @param pos the position of the bibliographic product in string format
     * @return the id of the bibliographic product
     */
    public String searchProductId(String pos){
        // Turn the position from the format (a,b) to the matrix format
        String msj = "Product not found";
        String[] position = pos.split(",");
        int row = Integer.parseInt(position[0]);
        int column = Integer.parseInt(position[1]);
        if (page[row-1][column-1] != null){
            msj= page[row-1][column-1];
        }
        return msj;
    }

    /**
     * Getter method for the page attribute
     * @return the page attribute
     */
    public String[][] getPage() {
        return page;
    }

    /**
     * Setter method for the page attribute
     * @param page the new page attribute
     */
    public void setPage(String[][] page) {
        this.page = page;
    }
}

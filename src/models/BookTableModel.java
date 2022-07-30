package models;

import classes.Book;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BookTableModel extends AbstractTableModel{
    
    private List<Book> bookData = new ArrayList<>();
    private final String[] columnNames =  {"Display", "Autor", "Título", "Subtítulo", "Volume", "Edição", "Gênero", "Idioma", "Tipo", "Local", "Observação"};

    public BookTableModel() {
    }

    public BookTableModel(List<Book> bookData) {
        this.bookData = bookData;
    }

    @Override
    public int getRowCount() {
        return bookData.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Object bookAttribute = null;
        Book bookObject = bookData.get(rowIndex);
        switch(columnIndex) {
            case 0 -> bookAttribute = bookObject.getDisplay();
            case 1 -> bookAttribute = bookObject.getTitle();
            case 2 -> bookAttribute = bookObject.getAuthor();
            case 3 -> bookAttribute = bookObject.getSub();
            case 4 -> bookAttribute = bookObject.getVolume();
            case 5 -> bookAttribute = bookObject.getEdition();
            case 6 -> bookAttribute = bookObject.getGenre();
            case 7 -> bookAttribute = bookObject.getLang();
            case 8 -> bookAttribute = bookObject.getType();
            case 9 -> bookAttribute = bookObject.getLocated();
            case 10 -> bookAttribute = bookObject.getObs();
            default -> {
            }
        }
        return bookAttribute;
    }
    
    public void addBook(Book book) {
        bookData.add(book);
        fireTableDataChanged();
    }
}

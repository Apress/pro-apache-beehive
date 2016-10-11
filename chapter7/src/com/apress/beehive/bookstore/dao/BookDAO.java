package com.apress.beehive.bookstore.dao;

/**
 * Created by IntelliJ IDEA.
 * User: skanchanavally
 * Date: Mar 25, 2005
 * Time: 10:40:27 AM
 * To change this template use File | Settings | File Templates.
 */

import com.apress.beehive.bookstore.vo.Book;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;


public class BookDAO {

    public static final String insertBook="insert into book_detail ( title, book_type,author, publication, isbn, comments,available)" +
     " values (?,?,?,?,?,?,?)";

    public String addBook(Book aBook) throws SQLException {
        PreparedStatement stmt = null;
        Connection oConnection = null;
        ResultSet oResultSet = null;
        int resourceId = -1;
        try {
            oConnection = getConnection();
            stmt = oConnection.prepareStatement(insertBook);
             stmt.setString(1, aBook.getTitle());
             stmt.setString(2,aBook.getBook_type());
             stmt.setString(3,aBook.getAuthor());
             stmt.setString(4,aBook.getPublication());
             stmt.setString(5,aBook.getIsbn());
             stmt.setString(6,aBook.getComments());
             stmt.setString(7,"1");
            int i = stmt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new SQLException();
        } finally {
            try {
                if (oConnection != null) {
                    oConnection.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (oResultSet != null) {
                    oResultSet.close();
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
        return String.valueOf(1);
    }

    public Connection getConnection() throws SQLException {

        try {
            InitialContext context = new javax.naming.InitialContext();
            DataSource dataSource = (DataSource) context.lookup("java:/bookstoreDS");
            return dataSource.getConnection();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
    }


}

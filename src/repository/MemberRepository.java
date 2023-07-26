package repository;

import controller.ConnectManager;
import model.Address;
import model.LibraryMember;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private Connection connection;

    public LibraryMember getMember(String memberId) throws SQLException, Exception {

        connection = ConnectManager.getConnection();
        String query = String.format("select * from library_member where member_id = '%s'", memberId);
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();
        if (!rs.next())
            throw new Exception("Member does not exist");

        return new LibraryMember(rs.getInt("id"),
                rs.getString("member_id"),
                rs.getString("firstname"),
                rs.getString("lastname"),
                rs.getString("phone"),
                null);
    }

    public List<LibraryMember> getMemberList() throws SQLException {
        connection = ConnectManager.getConnection();
        String query = "select * from library_member";
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();
        return getMemberList(rs);
    }
    private List<LibraryMember> getMemberList(ResultSet rs) throws SQLException {
        List<LibraryMember> list = new ArrayList<>();
        int id;
        String memberId;
        String firstName;
        String lastName;
        String phone;
        Address address = null;

        while (rs.next()) {
            id = rs.getInt("id");
            memberId = rs.getString("member_id");
            firstName = rs.getString("firstname");
            lastName = rs.getString("lastname");
            phone = rs.getString("phone");

            list.add(new LibraryMember(id, memberId, firstName, lastName, phone, address));
        }

        return list;
    }

    public boolean checkDupMemberId(String memberId) throws SQLException{
        connection = ConnectManager.getConnection();
        String query = String.format("SELECT * from library_member where member_id = '%s'", memberId);
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if(rs.next()){
            System.out.println("true :::::::: " );
            return true;
        }
        return false;
    }


    public void saveAddress(Address address){
        try {
            connection = ConnectManager.getConnection();
            PreparedStatement stat =  connection.prepareStatement("INSERT INTO address (id,street, city, state, zip) VALUES(?,?,?,?,?)");

            stat.setInt(1, address.getId());
            stat.setString(2, address.getStreet());
            stat.setString(3,address.getCity());
            stat.setString(4,address.getState());
            stat.setInt(5,address.getZip());
            stat.executeUpdate();
        } catch (SQLException s) {
            s.printStackTrace();
        }
    }

    public boolean saveLibraryMember(LibraryMember libraryMember){

        try {

            saveAddress(libraryMember.getAddress());


            connection = ConnectManager.getConnection();
            PreparedStatement stat =  connection.prepareStatement("INSERT INTO library_member(id,member_id, firstname, lastname, phone, address_id) VALUES(?,?,?,?,?,?)");
            stat.setInt(1, libraryMember.getId());
            stat.setString(2,libraryMember.getMemberId());
            stat.setString(3,libraryMember.getFirstName());
            stat.setString(4,libraryMember.getLastName());
            stat.setString(5, libraryMember.getPhone());
            stat.setInt(6, libraryMember.getAddress().getId());
            int rs = stat.executeUpdate();
            if (rs > 0) {
                System.out.println("Save successfully");
                return true;
            } else {
                System.out.println("Save failed");
                return false;
            }

        } catch (SQLException s) {
            s.printStackTrace();
        }

        return false;
    }

    public LibraryMember updateLibraryMember(LibraryMember libraryMember){
        try{
            connection = ConnectManager.getConnection();
            PreparedStatement stat = connection.prepareStatement("UPDATE library_member SET firstname = ?, lastname = ?, phone = ?  FROM employees WHERE employees.id = ?");
            stat.setString(1, libraryMember.getFirstName());
            stat.setString(2,libraryMember.getLastName());
            stat.setString(3,libraryMember.getPhone());
            stat.setInt(4,3);

        }catch(SQLException s){
            s.printStackTrace();
        }

        return null;
    }

    public int getNextId() throws SQLException, Exception {

        connection = ConnectManager.getConnection();
        String query = String.format("select max(id) as id from library_member");
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            return 1;

        return rs.getInt("id") + 1;
    }

    public int getAddressNextId() throws SQLException, Exception {

        connection = ConnectManager.getConnection();
        String query = String.format("select max(id) as id from address");
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            return 1;

        return rs.getInt("id") + 1;
    }
}

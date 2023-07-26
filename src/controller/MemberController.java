
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Address;
import model.LibraryMember;
import repository.MemberRepository;


/**
 *
 * @author PHEARUN PHIN
 */
public class MemberController {
    
    private MemberRepository memberRepository;
   
    public MemberController() {
        memberRepository = new MemberRepository();
    }
    
    public boolean addLibraryMember(String memberId, String firstname, String lastname, String phone,String street, String city, String state, int zip) throws Exception{
        int id = memberRepository.getNextId();
        int addressId = memberRepository.getAddressNextId();
    
        Address address = new Address(addressId,street, city, state, zip);
        LibraryMember libraryMember = new LibraryMember(id, memberId, firstname, lastname, phone, address);
        
        return memberRepository.saveLibraryMember(libraryMember);
        
    }
    
    public List<LibraryMember> getAllLibraryMember(){
        
        try {
            return memberRepository.getMemberList();
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return null;
    }
   
    public LibraryMember getLibraryMember(String memberId) throws Exception {
       
         return memberRepository.getMember(memberId);
    }
    
    public boolean checkMemDup(String memberId) throws SQLException{
       
        return memberRepository.checkDupMemberId(memberId);
    }
    
    
//    public Address getAddress(){
//        
//        
//         
//    }
      
}

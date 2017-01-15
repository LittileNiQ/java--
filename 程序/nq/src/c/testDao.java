package c;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import b.test;



import a.DBManager;

public class testDao {
   //�����Ϣ
	public static boolean  add(test bean) {
		Connection conn = null;// ���ݿ������ 
	      PreparedStatement stm = null;// SQL ����װ����  
	      String sql = "insert into student(sno,sname,ssex,sphone,saddress,semail,sphonepath)"
	      + " values(?,?,?,?,?,?,?)";  
	 try {  
	       // ��1����ȡ���ݿ�����  
		 conn = DBManager.getConnection();  
	       // ��2���� SQL ���ŵ�װ������
		 stm = conn.prepareStatement(sql);    
	       // ��3�����ò�����ֵ  
		    stm.setString(1, bean.getNo()); 
	        stm.setString(2, bean.getName());
	        stm.setString(3, bean.getSex());
	        stm.setString(4, bean.getPhone());
	        stm.setString(5, bean.getAddress());
	        stm.setString(6, bean.getEmail());
	        stm.setString(7, bean.getPhotopath());
	       
	     // ��4��ִ�� SQL ���    
	        stm.execute();
	        return true;
	   } 
	 catch (SQLException e) {
	    e.printStackTrace(); 
	     return false; 
	  }
	 finally {// ��5���ر� 
	   try {    
	         stm.close();  
	         conn.close(); 
	       } 
	        catch (SQLException e) {   
	             e.printStackTrace();    }  
	 }
	  } 
	//ɾ����Ϣ
	public static boolean deletetxl(String no) {  
        Connection conn = null;// ���ݿ������
        PreparedStatement stm = null;// SQL ����װ����
        String sql = "delete from student where sno=?";   
        try { 
             // ��1����ȡ���ݿ�����  
        	conn = DBManager.getConnection(); 
            // ��2���� SQL ���ŵ�װ������   
        	stm = conn.prepareStatement(sql); 
            // ��3�����ò�����ֵ  
            stm.setString(1, no);
            // ��4��ִ�� SQL ���  
            stm.execute();
            return true;
            }
       catch (SQLException e) {
            e.printStackTrace();
            return false;
           }
       finally {
         // ��5���ر�
         try {
             stm.close();
             conn.close();
             }
         catch (SQLException e) { 
             e.printStackTrace();
            }
          }	
	
	}
	//��ѯ��Ϣͨ�����
	public static Vector<test> findByNo(String sql) { 
		 test a;
		Vector<test> v=new Vector<test>();
		 ResultSet rs=find(sql);
		 try{
			  while(rs.next()){
				  a=new test();
				  a.setNo(rs.getString(1));
				  a.setName(rs.getString(2));
				  a.setSex(rs.getString(3));
				  a.setPhone(rs.getString(4));
				  a.setAddress(rs.getString(5));
				  a.setEmail(rs.getString(6));
				  a.setPhotopath(rs.getString(7));
				  v.add(a);
			  }
		 } catch (SQLException e){
			   e.printStackTrace();
		 }
		 return v;
	 }
	private static ResultSet find(String sql){
		 Connection conn=null;
		 Statement stmt=null;
		 ResultSet rs=null;
		 conn=DBManager.getConnection();
		 try{
			 stmt=conn.createStatement();
			 rs=stmt.executeQuery(sql);
		 } catch  (SQLException e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	//ͨ����������
	public static Vector<test> findByName(String sql) { 
		 test a;
		Vector<test> v=new Vector<test>();
		 ResultSet rs=findname(sql);
		 try{
			  while(rs.next()){
				  a=new test();
				  a.setNo(rs.getString(1));
				  a.setName(rs.getString(2));
				  a.setSex(rs.getString(3));
				  a.setPhone(rs.getString(4));
				  a.setAddress(rs.getString(5));
				  a.setEmail(rs.getString(6));
				  a.setPhotopath(rs.getString(7));
				  v.add(a);
			  }
		 } catch (SQLException e){
			   e.printStackTrace();
		 }
		 return v;
	 }
	private static ResultSet findname(String sql){
		 Connection conn=null;
		 Statement stmt=null;
		 ResultSet rs=null;
		 conn=DBManager.getConnection();
		 try{
			 stmt=conn.createStatement();
			 rs=stmt.executeQuery(sql);
			 
		 } catch  (SQLException e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	//ͨ���Ա���� 
	public static Vector<test> findBySex(String sql) { 
		 test a;
		Vector<test> v=new Vector<test>();
		 ResultSet rs=findsex(sql);
		 try{
			  while(rs.next()){
				  a=new test();
				  a.setNo(rs.getString(1));
				  a.setName(rs.getString(2));
				  a.setSex(rs.getString(3));
				  a.setPhone(rs.getString(4));
				  a.setAddress(rs.getString(5));
				  a.setEmail(rs.getString(6));
				  a.setPhotopath(rs.getString(7));
				  v.add(a);
			  }
		 } catch (SQLException e){
			   e.printStackTrace();
		 }
		 return v;
	 }
	private static ResultSet findsex(String sql){
		 Connection conn=null;
		 Statement stmt=null;
		 ResultSet rs=null;
		 conn=DBManager.getConnection();
		 try{
			 stmt=conn.createStatement();
			 rs=stmt.executeQuery(sql);
			 
		 } catch  (SQLException e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	//ͨ����ַ����
	public static Vector<test> findByAddress(String sql) { 
		 test a;
		Vector<test> v=new Vector<test>();
		 ResultSet rs=findaddress(sql);
		 try{
			  while(rs.next()){
				  a=new test();
				  a.setNo(rs.getString(1));
				  a.setName(rs.getString(2));
				  a.setSex(rs.getString(3));
				  a.setPhone(rs.getString(4));
				  a.setAddress(rs.getString(5));
				  a.setEmail(rs.getString(6));
				  a.setPhotopath(rs.getString(7));
				  v.add(a);
			  }
		 } catch (SQLException e){
			   e.printStackTrace();
		 }
		 return v;
	 }
	private static ResultSet findaddress(String sql){
		 Connection conn=null;
		 Statement stmt=null;
		 ResultSet rs=null;
		 conn=DBManager.getConnection();
		 try{
			 stmt=conn.createStatement();
			 rs=stmt.executeQuery(sql);
			 
		 } catch  (SQLException e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	//������Ϣ
	public static boolean updateTxl(test bean,String no) {  
        Connection conn = null;// ���ݿ������
        PreparedStatement stm = null;// SQL ����װ����
        String sql = "update student set sno=?,sname=?,ssex=?,sphone=?,saddress=?,semail=?,sphonepath=? where sno=?";
        try {   
             // ��1����ȡ���ݿ�����    
        	  conn = DBManager.getConnection(); 
             // ��2���� SQL ���ŵ�װ������
        	  stm = conn.prepareStatement(sql);
             // ��3�����ò�����ֵ 
             stm.setString(1, bean.getNo());
             stm.setString(2, bean.getName());
             stm.setString(3, bean.getSex());
             stm.setString(4, bean.getPhone());
             stm.setString(5, bean.getAddress());
             stm.setString(6, bean.getEmail());
             stm.setString(7, bean.getPhotopath());
             stm.setString(8, no);
            // ��4��ִ�� SQL ��� 
            stm.execute();
            return true;
            }
     catch (SQLException e) {
               e.printStackTrace();
               return false; 
          }
     
	
  }  
   
	//���ݱ�ţ�����ͼƬ��·��  
	 public static void updatePicturePath(String id, String saveFile) {
		 Connection conn = null;
		 PreparedStatement stm = null;
		 String sql = "update student set sphonepath=? where sno=?";
		 try {
			 conn = DBManager.getConnection();
			 stm = conn.prepareStatement(sql);
			 stm.setString(1, saveFile);
			 stm.setString(2, id);
			 stm.executeUpdate();// ִ�и���
			 } 
		 catch (SQLException e) {  
	           e.printStackTrace();   }
		 finally {
			 try {  
				 stm.close(); 
				 conn.close();
				 } 
			 catch (SQLException e) {  
	           e.printStackTrace();    }  
	  }  
	 } 
}


package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection getConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mails_db",
                "admin", "qwerty");
        
        //--task5--
        PreparedStatement mailInfo = getConnection.prepareStatement("SELECT SENDER_ID, RECEIVER, TOPIC, TEXT, SENDERDATE from MAILS where RECEIVER = ?");
        mailInfo.setInt(1, 1);
        PreparedStatement insertMails = getConnection.prepareStatement("INSERT INTO MAILS (SENDER_ID, RECEIVER, TOPIC, TEXT, SENDERDATE) VALUES (?, ?, ?, ?, ?)");
        ResultSet mailSet = mailInfo.executeQuery();
        while (mailSet.next()) {
            int sender_id = mailSet.getInt("SENDER_ID");
            int receiver = mailSet.getInt("RECEIVER");
            String topic = mailSet.getString("TOPIC");
            Date senderDate = mailSet.getDate("SENDERDATE");
            String text =mailSet.getString("TEXT");
            Mail getMail = new Mail(sender_id, receiver, topic, text, senderDate);
            System.out.println(getMail.toString());
            insertMails.setInt(1, getMail.getSenderId());
            insertMails.setInt(2, getMail.getReceiverId());
            insertMails.setString(3, getMail.getTopic());
            insertMails.setString(4, getMail.getText());
            insertMails.setDate(5, (Date) getMail.getSendDate());
            System.out.println(insertMails.executeUpdate());
        }
    }
}


package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Order;
import bean.User;

public class OrderDAO {

    public void insert(Order o) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cart?characterEncoding=UTF-8",
                    "root", "12345678");

            String sql = "insert into order_ values(null,?)";

            PreparedStatement ps = c.prepareStatement(sql);
            System.out.println(o.getUser().getName());

            String sql2 = "select * from user where name = ? and password = ?";

            PreparedStatement ps2 = c.prepareStatement(sql2);

            ps2.setString(1, o.getUser().getName());
            ps2.setString(2, o.getUser().getPassword());
            ResultSet rs2 = ps2.executeQuery();
            int user_id = 0;
            if (rs2.next()){
                System.out.println(rs2.getInt(1));
                ps.setInt(1,rs2.getInt(1));
                o.setId(rs2.getInt(1));
            }
            ps2.close();
            ps.execute();
//            ResultSet rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                int id = rs.getInt(1);
//                o.setId(id);
//            }

            ps.close();

            c.close();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
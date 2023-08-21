package com.codeacademy.thymeleaf_blog;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TopicDao {

    private final DataSource dataSource;

    public TopicDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        try {
            con = dataSource.getConnection();
            pstmt = con.prepareStatement("select * from topic");

            resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String header = resultSet.getString("header");
                topics.add(new Topic(title, header));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
                if (pstmt != null)
                    pstmt.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return topics;
    }

    public void addNewTopic(Topic newTopic) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = dataSource.getConnection();
            pstmt = con.prepareStatement("insert into topic (title, header) values (?,?)");
            pstmt.setString(1, newTopic.getTitle());
            pstmt.setString(2, newTopic.getHeader());
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

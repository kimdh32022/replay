package com.busanit501.board_login.recipe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RecipeDAO {

    public String getTime(){
        String now = null;
        try(Connection connection = Utill.INSTANCE.getConnection();
            PreparedStatement preparedStatement =
                connection.prepareStatement("select now()");
            ResultSet resultSet = preparedStatement.executeQuery();
        ){
            resultSet.next();
            now = resultSet.getString(1);
        } // try
        catch (Exception e){
            e.printStackTrace();
        }//catch
        return now;
    }//getTime

} //class

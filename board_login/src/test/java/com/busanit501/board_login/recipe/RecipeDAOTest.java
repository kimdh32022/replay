package com.busanit501.board_login.recipe;

import com.busanit501.board_login.recipe.dao.RecipeDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecipeDAOTest {
    private RecipeDAO recipeDAO;

    @BeforeEach
    public void ready(){
        recipeDAO = new RecipeDAO();
    }

    @Test
    public void getTime(){
        System.out.println("sql로 전달 후 , 시간 조회 확인용 :"+ recipeDAO.getTime());
    }
}

package com.busanit501.board_login.recipe.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
//@Getter
//@Setter
public class RecipeDTO {
    private Long rno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}

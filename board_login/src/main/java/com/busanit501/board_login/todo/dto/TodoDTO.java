package com.busanit501.board_login.todo.dto;

import java.util.Date;

public class TodoDTO {
    private Long tno;
    private String title;
    private String content;
    private Date date;
    private boolean done;

    public Long getTno() {
        return tno;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public Date getDate() {
        return date;
    }
    public boolean isDone() {
        return done;
    }

    public void setTno(Long tno) {
        this.tno = tno;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setDone(boolean done) {
        this.done = done;
    }

}

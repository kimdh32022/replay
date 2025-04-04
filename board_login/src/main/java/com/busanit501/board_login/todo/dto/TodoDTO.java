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
    public void setTno(Long tno) {
        this.tno = tno;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }

}

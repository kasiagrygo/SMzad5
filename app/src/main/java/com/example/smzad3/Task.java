package com.example.smzad3;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    private Category category;

    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }
    public void setCategory(Category category){
        this.category = category;
    }
    public Category getCategory(){
        return category;
    }
    public void setName(String Name) { name = Name; }
    public String getName() { return name; }
    public void setDone(boolean Done) { done = Done; }
    public boolean isDone() { return done; }
    public Date getDate(){ return date; }
    public UUID getId() { return id; }

    public void setDate(Date date) { this.date = date; }

}

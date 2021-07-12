package com.shwks.app.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="todo", schema = "wishlist")
@ApiModel(description = "Todo Table")

public class Todo implements Serializable {

    public Todo() {
    }

    public Todo(String description, String details, boolean done) {
        this.description = description;
        this.details = details;
        this.done = done;
    }

    @Id
    private Long id;

    @Column(name = "description", columnDefinition = "varchar(255) default null", nullable = true)
    @ApiModelProperty(notes = "description of what to do")
    private String description;

    @Column(name = "details", columnDefinition = "varchar(4096) default null", nullable = true)
    @ApiModelProperty(notes = "details of what to do")
    private String details;

    @Column(name = "done", columnDefinition = "boolean default null", nullable = true)
    @ApiModelProperty(notes = "todo is complete or not")
    private boolean done;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}

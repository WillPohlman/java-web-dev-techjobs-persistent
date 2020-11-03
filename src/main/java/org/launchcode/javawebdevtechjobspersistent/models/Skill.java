package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @Size(min = 1, max = 250, message = "Description must be between 1 and 250 characters")
    private String description;

    public Skill(@NotBlank @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters") String name, @NotBlank @Size(min = 1, max = 250, message = "Description must be between 1 and 250 characters") String description)
    {
        this.setName(name);
        this.description = description;
    }

    public Skill(){}

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}